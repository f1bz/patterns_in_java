package state;

public class Main {
    public static void main(String[] args) {
        PaymentTerminal paymentTerminal = new PaymentTerminal();

        paymentTerminal.insertMoney();

        paymentTerminal.ready();
        paymentTerminal.selectPayment();
        paymentTerminal.insertMoney();

        paymentTerminal.insertMoney();


    }
}
