package org.example.user.service;

import org.example.user.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Long id);

    User add(User user);

    User update(Long id, User user);

    void delete(Long id);
}
