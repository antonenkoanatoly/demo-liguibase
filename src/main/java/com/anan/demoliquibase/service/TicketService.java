package com.anan.demoliquibase.service;

import com.anan.demoliquibase.entity.Ticket;
import com.anan.demoliquibase.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAll() {
        List<Ticket> res = new ArrayList<>();
        ticketRepository.findAll().forEach(res::add);
        return res;
    }
}
