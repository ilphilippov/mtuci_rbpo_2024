package ru.mtuci.rbpo_2024_praktika.services;

import ru.mtuci.rbpo_2024_praktika.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAll();
    void add(User user);
    User getById(UUID id);
    User getByName(String name);
}