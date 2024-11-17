package com.example.coupling.loose_coupling;

public class UserManager {
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserInfo();
    }

}
