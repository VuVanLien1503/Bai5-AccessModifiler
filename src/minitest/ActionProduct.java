package minitest;

import java.util.Scanner;

public class ActionProduct {
    Product[] listProduct = new Product[10];
    public void display() {
        for (int i = 0; i < listProduct.length; i++) {
            System.out.println(listProduct[i]);
        }
    }
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i]!=null) {
                index = i+1;
            }else {
                break;
            }
        }
        for (int i = index; i < index + 1; i++) {
            System.out.println("Enter Name:");
            String name = scanner.next();
            System.out.println("Enter Price:");
            double price = scanner.nextDouble();
            System.out.println("Enter Category");
            String category = scanner.next();
            listProduct[i] = new Product(i + 1, name, price, category);
        }
    }
    public void findName(String name) {
        int count=0;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i]!=null){
                if (listProduct[i].name.contains(name)){
                    count++;
                    System.out.println("Find "+count+" "+ name +"/index:"+i);
                    System.out.println(listProduct[i]);
                }
            }
        }
    }
    public void editProduct(int id){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i]!=null){
                if (listProduct[i].id==id){
                    System.out.println("Enter Name:");
                    String name = scanner.next();
                    System.out.println("Enter Price:");
                    double price = scanner.nextDouble();
                    System.out.println("Enter Category");
                    String category = scanner.next();
                    listProduct[i].setId(id);
                    listProduct[i].setName(name);
                    listProduct[i].setPrice(price);
                    listProduct[i].setCategory(category);
                }
            }
        }
    }
    public void deleteProduct(int id){
        int index=0;
        Product[] newList=new Product[listProduct.length];
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].id==id){
                listProduct[i]=listProduct[i+1];
                index=i;
                break;
            }else {
                newList[i]=listProduct[i];
            }
        }
        for (int i = index; i <listProduct.length-1 ; i++) {
            newList[i]=listProduct[i+1];

        }
        listProduct=newList;
    }
}
