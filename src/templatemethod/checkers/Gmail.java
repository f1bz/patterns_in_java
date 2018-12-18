package templatemethod.checkers;

public class Gmail extends EmailChecker{

    @Override
    protected void logOut() {
        System.out.println("Logging out of Gmail");
    }

    @Override
    protected void readMails() {
        System.out.println("Reading new mails in Gmail");
    }

    @Override
    protected void getUnreadMails() {
        System.out.println("Getting  new mails in Gmail");
    }

    @Override
    protected void loginToService() {
        System.out.println("Logging in Gmail");
    }
}
