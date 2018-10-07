package com.anan.demoliquibase.repository;

import com.anan.demoliquibase.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
