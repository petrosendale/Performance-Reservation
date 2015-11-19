package com.wl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

@Entity
public class Seat {
    @Id
    @GeneratedValue
    private Long id;
	@Range(min=0)
	private int rows;
	@Range(min=0)
	private int seatsInRow;
	private boolean isavailable = true;

	public Seat(int rows, int seatsInRow) {
		this.setRows(rows);
		this.setSeatsInRow(seatsInRow);

	}

	public Seat() {

	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getSeatsInRow() {
		return seatsInRow;
	}

	public void setSeatsInRow(int seatsInRow) {
		this.seatsInRow = seatsInRow;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
