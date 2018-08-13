package com.sf.wdx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.wdx.domain.Cat;
import com.sf.wdx.mapper.CatMapper;

/**
 * 描述：CatService
 * @author 80002888
 * @date   2018年8月13日
 */
@Service
public class CatService {

	@Autowired
	private CatMapper catMapper;
	
	/**
	 * 查询所有
	 *	@ReturnType	List<Cat> 
	 *	@Date	2018年8月13日	下午3:05:50
	 *  @Param  @return
	 */
	public List<Cat> selectAll(){
		return catMapper.selectByExample(null);
	}
	
}
