package Module2_HW;

public class Ex1 {
    public static void main(String[] args) {
        /*
        ЗАДАНИЕ 1
Input: array with size = 10 can be of one of two data types: int and double. Calculate:

sum, min/max, max positive, multiplication, modulus of first and last element,
second largest element

As a result you should have methods with following names :

sum(int array[]), sum(double[])
min(int array[]), min(double[])
max(int array[]), max(double[])
maxPositive(int array[]), maxPositive(double array[]),
multiplication  (int array[]), multiplication (double[])
modulus(int array[]), modulus(double[])
secondLargest(int array[]), secondLargest(double[])
         */
        int [] ar = {10,5,9};
        sum(ar);
    }
     static int sum(int [] array) {

        int result = 0;

        for (int i = 0; i < array.length; i++){
            result = result + array[i];
        }
        System.out.println(result);
        return result;

    }

     /*static int test(int a, int b){
        int res;
        if (a > b)
            res = a;
        else
            res = b;
        System.out.println(res);
        return res;
    }*/

}
