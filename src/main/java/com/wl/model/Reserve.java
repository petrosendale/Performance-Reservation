package com.wl.model;

import java.util.Date;
import java.util.HashSet;

public class Reserve {
	private long id;
	private Date reservedat;
	private Date reservedto;
	private Double price;
	private HashSet<Seat> reservedSeat;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getReservedat() {
		return reservedat;
	}
	public void setReservedat(Date reservedat) {
		this.reservedat = reservedat;
	}
	public Date getReservedto() {
		return reservedto;
	}
	public void setReservedto(Date reservedto) {
		this.reservedto = reservedto;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
