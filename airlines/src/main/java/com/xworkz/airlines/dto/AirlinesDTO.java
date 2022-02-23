package com.xworkz.airlines.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airlines_details")

public class AirlinesDTO  {
	@Id
	
	@Column(name = "airlines_id")
	private int airlinesid;
	@Column(name = "airlines_name")
	private String airlinesName;
	@Column(name = "passenger_name")
	private String PassengerName;
	private float ticket;
	

	public int getAirlinesid() {
		return airlinesid;
	}
	public void setAirlinesid(int airlinesid) {
		this.airlinesid = airlinesid;
	}
	public String getAirlinesName() {
		return airlinesName;
	}
	public void setAirlinesName(String airlinesName) {
		this.airlinesName = airlinesName;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public float getTicket() {
		return ticket;
	}
	public void setTicket(float ticket) {
		this.ticket = ticket;
	}
	
	

}
