package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_GUZERGAH_KIRILMA TABLOSU
 * Guzergahlar uzerinde bulunan kirilma noktalari icin kullanilan entity.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_GUZERGAH_KIRILMA", schema="AYBTEST")
public class RouteBreakPoint extends BaseEntity {
	

	@Column(name="GUZERGAHID")
	private int routeId;
	
	@Column(name = "NOKTAID")
	private int pointId;//DurakId

	@Column(name="SURE")
	private int time;//kırılma noktasına gelmek için gereken süre dakika cinsinden
	
	@Column(name="SIRA")
	private int order;//Güzergahın kaçıncı kırılma noktası olduğu bilgisini tutar

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

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
	
	
}//End RouteBreakPoint class
