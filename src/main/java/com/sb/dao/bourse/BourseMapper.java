package com.sb.dao.bourse;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.bourse.model.Bourse;
import com.sb.dao.bourse.model.BourseExample;

public interface BourseMapper {
    int countByExample(BourseExample example);

    int deleteByExample(BourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bourse record);

    int insertSelective(Bourse record);

    List<Bourse> selectByExample(BourseExample example);

    Bourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bourse record, @Param("example") BourseExample example);

    int updateByExample(@Param("record") Bourse record, @Param("example") BourseExample example);

    int updateByPrimaryKeySelective(Bourse record);

    int updateByPrimaryKey(Bourse record);
}
