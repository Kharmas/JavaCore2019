package Module3_HW;

public class Main {

    public static void main(String[] args) {

       //Bird bird = new Bird();
       //System.out.println(bird.sing(" walking"));
       //System.out.println(bird.sing(" flying"));
       //System.out.println(bird.sing(" singing"));
       //System.out.println(bird.sing(" Bird"));

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(26,4);

        Square square = new Square(4);
        Triangle triangle = new Triangle(1, 2, 3);
        printPerimetr(square);
        printPerimetr(triangle);

    }

    public static void printPerimetr(Shape figura) {
        System.out.println(figura.perimetr());
    }

}
