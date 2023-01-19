package com.febatis.demo.repository;

import com.febatis.demo.model.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IFooRepository extends JpaRepository<Foo, Long> {

    Optional<Foo> findByName(String name);

    @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
    Optional<Foo> retrieveByName(@Param("name") String name);

}
