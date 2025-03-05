package java_variables;

public class Main{
    public static void main(String[] args){
        String make = "Toyota";
        String model = "Corolla";
        int yearOfManufacture = 2020;
        float price = 25000.50f;
        boolean available = true;
        System.out.println("Car Make: "+make+", "+"Model: "+model+", "+"Year: "+yearOfManufacture+", "+"Price: "+"$"+price+", "+"Available for sale: "+available);
        float newPrice = 24000.00f;
        System.out.println("Car Make: "+make+", "+"Model: "+model+", "+"Year: "+yearOfManufacture+", "+"Price: "+"$"+newPrice+", "+"Available for sale: "+available);
    }
}