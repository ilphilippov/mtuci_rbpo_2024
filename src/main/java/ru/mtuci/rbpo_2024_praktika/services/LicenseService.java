package ru.mtuci.rbpo_2024_praktika.services;

import ru.mtuci.rbpo_2024_praktika.model.License;

import java.util.List;

public interface LicenseService {
    void add(License license);

    List<License> getAll();

    License getById(Long id);

    License getByKey(String key);
}