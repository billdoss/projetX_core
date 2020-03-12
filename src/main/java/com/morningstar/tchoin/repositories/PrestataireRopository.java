package com.morningstar.tchoin.repositories;

import com.morningstar.tchoin.entities.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface PrestataireRopository extends JpaRepository<Prestataire, Long> {
}
