package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Bu entity araclara ait ip adreslerini tutmak icin kullaniliyor. Plan ve
 * dinamik mesaj gonderilirken gerek duyuluyor. Ancak bu entity bir api ile
 * diagnostic serverdan alinmali.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "H_ARAC_DURUM", schema="AYBTEST")
public class VehicleSituation extends BaseEntity {

	@Column(name = "MACADRES")
	private String macAddress;

	@Column(name = "IP")
	private String Ip;

	@Column(name = "DEGER")
	private String value;

	@Column(name = "ARACID")
	private int vehicleId;

	@JsonProperty("LuDt")
	@Column(name = "KLAVUZDETAYID")
	private int lookUpDetayId;

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getLookUpDetayId() {
		return lookUpDetayId;
	}

	public void setLookUpDetayId(int lookUpDetayId) {
		this.lookUpDetayId = lookUpDetayId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

}
