package ConstructorPractice;

public class Author {
    private String name;
    private String country;

    public Author(){
        this("Unknown", "Unknown");
    }
    public Author(String name, String country){
        this.name = name;
        this.country = country;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setName(String name){
        this.name = name;
    }
    public String displayInfo(){
        return name + " " + country;
    }
}
