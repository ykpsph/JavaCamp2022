package gun03;

import java.util.ArrayList;
import java.util.List;

import ders03.core.logging.DatabaseLogger;
import gun03.odev03.business.CourseManager;
import gun03.odev03.business.InstructorManager;
import gun03.odev03.core.logger.FileLogger;
import gun03.odev03.core.logger.Logger;
import gun03.odev03.dataAccess.Course.jdbcCourseDAO;
import gun03.odev03.dataAccess.Instructor.hibernateInstructorDAO;
import gun03.odev03.entities.Course;
import gun03.odev03.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Course> courses = new ArrayList<>();
        Course courses1 = new Course(
                "Java",
                "Engin",
                "Programlama",
                59.90
        );
        Course courses2 = new Course(
                "C++",
                "Yakup",
                "Programlama",
                58.90
        );

        List<Instructor> instructors = new ArrayList<>();
        Instructor instructors1 = new Instructor(
                1101,
                "Engin",
                99999,
                "demirog@java.com"
        );
        Instructor instructors2 = new Instructor(
                1102,
                "Engin",
                2.5,
                "bruce@noob.com"
        );
        Logger[] loggers = {new FileLogger(), new DatabaseLogger()};

        CourseManager courseManager = new CourseManager(new jdbcCourseDAO(), loggers );
        courseManager.create(courses1);
        courseManager.create(courses2);

        InstructorManager instructorManager = new InstructorManager(new hibernateInstructorDAO(), loggers);
        instructorManager.create(instructors1);
        instructorManager.create(instructors2);
    }
}
