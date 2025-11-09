package StrategyPattern;

interface PaymentMethod {
    public void pay();
}

class UPI implements PaymentMethod{
    private final String upiID;

    public UPI(String upiID){
        this.upiID = upiID;
    }

    @Override
    public void pay(){
        System.out.println("Payment completed on upiId"+upiID);
    }
}

class DebitCard implements PaymentMethod {
    private final String cardNo;

    public DebitCard(String cardNo){
        this.cardNo = cardNo;
    }

    @Override
    public void pay(){
        System.out.println("Payment completed on cardNo"+cardNo);
    }
}

class CreditCard implements PaymentMethod {
    private final String cardNo;

    public CreditCard(String cardNo){
        this.cardNo = cardNo;
    }

    @Override
    public void pay(){
        System.out.println("Payment completed on cardNo"+cardNo);
    }
}

class PaymentContext{
    private PaymentMethod paymentMethod;

    public PaymentContext(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    void makePayment(){
        if (paymentMethod == null){
            return;
        }
        paymentMethod.pay();
    }
}

public class Payment {
    public static void main() {
        PaymentContext paymentContext = new PaymentContext(
                new UPI("abc@okicici.com")
        );

        paymentContext.makePayment();
    }
}
