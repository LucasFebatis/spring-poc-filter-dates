package com.febatis.demo.repository;

import com.febatis.demo.model.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IFooRepository extends JpaRepository<Foo, Long> {

    Optional<Foo> findByName(String name);

    @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
    Optional<Foo> retrieveByName(@Param("name") String name);

    List<Foo> findAllByInitialDateBetween(LocalDate initialDateStart, LocalDate initialDateEnd);

    @Query("select a from Foo a where :actualDate >= a.initialDate and :actualDate <= a.finishedDate and a.enabled = true")
    List<Foo> findAllBetweenInitialDateAndFinishedDateWithParam(LocalDate actualDate);

    @Query("select a from Foo a where current_date >= a.initialDate and current_date <= a.finishedDate and a.enabled = true")
    List<Foo> findAllBetweenInitialDateAndFinishedDateWithoutParam();

}
