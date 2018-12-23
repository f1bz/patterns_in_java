package chainofresponsibilities.handlers;

import chainofresponsibilities.message.LoggedMessage;
import chainofresponsibilities.message.MessageType;

public class InfoLoggerHandler extends BaseHandler {
    @Override
    public void handle(LoggedMessage message) {
        if (message.getMessageType() == MessageType.INFO) {
            System.out.println("LEVEL INFO:" + message.getMessage());
        }else{
            nextHandler.handle(message);
        }
    }
}
