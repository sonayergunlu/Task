package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_ILK_NOKTA_GIRIS Tablosu. aracpc tarafindan ilk duraga giris yapildiginda
 * gonderilen veriler icin kullanilan entity.
 * Herbir gorev ilk durak ile baslar. Bundan dolayi aracin ilk durakta olup olmadigi
 * bilgisi bir sonraki gorevin baslama saatinin belirlenmesi acisindan onemlidir.
 * 
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "H_ILK_NOKTA_GIRIS", schema="AYBTEST")
public class FirstPointEntrance extends BaseEntity {

	@Column(name = "GOREVID")
	private int taskId;

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "HATID")
	private int lineId;

	@Column(name = "NOKTAID")
	private int pointId;//DurakId

	@Column(name = "GIRISZAMANI")
	private Date entranceTime;

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

}
