package com.wipro.api.logs.create;

import com.wipro.api.logs.domain.log.Log;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LogsCreateMapper {

    LogsCreateResponse toLogsDto(Log log);

    Log toLogs(LogsCreateRequest log);

}
