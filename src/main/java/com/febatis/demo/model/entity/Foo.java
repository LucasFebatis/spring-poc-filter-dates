package com.febatis.demo.model.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Builder
public class Foo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", updatable = false, unique = true, nullable = false)
    private UUID uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    @Column(name = "initial_date", nullable = false, columnDefinition = "DATE")
    private LocalDate initialDate;

    @Column(name = "finished_date", nullable = false, columnDefinition = "DATE")
    private LocalDate finishedDate;

    public Foo() {}

    public Foo(UUID uuid, String name, Boolean enabled, LocalDate initialDate, LocalDate finishedDate) {
        this.uuid = uuid;
        this.name = name;
        this.enabled = enabled;
        this.initialDate = initialDate;
        this.finishedDate = finishedDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(LocalDate finishedDate) {
        this.finishedDate = finishedDate;
    }
}
