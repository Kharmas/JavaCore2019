package forTraining;

public class UserMain {

    public static void main(String[] args) {

        BinTrain binTrain = new BinTrain(51);

       UserTest user = new UserTest("Jo",25, "Oz",5490);
        System.out.println(user.age);
        System.out.println(user.company);
        System.out.println(user.name);

        Cat cat1 = new Cat("Red",15);

        String[] names = {"My", "Name"};

        Train1 ex2 = new Train1(names);
        Train1 train1 = new Train1(new String[] {"Hello", "World"});
        binTrain.countNum(5);



       //System.out.println(user.name);
       // System.out.println(user.age);
       // System.out.println(user.company);

        //System.out.println(user);







    }

}
