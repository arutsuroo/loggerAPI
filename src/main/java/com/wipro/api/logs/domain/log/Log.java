package com.wipro.api.logs.domain.log;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Entity
@Data
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDate timestamp;

    @NotNull
    private String loglevel;

    @NotNull
    private String message;

//    @ManyToOne
//    private Request request;

}
