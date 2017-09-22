package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_GUZERGAH_TARIFE_DEGISIM Tablosu. Bazi uzun hatlarda birden fazla tarife
 * uygulanabiliyor. Bu bilgiyi tutmak icin kullanilan entity.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "K_GUZERGAH_TARIFE_DEGISIM", schema="AYBTEST")
public class RouteTariffChange extends BaseEntity {

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "NOKTAID")
	private int pointId;//DurakId

	@Column(name = "SIRANO")
	private int orderNo;//Guzergah üzerindeki kaçıncı tarife değişim noktası olduğu bilgisi

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
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

}// End RouteTariffChange class
