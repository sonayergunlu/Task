package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_OTOBUS_SON_GECIS Tablosu
 * Araclarin en son gectikleri durak bilgisi icin kullanilan entity.
 * Sadece son kayit tutulacagi icin her bir arac icin tek bir kayit bulunur.
 * ARaclarin bir sonraki gorev icin hazir olup olmadiklari, garaj icinde olup
 * olmadiklarinin tespiti icin kullaniliyormus.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="H_OTOBUS_SON_GECIS", schema="AYBTEST")
public class VehicleLastPointPassing extends BaseEntity {
	

	@Column(name="ARACID")
	private int vehicleId;

	
	@Column(name="GOREVID")
	private int taskId;
	
	
	@Column(name="GUZERGAHID")
	private int routeId;
	
	
	@Column(name="HATID")
	private int lineId;
	
	
	@Column(name="NOKTAID")
	private int pointId;//DurakId
	
	@Column(name="SIRANO")
	private int orderNo;//Durak sira numarasi


	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	
}//End H_OTOBUS_SON_GECIS class
