package state.states;

import state.PaymentTerminal;
import state.StateBase;

public class ReadyTerminalState extends StateBase {


    public ReadyTerminalState(PaymentTerminal paymentTerminal) {
        super(paymentTerminal);
    }

    @Override
    public void ready() {
        System.out.println("We are ready! Select Payment now!");
        paymentTerminal.setCurrentState(new SelectPaymentTerminalState(paymentTerminal));
    }

    @Override
    public void insertMoney() {
        System.out.println("Ooops, something went wrong! First get ready");
    }

    @Override
    public void selectPayment() {
        System.out.println("Ooops, something went wrong! First get ready");
    }
}
