package com.asr.personal.auditing.example.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(
    name = "TBL_TEST_ENTITY",
    uniqueConstraints = {
        @UniqueConstraint(name = "UQ_NAME", columnNames = { "name" })
    })
@NoArgsConstructor
public class TestEntity extends BaseEntity {

  String name;
}
