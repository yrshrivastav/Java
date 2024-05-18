public class data_hiding {
    public static void main(String[] args) {
        data_hiding d1 = new data_hiding();
        double balance = d1.getBalance();
        System.out.println(balance);
    }   
    private double balance = 700000;
    public double getBalance(){
        // validation
        return balance;
    }
}

