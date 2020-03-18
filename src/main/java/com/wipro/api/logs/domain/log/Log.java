package com.wipro.api.logs.domain.log;

import com.wipro.api.logs.domain.request.Request;
import com.wipro.api.logs.search.LogsSearchRequest;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;


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

    @ManyToOne
    private Request request;

    @Override
    public int hashCode(){
        return Objects.hash(this.getMessage());
    }
}
