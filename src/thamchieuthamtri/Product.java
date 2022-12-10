package thamchieuthamtri;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                '}';
    }
}
