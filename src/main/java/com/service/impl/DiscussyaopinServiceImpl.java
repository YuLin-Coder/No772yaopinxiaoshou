package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyaopinDao;
import com.entity.DiscussyaopinEntity;
import com.service.DiscussyaopinService;
import com.entity.vo.DiscussyaopinVO;
import com.entity.view.DiscussyaopinView;

@Service("discussyaopinService")
public class DiscussyaopinServiceImpl extends ServiceImpl<DiscussyaopinDao, DiscussyaopinEntity> implements DiscussyaopinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyaopinEntity> page = this.selectPage(
                new Query<DiscussyaopinEntity>(params).getPage(),
                new EntityWrapper<DiscussyaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyaopinEntity> wrapper) {
		  Page<DiscussyaopinView> page =new Query<DiscussyaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyaopinVO> selectListVO(Wrapper<DiscussyaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyaopinVO selectVO(Wrapper<DiscussyaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyaopinView> selectListView(Wrapper<DiscussyaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyaopinView selectView(Wrapper<DiscussyaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
