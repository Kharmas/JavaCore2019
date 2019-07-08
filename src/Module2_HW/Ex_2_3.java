package Module2_HW;

import java.util.Scanner;

public class Ex_2_3 {

    public static void main(String[] args) {

        /*You need to write method which withdraw money of particular account owner if he/she can.
        Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
        Commision is 5% for all cases.

Example

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Ann
double withdrawal = 100;

Output
Ann 100 145

Input

int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

String ownerName = Oww
double withdrawal = 490;

Output
Oww NO

*/

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        bank(balances,ownerNames);

    }

    static int bank (int balances[], String ownerName[]){



        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String owName = in.nextLine();
        //System.out.println(owName);

        System.out.println("Input amount: ");
        double withdrawal = in.nextInt();
        //System.out.println(withdrawal);

        for (int i = 0; i < ownerName.length; i++ ){
            //System.out.println(ownerName[i]);
            if (owName.equals(ownerName[i])){
                System.out.print(owName + " ");

                for (int j = 0; j < balances.length; j++){

                    if (i == j) {

                        double outComm = 0;
                        double outBal = 0;

                        outComm = withdrawal * 0.05;
                        outBal = (balances[j]) - withdrawal - outComm;

                        if (outBal > 0) {
                            System.out.println((int)withdrawal + " " + (int)outBal);
                        } else {
                            System.out.println("NO");
                        }
                    }

                }

            }
        }




        return 0;

    }

}
