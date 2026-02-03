package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TicketEntity;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    // Create / Update ticket
    public TicketEntity saveTicket(TicketEntity ticket) {
        return ticketRepository.save(ticket);
    }

    // Get ticket by ID
    public TicketEntity getTicketById(Integer ticketId) {
        Optional<TicketEntity> ticket =
                ticketRepository.findById(ticketId);
        return ticket.orElse(null);
    }

    // Get all tickets
    public List<TicketEntity> getAllTickets() {
        return ticketRepository.findAll();
    }

    // Delete ticket
    public void deleteTicket(Integer ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
