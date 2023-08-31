package encap_sulation;
public class setter_getter {
    private static String username, address;

    public String getName(){
        return username;
    }
    public String getAddress(){
        return address;
    }
    public void setUsername(String emilID){
        username = emilID;
    }
    public void setAddress(String add){
        address = add;
    }
}
