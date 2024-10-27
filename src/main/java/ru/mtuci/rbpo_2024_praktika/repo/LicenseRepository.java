package ru.mtuci.rbpo_2024_praktika.repo;

import org.springframework.stereotype.Repository;
import ru.mtuci.rbpo_2024_praktika.model.License;

import java.util.Optional;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {
    Optional<License> findByKey(String key);
}
