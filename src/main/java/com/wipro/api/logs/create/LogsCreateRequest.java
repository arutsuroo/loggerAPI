package com.wipro.api.logs.create;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LogsCreateRequest {

    @NotNull
    private String loglevel;

    @NotNull
    private String request;

    @NotNull
    private String message;

}
