package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.TicketEntity;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "*")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    // Create ticket
    @PostMapping
    public TicketEntity createTicket(@RequestBody TicketEntity ticket) {
        return ticketService.saveTicket(ticket);
    }

    // Get ticket by ID
    @GetMapping("/{id}")
    public TicketEntity getTicketById(@PathVariable Integer id) {
        return ticketService.getTicketById(id);
    }

    // Get all tickets
    @GetMapping
    public List<TicketEntity> getAllTickets() {
        return ticketService.getAllTickets();
    }

    // Delete ticket
    @DeleteMapping("/{id}")
    public String deleteTicket(@PathVariable Integer id) {
        ticketService.deleteTicket(id);
        return "Ticket deleted successfully";
    }
}
