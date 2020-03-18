package com.wipro.api.logs.create;

import com.wipro.api.logs.common.exceptions.LogExceptionHandler;
import com.wipro.api.logs.common.exceptions.LogRequestException;
import com.wipro.api.logs.domain.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/logs")
public class LogsCreateController {

    @Autowired
    private LogsCreateService service;

    @Autowired
    private LogsCreateMapper mapper;

    @PostMapping
    public ResponseEntity<LogsCreateResponse> insert(@RequestBody @Valid LogsCreateRequest obj) throws LogRequestException {
        Log log = service.insert(mapper.toLogs(obj));
        LogsCreateResponse response = mapper.toLogsDto(log);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
