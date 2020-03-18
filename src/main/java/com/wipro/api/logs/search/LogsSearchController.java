package com.wipro.api.logs.search;

import com.wipro.api.logs.domain.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logs/search")
public class LogsSearchController {

    @Autowired
    private LogsSearchService service;

    @GetMapping
    public ResponseEntity<List<Log>> getAllLogs(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "0") String sortBy)
    {
        List<Log> list = service.getAllLogs(pageNo,pageSize, sortBy);

        return new ResponseEntity<List<Log>>(list, new HttpHeaders(), HttpStatus.OK);
    }

}
