package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * entity'ler için oluşturulmuş genel base abstract sınıfdır.
 * Bu sınıfı extend eden tüm entity sınıfları bu sınıftaki değişkenlere sahip olmuş olur.
 * 
 * Amaç tüm entity'ler için ortak olan alanları bu abstract sınıfta toplamaktır.
 * Böylelikle aynı kodu tekrar tekrar yazmayı engellemiş oluyoruz.
 * 
 * Bu property'ler; id, createdDate ve createdBy 'dır.
 * Bunlar genel property'lerdir. Açıklamaları alttadır.
 * 
 * id; tablonun primary key alanıdır ve otomatik artan şekilde ayarlanmıştır.
 * createdDate; kaydın oluşturma tarihini tutmak için kullanılan alandır.
 * createdBy; kaydı oluşturan kişi ya da sunucuyu tutmak amaçlı oluşturulmuş alandır.
 * 
 * @author Ozge
 * @author abdullah.dogan
 *
 */
@MappedSuperclass
public abstract class BaseEntity implements com.model.serialization.ISerializable {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "KAYITZAMANI")
	private Date createdDate = new Date();

	@Column(name = "KAYITEDEN")
	private String createdBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
