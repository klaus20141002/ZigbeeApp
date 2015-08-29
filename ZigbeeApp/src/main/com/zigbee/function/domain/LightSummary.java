package com.zigbee.function.domain;

import java.util.Date;

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
@Table(name = "light_summary_tbl")   
public class LightSummary extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer equipmentId;
    private Integer port;
    private Integer usage;
    private Date ontime;
    private Date offtime;
    private Date lastOntime;
    private Date lastOfftime;
    
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

	@Column(name = "`usage`")
	public Integer getUsage() {
		return usage;
	}

	public void setUsage(Integer usage) {
		this.usage = usage;
	}

	@Column(name = "ontime")
	public Date getOntime() {
		return ontime;
	}

	public void setOntime(Date ontime) {
		this.ontime = ontime;
	}

	@Column(name = "offtime")
	public Date getOfftime() {
		return offtime;
	}

	public void setOfftime(Date offtime) {
		this.offtime = offtime;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-14
	 *
	 * @return the lastOntime
	 */
	@Column(name = "last_ontime")
	public Date getLastOntime() {
		return lastOntime;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-14
	 *
	 * @param lastOntime the lastOntime to set
	 */
	public void setLastOntime(Date lastOntime) {
		this.lastOntime = lastOntime;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-14
	 *
	 * @return the lastOfftime
	 */
	@Column(name = "last_offtime")
	public Date getLastOfftime() {
		return lastOfftime;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2014-9-14
	 *
	 * @param lastOfftime the lastOfftime to set
	 */
	public void setLastOfftime(Date lastOfftime) {
		this.lastOfftime = lastOfftime;
	}

	
 }
