package com.zigbee.function.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zigbee.framework.common.domain.BaseDomain;

/**
 *
 */
@Entity
@Table(name = "time_configration_tbl")   
public class TimeConfigration extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer equipmentId;
    private Integer port;
    private Integer type;
    private Integer airTemperature;
    private Integer airWetness;
    private Integer light;
    private Integer ledLightOnOff;
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    @Column(name = "equipment_id")
	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	@Column(name = "port_id")
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Column(name = "`type`")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "airtemperature")
	public Integer getAirTemperature() {
		return airTemperature;
	}

	public void setAirTemperature(Integer airTemperature) {
		this.airTemperature = airTemperature;
	}

	@Column(name = "airwetness")
	public Integer getAirWetness() {
		return airWetness;
	}

	public void setAirWetness(Integer airWetness) {
		this.airWetness = airWetness;
	}

	@Column(name = "light")
	public Integer getLight() {
		return light;
	}

	public void setLight(Integer light) {
		this.light = light;
	}

	@Column(name = "ledlightonoff")
	public Integer getLedLightOnOff() {
		return ledLightOnOff;
	}

	public void setLedLightOnOff(Integer ledLightOnOff) {
		this.ledLightOnOff = ledLightOnOff;
	}
	
}
