package com.jlfex.hermes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jlfex.hermes.model.Properties;

/**
 * 系统属性仓库
 * 
 * @author ultrafrog
 * @version 1.0, 2013-11-26
 * @since 1.0
 */
@Repository
public interface PropertiesRepository extends JpaRepository<Properties, String> {

	/**
	 * 通过代码查询系统属性
	 * 
	 * @param code
	 * @return
	 */
	public Properties findByCode(String code);
}
