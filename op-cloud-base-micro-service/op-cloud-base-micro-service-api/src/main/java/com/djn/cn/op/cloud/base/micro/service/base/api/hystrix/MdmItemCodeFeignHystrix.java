package com.djn.cn.op.cloud.base.micro.service.base.api.hystrix;

import com.djn.cn.op.cloud.base.micro.service.base.api.MdmItemCodeFeignApi;
import com.djn.cn.op.cloud.base.micro.service.base.model.dto.ItemCodeDTO;
import com.djn.cn.op.common.service.model.ServiceReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MdmItemCodeFeignHystrix implements MdmItemCodeFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(MdmItemCodeFeignHystrix.class);

	
	@Override
	public ServiceReturn<List<ItemCodeDTO>> getByCategory(String category) {
		logger.error("MdmItemCodeFeignHystrix[]category[]" + category);
		return null;
	}

}
