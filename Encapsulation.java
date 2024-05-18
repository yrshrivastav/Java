public class Encapsulation{

   
    private double balance = 700000;
    public double getBalance(){
        // validation
        return balance;
    }
    public void setBalance(double balance){
        // validation
        this.balance=balance;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        double balance = e.getBalance();
        System.out.println(balance);
        e.setBalance(500000);
        double new_balance = e.getBalance();
        System.out.println(new_balance);
    }
}



