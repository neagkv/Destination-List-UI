package com.dev.Spring_Angular_CRUD.controller;

import com.dev.Spring_Angular_CRUD.domain.Destination;
import com.dev.Spring_Angular_CRUD.repository.DestinationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Kevin Neag
 */
@RestController
public class EastCoastDestinationController {

    private DestinationRepository repository;


        public EastCoastDestinationController(DestinationRepository repository) {
            this.repository = repository;
        }

        @GetMapping("/east-coast")
        public Collection<Destination> eastCoast() {
            return repository.findAll().stream()
                    .filter(this::isEastCoast)
                    .collect(Collectors.toList());
        }

        private boolean isEastCoast(Destination destination) {
            return !destination.getName().equals("Detroit") &&
                    !destination.getName().equals("Milwaukee") &&
                    !destination.getName().equals("Cincinnati") &&
                    !destination.getName().equals("Chicago");
        }

}
