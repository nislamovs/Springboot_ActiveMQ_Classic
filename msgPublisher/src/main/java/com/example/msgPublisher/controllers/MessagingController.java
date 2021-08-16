package com.example.msgPublisher.controllers;

import com.example.msgPublisher.controllers.docs.MessagingControllerDocs;
import com.example.msgPublisher.domain.dtos.MessageDto;
import com.example.msgPublisher.services.MessagingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessagingController implements MessagingControllerDocs {

  private final MessagingService messagingService;

  @Override
  @GetMapping("/message")
  public Flux<?> getMsg() {
    return null;
  }

  @Override
  @PostMapping("/message/{text}")
  public Mono<?> postMsg(@PathVariable(value = "text") String text) {
    return Mono.just(messagingService.pushMessage(new MessageDto(text)));
  }

}
