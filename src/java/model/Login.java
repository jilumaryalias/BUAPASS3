package model;
// Generated Oct 26, 2018 5:26:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer loginId;
     private String username;
     private String password;
     private String type;
     private Set users = new HashSet(0);

    public Login() {
    }

	
    public Login(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }
    public Login(String username, String password, String type, Set users) {
       this.username = username;
       this.password = password;
       this.type = type;
       this.users = users;
    }
   
    public Integer getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }




}


