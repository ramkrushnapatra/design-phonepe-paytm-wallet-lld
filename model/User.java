package model;

public class User {
    private Integer userId;
    private String username;
    private String emailId;

    public User(Integer userId, String username, String emailId) {
        this.userId = userId;
        this.username = username;
        this.emailId = emailId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
