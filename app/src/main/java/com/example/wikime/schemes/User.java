package com.example.wikime.schemes;

public class User {

    private String username, userId, userProfileImage;

    public User(String username, String userId, String userProfileImage) {
        this.username = username;
        this.userId = userId;
        this.userProfileImage = userProfileImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }
}
