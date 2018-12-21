package proxy.example1;

public class ComputerUser {
    private boolean isAdmin;

    public ComputerUser(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    public boolean isAdmin() {
        return isAdmin;
    }
}
