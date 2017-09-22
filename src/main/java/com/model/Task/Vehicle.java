package com.model.Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * K_ARAC tablosu. araclara ait bilgileri tutmak icin kullanilan model.
 * plate=plaka bilgisini tutar
 * doorNumber = kapi numarasi bilgisini tutar
 * brandmodel = aracin marka-model bilgisini tutmak icin kullanilir
 * vehicleTypeCode = arac tip kodu bilgisini tutar; Yolcu, Tamir ve diğer değerlerini alir.
 * operatorId = aracin hangi operatore ait oldugu bilgisini tutar
 * operatorCode = aracin hangi operatore ait olduğu bilgisini tutar.(iett, öho gibi)
 * vehicleKindCode = arac cins kodu bilgisini tutar. Çift katlı, körüklü, solo, Öho ve bilinmiyor değerleri var mevcutta.
 * vehicleSituationCode = arac durum kodu bilgisini tutar. Aktif, Pasif, Arızalı değerlerini alır.
 * handicappedSupportCode = özürlü destek kodu bilgisini tutar. V=Var, Y=Yok, B= bilinmiyor değerlerini alir.
 * vehicleBrandId = arac marka id bilgisni tutar.
 * garagePointId = garaj nokta id bilgisini tutar.
 * vehicleRaceCode = araç tür kodu bilgisni tutar. Metrobus, otobus değerlerini alır.
 * rotationGroupCode = rotasyon grup kodu bilgisini tutar.
 * vehicleGsm = araci suren soforun gsm bilgsini tutar(öho gibi özel şirketler için geçerli)
 * 
 * 
 * @author abdullah.dogan
 *
 */
@Entity
@Table(name="K_ARAC", schema="AYBTEST")
public class Vehicle extends BaseEntity{
	
	@Column(name = "PLAKA")
	private String plate;
	
    @Column(name = "KAPINUMARASI")
    private String doorNumber;
     
     @Column(name = "MARKAMODEL")
    private String brandModel;
     
     @Column(name = "ARACTIPKODU")
    private String vehicleTypeCode;  
     
     @Column(name = "OPERATORID")
    private int operatorId;
     
     @Column(name = "OPERATORKODU")
    private String operatorCode;
     
     @Column(name = "ARACCINSKODU")
    private String vehicleKindCode;
     
     @Column(name = "ARACDURUMKODU")
    private String vehicleSituationCode;
     
     @Column(name = "OZURLUDESTEKKODU")
    private String	handicappedSupportCode;
     
     @Column(name = "ARACMARKAID")
    private int vehicleBrandId;
     
     @Column(name = "GARAJNOKTAID")
    private int garagePointId;
     
     @Column(name = "ARACTURKODU")
    private String vehicleRaceCode;
     
     @Column(name = "ROTASYONGRUPKODU")
    private String rotationGroupCode;
     
     @Column(name = "GSMSAHIP")
    private String gsmSahip;//TODO türkçe tanımlama yapılmayacağı için düzenlenmeli
    
     @Column(name = "ARACGSM")
    private String vehicleGsm;
     
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getBrandModel() {
		return brandModel;
	}

	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public String getVehicleTypeCode() {
		return vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		this.vehicleTypeCode = vehicleTypeCode;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorCode() {
		return operatorCode;
	}

	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}

	public String getVehicleKindCode() {
		return vehicleKindCode;
	}

	public void setVehicleKindCode(String vehicleKindCode) {
		this.vehicleKindCode = vehicleKindCode;
	}

	public String getVehicleSituationCode() {
		return vehicleSituationCode;
	}

	public void setVehicleSituationCode(String vehicleSituationCode) {
		this.vehicleSituationCode = vehicleSituationCode;
	}

	public String getHandicappedSupportCode() {
		return handicappedSupportCode;
	}

	public void setHandicappedSupportCode(String handicappedSupportCode) {
		this.handicappedSupportCode = handicappedSupportCode;
	}

	public int getVehicleBrandId() {
		return vehicleBrandId;
	}

	public void setVehicleBrandId(int vehicleBrandId) {
		this.vehicleBrandId = vehicleBrandId;
	}

	public int getGaragePointId() {
		return garagePointId;
	}

	public void setGaragePointId(int garagePointId) {
		this.garagePointId = garagePointId;
	}

	public String getVehicleRaceCode() {
		return vehicleRaceCode;
	}

	public void setVehicleRaceCode(String vehicleRaceCode) {
		this.vehicleRaceCode = vehicleRaceCode;
	}

	public String getRotationGroupCode() {
		return rotationGroupCode;
	}

	public void setRotationGroupCode(String rotationGroupCode) {
		this.rotationGroupCode = rotationGroupCode;
	}

	public String getGsmSahip() {
		return gsmSahip;
	}

	public void setGsmSahip(String gsmSahip) {
		this.gsmSahip = gsmSahip;
	}

	public String getVehicleGsm() {
		return vehicleGsm;
	}

	public void setVehicleGsm(String vehicleGsm) {
		this.vehicleGsm = vehicleGsm;
	}
     
    		
}
