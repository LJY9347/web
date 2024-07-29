package com.itwill.springboot3.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Entity @Table(name = "REGIONS") @ToString @Getter @EqualsAndHashCode
public class Region {
	
	@Id
	@Column(name = "REGION_ID")
	private Integer id;
	
	private String regionName;
	
}
