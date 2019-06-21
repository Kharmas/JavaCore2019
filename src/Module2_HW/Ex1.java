package Module2_HW;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        int [] ar = {3,5,2};
        System.out.println(Arrays.toString(ar));
        sum(ar);
        max(ar);
        min(ar);
        //maxPositive(ar);
        multiplication(ar);


    }

    static int multiplication(int [] array){
        int result = 1;
        for (int i: array){

            result = result * i;
        }
        System.out.println("multiplication = " + result);
        return result;

    }


    static int maxPositive(int [] array){

        int result = array[0];
        for (int i: array){
            if (result > 0){
                result = i;
            }

        }

        System.out.println("maxPositive = " + result);
        return result;
    }


    static int sum(int [] array) {

        int result = 0;

        for (int i: array){
            result += i;
        }
        System.out.println("Sum = " + result);
        return result;

    }

    static int max(int [] array){

        int result = array[0];

        for (int i: array){

            if (result < i ){
                result = i;

            }
        }
        System.out.println("Max = " + result);
        return result;
    }

    static int min (int [] array){

        int result = array[0];

        for (int i: array){
            if (result > i){
                result = i;
            }
        }
        System.out.println("Min = " + result);
        return result;
    }



}
