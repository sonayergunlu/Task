package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_NOKTA_GIRIS Tablosu. EstimationServer icin son 6 saat(mevcut
 * sistemde) icinde aracpc'lerden alinan duraga giris bilgisi icin kullanilan
 * entity.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "H_NOKTA_GIRIS_TAHMIN", schema="AYBTEST")
public class PointEntranceForEstimation extends BaseEntity {

	@Column(name = "GOREVID")
	private int taskId;

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "HATID")
	private int lineId;

	@Column(name = "NOKTAID")
	private int pointId;

	@Column(name = "SIRANO")
	private int orderNo;

	@Column(name = "GIRISZAMANI")
	private Date entranceTime;

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

	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

}// End PointEntrance class
