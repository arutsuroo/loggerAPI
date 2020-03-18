package com.wipro.api.logs.domain.request;

import com.wipro.api.logs.domain.log.Log;
import com.wipro.api.logs.domain.response.Response;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String body;
    private LocalDateTime timestamp;
    private String endpoint;
    private String method;
    private String hash;
    private String headers;

    @OneToMany(mappedBy = "request")
    private Set<Log> logs;

    @OneToMany(mappedBy = "request")
    private Response response;
}
