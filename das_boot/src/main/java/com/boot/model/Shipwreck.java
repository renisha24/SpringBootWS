package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipwreck {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	String description;
	String condition;
	Integer depth;
	Double lattitude;
	Double longitude;
	Integer yeardiscovered;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitude, Integer yeardiscovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
		this.depth = depth;
		this.lattitude = latitude;
		this.longitude = longitude;
		this.yeardiscovered = yeardiscovered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return lattitude;
	}

	public void setLatitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYeardiscovered() {
		return yeardiscovered;
	}

	public void setYeardiscovered(Integer yeardiscovered) {
		this.yeardiscovered = yeardiscovered;
	}
}
