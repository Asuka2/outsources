package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Education;
    /**
 * @Author JCX
 * @create 2020-01-06 14:47
 */
public interface EducationService{


    int deleteByPrimaryKey(Integer educationId);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer educationId);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);

}
