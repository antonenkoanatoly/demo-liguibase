package com.anan.demoliquibase.controller;

import com.anan.demoliquibase.entity.Ticket;
import com.anan.demoliquibase.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/tickets")
    public List<Ticket> tickets() {
        return ticketService.getAll();
    }
}
