package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;

public abstract class BaseHandler implements Handler {
    protected Handler nextHandler;
    @Override

    public final void setHandle(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void handle(LoggedMessage message) {

    }
}
