package ru.kremenia.architecture.mapper;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleEntityDto {
    private Long id;
    private String name;
    private Property property;
}
