public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //area de un circu lo pi*r^2
        System.out.println(circleArea(y));
        //area de una esfera
        //4*PI*r^2
        System.out.println(sphereArea(y));
        //vlomen de una esfera (4/3)*pi*r^2
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOALRES: " + converToDolar(200, "MXN"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return  4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
