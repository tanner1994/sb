package com.sb.dao.tally;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.tally.model.Tally;
import com.sb.dao.tally.model.TallyExample;

public interface TallyMapper {
    int countByExample(TallyExample example);

    int deleteByExample(TallyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tally record);

    int insertSelective(Tally record);

    List<Tally> selectByExample(TallyExample example);

    Tally selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tally record, @Param("example") TallyExample example);

    int updateByExample(@Param("record") Tally record, @Param("example") TallyExample example);

    int updateByPrimaryKeySelective(Tally record);

    int updateByPrimaryKey(Tally record);
}
