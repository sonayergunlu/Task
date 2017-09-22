package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * H_GOREV Tablosu. Gorevlere ait bilgileri tutan model.
 * 
 * driverId - SOFORID
 * serviceNo -SERVISNO
 * lineId - HATID
 * routeId - GUZERGAHID
 * vehicleId - ARACID
 * sign - TABELA (tabela bir serviste çalışan araçların sıra numarası, örneğin; 1 nolu servisin 1. aracı, 1 nolu servisin 2.aracı gibi)
 * plannedStartTime - PLANLANANBASLANGICZAMANI
 * updatedStartTime - DUZENLENENBASLANGICZAMANI
 * taskSituationId - GOREVDURUMID (AraçDurum için kullanılacak, görev durumunu ifade eder - Değerleri: 1-Başlamadı 2-Aktif 3-Tamamlandı 4-İptal)
 * startTime - BASLANGICZAMANI
 * finishTime - BITISZAMANI
 * pointEntranceTime - DURAGAGIRISZAMANI (Göreve başlayacağı ilk durağa giriş zamanı)
 * estimatedFinishTime - TAHMINIBITISZAMANI
 * updatedTime - SONDEGISIMZAMANI
 * taskTypeCode - GOREVTIPIKODU (AA, PA gibi değerler alır. PA=Orer'den gelen bir görev, AA=Amir tarafından verilen bir görev)
 * planStatusCode - PLANDURUMKODU (Gerçek veya Tahsis olma durumunu tutar)
 * totalKm - TOPLAMKM
 * isDeadKm - ÖLÜKM
 * 
 * @author abdullah.dogan
 *
 */
@Audited
@Entity
@EntityListeners({AuditingEntityListener.class})
@Table(name = "H_GOREV", schema="AYBTEST")
public class Task extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "SOFORID")
	private int driverId;

	@Column(name = "SERVISNO")
	private String serviceNo;

	@Column(name = "HATID")
	private int lineId;

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "ARACID")
	private int vehicleId;

	@Column(name = "TABELA")
	private int sign;

	@Column(name = "PLANLANANBASLANGICZAMANI")
	private Date plannedStartTime;

	@Column(name = "DUZENLENENBASLANGICZAMANI")
	private Date updatedStartTime;

	@Column(name = "GOREVDURUMID")
	private int taskSituationId;
	// AraçDurum için kullanılacak - Değerleri: 1-Başlamadı 2-Aktif 3-Tamamlandı
	// 4-İptal

	@Column(name = "BASLANGICZAMANI")
	private Date startTime;

	@Column(name = "BITISZAMANI", nullable = true)
	private Date finishTime;

	@Column(name = "DURAGAGIRISZAMANI", nullable = true)
	private Date pointEntranceTime;// Göreve başlayacağı ilk durağa giriş zamanı

	@Column(name = "TAHMINIBITISZAMANI", nullable = true)
	private Date estimatedFinishTime;

	@LastModifiedDate
	@Column(name = "SONDEGISIMZAMANI")
	private Date updatedTime;

	@Column(name = "GOREVTIPIKODU")
	private String taskTypeCode;// PA gibi değerler(Orer tarafından atanan görev
								// gibi)

	@Column(name = "PLANDURUMKODU")
	private String planStatusCode;

	@Column(name = "TOPLAMKM")
	private double totalKm;
	
	@Column(name = "OLUKM")
	private boolean isDeadKm;

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public Date getPlannedStartTime() {
		return plannedStartTime;
	}

	public void setPlannedStartTime(Date plannedStartTime) {
		this.plannedStartTime = plannedStartTime;
	}

	public Date getUpdatedStartTime() {
		return updatedStartTime;
	}

	public void setUpdatedStartTime(Date updatedStartTime) {
		this.updatedStartTime = updatedStartTime;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Date getPointEntranceTime() {
		return pointEntranceTime;
	}

	public void setPointEntranceTime(Date pointEntranceTime) {
		this.pointEntranceTime = pointEntranceTime;
	}

	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}

	public void setEstimatedFinishTime(Date estimatedFinishTime) {
		this.estimatedFinishTime = estimatedFinishTime;
	}


	public String getTaskTypeCode() {
		return taskTypeCode;
	}

	public void setTaskTypeCode(String taskTypeCode) {
		this.taskTypeCode = taskTypeCode;
	}

	public String getPlanStatusCode() {
		return planStatusCode;
	}

	public void setPlanStatusCode(String planStatuCode) {
		this.planStatusCode = planStatuCode;
	}

	public double getTotalKm() {
		return totalKm;
	}

	public void setTotalKm(double totalKm) {
		this.totalKm = totalKm;
	}

	public int getTaskSituationId() {
		return taskSituationId;
	}

	public void setTaskSituationId(int taskSituationId) {
		this.taskSituationId = taskSituationId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public boolean isDeadKm() {
		return isDeadKm;
	}

	public void setDeadKm(boolean isDeadKm) {
		this.isDeadKm = isDeadKm;
	}

}// End H_Gorev class block
