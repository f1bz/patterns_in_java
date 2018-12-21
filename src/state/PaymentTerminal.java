package state;

import state.states.ReadyTerminalState;

public class PaymentTerminal implements State {
    private State currentState;

    public PaymentTerminal() {
        currentState = new ReadyTerminalState(this);
    }

    @Override
    public void ready() {
        currentState.ready();
    }

    @Override
    public void insertMoney() {
        currentState.insertMoney();
    }

    @Override
    public void selectPayment() {
        currentState.selectPayment();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
