package Streams;

public class Product {
    private String name;
    private int price;

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    Product(String name , int price){
        this.name = name;
        this.price = price;
    }

    /*
    **L5 Map to Operations
    public Product (String line){
        var array = line.split("\t");
        this.name = array[0];
        this.price = Integer.parseInt(array[1]);
    }
     */

    public String toString(){
        return String.format("Product [name : %s , price : %d" , name , price);
    }

    //Set For L6_PeekOperation
    public void setPrice(int price){
        this.price = price;
    }
}
