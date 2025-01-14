package service;

import model.User;

public interface MainService {

    User registerUser(String email, String password);

    boolean loginUser(String email, String password);

    void logout();
}
