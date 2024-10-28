package com.entity.view;

import com.entity.YaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
@TableName("yaopin")
public class YaopinView  extends YaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinView(){
	}
 
 	public YaopinView(YaopinEntity yaopinEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
