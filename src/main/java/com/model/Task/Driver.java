package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_Sofor tablosu. 
 * Soforlere ait bilgilerin tutuldugu kaynak tablolusudur. 
 * Araclara gonderilen gorev datasinin icinde sofor bilgileri bulunmaktadir.
 * BU bilgiler K_Sofor tablosundan alinmaktadir.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_SOFOR", schema="AYBTEST")
public class Driver extends BaseEntity{
	
	@Column(name="SICILNUMARASI")
	private String registrationNumber;
	
	@Column(name="ADI")
	private String name;
	
	@Column(name="SOYADI")
	private String surname;
	
	
	@Column(name="OPERATORID")
	private int operatorId;//hangi operatore bağlı olduğunu tutar; İETT, ÖHO vs.
	
	@Column(name = "GARAJNOKTAID")
	private int garagePointId;//Herbir şoförün bağlı olduğu bir garaj vardır.
	
	@Column(name="GSM")
	private String Gsm;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGsm() {
		return Gsm;
	}

	public void setGsm(String gsm) {
		Gsm = gsm;
	}


	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	
}//End Driver class
