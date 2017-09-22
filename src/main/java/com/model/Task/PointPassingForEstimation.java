package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_NOKTA_GECIS tablosu. EstimationServer icin son 6 saat(mevcut
 * sistemde) icinde aracpc'lerden alinan durak gecis bilgisi icin kullanilan
 * entity.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="H_NOKTA_GECIS_TAHMIN", schema="AYBTEST")
public class PointPassingForEstimation extends BaseEntity{
	
	@Column(name="GOREVID")
	private int taskId;
	
	@Column(name="GUZERGAHID")
	private int routeId;
		
	@Column(name = "HATID")
	private int lineId;
	
	@Column(name="NOKTAID")
	private int pointId;//DurakId
	
	@Column(name="SIRANO")
	private int orderNo;//Durağın güzergah içinde kaçıncı sırada olduğu bilgisi
	
	@Column(name="DURMASURESI")
	private int stopTime; //Durakta bekleme-durma süresi
	
	@Column(name="BINENYOLCUSAYISI")
	private int ridePassengerOrder;//Durakta binen yolcu sayısı
	
	@Column(name="GECISZAMANI")
	private Date passingTime;//Durağı geçiş zamanı

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getStopTime() {
		return stopTime;
	}

	public void setStopTime(int stopTime) {
		this.stopTime = stopTime;
	}

	public int getRidePassengerOrder() {
		return ridePassengerOrder;
	}

	public void setRidePassengerOrder(int ridePassengerOrder) {
		this.ridePassengerOrder = ridePassengerOrder;
	}

	public Date getPassingTime() {
		return passingTime;
	}

	public void setPassingTime(Date passingTime) {
		this.passingTime = passingTime;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}
	
}//End PointPassing class
