package application;

public class Base {
    private String UserName;
    private String Name;
    private String Password;

    // default constructor
    public Base()
    {

    }
    public Base(String UserName, String Name, String Password)
    {
        setUserName(UserName);
        setName(Name);
        setPassword(Password);
    }
    // getters and setters

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String userName) {
        this.UserName = UserName;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String password) {
        this.Password = Password;
    }
}
