package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;

public interface Handler {
    void setHandle(Handler handler);

    void handle(LoggedMessage message);
}
