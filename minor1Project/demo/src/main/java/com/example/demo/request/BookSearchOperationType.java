package com.example.demo.request;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum BookSearchOperationType {

    EQUALS,
    LESS_THAN_EQUAL_TO,
    LESS_THAN,
    GREATER_THAN,
    GREATER_THAN_EQUAL_TO,
    IN
}
