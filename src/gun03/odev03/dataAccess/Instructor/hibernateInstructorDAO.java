package gun03.odev03.dataAccess.Instructor;

import gun03.odev03.entities.Instructor;

public class hibernateInstructorDAO implements InstructorDAO{
    @Override
    public void create(Instructor instructor) {
        System.out.println("Hibernate ile veritabanina eklendi: "+instructor.getName());
    }
}