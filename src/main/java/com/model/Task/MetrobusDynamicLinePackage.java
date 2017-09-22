package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * hat ismini alan metrobüslerin kayıt edildiği model.
 * @author sonay
 *
 */

@Entity
@Table(name="H_METROBUS_HAT_PAKET", schema="AYBTEST")
public class MetrobusDynamicLinePackage extends BaseEntity {

	@Column(name="ARACID")
	private int vehicleId;
	
	@Column(name="PAKETID")
	private int packageId;


	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}


	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
}
