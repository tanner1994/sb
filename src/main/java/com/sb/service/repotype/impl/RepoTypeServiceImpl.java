package com.sb.service.repotype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.repotype.RepoTypeMapper;
import com.sb.dao.repotype.model.RepoType;
import com.sb.dao.repotype.model.RepoTypeExample;
import com.sb.service.repotype.RepoTypeService;

/**
 * 回购类型Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class RepoTypeServiceImpl implements RepoTypeService {

    @Autowired
    private RepoTypeMapper repoTypeMapper;

    @Override
    public Integer create(RepoType repoType) {
        repoTypeMapper.insertSelective(repoType);
        return repoType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        repoTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids))
            return;
        for (Integer id : ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(RepoType repoType) {
        repoTypeMapper.updateByPrimaryKeySelective(repoType);
    }

    @Override
    public void updateByIdInBatch(List<RepoType> repoTypes) {
        if (CollectionUtils.isEmpty(repoTypes))
            return;
        for (RepoType repoType : repoTypes) {
            this.updateById(repoType);
        }
    }

    @Override
    public RepoType findById(Integer id) {
        return repoTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public RepoType findOne(RepoType repoType) {
        ExampleBuilder<RepoTypeExample, RepoTypeExample.Criteria> builder =
            ExampleBuilder.create(RepoTypeExample.class, RepoTypeExample.Criteria.class);
        List<RepoType> repoTypes = repoTypeMapper.selectByExample(builder.buildExamplePack(repoType).getExample());
        if (repoTypes.size() > 0) {
            return repoTypes.get(0);
        }
        return null;
    }

    @Override
    public List<RepoType> findList(RepoType repoType) {
        ExampleBuilder<RepoTypeExample, RepoTypeExample.Criteria> builder =
            ExampleBuilder.create(RepoTypeExample.class, RepoTypeExample.Criteria.class);
        return repoTypeMapper.selectByExample(builder.buildExamplePack(repoType).getExample());
    }

    @Override
    public PageData<RepoType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<RepoTypeExample, RepoTypeExample.Criteria> builder =
            ExampleBuilder.create(RepoTypeExample.class, RepoTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<RepoTypeExample, RepoTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(repoTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(RepoType repoType) {
        ExampleBuilder<RepoTypeExample, RepoTypeExample.Criteria> builder =
            ExampleBuilder.create(RepoTypeExample.class, RepoTypeExample.Criteria.class);
        return repoTypeMapper.countByExample(builder.buildExamplePack(repoType).getExample());
    }
}
