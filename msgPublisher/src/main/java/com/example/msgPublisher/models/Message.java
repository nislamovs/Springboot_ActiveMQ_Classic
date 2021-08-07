package com.example.msgPublisher.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

@EqualsAndHashCode(callSuper = true)
@Table("messages")
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class Message extends AbstractEntity{

  @Column("extention_period")
  private int messageId;

  @Column("extention_period")
  private String messageType;

  @Column("extention_period")
  private String payload;

  @Column("extention_period")
  private String direction;

  @Column("extention_period")
  private String status;


}
