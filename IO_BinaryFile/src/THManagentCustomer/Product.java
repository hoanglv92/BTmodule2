package THManagentCustomer;

public class Product {
    private  String name;
    private  String id;
    private  String nameManufactoring;
    private  int price;
    private  String information;

    public Product() {
    }

    public Product(String name, String id, String nameManufactoring, int price, String information) {
        this.name = name;
        this.id = id;
        this.nameManufactoring = nameManufactoring;
        this.price = price;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameManufactoring() {
        return nameManufactoring;
    }

    public void setNameManufactoring(String nameManufactoring) {
        this.nameManufactoring = nameManufactoring;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", nameManufactoring='" + nameManufactoring + '\'' +
                ", price='" + price + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
