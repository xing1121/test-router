package com.sf.wdx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.wdx.domain.Person;
import com.sf.wdx.mapper.PersonMapper;

/**
 * 描述：PersonService
 * @author 80002888
 * @date   2018年8月13日
 */
@Service
public class PersonService {

	@Autowired
	private PersonMapper personMapper;
	
	/**
	 * 查询所有
	 *	@ReturnType	List<Person> 
	 *	@Date	2018年8月13日	下午3:05:50
	 *  @Param  @return
	 */
	public List<Person> selectAll(){
		return personMapper.selectByExample(null);
	}
	
}
