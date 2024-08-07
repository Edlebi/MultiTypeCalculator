package ConstructorPractice;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author();
        Author a2 = new Author("Hamzeh", "Jordan");

        Book b1 = new Book();
        Book b2 = new Book("Animal Farm", a1, 328);
        Book b3 = new Book("1087", a2, 167);

        System.out.println(b1.displayInfo());
        System.out.println("------------");
        System.out.println(b2.displayInfo());
        System.out.println("-------------");
        System.out.println(b3.displayInfo());
    }
}
