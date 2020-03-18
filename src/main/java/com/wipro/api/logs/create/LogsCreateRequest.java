package com.wipro.api.logs.create;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class LogsCreateRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDateTime timestamp;

    @NotNull
    private String loglevel;

    @NotNull
    private String request;

    @NotNull
    private String message;

}
