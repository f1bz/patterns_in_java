package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;
import chainofresponsibilities.message.MessageType;

public class DebugLoggerHandler extends BaseHandler {
    @Override
    public void handle(LoggedMessage message) {
        if (message.getMessageType() == MessageType.DEBUG) {
            System.out.println("LEVEL DEBUG:" + message.getMessage());
        }else{
            nextHandler.handle(message);
        }
    }
}
