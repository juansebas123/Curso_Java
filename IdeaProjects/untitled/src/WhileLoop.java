public class WhileLoop {

    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {

        turnOnOffLight();

        int i = 1;
        while (isTurnOnLigth && i<=10){
            printSOS();
            i++;
        }
    }
    //void no devolver nada, solo imprime el mensaje
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight(){
        //evaluar otra forma de if
        /*
        if (isTurnOnLigth){
            isTurnOnLigth = false;
        }else{
            isTurnOnLigth = true;
        }
        return isTurnOnLigth;
         */
        //operador ternario otra for de hacerlo del if
        // isTurnOnLigth = ()?valor1:valor2; valor 1 es verdadero y si valor 2 es cuando es falso
        // isTurnOnLigth = (isTurnOnLigth)?false:true;
        //sTurnOnLigth = !isTurnOnLigth; esta formal o da el sistema mmm
        isTurnOnLigth = !isTurnOnLigth;
        return  isTurnOnLigth;
    }
}
