package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_Operator tablosu
 * Operator bilgileri icin kullanilan entity.
 * Operator iett basta olmak uzere ozel halk otobuslerini isleten firmalardir.
 * mevcutta kayitli bazi operatorler sunlar;
 * IETT
 * Mavi Marmara Ulasim A.S
 * Ozulas A.S
 * Otobus A.S
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_OPERATOR", schema="AYBTEST")
public class Operator extends BaseEntity{
	
	@Column(name = "ADI")
	private String name;
	
	@Column(name = "KODU")
	private String Code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}
	
	
}//End Operator class
