public class CreditPayment implements  Payment{
    @Override
    public void pay(double money) {
        IO.println(String.format("paid " + money + " Baht using Credit Caed."));
        IO.readln(String.format("get point for Cash back"));
    }
}
