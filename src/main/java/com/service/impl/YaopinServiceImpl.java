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


import com.dao.YaopinDao;
import com.entity.YaopinEntity;
import com.service.YaopinService;
import com.entity.vo.YaopinVO;
import com.entity.view.YaopinView;

@Service("yaopinService")
public class YaopinServiceImpl extends ServiceImpl<YaopinDao, YaopinEntity> implements YaopinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaopinEntity> page = this.selectPage(
                new Query<YaopinEntity>(params).getPage(),
                new EntityWrapper<YaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaopinEntity> wrapper) {
		  Page<YaopinView> page =new Query<YaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaopinVO> selectListVO(Wrapper<YaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaopinVO selectVO(Wrapper<YaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaopinView> selectListView(Wrapper<YaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaopinView selectView(Wrapper<YaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
