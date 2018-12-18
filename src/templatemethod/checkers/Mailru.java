package templatemethod.checkers;

public class Mailru extends EmailChecker {
    @Override
    protected void logOut() {
        System.out.println("Logging out of Mail.ru");
    }

    @Override
    protected void readMails() {
        System.out.println("Reading new mails in Mail.ru");
    }

    @Override
    protected void getUnreadMails() {
        System.out.println("Getting  new mails in Mail.ru");
    }

    @Override
    protected void loginToService() {
        System.out.println("Logging in Mail.ru");
    }
}
