package com.example.msgPublisher.models;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Data
public class AbstractEntity {

  @Id
  @PrimaryKey
  private int id;

  @CreatedBy
  @Column("created_by")
  private String createdBy;

  @CreatedDate
  @Column("created_at")
  private Instant createdAt;

  @LastModifiedBy
  @Column("modified_by")
  private String modifiedBy;

  @LastModifiedDate
  @Column("modified_at")
  private Instant modifiedAt;
}
