package gun03.odev03.entities;

public class Course {
    private String name; // kurs
    private String instructor; // egitmen
    private String category; // kategori
    private double price; // fiyat

    public Course (String name, String instructor, String category,
                   double price) {
        this.name = name;
        this.instructor = instructor;
        this.category = category;
        this.price = price;

    }

    public String getName() {
        return name;
    }
    public void setCourseName(String courseName){
        this.name = name;
    }

    public String getInstructor(){
        return instructor;
    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }

    public String getCourseCategory() {
        return category;
    }
    public void setCourseCategory(String category){
        this.category = category;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}