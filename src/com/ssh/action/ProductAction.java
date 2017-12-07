package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.Product;
import com.ssh.service.ProductService;

/*  
 * 这种将表单数据封装到后台对象属性的方式叫做模型驱动，模型驱动的实现方式  
 * 1、实现ModelDriven<T>接口  
 * 2、在对应的Action下面，提供一个要封装表单数据的属性，即18行代码所示  
 * 3、实现getModel方法，返回在2处的属性名字  
 * 如果一个Action类没有实现ModelDriven这个接口，那么比如form表单有个name为web的表单项，  
 * 那么Struts2会默认调用当前action类的setWeb方法，否则会调用getModel()方法返回值得setWeb方法  
 */  
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	private static final long serialVersionUID = 1L;
	//驱动模型使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	//Struts和spring整合过程中按名称自动注入的业务层类
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * 保存
	 * @param product
	 * @return
	 */
	public String save(){
		System.out.println("Action中save方法开始执行#########");
		System.out.println(product.getPname()+"########"+product.getPrice());
		productService.save(product);
		return NONE;
	}
	
}
