package gun03.odev03.dataAccess.Instructor;

import gun03.odev03.entities.Instructor;

public class jdbcInstructorDAO implements InstructorDAO{
    public void create(Instructor instructor){
        System.out.println("JDBC ile veritabanina eklendi: "+instructor.getName());
        System.out.println("--------------------------------------------");
    }
}
