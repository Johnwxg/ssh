package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ProductDao;
import com.ssh.domain.Product;

@Transactional
public class ProductService {
	//业务层注入DAO类
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * 保存
	 * @param product
	 * @return
	 */
	public void save(Product product){
		System.out.println("Service中save方法开始执行#########");
		productDao.save(product);
	}
}
