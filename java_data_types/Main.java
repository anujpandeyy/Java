package java_data_types;

public class Main {
    public static void main(String[] args) {
        int numOfItem = 5;
        float costOfItem = 25.00f;
        float taxRate = 12.00f;
        boolean discount = true;
        int discountValue = 10;
        String storeName = "Best Buy";
        
      
        float costBeforeTax = numOfItem * costOfItem;
        
       
        float taxAmount = costBeforeTax * (taxRate / 100);
        
       
        float costAfterTax = costBeforeTax + taxAmount;
        
       
        float costAfterDiscount = costAfterTax;
        if (discount) {
            float discountAmount = costAfterTax * (discountValue / 100.0f);
            costAfterDiscount = costAfterTax - discountAmount;
        }
        
 
        System.out.println("Store: " + storeName);
        System.out.println("Items: " + numOfItem);
        System.out.println("Cost per item: $" + String.format("%.2f", costOfItem));
        System.out.println("Total cost before tax: $" + String.format("%.2f", costBeforeTax));
        System.out.println("Tax amount: $" + String.format("%.2f", taxAmount)); 
        System.out.println("Total cost after tax: $" + String.format("%.2f", costAfterTax));
        System.out.println("Discount applied: " + discount);
        if (discount) {
            System.out.println("Discount of: " + discountValue + "%");
        }
        System.out.println("Final total: $" + String.format("%.2f", costAfterDiscount));
    }
}
