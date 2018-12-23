package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;
import chainofresponsibilities.message.MessageType;

public class ErrorLoggerHandler extends BaseHandler {
    @Override
    public void handle(LoggedMessage message) {
        if (message.getMessageType() == MessageType.ERROR) {
            System.out.println("LEVEL ERROR:" + message.getMessage());
        }else{
            System.out.println("there is no handler to cope with this message");
        }
    }
}
