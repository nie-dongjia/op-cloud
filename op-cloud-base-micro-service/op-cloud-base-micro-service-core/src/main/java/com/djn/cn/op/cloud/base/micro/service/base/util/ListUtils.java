package com.djn.cn.op.cloud.base.micro.service.base.util;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class ListUtils {
	@SuppressWarnings("unchecked")
	public static void copyProperties(List<?> source, List<?> result,@SuppressWarnings("rawtypes") Class targetListClass){
        if(CollectionUtils.isEmpty(source) || result == null){
            return;
        }
        try {
        	 for (Object o :  source) {
                 Object object = targetListClass.newInstance();
                 BeanUtils.copyProperties(o,object);
                 //定义集合的下边界。
                 ((List<? super Object>)result).add(object);
             }
		} catch (Exception e) {
			// TODO: handle exception
		}
       
    }
}
