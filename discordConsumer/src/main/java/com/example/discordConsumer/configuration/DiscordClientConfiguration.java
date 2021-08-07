package com.example.discordConsumer.configuration;

import com.example.discordConsumer.services.eventListeners.EventListener;
import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.Event;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DiscordClientConfiguration {

  @Value("${discord.token}")
  private String token;

  @Bean
  public <T extends Event> GatewayDiscordClient gatewayDiscordClient(
      List<EventListener<T>> eventListeners) {
    GatewayDiscordClient client = null;

    try {
      client = DiscordClientBuilder.create(token)
          .build()
          .login()
          .block();

      for(EventListener<T> listener : eventListeners) {
        client.on(listener.getEventType())
            .flatMap(listener::execute)
            .onErrorResume(listener::handleError)
            .subscribe();
      }
    }
    catch ( Exception exception ) {
      log.error( "Be sure to use a valid bot token!", exception );
    }

    return client;
  }

}
