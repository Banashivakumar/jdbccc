package com.xworkz.socialmedia.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "social_media")
@NamedQueries(value = {
		@NamedQuery(name ="fetchByRevenue",
                query="select social from SocialMediaDTO as social "+" where social.revenue =4.56")
		,@NamedQuery(name ="fetchByAppName",
		        query="select social from SocialMediaDTO as social "
                +"where social.appName='instagram'")
		,@NamedQuery(name ="fetchByRatings",
		        query ="select social from SocialMediaDTO as social "
                +"where social.ratings=4.5")
		,@NamedQuery(name ="fetchByAllValues",
		         query="select social from SocialMediaDTO as social ")		
})

public class SocialMediaDTO {
	@Id
	@Column(name = "social_media_id")
	private int id;
	@Column(name ="app_name")
	private String appName;
	private float revenue;
	private double version;
	private double ratings;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public float getRevenue() {
		return revenue;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	
	
	

}
