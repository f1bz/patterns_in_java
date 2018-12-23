package chainofresponsibilities;

import chainofresponsibilities.handlers.*;
import chainofresponsibilities.message.LoggedMessage;
import chainofresponsibilities.message.MessageType;

public class Main {
    public static void main(String[] args) {

        Handler info = new InfoLoggerHandler();
        Handler debug = new DebugLoggerHandler();
        Handler warning = new WarningLoggerHandler();
        Handler error = new ErrorLoggerHandler();

        info.setHandle(debug);
        debug.setHandle(warning);
        warning.setHandle(error);

        info.handle(new LoggedMessage("HERE WE GO!!", MessageType.INFO));
        info.handle(new LoggedMessage("SYSTEM SEEMS TO WORK FINE!", MessageType.DEBUG));
        info.handle(new LoggedMessage("YOU ARE THE BEST!", MessageType.WARNING));
        info.handle(new LoggedMessage("Oops, SOMETHING WENT WRONG!", MessageType.ERROR));

    }
}
