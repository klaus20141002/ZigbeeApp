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
@Table(name = "tc_light_trigger")   
public class CfgLightTrigger extends BaseDomain{

    /**
     *   `from_hour` int(2) NOT NULL COMMENT '起始时数',
  `from_minute` int(2) NOT NULL COMMENT '起始分钟数',
  `to_hour` int(2) NOT NULL COMMENT '截止时数',
  `to_minute` int(2) NOT NULL COMMENT '截止分钟数',
  `threshold_value` float NOT NULL,
  `greater_action` int(11) NOT NULL,
  `less_action` int(11) NOT NULL,
  `is_valid` int(1) NOT NULL,
     */
    private static final long serialVersionUID = 1L;

    private Integer fromHour;
    private Integer fromMinute;
    private Integer toHour;
    private Integer toMinute;
    private Integer greaterAction;
    private Integer lessAction;
    private Integer isValid;
    private Float thresholdValue;
    
    
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
	 * @return the fromHour
	 */
    @Column(name = "from_hour")
	public Integer getFromHour() {
		return fromHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param fromHour the fromHour to set
	 */
	public void setFromHour(Integer fromHour) {
		this.fromHour = fromHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the fromMinute
	 */
	@Column(name = "from_minute")
	public Integer getFromMinute() {
		return fromMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param fromMinute the fromMinute to set
	 */
	public void setFromMinute(Integer fromMinute) {
		this.fromMinute = fromMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the toHour
	 */
	@Column(name = "to_hour")
	public Integer getToHour() {
		return toHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param toHour the toHour to set
	 */
	public void setToHour(Integer toHour) {
		this.toHour = toHour;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the toMinute
	 */
	@Column(name = "to_minute")
	public Integer getToMinute() {
		return toMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param toMinute the toMinute to set
	 */
	public void setToMinute(Integer toMinute) {
		this.toMinute = toMinute;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the greaterAction
	 */
	@Column(name = "greater_action")
	public Integer getGreaterAction() {
		return greaterAction;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param greaterAction the greaterAction to set
	 */
	public void setGreaterAction(Integer greaterAction) {
		this.greaterAction = greaterAction;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @return the lessAction
	 */
	@Column(name = "less_action")
	public Integer getLessAction() {
		return lessAction;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param lessAction the lessAction to set
	 */
	public void setLessAction(Integer lessAction) {
		this.lessAction = lessAction;
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
	 * @return the thresholdValue
	 */
	@Column(name = "threshold_value")
	public Float getThresholdValue() {
		return thresholdValue;
	}

	/**
	 * @Author      :      ZHWANG
	 *
	 * @Date        :      2015-1-12
	 *
	 * @param thresholdValue the thresholdValue to set
	 */
	public void setThresholdValue(Float thresholdValue) {
		this.thresholdValue = thresholdValue;
	}

}
