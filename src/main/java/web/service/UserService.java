package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    User getUserById(long id);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    User getByEmail(String email);
    boolean existUserById (long id);
}
