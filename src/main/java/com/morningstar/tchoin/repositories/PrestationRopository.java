package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface PrestationRopository extends JpaRepository<Prestation, Long> {

    @RestResource(path = "/byPrestation")
    List<Prestation> findPrestationsByLibelle(@Param("prestaion") String prestation);
}
