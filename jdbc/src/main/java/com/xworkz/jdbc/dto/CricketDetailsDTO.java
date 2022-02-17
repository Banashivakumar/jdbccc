package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class CricketDetailsDTO implements Serializable {
	
	private byte noofPlayers;
	private String teamName;
	private String captainName;
	private int matchesPlayed;
	
	public byte getNoofPlayers() {
		return noofPlayers;
	}
	public void setNoofPlayers(byte noofPlayers) {
		this.noofPlayers = noofPlayers;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	
	

}
