package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "K_SERVIS", schema="AYBTEST")
public class Service extends BaseEntity {

	@Column(name="HATID")
	private int lineId;
	
	@Column(name="SERVISNO")
	private int serviceNumber;
	
	@Column(name="SEFERSAYISI")
	private int voyageNumber;
	
	@Column(name="MESAISURESI")
	private int shiftTime;

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public int getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(int serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public int getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(int voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public int getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(int shiftTime) {
		this.shiftTime = shiftTime;
	}
	
}
