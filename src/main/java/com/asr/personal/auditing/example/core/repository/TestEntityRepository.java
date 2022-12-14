package com.asr.personal.auditing.example.core.repository;

import com.asr.personal.auditing.example.core.entity.TestEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface TestEntityRepository extends JpaRepository<TestEntity, UUID> {
}
