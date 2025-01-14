package repository;

import model.User;

public interface UserRepository {

    // CRUD

    User addUser(String email, String password);



    boolean isEmailExist(String email);

    // Get

    User getUserByEmail(String email);

    // Update
    boolean updatePassword(String email, String newPassword);

}
