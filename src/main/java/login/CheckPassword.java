package login;

public class CheckPassword {
    private LoginAdmin loginAdmin = new LoginAdmin();

    public boolean addAdminAndPasswordCheck(String login, String password) {
        addAdmin();
        return passwordCheck(login, password);
    }

    private boolean passwordCheck(String login, String password) {
        if (loginAdmin.getLogin().equals(login) & loginAdmin.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    private void addAdmin() {
        loginAdmin.setLogin("root");
        loginAdmin.setPassword("root");
    }
}
