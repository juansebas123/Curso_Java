public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);
        //nos devuelve un numero entero hacia arriba
        System.out.println(Math.ceil(x));
        //nos devuelve un numero entero hacia abajo
        System.out.println(Math.floor(x));
        //nos devuelve un numero elevado a otro numero 2^3=8
        System.out.println(Math.pow(x,y));
        //nos devuelve el numero mayor entre los dos
        System.out.println(Math.max(x,y));
        //nos devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        //area de un circulo pi*r^2
        System.out.println(Math.PI * Math.pow(y,2));
        //area de una esfera
        //4*PI*r^2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        //vlomen de una esfera (4/3)*pi*r^2
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
