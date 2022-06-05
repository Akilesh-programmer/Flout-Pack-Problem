public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        if ((bigCount != 0) && (smallCount != 0)) {
            for (int i = 1; i <= bigCount; i++) {
                if ((i * 5) == goal) {
                    return true;
                }
                if ((goal - (i * 5)) <= smallCount) {
                    for (int j = 1; j <= smallCount; j++) {
                        if ((i * 5) + j == goal) {
                            return true;
                        }
                    }
                    return false;
                }
                goal += i * 5;
            }
            if (smallCount >= goal) {
                return true;
            }
        }
        if ((bigCount == 0) && (smallCount >= goal)) {
            return true;
        }
        if ((smallCount == 0) && (bigCount * 5 == goal)) {
            return true;
        }
        return false;
    }
}
