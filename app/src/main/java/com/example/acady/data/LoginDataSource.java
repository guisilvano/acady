package com.example.acady.data;

import com.example.acady.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

            if (username.equals("admin") && password.equals("password")) {
                LoggedInUser fakeUser =
                        new LoggedInUser(
                                java.util.UUID.randomUUID().toString(),
                                username);
                return new Result.Success<>(fakeUser);
            }

            return new Result.Error(new IOException("Error logging in"));

    }

    public void logout() {
        // TODO: revoke authentication
    }
}