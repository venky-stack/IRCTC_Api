package com.example.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.bindings.Passenger;
import com.example.bindings.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	
	Map<Integer, Ticket> db = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket t =new Ticket();
		Random r = new Random();
		int id =r.nextInt(5);
		t.setTickId(id);
		BeanUtils.copyProperties(p, t);
		t.setStatus("Conformed..");
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		return  db.values();	
	}
}