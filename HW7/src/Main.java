public class Main {
    public static void main(String[] args) {

        ExchangeTemplateClass<Integer> obj1 = new ExchangeTemplateClass<>(10);
        ExchangeTemplateClass<Integer> obj2 = new ExchangeTemplateClass<>(20);

        System.out.println("Before Exchange:");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());

        swapObjects(obj1, obj2);

        System.out.println("After Exchange:");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());
    }

    public static <T> void swapObjects(ExchangeTemplateClass<T> a, ExchangeTemplateClass<T> b) {
        T temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
}