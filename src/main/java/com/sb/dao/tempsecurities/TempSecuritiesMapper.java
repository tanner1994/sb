package com.sb.dao.tempsecurities;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.tempsecurities.model.TempSecurities;
import com.sb.dao.tempsecurities.model.TempSecuritiesExample;

public interface TempSecuritiesMapper {
    int countByExample(TempSecuritiesExample example);

    int deleteByExample(TempSecuritiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TempSecurities record);

    int insertSelective(TempSecurities record);

    List<TempSecurities> selectByExample(TempSecuritiesExample example);

    TempSecurities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TempSecurities record,
        @Param("example") TempSecuritiesExample example);

    int updateByExample(@Param("record") TempSecurities record, @Param("example") TempSecuritiesExample example);

    int updateByPrimaryKeySelective(TempSecurities record);

    int updateByPrimaryKey(TempSecurities record);
}
