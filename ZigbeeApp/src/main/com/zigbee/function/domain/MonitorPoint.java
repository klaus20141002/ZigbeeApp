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
@Table(name = "tm_monitor_point")   
public class MonitorPoint extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String pointName; //监测点名
    private String description; //监测点描述信息
    private Integer owner; //监测点所有者，用于权限控制
    private String position; //监测点位置
    private Integer mainDAEquipId;//对应主采集设备id
    private String pointCode; //监测点code
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    @Column(name = "point_name")
	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "owner")
	public Integer getOwner() {
		return owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}

	@Column(name = "position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "main_da_equip_id")
	public Integer getMainDAEquipId() {
		return mainDAEquipId;
	}

	public void setMainDAEquipId(Integer mainDAEquipId) {
		this.mainDAEquipId = mainDAEquipId;
	}

	@Column(name = "point_code")
	public String getPointCode() {
		return pointCode;
	}

	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

}
