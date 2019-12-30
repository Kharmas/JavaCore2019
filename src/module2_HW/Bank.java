package module2_HW;

public class Bank {

    public static void main(String[] args) {


        /*Continue with BANK example
2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

Example

Input

balance = 100
withdrawal = 10

Output
OK 0.5 89.5

Input

balance = 100
withdrawal = 99

Output
NO*/

       int balance = 100;
       int withdrawal = 96;

       bank(balance,withdrawal);


    }

    static int bank (double balance, double withdrawal){

        double outComm = 0;
        double outBal = 0;

        outComm = withdrawal * 0.05 ;
        outBal =  balance - withdrawal - outComm;

        if (outBal > 0){
            System.out.println("Ok " + outComm + " " + outBal);
        }else {
            System.out.println("No*/");
        }


        



        return 0;
    }

}
