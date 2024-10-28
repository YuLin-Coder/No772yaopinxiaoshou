package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaopinView;


/**
 * 药品
 *
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface YaopinService extends IService<YaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaopinVO> selectListVO(Wrapper<YaopinEntity> wrapper);
   	
   	YaopinVO selectVO(@Param("ew") Wrapper<YaopinEntity> wrapper);
   	
   	List<YaopinView> selectListView(Wrapper<YaopinEntity> wrapper);
   	
   	YaopinView selectView(@Param("ew") Wrapper<YaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaopinEntity> wrapper);
   	
}

