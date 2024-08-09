package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private Long id;
}
