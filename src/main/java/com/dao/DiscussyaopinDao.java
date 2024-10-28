package com.dao;

import com.entity.DiscussyaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyaopinVO;
import com.entity.view.DiscussyaopinView;


/**
 * 药品评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussyaopinDao extends BaseMapper<DiscussyaopinEntity> {
	
	List<DiscussyaopinVO> selectListVO(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
	
	DiscussyaopinVO selectVO(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
	
	List<DiscussyaopinView> selectListView(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);

	List<DiscussyaopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
	
	DiscussyaopinView selectView(@Param("ew") Wrapper<DiscussyaopinEntity> wrapper);
	
}
