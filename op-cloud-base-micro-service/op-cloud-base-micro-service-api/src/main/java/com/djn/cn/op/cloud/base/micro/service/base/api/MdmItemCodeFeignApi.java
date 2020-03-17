package com.djn.cn.op.cloud.base.micro.service.base.api;

import com.djn.cn.op.cloud.base.micro.service.base.api.hystrix.MdmItemCodeFeignHystrix;
import com.djn.cn.op.cloud.base.micro.service.base.model.dto.ItemCodeDTO;
import com.djn.cn.op.cloud.common.config.FeignConfig;
import com.djn.cn.op.common.service.model.ServiceReturn;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 
 * <b>类   名：</b>MdmItemCodeFeignApi<br/>
 * <b>类描述：</b>The interface MDM  ItemCode feign api. <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@FeignClient(value = "base-micro-service",configuration = FeignConfig.class,fallback = MdmItemCodeFeignHystrix.class)
public interface MdmItemCodeFeignApi {
	/**
	 * 
	 * getByCategory  通过 category 查询 ItemCodeDTO 列表
	 *
	 * @param category
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	@PostMapping(value = "/api/itemCode/getByCategory/{category}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ServiceReturn<List<ItemCodeDTO>> getByCategory(@PathVariable("category") String category);
}
