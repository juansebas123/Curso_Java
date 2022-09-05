public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //recive un bono de $200
        //salary = salary + 200;
        salary += 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //cupon de comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Sebastian";
        //concatenar texto
        employeeName = employeeName + " Ricaurte Gonzalez";
        System.out.println(employeeName);

        employeeName= "Juan " + employeeName;
        System.out.println("tu nombre es: " + employeeName);

    }
}
