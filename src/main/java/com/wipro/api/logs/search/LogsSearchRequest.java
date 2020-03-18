package com.wipro.api.logs.search;

import lombok.Data;

@Data
public class LogsSearchRequest {

    private int page;
    private int pageSize;
    private String orderField;
    private String orderDirection;
    private LogsSearchQueryParams field;
    private LogsSearchQueryParams value;

}
