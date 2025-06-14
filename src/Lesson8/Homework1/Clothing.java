package Lesson8.Homework1;

public class Clothing implements Product{
    private String name;
    private double price;

    public Clothing(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public double getFinalPrice() {
        return price*0.85;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showFinalPrice() {
        System.out.println(name + ", Цена: " + getFinalPrice());
    }
}