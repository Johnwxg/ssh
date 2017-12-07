package com.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.domain.Product;

/**
 * DAO中注入SessionFactory
 * 1、在DAO类中继承HibernateDaoSupport（该类中有定义好的模板，可直接使用getHibernateTemplate()方法）
 * 2、spring bean中配置dao类
 * 3、在dao中调用模板完成需要的操作
 * @author Admin
 *
 */
public class ProductDao extends HibernateDaoSupport{
	/**
	 * 保存
	 * @param product
	 */
	public void save(Product product){
		System.out.println("DAO中save方法开始执行#########");
		this.getHibernateTemplate().save(product);
	} 
}
