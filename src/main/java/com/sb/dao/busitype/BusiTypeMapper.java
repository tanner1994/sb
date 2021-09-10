package com.sb.dao.busitype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.busitype.model.BusiType;
import com.sb.dao.busitype.model.BusiTypeExample;

public interface BusiTypeMapper {
    int countByExample(BusiTypeExample example);

    int deleteByExample(BusiTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusiType record);

    int insertSelective(BusiType record);

    List<BusiType> selectByExample(BusiTypeExample example);

    BusiType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusiType record, @Param("example") BusiTypeExample example);

    int updateByExample(@Param("record") BusiType record, @Param("example") BusiTypeExample example);

    int updateByPrimaryKeySelective(BusiType record);

    int updateByPrimaryKey(BusiType record);
}
