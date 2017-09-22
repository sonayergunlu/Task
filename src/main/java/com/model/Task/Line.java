package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_Hat tablosu
 * Hat bilgilerini tutan model.
 * 
 * @author abdullah.dogan
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="K_HAT", schema="AYBTEST")
public class Line extends BaseEntity {
	
	@Column(name="HATKODU")
	private String lineCode;
	
	@Column(name="HATADI")
	private String lineName;
	
	@Column(name="HATTURU")
	private String lineKind;//Metrobüs, minibus vs
	
	@Column(name="HATTIPI")
	private int lineType;//Normal, Ring, 1.Boğazgeç, Bölgesel, Tahis vs.
	
	@Column(name="HATISLETME")
	private int lineOperation;//Anadolu1, Avrupa3, Metrobüs vs.
	
	@Column(name="ISAKTIF")
	private boolean isActive;
	
	@Column(name="SEFERSURESI")
	private int voyageTime;//Dakika cinsinden sefer süresi


	public int getLineType() {
		return lineType;
	}

	public void setLineType(int lineType) {
		this.lineType = lineType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getVoyageTime() {
		return voyageTime;
	}

	public void setVoyageTime(int voyageTime) {
		this.voyageTime = voyageTime;
	}

	public int getLineOperation() {
		return lineOperation;
	}

	public void setLineOperation(int lineOperation) {
		this.lineOperation = lineOperation;
	}

	public String getLineKind() {
		return lineKind;
	}

	public void setLineKind(String lineKind) {
		this.lineKind = lineKind;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	
	
}//End Line class
