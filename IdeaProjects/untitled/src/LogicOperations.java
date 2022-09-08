public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores asignación
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente a b? -> " + (a != b));

        //operaciones relacionales

        System.out.println("a es mayora b? -> " + (a > b));
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es mayor o igual b? -> " + (a >= b));
        System.out.println("a es menor o igual b? -> " + (a <= b));
        System.out.println("/n");

        if (a == b){
            System.out.println("a es igual a b? -> " );
        } else if ((a != b) && (a > b)) {
            System.out.println("a es diferente a b? -> ");
        } else if (a > b) {
            System.out.println("a es mayora b? -> ");
        }else if (a < b){
            System.out.println("a es menor a b? -> ");
        } else if (a >= b) {
            System.out.println("a es mayor o igual b? -> ");
        } else if (a <= b) {
            System.out.println("a es menor o igual b? -> ");
        }
    }
}
