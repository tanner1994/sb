package com.sb.dao.interest;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.interest.model.Interest;
import com.sb.dao.interest.model.InterestExample;

public interface InterestMapper {
    int countByExample(InterestExample example);

    int deleteByExample(InterestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Interest record);

    int insertSelective(Interest record);

    List<Interest> selectByExample(InterestExample example);

    Interest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByExample(@Param("record") Interest record, @Param("example") InterestExample example);

    int updateByPrimaryKeySelective(Interest record);

    int updateByPrimaryKey(Interest record);
}
