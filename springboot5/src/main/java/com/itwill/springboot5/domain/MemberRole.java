package com.itwill.springboot5.domain;

public enum MemberRole {
	// MemberRole 타입의 public static final 객체
	USER("ROLE_USER"), // public static final MemberRole USER = new MemberRole("ROLE_USER");
	ADMIN("ROLE_ADMIN"); // 아규먼트가 없는 기본 생성자의 경우엔 () 생략.
	
	private String authority;
	
	// 주의: enum의 생성자는 항상 private. private 수식어는 생략함.
	MemberRole(String authority) {
		this.authority = authority;
	}
	
	public String getAuthority() {
		return this.authority;
	}
}
