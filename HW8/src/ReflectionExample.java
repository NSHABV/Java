public class ReflectionExample {
    private String name;
    private int val;

    public ReflectionExample(String name, int val) {
        this.name = name;
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void introduce() {
        System.out.println("String: " + name + "; val: " + val);
    }
}
