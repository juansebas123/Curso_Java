public class DataTypes {
    public static void main(String[] args) {

        // tipo de dato byte=1byte, short=2bytes, int=4bytes, long=8bytes
        int n = 1234567890;
        long nL=12345678901L;

        //decimales float=4bytes, double=8bytes
        double nD = 123.456;
        float nF = 123.456F;

        //tipo var
        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03;// double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Juan Sebastian";
        System.out.println("EMPLOYEE: " + employeeName + "SALARY: " + totalSalary);

    }
}
