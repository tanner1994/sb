package com.sb.service.org.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.org.OrgMapper;
import com.sb.dao.org.model.Org;
import com.sb.dao.org.model.OrgExample;
import com.sb.service.org.OrgService;

/**
 * 组织Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgMapper orgMapper;

    @Override
    public Integer create(Org org) {
        orgMapper.insertSelective(org);
        return org.getId();
    }

    @Override
    public void deleteById(Integer id) {
        orgMapper.deleteByPrimaryKey(id);
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
    public void updateById(Org org) {
        orgMapper.updateByPrimaryKeySelective(org);
    }

    @Override
    public void updateByIdInBatch(List<Org> orgs) {
        if (CollectionUtils.isEmpty(orgs))
            return;
        for (Org org : orgs) {
            this.updateById(org);
        }
    }

    @Override
    public Org findById(Integer id) {
        return orgMapper.selectByPrimaryKey(id);
    }

    @Override
    public Org findOne(Org org) {
        ExampleBuilder<OrgExample, OrgExample.Criteria> builder =
            ExampleBuilder.create(OrgExample.class, OrgExample.Criteria.class);
        List<Org> orgs = orgMapper.selectByExample(builder.buildExamplePack(org).getExample());
        if (orgs.size() > 0) {
            return orgs.get(0);
        }
        return null;
    }

    @Override
    public List<Org> findList(Org org) {
        ExampleBuilder<OrgExample, OrgExample.Criteria> builder =
            ExampleBuilder.create(OrgExample.class, OrgExample.Criteria.class);
        return orgMapper.selectByExample(builder.buildExamplePack(org).getExample());
    }

    @Override
    public PageData<Org> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<OrgExample, OrgExample.Criteria> builder =
            ExampleBuilder.create(OrgExample.class, OrgExample.Criteria.class);
        ExampleBuilder.ExamplePack<OrgExample, OrgExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(orgMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Org org) {
        ExampleBuilder<OrgExample, OrgExample.Criteria> builder =
            ExampleBuilder.create(OrgExample.class, OrgExample.Criteria.class);
        return orgMapper.countByExample(builder.buildExamplePack(org).getExample());
    }
}
