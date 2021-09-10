package com.sb.dao.capaccount;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.capaccount.model.CapAccount;
import com.sb.dao.capaccount.model.CapAccountExample;

public interface CapAccountMapper {
    int countByExample(CapAccountExample example);

    int deleteByExample(CapAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CapAccount record);

    int insertSelective(CapAccount record);

    List<CapAccount> selectByExample(CapAccountExample example);

    CapAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CapAccount record, @Param("example") CapAccountExample example);

    int updateByExample(@Param("record") CapAccount record, @Param("example") CapAccountExample example);

    int updateByPrimaryKeySelective(CapAccount record);

    int updateByPrimaryKey(CapAccount record);
}
