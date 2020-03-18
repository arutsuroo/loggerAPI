package com.wipro.api.logs.search;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LogsSearchResponse {

    private String requestHash;
    private String message;
    private LocalDate timestamp;
    private String logLevel;

}
