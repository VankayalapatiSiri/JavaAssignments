package Question3;

import java.util.Scanner;

public class Book {
    String Book_title = "C ";
    float Book_price = 0;

    public String getBookTitle() {
        return Book_title;
    }

    public void setBookTitle(String title) {
        Book_title = title;
    }

    public float getBookPrice() {
        return Book_price;
    }

    public void setBookPrice(float price) {
        Book_price = price;
    }
}

class Solution {

    public static Scanner scan = new Scanner(System.in);

    public static void createBooks(Book[] books, int n) {

        for (int i = 0; i < n; i++) {
            Book temp = new Book();
            scan.nextLine();
            System.out.println("Enter Book " + (i + 1) + "Title: ");
            temp.setBookTitle(scan.nextLine());
            System.out.println("Enter Book " + (i + 1) + "Price: ");
            temp.setBookPrice(scan.nextFloat());
            books[i] = temp;
        }
    }

    public static void showBooks(Book[] books, int n) {

        String titleHeader = "Book Title", priceHeader = "Price";
        System.out.printf("%-20s %s\n", titleHeader, priceHeader);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %f\n",
                    books[i].getBookTitle(),
                    books[i].getBookPrice());
        }
    }

    public static void main(String args[]) {

        int n = scan.nextInt();
        Book[] books = new Book[n];

        createBooks(books, n);
        showBooks(books, n);
    }
}

