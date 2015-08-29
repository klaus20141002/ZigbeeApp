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
@Table(name = "tc_threshold")   
public class CfgThreshold extends BaseDomain{

    /**
     *  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cfg_type` int(1) NOT NULL COMMENT '设置类型 1-温度，2-湿度，3-光照度',
  `cfg_hour` int(11) NOT NULL COMMENT '小时',
  `cfg_minute` int(11) NOT NULL COMMENT '分钟',
  `cfg_value` float NOT NULL COMMENT '取值',
  `is_constant` int(1) NOT NULL COMMENT '恒定1/变化0',
  `is_valid` int(1) NOT NULL COMMENT '1有效/0无效',
  `applied` int(1) NOT NULL COMMENT '是否已应用1是/0否',
  apply_date
     */
    private static final long serialVersionUID = 1L;

    private Integer cfgType;
    private Integer cfgHour;
    private Integer cfgMinute;
    private Integer isConstant;
    private Integer isValid;
    private Integer applied;
    private Date applyDate;
    private Float cfgValue;
    
    
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
	 * @return the cfgHour
	 */
	@Column(name = "cfg_hour")
	public Integer getCfgHour() {
		return cfgHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param cfgHour the cfgHour to set
	 */
	public void setCfgHour(Integer cfgHour) {
		this.cfgHour = cfgHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the cfgMinute
	 */
	@Column(name = "cfg_minute")
	public Integer getCfgMinute() {
		return cfgMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param cfgMinute the cfgMinute to set
	 */
	public void setCfgMinute(Integer cfgMinute) {
		this.cfgMinute = cfgMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the isConstant
	 */
	@Column(name = "is_constant")
	public Integer getIsConstant() {
		return isConstant;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param isConstant the isConstant to set
	 */
	public void setIsConstant(Integer isConstant) {
		this.isConstant = isConstant;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the isValid
	 */
	@Column(name = "is_valid")
	public Integer getIsValid() {
		return isValid;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param isValid the isValid to set
	 */
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the applied
	 */
	@Column(name = "applied")
	public Integer getApplied() {
		return applied;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param applied the applied to set
	 */
	public void setApplied(Integer applied) {
		this.applied = applied;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the applyDate
	 */
	@Column(name = "apply_date")
	public Date getApplyDate() {
		return applyDate;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param applyDate the applyDate to set
	 */
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the cfgValue
	 */
	@Column(name = "cfg_value")
	public Float getCfgValue() {
		return cfgValue;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param cfgValue the cfgValue to set
	 */
	public void setCfgValue(Float cfgValue) {
		this.cfgValue = cfgValue;
	}

}
