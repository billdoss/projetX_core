package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Disponibilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface DisponibiliteRopository extends JpaRepository<Disponibilite, Long> {

    @RestResource(path = "/bySemaineOrJournee")
    List<Disponibilite> findDisponibilitesByIdSemaineOrIdJournee(@Param("semaine") Long semaine,@Param("semaine") Long journee);

    @RestResource(path = "/bySemaineAndJournee")
    List<Disponibilite> findDisponibilitesByIdSemaineAndIdJournee(@Param("semaine") Long semaine,@Param("semaine") Long journee);
}
