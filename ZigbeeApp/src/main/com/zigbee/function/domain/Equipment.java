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
@Table(name = "tm_equipment")   
public class Equipment extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String equipName; //设备名
    private Byte equipType; //设备类型
    private String equipCode; //设备code
    private String equipSeq; //设备编号
    private Integer monitorPointId;//所属监测点ID
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    @Column(name = "equip_name")
	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

    @Column(name = "equip_type")
	public Byte getEquipType() {
		return equipType;
	}

	public void setEquipType(Byte equipType) {
		this.equipType = equipType;
	}

    @Column(name = "equipment_id")
	public String getEquipCode() {
		return equipCode;
	}

	public void setEquipCode(String equipCode) {
		this.equipCode = equipCode;
	}

    @Column(name = "equip_seq")
	public String getEquipSeq() {
		return equipSeq;
	}

	public void setEquipSeq(String equipSeq) {
		this.equipSeq = equipSeq;
	}

    @Column(name = "monitor_point_id")
	public Integer getMonitorPointId() {
		return monitorPointId;
	}

	public void setMonitorPointId(Integer monitorPointId) {
		this.monitorPointId = monitorPointId;
	}
}
