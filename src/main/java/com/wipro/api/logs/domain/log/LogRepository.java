package com.wipro.api.logs.domain.log;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {
}
