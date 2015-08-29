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
@Table(name = "tm_trigger_setting")   
public class TriggerSetting extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer dataAcquType;//数据采集类型： 1-空气温度，2-空气湿度，3-光照度
    private Byte triggerType; //-1代表低于，+1代表高于
    private Float triggerVal; //触发阀值
    private Integer triggerActionType; //1闭合，2断开
    private Date lastUpdateTime; //配置最后更新时间
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    @Column(name = "data_acqu_type")
	public Integer getDataAcquType() {
		return dataAcquType;
	}

	public void setDataAcquType(Integer dataAcquType) {
		this.dataAcquType = dataAcquType;
	}

	@Column(name = "trigger_type")
	public Byte getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(Byte triggerType) {
		this.triggerType = triggerType;
	}

	@Column(name = "trigger_val")
	public Float getTriggerVal() {
		return triggerVal;
	}

	public void setTriggerVal(Float triggerVal) {
		this.triggerVal = triggerVal;
	}

	@Column(name = "trigger_action_type")
	public Integer getTriggerActionType() {
		return triggerActionType;
	}

	public void setTriggerActionType(Integer triggerActionType) {
		this.triggerActionType = triggerActionType;
	}

	@Column(name = "last_update_time")
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}
