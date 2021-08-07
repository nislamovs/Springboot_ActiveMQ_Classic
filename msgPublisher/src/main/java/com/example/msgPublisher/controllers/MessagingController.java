package com.example.msgPublisher.controllers;

import com.example.msgPublisher.controllers.docs.MessagingControllerDocs;
import com.example.msgPublisher.services.MessagingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessagingController extends MessagingControllerDocs {

  private final MessagingService messagingService;

//    TODO create endpoints with documentation

}
