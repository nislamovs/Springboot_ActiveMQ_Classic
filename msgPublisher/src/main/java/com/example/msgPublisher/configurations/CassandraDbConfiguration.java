package com.example.msgPublisher.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.EnableReactiveCassandraAuditing;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
//@EnableReactiveCassandraAuditing
@EnableReactiveCassandraRepositories(basePackages = {"com.example.msgPublisher.models"})
public class CassandraDbConfiguration {

//  @Bean
//  public ReactiveAuditorAware<AuditableUser> myAuditorProvider() {
//    return new AuditorAwareImpl();
//  }
}
