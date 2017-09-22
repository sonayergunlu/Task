package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_Klavuz tablosu.
 * Olusturulan tablolarda tur, cins, cesit gibi birden fazla deger iceren
 * alanlari tutmak icin kullanilan entity. Ornegin; hattipi, 
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "K_KLAVUZ", schema="AYBTEST")
public class LookUp extends BaseEntity {

	@Column(name = "ADI")
	private String adi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

}// End LookUp class
