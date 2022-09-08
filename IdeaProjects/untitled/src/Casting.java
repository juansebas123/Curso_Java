public class Casting {
    public static void main(String[] args) {
        // en un año ubicar 30 perritos
        //cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //estimación
        int estimatedMonthliDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthliDogs);

        //exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        //Casteo entre tipos de datos
        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
