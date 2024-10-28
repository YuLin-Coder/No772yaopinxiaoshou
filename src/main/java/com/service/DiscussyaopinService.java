package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyaopinView;


/**
 * 药品评论表
 *
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussyaopinService extends IService<DiscussyaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyaopinVO> selectListVO(Wrapper<DiscussyaopinEntity> wrapper);
   	
   	DiscussyaopinVO selectVO(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
   	
   	List<DiscussyaopinView> selectListView(Wrapper<DiscussyaopinEntity> wrapper);
   	
   	DiscussyaopinView selectView(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyaopinEntity> wrapper);
   	
}

