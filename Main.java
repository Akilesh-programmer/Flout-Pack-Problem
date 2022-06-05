public class Main {
    
    // The first parameter is for the big bags, one bag has 5 kg, the second one is for small bag, one bag has 1 kg, we need to tell if we can achieve the 
    // goal, that is total kgs, with the given small and big bag combination.
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(2, 1, 12));
        System.out.println(FlourPacker.canPack(5, 3, 24));
    }
}
