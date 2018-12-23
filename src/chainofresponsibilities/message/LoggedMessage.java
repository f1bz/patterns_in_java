package chainofresponsibilities.message;

public class LoggedMessage {
    private String message;
    private MessageType messageType;

    public LoggedMessage(String message, MessageType messageType) {
        this.message = message;
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public MessageType getMessageType() {
        return messageType;
    }
}
