package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_NOKTA_GIRIS Tablosu. aracPc tarafindan gonderilen duraga giris verisi icin
 * kullanilan entity. Araclarin herbir duraga giris verileri estimation Server
 * icin ve ihlal kontrolleri icin kullaniliyor.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "H_NOKTA_GIRIS", schema="AYBTEST")
public class PointEntrance extends BaseEntity {

	@Column(name = "GOREVID")
	private int taskId;

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "HATID")
	private int lineId;

	@Column(name = "NOKTAID")
	private int pointId; //DurakId

	@Column(name = "SIRANO")
	private int orderNo; //Durağın güzergah içinde kaçıncı sırada olduğu bilgisini tutar.

	@Column(name = "GIRISZAMANI")
	private Date entranceTime; //Durağa giriş zamanı

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(Date entranceTime) {
		this.entranceTime = entranceTime;
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

}// End PointEntrance class
