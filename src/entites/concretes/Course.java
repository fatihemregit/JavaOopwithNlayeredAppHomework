package entites.concretes;

public class Course {
    private int id;
    private int unitPrice;
    private String name;

    public Course(int id, int unitPrice, String name) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
