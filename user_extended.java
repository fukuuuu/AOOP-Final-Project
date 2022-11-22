package Home;

import static Home.DBConnection.user;
import java.util.ArrayList;

public class user_extended {
    static ArrayList<user> users= new ArrayList<user>() ;  
    public user_extended() { 
    } 
    
    public void printstring(){ 
        for (int i =0 ; i<=users.size()-1 ; i++) {
            users.get(i).printoString(); 
        }
    } 
    
    public void add(user u)  {
        users.add(u) ;
    } 
    
    public void compare(String username) { 
        for(int i = users.size()-1; i >= 0 ; i--) { 
            if (!username.equals(users.get(i).UserName )) {  

                users.remove(i) ;

            } 

        }
    }
}
