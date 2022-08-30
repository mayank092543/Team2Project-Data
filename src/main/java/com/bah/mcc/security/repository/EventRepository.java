package com.bah.mcc.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.mcc.security.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
