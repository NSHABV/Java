//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        String newStr = str + " str summ demonstration";
        System.out.println(newStr);

        String subStr = str.substring(7);
        System.out.println("Substring Demo: " + subStr);

        String ucStr = str.toUpperCase();
        System.out.println("Upper case function: " + ucStr);

        String lcStr = str.toLowerCase();
        System.out.println("lower case function: " + lcStr);

        String replacedWorld = str.replace("World", "Test");
        System.out.println("replace method result: " + replacedWorld);

        boolean containsWorld = str.contains("World");
        System.out.println("contains 'World' result: " + containsWorld);

        int indexOfH = str.indexOf("H");
        System.out.println("indexof 'H': " + indexOfH);

        String spacedStr = "   Hello World   ";
        String trimm = spacedStr.trim();
        System.out.println("Trimmed: " + trimm);

        int len = str.length();
        System.out.println("Length: " + len);
    }
}
