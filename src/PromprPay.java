public class PromprPay implements Payment{
    @Override
    public void pay(double money) {
        IO.readln(String.format("get Mobile Application"));
        IO.println(String.format("paid " + money + " Baht using PromptPay."));
    }
}
