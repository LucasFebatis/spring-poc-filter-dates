package com.febatis.demo.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
public class FooResponseDTO {
    private UUID uuid;
    private String name;
    private Boolean enabled;
    private LocalDate initialDate;
    private LocalDate finishedDate;
}
