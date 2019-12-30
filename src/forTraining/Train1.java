package forTraining;

public class Train1 {

    private String [] names;
    private int num;

   public Train1(String [] names)  {
     this.names = names;
   }


   public String [] getNames() {
       return this.names;
   }

    public int getNum() {
        return num;
    }

    public int bintree(int num){
       int countNum = (num >10)? num + 10 : num + 50;
       return countNum;
   }





}
