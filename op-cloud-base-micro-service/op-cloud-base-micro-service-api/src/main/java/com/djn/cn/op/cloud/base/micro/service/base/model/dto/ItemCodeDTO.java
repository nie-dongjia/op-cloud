package com.djn.cn.op.cloud.base.micro.service.base.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class ItemCodeDTO implements Serializable{  
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "名称")
	private String name;
	@ApiModelProperty(value = "描述")
    private String categoryDesc;
	@ApiModelProperty(value = "类别")
    private String category;
	@ApiModelProperty(value = "code")
    private String code;
	@ApiModelProperty(value = "语言")
    private String culture;
	
	public ItemCodeDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCulture() {
		return culture;
	}
	public void setCulture(String culture) {
		this.culture = culture;
	}
    
}
