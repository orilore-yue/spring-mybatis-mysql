package com.orilore.model;
public class Good{
	private Integer id;
	private String gname;
	private String photo;
	private String info;
	private String facotry;
	private String size;
	private Float price;
	private Kind kind;
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	public void setGname(String gname){
		this.gname=gname;
	}
	public String getGname(){
		return this.gname;
	}
	public void setPrice(Float price){
		this.price=price;
	}
	public Float getPrice(){
		return this.price;
	}
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return this.size;
	}
	public void setFacotry(String facotry){
		this.facotry=facotry;
	}
	public String getFacotry(){
		return this.facotry;
	}
	public void setPhoto(String photo){
		this.photo=photo;
	}
	public String getPhoto(){
		return this.photo;
	}
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
}