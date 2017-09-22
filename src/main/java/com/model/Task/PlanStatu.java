package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * H_PLAN_DURUM Tablosu.
 * Aracpclere gonderilen plan datasi icin kullanilan
 * entity. Bu entity sayesinde plan datasi bir arac icin bir kez olusturuluyor.
 * Tekrar tekrar plan datasi olusturulmuyor. Plan datasi gonderilemeyen araclara
 * bu tablodaki veri cekilerek tekrar tekrar gonderilmesi saglaniyor.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "H_PLAN_DURUM", schema="AYBTEST")
public class PlanStatu extends BaseEntity {

	@Column(name = "ARACID")
	private int vehicleId;

	@Column(name = "GONDERILENDATA", columnDefinition="CLOB NOT NULL") 
	@Lob
	private String sendingData;

	/**
	 * AracPc isletim sistemleri farkli oldugu icin kullanilmis alan
	 */
	@Column(name = "ARACPLANUYUMU", nullable = true)
	private String vehiclePlanAdaptation;

	@Column(name = "ILETIMRAPORZAMANI", nullable = true)
	private Date deliveryReportTime;

	@Column(name = "SAYI")
	private int count;//Plan verisinin kac kez araca gonderildigini tutmak icin kullaniliyor.

	public String getVehiclePlanAdaptation() {
		return vehiclePlanAdaptation;
	}

	public void setVehiclePlanAdaptation(String vehiclePlanAdaptation) {
		this.vehiclePlanAdaptation = vehiclePlanAdaptation;
	}

	public Date getDeliveryReportTime() {
		return deliveryReportTime;
	}

	public void setDeliveryReportTime(Date deliveryReportTime) {
		this.deliveryReportTime = deliveryReportTime;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getSendingData() {
		return sendingData;
	}

	public void setSendingData(String sendingData) {
		this.sendingData = sendingData;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}// End Kullanılmıyor_TaskStatu class
