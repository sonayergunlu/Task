package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_GUZERGAH_NOKTASI tablosu
 * Guzergahlarin icinde bulunan duraklar icin kullanilan entity.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_GUZERGAH_NOKTASI", schema="AYBTEST")
public class RoutePoints extends BaseEntity{
	
	@Column(name="GUZERGAHID")
	private int routeId;
	
	@Column(name="NOKTAID")
	private int pointId;//DurakId
	
	@Column(name="SIRANO")
	private int order;//Durağın güzergah üzerindeki sırası
	
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
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
	
}//End RoutePoints class
