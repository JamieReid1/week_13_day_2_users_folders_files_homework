package com.example.relationshipshomework.repositories;

import com.example.relationshipshomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
