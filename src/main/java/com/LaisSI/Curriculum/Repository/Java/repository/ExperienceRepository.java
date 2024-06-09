package com.LaisSI.Curriculum.Repository.Java.repository;

import com.LaisSI.Curriculum.Repository.Java.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}
