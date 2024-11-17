package com.example.coupling;

import com.example.coupling.loose_coupling.UserDataProvider;
import com.example.coupling.loose_coupling.UserDatabaseProvider;
import com.example.coupling.loose_coupling.UserManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouplingApplication {

	public static void main(String[] args) {
		UserDataProvider dataBaseProvider = new UserDatabaseProvider();
		UserManager userManagerWithDB   = new UserManager(dataBaseProvider);
		System.out.println(userManagerWithDB.getUserInfo());

	}

}
