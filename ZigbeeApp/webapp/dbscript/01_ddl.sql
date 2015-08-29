--联动触发的触发器
/**
 * 	public static final int DATAACQUTYPE_AIRTEMPERATURE = 1 ;//空气温度
 *	public static final int DATAACQUTYPE_AIRWETNESS = 2 ; //空气湿度
 *	public static final int DATAACQUTYPE_LIGHT = 3 ;  //光照度
 */
--光照度
USE `mxagriculture`;

DELIMITER $$

DROP TRIGGER IF EXISTS mxagriculture.light_tbl_AINS$$
USE `mxagriculture`$$
CREATE DEFINER=`root`@`%` TRIGGER `light_tbl_AINS` AFTER INSERT ON `light_tbl` FOR EACH ROW
begin
# find higher trigger setting
select trigger_val,trigger_action_type into  @trigger_val, @trigger_action_type
from tm_trigger_setting t where t.data_acqu_type = 3 and t.trigger_type = 1 ;
if !isnull(@trigger_val) && new.data_value >= @trigger_val then
	/**  delete all light controll */
	delete from `light_switch_tbl` where equipment_id in (
		select id from `tm_equipment` where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
		) and equip_type =2 # controller
	);
	/**   insert into new */
    insert into `light_switch_tbl`(equipment_id,data_value)
	select id,@trigger_action_type from `tm_equipment` e where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
	) and equip_type =2 ;# controller
else
select trigger_val,trigger_action_type into  @trigger_val, @trigger_action_type
from tm_trigger_setting t where t.data_acqu_type = 3 and t.trigger_type = -1 ;
if !isnull(@trigger_val) && new.data_value <= @trigger_val then
	/**  delete all light controll */
	delete from `light_switch_tbl` where equipment_id in (
		select id from `tm_equipment` where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
		) and equip_type =2 # controller
	);
	/**   insert into new */
    insert into `light_switch_tbl`(equipment_id,data_value)
	select id,@trigger_action_type from `tm_equipment` e where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
	) and equip_type =2 ;# controller
end if;
end if; 


END$$
DELIMITER ;

--空气温度
USE `mxagriculture`;
DELIMITER $$

DROP TRIGGER IF EXISTS mxagriculture.air_temperature_tbl_AINS$$
USE `mxagriculture`$$
CREATE TRIGGER `air_temperature_tbl_AINS` AFTER INSERT ON `air_temperature_tbl` FOR EACH ROW
begin
# find higher trigger setting
select trigger_val,trigger_action_type into  @trigger_val, @trigger_action_type
from tm_trigger_setting t where t.data_acqu_type = 1 and t.trigger_type = 1 ;
if !isnull(@trigger_val) && new.data_value >= @trigger_val then
	/**  delete all light controll */
	delete from `light_switch_tbl` where equipment_id in (
		select id from `tm_equipment` where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
		) and equip_type =2 # controller
	);
	/**   insert into new */
    insert into `light_switch_tbl`(equipment_id,data_value)
	select id,@trigger_action_type from `tm_equipment` e where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
	) and equip_type =2 ;# controller
else
select trigger_val,trigger_action_type into  @trigger_val, @trigger_action_type
from tm_trigger_setting t where t.data_acqu_type = 1 and t.trigger_type = -1 ;
if !isnull(@trigger_val) && new.data_value <= @trigger_val then
	/**  delete all light controll */
	delete from `light_switch_tbl` where equipment_id in (
		select id from `tm_equipment` where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
		) and equip_type =2 # controller
	);
	/**   insert into new */
    insert into `light_switch_tbl`(equipment_id,data_value)
	select id,@trigger_action_type from `tm_equipment` e where monitor_point_id = (
			select monitor_point_id from `tm_equipment` where id = new.equipment_id
	) and equip_type =2 ;# controller
end if;
end if; 


END$$
DELIMITER ;

