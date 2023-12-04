package Aggregation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Emmma",1801,"MCA");
        Student std2 = new Student("Femma",1802,"MCA");
        Student std3 = new Student("Gemma",1804,"DCA");
        Student std4 = new Student("Hemma",1806,"DCA");
        Student std5 = new Student("Imma",1808,"GCA");

        List<Student> mca_students = new ArrayList<Student>();
        mca_students.add(std1);
        mca_students.add(std2);

        List<Student> dca_students = new ArrayList<Student>();
        dca_students.add(std3);
        dca_students.add(std4);

        List<Student> gca_students = new ArrayList<Student>();
        gca_students.add(std5);

        Course MCA = new Course("MCA",mca_students);
        Course DCA = new Course("DCA",dca_students);
        Course GCA = new Course("GCA",gca_students);

        List<Course> courses = new ArrayList<Course>();
        courses.add(MCA);
        courses.add(DCA);
        courses.add(GCA);

        College college= new College("ABES",courses);
        for(Course course: courses){
            System.out.println(course);
        }
        System.out.println(college.collegeName+ " has "+college.countStudents()+" students.");
        System.out.println(college.collegeName+" has available "+college.getCourses());

    }
}
