package com.febatis.demo.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FooRequestDTO {
    private String name;
    private Boolean enabled;
    private LocalDate initialDate;
    private LocalDate finishedDate;
}
