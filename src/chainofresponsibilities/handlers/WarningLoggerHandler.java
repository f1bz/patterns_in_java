package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;
import chainofresponsibilities.message.MessageType;

public class WarningLoggerHandler extends BaseHandler {
    @Override
    public void handle(LoggedMessage message) {
        if (message.getMessageType() == MessageType.WARNING) {
            System.out.println("LEVEL WARNING:" + message.getMessage());
        }else{
            nextHandler.handle(message);
        }
    }
}
