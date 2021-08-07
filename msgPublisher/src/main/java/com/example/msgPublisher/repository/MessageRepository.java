package com.example.msgPublisher.repository;

import com.example.msgPublisher.models.Message;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageRepository extends ReactiveCassandraRepository<Message, Integer> {

  @AllowFiltering
  Flux<Message> findByMessengerType(String messengerType);

}
