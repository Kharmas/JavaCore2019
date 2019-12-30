package module3_HW;

public class Arithmetic {

    public int add(Integer a, Integer b){
        int sum;
        sum = a + b;
        System.err.println(sum);
        return sum;
    }
}

class Substitution extends Arithmetic {

    public int substitue(Integer a, Integer b) {
        int substitution;
        substitution = add(a, -b);
        return substitution;
    }
}

class Multiplication extends Arithmetic {
    public int multy(Integer a, Integer b) {
        int mul = 0;
        for (int i = 0; i < a; i++) {
            mul = add(mul, b);
        }
        return mul;
    }
}


interface Shape {

    int perimetr();
}

class Square implements Shape {

    int a;

    Square(int a) {
        this.a = a;
    }

    @Override
    public int perimetr() {
        return 4 * a;
    }
}

class Triangle implements Shape {

    int a, b, c;

    Triangle(int q, int w, int e) {
        a =q;
        b = w;
        c = e;

    }

    @Override
    public int perimetr() {
        return a + b + c;
    }
}
