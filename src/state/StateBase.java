package state;

public abstract class StateBase implements State{
    protected PaymentTerminal paymentTerminal;

    public StateBase(PaymentTerminal paymentTerminal) {
        this.paymentTerminal = paymentTerminal;
    }


}
