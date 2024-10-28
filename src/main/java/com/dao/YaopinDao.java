package com.dao;

import com.entity.YaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinVO;
import com.entity.view.YaopinView;


/**
 * 药品
 * 
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface YaopinDao extends BaseMapper<YaopinEntity> {
	
	List<YaopinVO> selectListVO(@Param("ew") Wrapper<YaopinEntity> wrapper);
	
	YaopinVO selectVO(@Param("ew") Wrapper<YaopinEntity> wrapper);
	
	List<YaopinView> selectListView(@Param("ew") Wrapper<YaopinEntity> wrapper);

	List<YaopinView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinEntity> wrapper);
	
	YaopinView selectView(@Param("ew") Wrapper<YaopinEntity> wrapper);
	
}
