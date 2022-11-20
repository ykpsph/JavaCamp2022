package gun03.odev03.entities;

public class Instructor {
    private int id;
    private String name;
    private double salary;
    private String mail;

    public Instructor(int id, String name, double salary, String mail){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mail = mail;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
}

