//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberSwitch = 2;
        char charSwitch = 'a';
        String strSwitch = "str";

        switch (numberSwitch) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Undefined");
        }

        switch (charSwitch) {
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("b");
                break;
            default:
                System.out.println("Undefined");
        }

        switch (strSwitch) {
            case "str":
                System.out.println("str");
                break;
            case "strr":
                System.out.println("strr");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}