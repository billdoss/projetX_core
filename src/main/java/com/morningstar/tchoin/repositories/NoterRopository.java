package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Noter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface NoterRopository extends JpaRepository<Noter, Long> {

    @RestResource(path = "/byNote")
    List<Noter> findNotersByNote(@Param("note") String note);

    @RestResource(path = "/byClient")
    List<Noter> findNotersByIdClient(@Param("client") Long client);
}
