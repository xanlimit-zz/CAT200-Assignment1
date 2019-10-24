package cat200;
public class account_database {
    private String username, password;
    public account_database(String a, String b){username=a; password=b;}
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String toString(){return username+" "+password;}
}
