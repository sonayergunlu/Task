package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * A_GOREV_OFFLINE Tablosu. Arac pcde gelen offline olusturulan plan entity.
 * 
 * @author ibrahim.barlin
 *
 */
@Entity
@Table(name = "A_GOREV_OFFLINE", schema="AYBTEST")
public class OfflinePlan extends BaseEntity {

	@Column(name = "GOREVID")
	private int taskId;
	
	@Column(name="ARACID")
	private int vehicleId;
	
	@Column(name="DRIVERID")
	private int driverId;
	
	@Column(name = "HATKODU")
	private String lineCode;
	
	@Column(name = "YON")
	private String direction;
	
	@Column(name = "DURUM")
	private String status;
	
	@Column(name = "SEFERBASLAMAZAMANI")
	private Date taskStartDate;
	
	@Column(name = "BASLANGINCX")
	private double taskStartLocatinX;
	
	@Column(name = "BASLANGINCY")
	private double taskStartLocatinY;
	
	@Column(name = "SEFERBITISZAMANI")
	private Date taskEndDate;
	
	@Column(name = "BITISX")
	private double taskEndLocatinX;
	
	@Column(name = "BITISY")
	private double taskEndLocatinY;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTaskStartDate() {
		return taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public double getTaskStartLocatinX() {
		return taskStartLocatinX;
	}

	public void setTaskStartLocatinX(double taskStartLocatinX) {
		this.taskStartLocatinX = taskStartLocatinX;
	}

	public double getTaskStartLocatinY() {
		return taskStartLocatinY;
	}

	public void setTaskStartLocatinY(double taskStartLocatinY) {
		this.taskStartLocatinY = taskStartLocatinY;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public double getTaskEndLocatinX() {
		return taskEndLocatinX;
	}

	public void setTaskEndLocatinX(double taskEndLocatinX) {
		this.taskEndLocatinX = taskEndLocatinX;
	}

	public double getTaskEndLocatinY() {
		return taskEndLocatinY;
	}

	public void setTaskEndLocatinY(double taskEndLocatinY) {
		this.taskEndLocatinY = taskEndLocatinY;
	}
	
	
}
