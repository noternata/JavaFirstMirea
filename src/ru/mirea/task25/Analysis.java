package ru.mirea.task25;

interface Service {
    public int getPrice();
    public String getType();
}
class GeneralBloodA implements Service {
    private String type;
    private int price;
    public GeneralBloodA (String type, int price) {
        this.type = type;
        this.price = price;
    }
    public int getPrice() {return this.price;}
    public String getType() {return this.type;    }
}
class BloodChememistry implements Service {
    private String type;
    private int price;
    public BloodChememistry (String type, int price) {
        this.type = type;
        this.price = price;
    }
    public int getPrice() {return this.price;}
    public String getType() {return this.type;    }
}
class OptionDecorator implements Service {
    private Service service;
    private String type;
    private int price;
    public OptionDecorator(Service service, String type, int price) {
        this.service = service;
        this.type = type;
        this.price = price;
    }
    public int getPrice() {return this.price + service.getPrice();}
    public String getType() {return this.type + service.getType();}
}
class TestVit extends OptionDecorator {
    public TestVit(Service service) {
        super(service, "Bood test for vitamins", 1500);
    }
}
class TestAntibodies extends OptionDecorator {
    public TestAntibodies(Service service) {
        super(service, "Bood test for antibodies", 2000);
    }
}
public class Analysis {
    public static void main(String[] args) {
        // Общий анализ крови
        Service genbl = new GeneralBloodA("General blood analysis", 1000);
        Service testv = new TestVit(genbl);
        Service antibodyt = new TestAntibodies(testv);

        // И общая стоимость
        System.out.println("Total cost of analysis: "+ antibodyt.getPrice());
    }
}
