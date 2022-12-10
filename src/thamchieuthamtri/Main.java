package thamchieuthamtri;

public class Main {
    public static void main(String[] args) {
        int number=5;
        demo(number);
        System.out.println(number);
        System.out.println(demo(number));

        Product product1=new Product("NguyenA");
        Product product2=new Product("NguyenB");
        System.out.println("product1"+product1);
        System.out.println("product2"+product2);
        product1=product2;
        System.out.println("product1"+product1);
        System.out.println("product2"+product2);
        product2.setName("NguyenC");
        System.out.println("product1"+product1);
        System.out.println("product2"+product2);
    }
    public static int demo(int number){
        number+=number;
        return number;
    }
}
