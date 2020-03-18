package com.wipro.api.logs.search;

import com.wipro.api.logs.domain.log.Log;
import org.mapstruct.Mapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Mapper(componentModel = "spring")
public interface LogsSearchMapper {

    default Pageable requestToPage(LogsSearchRequest request){
        Sort.Direction direction = Sort.Direction.fromString(request.getOrderDirection());
        Pageable pageable = PageRequest.of(request.getPage(), request.getPageSize(), Sort.by(direction, request.getOrderDirection()));
        return pageable;
    }

    default LogsSearchResponse toLogDto(Log log){
        LogsSearchResponse response = new LogsSearchResponse();
        response.setRequestHash(log.getRequest().getHash());
        response.setMessage(log.getMessage());
        response.setTimestamp(log.getTimestamp());
        response.setLogLevel(log.getLoglevel());
        return response;
    }


}
