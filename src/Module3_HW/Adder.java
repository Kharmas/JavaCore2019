package Module3_HW;

public class Adder extends Arithmetic {

    public boolean check (int a, int b){
//        boolean result;
//        if (a >= b){
//            result = true;
//        }else {
//            result = false;
//        }
//        return result;

        boolean res = a >= b;
        System.out.println(res);
        return res;
    }

}
