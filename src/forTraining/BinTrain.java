package forTraining;

public class BinTrain {
    private int number;

    public BinTrain (int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void countNum (int res){
        res = (number >10)? number + 10 : number + 50;
        System.out.println(" Result " + res);
    }


}
