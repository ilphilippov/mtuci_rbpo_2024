package ru.mtuci.rbpo_2024_praktika.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.rbpo_2024_praktika.model.License;
import ru.mtuci.rbpo_2024_praktika.services.LicenseService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("licenses")
@RestController
public class LicenseController {
    private final LicenseService licenseService;

    @GetMapping
    public List<License> getAll() {
        return licenseService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody License license) {
        licenseService.add(license);
    }
}