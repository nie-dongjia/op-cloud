package com.djn.cn.op.cloud.base.micro.service.test.base;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.op.cloud.base.micro.service.base.dao.ItemCodeMapper;
import com.djn.cn.op.cloud.base.micro.service.base.entity.ItemCode;
import com.djn.cn.op.cloud.base.micro.service.base.service.IItemCodeService;
import com.djn.cn.op.cloud.base.micro.service.test.AbstractTestCase;

public class ItemCodeTest extends AbstractTestCase{
	@Autowired
	private IItemCodeService iItemCodeService;
	@Autowired
	private ItemCodeMapper itemCodeMapper;
	@Test
	public void selectAllTest() {
		System.out.println("AAAAA:" + iItemCodeService.selectAll().size());
	}	
	@Test
	public void insertSelectiveTest() {
		ItemCode itemCode = new ItemCode();
		itemCode.setCategory("sex");
		itemCode.setCategoryDesc("性别");
		itemCode.setCode("0");
		itemCode.setName("女");
		System.out.println("AAAAA:" + iItemCodeService.insertSelective(itemCode));
		System.out.println(itemCode.getId());
		System.out.println(itemCode.getDeleted());
		ItemCode itemCode1 = new ItemCode();
		itemCode1.setCategory("sex");
		itemCode1.setCategoryDesc("性别");
		itemCode1.setCode("1");
		itemCode1.setName("男");
		System.out.println("BBBBB:" + iItemCodeService.insertSelective(itemCode1));
		System.out.println(itemCode1.getId());
		System.out.println(itemCode1.getDeleted());
	}	
	@Test
	public void selectByPrimaryKeyTest() {
		ItemCode itemCode = iItemCodeService.selectByPrimaryKey(1L);
		System.out.println("AAAAA:" + itemCode);
	}	
	@Test
	public void selectOneTest() {
		ItemCode itemCode = new ItemCode();
		itemCode.setCategory("sex");
		List<ItemCode> itemCodes = itemCodeMapper.select(itemCode);
		
		System.out.println(itemCodes);
	}	
}
