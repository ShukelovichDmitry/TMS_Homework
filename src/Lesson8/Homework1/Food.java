package Lesson8.Homework1;

public class Food implements Product{
    private String name;
    private double price;

    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public double getFinalPrice() {
        return price;
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