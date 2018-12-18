package templatemethod;

import templatemethod.checkers.EmailChecker;
import templatemethod.checkers.Gmail;
import templatemethod.checkers.Mailru;

public class Main {
    public static void main(String[] args) {
        EmailChecker checker = new Gmail();
        EmailChecker checker2 = new Mailru();

        checker.checkEmails();
        System.out.println();
        checker2.checkEmails();
    }
}
