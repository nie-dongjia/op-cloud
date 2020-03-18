package com.djn.cn.op.cloud.base.micro.service.base.service;

import com.djn.cn.op.cloud.base.micro.service.base.entity.ItemCode;

import java.util.List;

/**
 * 
 * <b>类   名：</b>IUserInfoService<br/>
 * <b>类描述：</b>应用用户接口<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月18日 下午9:35:52<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月18日 下午9:35:52<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public interface IItemCodeService extends IBaseService<ItemCode> {

	/**
	 * 
	 * getByCategory  category 查询 ItemCode 列表
	 *
	 * @param category
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	List<ItemCode>  getByCategory(String category);
}
