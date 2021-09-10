package com.sb.dao.repotype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sb.dao.repotype.model.RepoType;
import com.sb.dao.repotype.model.RepoTypeExample;

public interface RepoTypeMapper {
    int countByExample(RepoTypeExample example);

    int deleteByExample(RepoTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepoType record);

    int insertSelective(RepoType record);

    List<RepoType> selectByExample(RepoTypeExample example);

    RepoType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepoType record, @Param("example") RepoTypeExample example);

    int updateByExample(@Param("record") RepoType record, @Param("example") RepoTypeExample example);

    int updateByPrimaryKeySelective(RepoType record);

    int updateByPrimaryKey(RepoType record);
}
