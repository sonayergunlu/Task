package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_Nokta tablosu.
 * Duraklar icin kullaniliyor.
 * name= durağın ismini 
 * code = durağın kodunu
 * pointTypeCode = durağın tipi kodunu(d->durak, pg->peron alanı vs)
 * stopTypeCode =  durağın tür kodunu(durak tip1, durak wall, -1 vs)
 * xCoordinate = durağın x koordinatını
 * yCoordinate = durağın y koordinatını
 * isEnergy = durakta elektrik enerjisi olup olmadığını
 * isGoing = durağın gidiş yönünde olup olmadığını
 * isActive = durağın aktif olup olmadığını 
 * tutar.
 * 
 * @author abdullah.dogan
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="K_NOKTA", schema="AYBTEST")
public class Point extends BaseEntity {
	
	@Column(name="NOKTAADI")
	private String name;
	
	@Column(name="NOKTAKODU")
	private String code;
	
	@Column(name="NOKTATIPIKODU")
	private String pointTypeCode;//D-->DURAK, PG -->PERON VS
	
	@Column(name="DURAKTIPIKODU")
	private String stopTypeCode;//DURAK TİP1, DURAK WALL, -1 VS
	
	@Column(name="XKOORDINAT")
	private double xCoordinate;
	
	@Column(name="YKOORDINAT")
	private double yCoordinate;
	
	@Column(name="ISENERJI")
	private boolean isEnergy;//ENERJİ VAR MI 
	
	@Column(name="ISGIDIS")
	private boolean isGoing;//GIDIS YONU MU
	
	@Column(name="ISAKTIF")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPointTypeCode() {
		return pointTypeCode;
	}

	public void setPointTypeCode(String pointTypeCode) {
		this.pointTypeCode = pointTypeCode;
	}

	public String getStopTypeCode() {
		return stopTypeCode;
	}

	public void setStopTypeCode(String stopTypeCode) {
		this.stopTypeCode = stopTypeCode;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public boolean isEnergy() {
		return isEnergy;
	}

	public void setEnergy(boolean isEnergy) {
		this.isEnergy = isEnergy;
	}

	public boolean isGoing() {
		return isGoing;
	}

	public void setGoing(boolean isGoing) {
		this.isGoing = isGoing;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}//End Point class
