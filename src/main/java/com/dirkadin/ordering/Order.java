package com.dirkadin.ordering;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER_ORDER")
public class Order {

    private @Id @GeneratedValue Long id;

    private String description;
    private Status status;

    Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }

}
