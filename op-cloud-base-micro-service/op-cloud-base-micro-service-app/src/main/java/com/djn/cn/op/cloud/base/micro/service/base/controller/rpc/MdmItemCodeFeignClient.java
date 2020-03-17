package com.djn.cn.op.cloud.base.micro.service.base.controller.rpc;

import com.djn.cn.op.cloud.base.micro.service.base.api.MdmItemCodeFeignApi;
import com.djn.cn.op.cloud.base.micro.service.base.entity.ItemCode;
import com.djn.cn.op.cloud.base.micro.service.base.model.dto.ItemCodeDTO;
import com.djn.cn.op.cloud.base.micro.service.base.service.IItemCodeService;
import com.djn.cn.op.cloud.base.micro.service.base.util.ListUtils;
import com.djn.cn.op.common.service.model.ServiceReturn;
import com.djn.cn.op.common.service.util.ServiceReturnUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MdmItemCodeFeignClient implements  MdmItemCodeFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(MdmItemCodeFeignClient.class);
	@Autowired
	private IItemCodeService iItemCodeService;
	
	@Override
	@ApiOperation(httpMethod = "POST", value = " 通过 category 查询 ItemCodeDTO 列表")
	public ServiceReturn<List<ItemCodeDTO>> getByCategory(@PathVariable("category")  String category) {
		
		logger.info("mdm[]MdmItemCodeFeignClient[]getByCategory[]category=[{}]", category);	

		List<ItemCodeDTO> itemCodeDTOs = new ArrayList<>();
		List<ItemCode> itemCodes = iItemCodeService.getByCategory(category);
		if(itemCodes != null ) {
			ListUtils.copyProperties(itemCodes, itemCodeDTOs,ItemCodeDTO.class);
		}
		return ServiceReturnUtil.ok(itemCodeDTOs);
	}
}
