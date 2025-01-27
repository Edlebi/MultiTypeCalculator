package ConstructorPractice;

public class Book {
    private String title;
    private Author author;
    private int pages;

    public Book(){
        this("Untitled", new Author(), 300);
    }
    public Book(String title, Author author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public Book(String title, Author author){
        this.title = title;
        this.author = new Author();
        this.pages = 100;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String displayInfo(){
        return "Title: " + title + "\nAuthor: " + author.displayInfo() + "\nPages: " + pages;
    }


}
