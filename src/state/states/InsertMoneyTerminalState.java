package state.states;

import state.PaymentTerminal;
import state.StateBase;

public class InsertMoneyTerminalState extends StateBase {

    public InsertMoneyTerminalState(PaymentTerminal paymentTerminal) {
        super(paymentTerminal);
    }

    @Override
    public void ready() {
        System.out.println("Ooops, something went wrong! First insert money");
    }

    @Override
    public void insertMoney() {
        System.out.println("Ok! Your payment has been successfully processed!");
        paymentTerminal.setCurrentState(new ReadyTerminalState(paymentTerminal));
    }

    @Override
    public void selectPayment() {
        System.out.println("Ooops, something went wrong! First insert money ");
    }
}
