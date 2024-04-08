public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean isGuest;


    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }


    public void registerUser(String name, String surname, String password) {
        if(isGuest) {
            this.name = name;
            this.surname = surname;
            this.password = password;
            this.isGuest = false;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
