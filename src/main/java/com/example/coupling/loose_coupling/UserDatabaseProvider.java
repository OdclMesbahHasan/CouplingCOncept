package com.example.coupling.loose_coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserInfo() {
        return "User Details From dataBase ";
    }
}
