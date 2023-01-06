package com.telly.dao;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="test")
public class Bus implements Serializable {
	

	private static final long serialVersionUID = 5362437768854142524L;


	@Id
	@Column(name="dateleave")
	private Date dateLeave;
	
	
	@Column(name="datereturn")
	private Date dateReturn;
	
	@Column(name="leavingfrom")
	private String leaveFrom;
	
	@Column(name="goingto")
	private String goingTo;
	
	
	public Bus() {
		
	}

	@Override
	public String toString() {
		return "Bus [dateLeave=" + dateLeave + ", dateReturn=" + dateReturn + ", leaveFrom=" + leaveFrom + ", goingTo="
				+ goingTo + "]";
	}


	public String getLeaveFrom() {
		return leaveFrom;
	}
	public String getGoingTo() {
		return goingTo;
	}
	public Date getDateLeave() {
		return dateLeave;
	}
	public Date getDateReturn() {
		return dateReturn;
	}
}
