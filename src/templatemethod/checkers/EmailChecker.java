package templatemethod.checkers;

public abstract class EmailChecker {

    public final void checkEmails(){
        loginToService();
        getUnreadMails();
        readMails();
        logOut();
    }

    protected abstract void logOut();

    protected abstract void readMails();

    protected abstract void getUnreadMails();

    protected abstract void loginToService();
}
