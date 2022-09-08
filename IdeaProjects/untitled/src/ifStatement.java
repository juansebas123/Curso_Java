public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("archivo enviado");

        } else {
            fileSended--;
            System.out.println("por favor enceinde tu blurtooth, para iniciarl la transferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}
