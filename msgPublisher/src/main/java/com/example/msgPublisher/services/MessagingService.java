package com.example.msgPublisher.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessagingService {

  private final MessageRepository messageRepository;

  public void initializeMessages(List<Message> Messages) {
    Flux<Message> savedMessages = messageRepository.saveAll(Messages);
    savedMessages.subscribe();
  }

  public Flux<Message> getAllMessages() {
    Flux<Message> Messages =  messageRepository.findAll();
    return Messages;
  }

  public Flux<Message> getMessagesFilterByAge(String messengerType) {
    return messageRepository.findByMessengerType(messengerType);
  }

  public Mono<Message> getMessageById(int id) {
    return messageRepository.findById(id);
  }
}
