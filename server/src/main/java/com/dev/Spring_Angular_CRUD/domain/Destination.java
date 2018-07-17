package com.dev.Spring_Angular_CRUD.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author Kevin Neag
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Destination {

    @Id
    @GeneratedValue
    private Long id;
    private @NotNull String name;
}
