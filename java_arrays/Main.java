package java_arrays;

public class Main {
    public static void main(String[] args) {
        int totalBooksRead = 0;
        float avgBooks = 0;
        int maxBooks = 0;
        int minBooks = 1000;
        int [] booksRead = {5, 12, 7, 9, 3};
        for(int i=0;i<booksRead.length;i++){
            totalBooksRead += booksRead[i];
            avgBooks = (float)totalBooksRead/booksRead.length;
            if(booksRead[i]>=maxBooks){
                maxBooks = booksRead[i];
            }
            if(booksRead[i]<=minBooks){
                minBooks = booksRead[i];
            }
        }
        System.out.println("Total books read: "+totalBooksRead);
        System.out.println("Average books read: "+avgBooks);
        System.out.println("Highest number of books read: "+maxBooks);
        System.out.println("Lowest number of books read: "+minBooks);
    }
}
