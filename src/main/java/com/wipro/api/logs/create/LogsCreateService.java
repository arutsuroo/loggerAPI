package com.wipro.api.logs.create;

import com.wipro.api.logs.domain.log.Log;
import com.wipro.api.logs.domain.log.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogsCreateService {

    @Autowired
    private LogRepository repository;

    public Log insert(Log obj){
        return repository.save(obj);
    }

}
