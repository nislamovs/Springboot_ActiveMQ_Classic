package com.example.discordConsumer.controllers;

import com.example.discordConsumer.services.DiscordService;
import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

  private final DiscordService discordService;

  @GetMapping("/test")
  public ResponseEntity test() {

    discordService.sendMessage("jksdfjklsdfjk");
    return ResponseEntity.ok("asdasdas2") ;
  }

  @GetMapping("/test1")
  public ResponseEntity test1() {
    discordService.send2();
    return ResponseEntity.ok().build();
  }

}
