class Login 
{
    private String username;
    private String password;

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setPassword(String password) 
    {
        if (password.length() >= 8) 
        {
            this.password = password;
        } 
        else 
        {
            System.out.println("Password must be at least 8 characters");
        }
    }
    public String getUsername() 
    {
        return username;
    }
    public String getPassword() 
    {
        return password;
    }
}

public class Encapsulation

{
    public static void main(String[] args) 
    {
        Login user = new Login();

        user.setUsername("Srivani123");
        user.setPassword("sri123");      
        user.setPassword("sri12345");    

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
