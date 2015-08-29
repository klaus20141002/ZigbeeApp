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
@Table(name = "tc_control_mode")   
public class CfgSysControl extends BaseDomain{

    /**
     *    `id` int(11) NOT NULL AUTO_INCREMENT,
  `cur_mode` int(11) NOT NULL COMMENT '1 - 自动控制模式 2-手动控制模式',
     */
    private static final long serialVersionUID = 1L;

    private Integer curMode;
    
    
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

}
