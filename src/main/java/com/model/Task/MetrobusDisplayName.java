package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Metrobüslerdeki hat isimleri sürekli olarak değiştiği için dinamik olarak bu isimlerin
 * gönderilmesi gerekiyor,bu model sınıfı bunu sağlamak için yazılmıştır. 
 * @author sonay
 *
 */


@Entity
@Table(name="A_METROBUS_HAT_ISMI", schema="AYBTEST")
public class MetrobusDisplayName extends BaseEntity {

	@Column(name="ARACID")
	private int vehicleId;
	
	@Column(name="HATISMI")
	public String displayName;

	@Column(name="HATID")
	public int hatId;
	
	

	public int getHatId() {
		return hatId;
	}

	public void setHatId(int hatId) {
		this.hatId = hatId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
	
}
