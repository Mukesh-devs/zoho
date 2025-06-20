package practice;


import java.util.*;

public class Demo {

    public static void main(String[] args) throws Exception {

        Apple ap = new Apple();
        ap.setPrice(10);
        ap.setColor("red");
        Apple ap2 = ap.clone();

        ap2.setColor("blue");
        if ( ap == ap2) {
            System.out.println("shallow");
        }
        else {
            System.out.println("depp");
        }
        System.out.println(ap.getColor());
    }

}

class Apple implements Cloneable{
    int price;

    String color;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Apple clone() throws CloneNotSupportedException{
        return (Apple) super.clone();
    }
}