package Module3_HW;

import java.time.Instant;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Course cour1 = new Course(new Date(19, 10, 28), "TestCourse");
        Course cour2 = new Course(123,"ex","Ed");
        Course cour3 = new Course(new Date(19,11,02),"testCourse1");
        Course cour4 = new Course(156,"ex1","Tim");

        Course courses [] = {cour1,cour2,cour3,cour4};
        Student stud2 = new Student("Green",courses);
        Student stud1 = new Student("Tom", "Lee",220);

        CollegeStuden cStud = new CollegeStuden("John","Wood",155);
        CollegeStuden cStud1 = new CollegeStuden("Mike","Green",120,"CSM",3,2652);
        CollegeStuden cSud2 = new CollegeStuden("Green",courses);

        SpecialStudent sStud = new SpecialStudent("Tim","Osborn",125);
        SpecialStudent sStud1 = new SpecialStudent("Osborn",courses);
        SpecialStudent sStud2 = new SpecialStudent("Tom","Lee",220,2523);


        Bird bird = new Bird();
        bird.say();


//        Arithmetic arithmetic = new Arithmetic();
//        arithmetic.add(26,4);
//
//        Adder adder = new Adder();
//        adder.check(5,3);





    }


}
