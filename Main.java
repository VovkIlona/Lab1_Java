

public class Main {

    public static void main(String[] args) {
        Combine defaultCombine = new Combine();
        ((Combine) defaultCombine).toString();
        ((Combine) defaultCombine).resetValues(4, 50, 9, 600, 4, "Green", "Harvest");


        defaultCombine.toString();
        defaultCombine.printAveragePrice();
        Combine.printStaticAveragePrice();

        Combine PerkinsCombine = new Combine(5, 56, 8, 460, 4, "Pink", "Perkins");
        PerkinsCombine.toString();
        PerkinsCombine.resetValues(5, 56, 8, 460, 4, "Pink", "Perkins");
        PerkinsCombine.toString();
        PerkinsCombine.printAveragePrice();
        Combine.printStaticAveragePrice();

        Combine BilosnizhkaCombine = new Combine(3, 75, 9, 880, 3, "Black", "Bilosnizhka-2000");
        BilosnizhkaCombine.toString();
        BilosnizhkaCombine.printAveragePrice();
        Combine.printStaticAveragePrice();

    }
}
