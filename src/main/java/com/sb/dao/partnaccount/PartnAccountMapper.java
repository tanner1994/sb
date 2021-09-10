package com.sb.dao.partnaccount;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.partnaccount.model.PartnAccount;
import com.sb.dao.partnaccount.model.PartnAccountExample;

public interface PartnAccountMapper {
    int countByExample(PartnAccountExample example);

    int deleteByExample(PartnAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartnAccount record);

    int insertSelective(PartnAccount record);

    List<PartnAccount> selectByExample(PartnAccountExample example);

    PartnAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartnAccount record, @Param("example") PartnAccountExample example);

    int updateByExample(@Param("record") PartnAccount record, @Param("example") PartnAccountExample example);

    int updateByPrimaryKeySelective(PartnAccount record);

    int updateByPrimaryKey(PartnAccount record);
}
