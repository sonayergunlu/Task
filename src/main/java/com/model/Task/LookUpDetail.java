package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * K_KLAVUZ_DETAY tablosu.
 * K_Klavuz tablosunun alt tablosu olarak kullaniliyor.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_KLAVUZ_DETAY", schema="AYBTEST")
public class LookUpDetail extends BaseEntity{
	

	@Column(name="LOOKUPID")
	private int lookUpId;
	
	@Column(name="ADI")
	private String name;

	
	public int getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(int lookUpId) {
		this.lookUpId = lookUpId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}//End LookUpDetail class
