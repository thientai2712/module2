package com.company.services;

import com.company.models.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User adminLogin(String name, String password);

    void add(User newUser);

    void update(User newUser);

    void deleteById(int id);

    boolean existById(int id);

    boolean existByEmail(String email);

    boolean existsByPhone(String phone);

    boolean existsByUsername(String userName);

    User findById(int id);
}
