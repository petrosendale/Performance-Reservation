package com.wl.model;

import java.util.HashSet;

public class Ticket {
	private HashSet<Seat> reservedseat;
	private Show show;
	private Customer customer;
	
	private boolean cancelTicket()
	{
		return false;
		
	}
	private boolean buyTicket()
	{
		return false;
		
	}

}
