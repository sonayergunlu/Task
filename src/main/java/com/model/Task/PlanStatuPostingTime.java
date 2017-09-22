package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * H_Plan_Durum_Gonderim_Zamani tablosu
 * Aracpc den gelen "plani aldim" verisi icin kullanilan entity.
 * Plani alan arac icin kayit eklenir.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="H_PLAN_DURUM_GONDERIM_ZAMANI", schema="AYBTEST")
public class PlanStatuPostingTime extends BaseEntity{
	
	
	@Column(name = "GOREVDURUMID")
	private int planStatuId;
	
	@Column(name="GONDERIMZAMANI")
	private Date sendingTime;
	
	public Date getSendingTime() {
		return sendingTime;
	}

	public void setSendingTime(Date sendingTime) {
		this.sendingTime = sendingTime;
	}


	public int getPlanStatuId() {
		return planStatuId;
	}

	public void setPlanStatuId(int planStatuId) {
		this.planStatuId = planStatuId;
	}

	
}//End PlanStatusPostingTime class
