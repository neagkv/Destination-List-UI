package com.dev.Spring_Angular_CRUD.repository;

import com.dev.Spring_Angular_CRUD.domain.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Kevin Neag
 */

@RepositoryRestResource
public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
