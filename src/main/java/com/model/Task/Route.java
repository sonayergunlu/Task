package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_GUZERGAH Tablosu
 * Guzergah bilgileri icin kullanilan entity.
 * 
 * @author abdullah.dogan
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="K_GUZERGAH", schema="AYBTEST")
public class Route extends BaseEntity{
	
	@Column(name="HATID")
	private int lineId;
	
	@Column(name="GUZERGAHKODU")
	private String routeCode;
	
	@Column(name="ISGIDISYONU")
	private boolean isGoingDirection;

	public boolean isGoingDirection() {
		return isGoingDirection;
	}

	public void setGoingDirection(boolean isGoingDirection) {
		this.isGoingDirection = isGoingDirection;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	
	
}//End Route class
