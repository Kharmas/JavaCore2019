package Module3_HW;

public class Main {

    public static void main(String[] args) {

        Student stud1 = new Student("Tom", "Lee",220);
        Student stud2 = new Student("Ed","Black",285);
        System.out.println(stud1.lastName);
        CollegeStuden cStud = new CollegeStuden("Mike","Green",120,"CSM",3,2652);


//        Arithmetic arithmetic = new Arithmetic();
//        arithmetic.add(26,4);
//
//        Adder adder = new Adder();
//        adder.check(5,3);





    }

    public static void printPerimetr(Shape figura) {
        System.out.println(figura.perimetr());
    }

}
