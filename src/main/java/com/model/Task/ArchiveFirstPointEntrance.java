package com.model.Task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * A_ILK_NOKTA_GIRIS Tablosu.
 * aracpc' nin ilk duraga giris yaptigi zaman
 * yolladigi veriyi arsivlemek icin kullanilan model.
 * Bu tabloda tum araclarin ilk durak giris verileri tutulur. 
 * Ilk duraga giris verilerinin tutulmasinin sebebi goreve baslama zamaninin
 * duzenlenmesiyle ilgilidir. Cunku her arac gorevine ilk duragindayken baslar.
 * Ilk duraga zamaninda gelip gelmedigi bir sonraki gorev icin baslama saatinin
 * otelenip otelenmemesine neden olmaktadir.
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name = "A_ILK_NOKTA_GIRIS", schema="AYBTEST")
public class ArchiveFirstPointEntrance extends BaseEntity {


	@Column(name = "GOREVID")
	private int taskId;

	@Column(name = "GUZERGAHID")
	private int routeId;

	@Column(name = "HATID")
	private int lineId;

	@Column(name = "NOKTAID")
	private int pointId; //DurakId

	@Column(name = "GIRISZAMANI")
	private Date entranceTime; //Durağa giriş zamani

	public Date getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(Date entranceTime) {
		this.entranceTime = entranceTime;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}

}// End FirstPointEntrance class
