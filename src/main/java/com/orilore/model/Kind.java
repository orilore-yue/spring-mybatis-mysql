package com.orilore.model;

import java.util.List;

public class Kind{
	private Integer id;
	private String name;
	
	public Kind() {
		
	}
	
	public Kind(String name) {
		this.name = name;
	}
	
	private List<Good> goods;
	
	public void setId(Integer id){
		this.id=id;
	}	public Integer getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public List<Good> getGoods() {
		return goods;
	}
	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}
}