package com.example.service;

import java.util.Collection;

import com.example.bindings.Passenger;
import com.example.bindings.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();
}