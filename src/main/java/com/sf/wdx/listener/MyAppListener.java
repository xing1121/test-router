package com.sf.wdx.listener;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.sf.wdx.domain.Cat;
import com.sf.wdx.domain.Person;
import com.sf.wdx.router.KeyBinder;
import com.sf.wdx.service.CatService;
import com.sf.wdx.service.PersonService;

/**
 * 描述：Spring启动监听器
 * @author 80002888
 * @date   2018年8月13日
 */
@Component
public class MyAppListener implements ApplicationListener<ApplicationEvent>{

	@Autowired
	private PersonService personService;
	
	@Autowired
	private CatService catService; 
	
	/**
	 * Spring启动时触发(refresh=ContextRefreshedEvent，若是调用context.start()=ContextStartedEvent)
	 */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			// 查询demo数据库
			KeyBinder.bindKey(KeyBinder.DATASOURCE_DEMO);
			List<Person> persons = personService.selectAll();
			persons.forEach(System.out::println);
			
			System.out.println("---------------------------");
			
			// 查询test数据库
			KeyBinder.bindKey(KeyBinder.DATASOURCE_TEST);
			List<Cat> cats = catService.selectAll();
			cats.forEach(System.out::println);
			
			System.out.println("---------------------------");
			
			// 查询demo数据库
			KeyBinder.bindKey(KeyBinder.DATASOURCE_DEMO);
			persons = personService.selectAll();
			persons.forEach(System.out::println);
		}
	}

}
