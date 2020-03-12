package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Fournir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface FournirRopository extends JpaRepository<Fournir, Long> {

    @RestResource(path = "/byPrestation")
    List<Fournir> findFournirsByIdPrestation(@Param("prestation") Long prestation);

}
