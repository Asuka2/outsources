package com.xdkj.outsources.service;

import com.xdkj.outsources.entity.Project;

/**
 * @Author JCX
 * @create 2020-01-06 14:48
 */
public interface ProjectService {


    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

}

