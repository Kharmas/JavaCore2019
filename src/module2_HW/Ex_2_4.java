package module2_HW;

import java.util.Scanner;

public class Ex_2_4 {

    public static void main(String[] args) {

        /* You need to write method which will fund (пополнение) balance of particular user.
        Print name + balance after funding

        Input

        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = Oww
        double withdrawal = 100;

        Output
        Oww 600



*/

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        replenish(balances,ownerNames);
    }

    static int replenish (int balances[], String ownerName[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String owName = in.nextLine();
        //System.out.println(owName);

        System.out.println("Input amount: ");
        double withdrawal = in.nextInt();
        //System.out.println(withdrawal);

        for (int i = 0; i < ownerName.length; i++) {

            if (owName.equals(ownerName[i])) {
                System.out.print(owName + " ");

                for (int j = 0; j < balances.length; j++) {

                    if (i == j) {
                        double outComm = 0;
                        double outBal = 0;

                        outBal = (balances[j]) + withdrawal ;
                        System.out.println((int)outBal);

                    }

                }

            }
        }




        return 0;

    }



}
