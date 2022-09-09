public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark"; //hagalo ocn 1

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("seleccionaste Light Mode");
                break;
            case "Night": //Ambar
                System.out.println("seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("seleccionaste Dark Mode");
                break;
            default:
                System.out.println("seleciona una opción");
        }
    }
}
