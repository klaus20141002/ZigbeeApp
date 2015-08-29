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
@Table(name = "tc_auto_control")   
public class CfgTriggerMode extends BaseDomain{

    /**
     *     `id` int(11) NOT NULL AUTO_INCREMENT,
  `cfg_type` int(1) NOT NULL COMMENT '控制类型 1-温度，2-湿度，3-光照度',
  `cur_mode` int(1) NOT NULL COMMENT '当前模式1-恒定值，2-变值',
  `region` float DEFAULT NULL COMMENT '误差区间，如温度上下1度，设为1',
     */
    private static final long serialVersionUID = 1L;

    private Integer cfgType;
    private Integer curMode;
    private Float region;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the cfgType
	 */
    @Column(name = "cfg_type")
	public Integer getCfgType() {
		return cfgType;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param cfgType the cfgType to set
	 */
	public void setCfgType(Integer cfgType) {
		this.cfgType = cfgType;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the curMode
	 */
	@Column(name = "cur_mode")
	public Integer getCurMode() {
		return curMode;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param curMode the curMode to set
	 */
	public void setCurMode(Integer curMode) {
		this.curMode = curMode;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the region
	 */
	@Column(name = "region")
	public Float getRegion() {
		return region;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param region the region to set
	 */
	public void setRegion(Float region) {
		this.region = region;
	}

}
