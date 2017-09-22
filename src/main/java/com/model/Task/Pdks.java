package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Sofor tarafindan goreve baslarken ve gorevi bitirirken aracpc ye okutulan
 * personel kartinin gonderdigi bilgileri tutmak icin kullanilan entity.
 * 
 * @author osume
 *
 */
@Entity
@Table(name = "A_PDKS", schema="AYBTEST")
public class Pdks extends BaseEntity{
	
	@Column(name="SOFORID")
	private int driverId;
	
	@Column(name="ARACID")
	private int vehicleId;
	
	@Column(name="GOREVID")
	private int taskId;
	
	@Column(name="GOREV_AKTIF")
	private boolean continues;
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public boolean isContinues() {
		return continues;
	}
	public void setContinues(boolean continues) {
		this.continues = continues;
	}
	
}
