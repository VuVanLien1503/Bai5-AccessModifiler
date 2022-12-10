package TH_staticmethod;

public class StaticMethod {
    private int rollNo;
    private String name;
    private static String college="BBDIT";

    public StaticMethod(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public StaticMethod() {
    }
    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }
    //method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
