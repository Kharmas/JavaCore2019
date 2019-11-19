package Module3_HW;

public class User {

    /*ЗАДАНИЕ 4
Создайте класс User со следующими полями:
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.
Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
Напишите методы:
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLenght - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth*/

    private String name;
    private int balance;
    private int monthsOfEmployee;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployee, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployee = monthsOfEmployee;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthsOfEmployee() {
        return monthsOfEmployee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployee(int monthsOfEmployee) {
        this.monthsOfEmployee = monthsOfEmployee;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary(){
        balance = balance + salary;
        System.out.println(balance);
    }
    //withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
    void withdraw(int summ){
        double balanceShow;
        if (summ < 1000){
           double com = summ * 0.05;
           balanceShow = balance - summ - com;
           System.out.println("Баланс після зняття коштів - " + balanceShow);
        } else {
           double com = summ * 0.10;
           balanceShow = balance - summ - com;
           System.out.println("Баланс після зняття коштів - " + balanceShow);
        }
    }

    //companyNameLenght - вычисляет длину имя компании
    void companyNameLenght(){
        System.out.println("Довжина назви компанії - " + companyName.length());
    }

    // monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth

    void monthIncreaser(int addMonth){
        monthsOfEmployee = monthsOfEmployee + addMonth;
        System.out.println("monthsOfEmployee - " + monthsOfEmployee);
    }





    



}
