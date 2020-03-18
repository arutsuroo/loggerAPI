package com.wipro.api.logs.domain.response;

import com.wipro.api.logs.domain.request.Request;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String body;
    private LocalDateTime timestamp;
    private Integer status;
    private String headers;

    @OneToOne
    private Request request;
}
