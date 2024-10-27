package ru.mtuci.rbpo_2024_praktika.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import  ru.mtuci.rbpo_2024_praktika.model.License;
import  ru.mtuci.rbpo_2024_praktika.repo.LicenseRepository;
import  ru.mtuci.rbpo_2024_praktika.services.LicenseService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LicenseServiceImpl implements LicenseService {

    private final LicenseRepository licenseRepository;

    @Override
    public void add(License license) {
        licenseRepository.save(license);
    }

    @Override
    public List<License> getAll() {
        return licenseRepository.findAll();
    }

    @Override
    public License getById(Long id) {
        return licenseRepository.findById(id).orElse(new License());
    }

    @Override
    public License getByKey(String key) {
        return licenseRepository.findByKey(key).orElse(new License());
    }
}
