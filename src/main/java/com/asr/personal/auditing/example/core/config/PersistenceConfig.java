package com.asr.personal.auditing.example.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.asr.personal.auditing.example.core.repository")
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class PersistenceConfig {
}
