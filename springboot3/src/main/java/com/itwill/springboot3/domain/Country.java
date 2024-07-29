package com.itwill.springboot3.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Entity @Table(name = "COUNTRIES") @Getter @EqualsAndHashCode @ToString
public class Country {
	
	@Id
	@Column(name = "COUNTRY_ID")
	private String id;
	
	private String countryName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ToString.Exclude
	@JoinColumn(name = "REGION_ID")
	private Region region;
	
}
