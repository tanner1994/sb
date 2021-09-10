package com.sb.dao.sclassify;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.sclassify.model.Sclassify;
import com.sb.dao.sclassify.model.SclassifyExample;

public interface SclassifyMapper {
    int countByExample(SclassifyExample example);

    int deleteByExample(SclassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sclassify record);

    int insertSelective(Sclassify record);

    List<Sclassify> selectByExample(SclassifyExample example);

    Sclassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sclassify record, @Param("example") SclassifyExample example);

    int updateByExample(@Param("record") Sclassify record, @Param("example") SclassifyExample example);

    int updateByPrimaryKeySelective(Sclassify record);

    int updateByPrimaryKey(Sclassify record);
}
