package model;
// Generated Sep 6, 2018 2:41:38 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer loginId;
     private User user;
     private String username;
     private String password;
     private String type;

    public Login() {
    }

    public Login(User user, String username, String password, String type) {
       this.user = user;
       this.username = username;
       this.password = password;
       this.type = type;
    }
   
    public Integer getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
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




}

