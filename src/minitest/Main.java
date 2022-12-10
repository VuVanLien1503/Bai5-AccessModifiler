package minitest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ActionProduct actionProduct=new ActionProduct();
        actionProduct.listProduct[0]=new Product(1,"vina",1.5,"ThuocLa");
        actionProduct.listProduct[1]=new Product(2,"vina1",2.5,"ThuocLa");
        actionProduct.listProduct[2]=new Product(3,"SaiGon",3.5,"ThuocLa");
        System.out.println(actionProduct.listProduct.length);
        Scanner scanner=new Scanner(System.in);
        int choice=-1;

        do {
            System.out.println("Menu:");
            System.out.println("1.Show List Product:");
            System.out.println("2.AddProduct:");
            System.out.println("3.FindNameProduct:");
            System.out.println("4.Edit Product:");
            System.out.println("5. delete Product:");
            System.out.println("0.Exit:");
            System.out.print("Enter choice : ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    actionProduct.display();
                    break;
                case 2:
                    actionProduct.addProduct();
                    break;
                case 3:
                    System.out.println("Enter Find Name product");
                    actionProduct.findName(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter Id editProduct:");
                    actionProduct.editProduct(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Enter deleteID Product");
                    actionProduct.deleteProduct(scanner.nextInt());
                    break;

            }
        }
        while (choice!=0);
    }
}
