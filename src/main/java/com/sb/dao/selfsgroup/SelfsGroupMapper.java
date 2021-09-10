package com.sb.dao.selfsgroup;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.selfsgroup.model.SelfsGroup;
import com.sb.dao.selfsgroup.model.SelfsGroupExample;

public interface SelfsGroupMapper {
    int countByExample(SelfsGroupExample example);

    int deleteByExample(SelfsGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SelfsGroup record);

    int insertSelective(SelfsGroup record);

    List<SelfsGroup> selectByExample(SelfsGroupExample example);

    SelfsGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SelfsGroup record, @Param("example") SelfsGroupExample example);

    int updateByExample(@Param("record") SelfsGroup record, @Param("example") SelfsGroupExample example);

    int updateByPrimaryKeySelective(SelfsGroup record);

    int updateByPrimaryKey(SelfsGroup record);
}
