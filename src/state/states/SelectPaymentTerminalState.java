package state.states;

import state.PaymentTerminal;
import state.StateBase;

public class SelectPaymentTerminalState extends StateBase {

    public SelectPaymentTerminalState(PaymentTerminal paymentTerminal) {
        super(paymentTerminal);
    }


    @Override
    public void ready() {
        System.out.println("Ooops, something went wrong! First select payment");
    }

    @Override
    public void insertMoney() {
        System.out.println("Ooops, something went wrong! First select payment");
    }

    @Override
    public void selectPayment() {
        System.out.println("Ok! It's time to insert your money!");
        paymentTerminal.setCurrentState(new InsertMoneyTerminalState(paymentTerminal));

    }
}
