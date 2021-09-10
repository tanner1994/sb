package com.sb.dao.assetsprop;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.assetsprop.model.AssetsProp;
import com.sb.dao.assetsprop.model.AssetsPropExample;

public interface AssetsPropMapper {
    int countByExample(AssetsPropExample example);

    int deleteByExample(AssetsPropExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetsProp record);

    int insertSelective(AssetsProp record);

    List<AssetsProp> selectByExample(AssetsPropExample example);

    AssetsProp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetsProp record, @Param("example") AssetsPropExample example);

    int updateByExample(@Param("record") AssetsProp record, @Param("example") AssetsPropExample example);

    int updateByPrimaryKeySelective(AssetsProp record);

    int updateByPrimaryKey(AssetsProp record);
}
