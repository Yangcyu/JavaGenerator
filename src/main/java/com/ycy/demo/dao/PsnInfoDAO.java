package com.ycy.demo.dao;

import com.ycy.demo.entity.PsnInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PsnInfoDAO {
    int deleteByPrimaryKey(String psnNo);

    int insert(PsnInfo record);

    int insertSelective(PsnInfo record);

    PsnInfo selectByPrimaryKey(String psnNo);

    int updateByPrimaryKeySelective(PsnInfo record);

    int updateByPrimaryKey(PsnInfo record);
}