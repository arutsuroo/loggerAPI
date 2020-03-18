package com.wipro.api.logs.common.exceptions;

public class LogRequestException extends RuntimeException{

    public LogRequestException(Object id){
        super("Invalid request. Id " + id);
    }

}
