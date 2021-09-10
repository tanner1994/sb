package com.sb.service.securities.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.securities.SecuritiesMapper;
import com.sb.dao.securities.model.Securities;
import com.sb.dao.securities.model.SecuritiesExample;
import com.sb.service.securities.SecuritiesService;

/**
 * 证券档案Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class SecuritiesServiceImpl implements SecuritiesService {

    @Autowired
    private SecuritiesMapper securitiesMapper;

    @Override
    public Integer create(Securities securities) {
        securitiesMapper.insertSelective(securities);
        return securities.getId();
    }

    @Override
    public void deleteById(Integer id) {
        securitiesMapper.deleteByPrimaryKey(id);
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
    public void updateById(Securities securities) {
        securitiesMapper.updateByPrimaryKeySelective(securities);
    }

    @Override
    public void updateByIdInBatch(List<Securities> securitiess) {
        if (CollectionUtils.isEmpty(securitiess))
            return;
        for (Securities securities : securitiess) {
            this.updateById(securities);
        }
    }

    @Override
    public Securities findById(Integer id) {
        return securitiesMapper.selectByPrimaryKey(id);
    }

    @Override
    public Securities findOne(Securities securities) {
        ExampleBuilder<SecuritiesExample, SecuritiesExample.Criteria> builder =
            ExampleBuilder.create(SecuritiesExample.class, SecuritiesExample.Criteria.class);
        List<Securities> securitiess =
            securitiesMapper.selectByExample(builder.buildExamplePack(securities).getExample());
        if (securitiess.size() > 0) {
            return securitiess.get(0);
        }
        return null;
    }

    @Override
    public List<Securities> findList(Securities securities) {
        ExampleBuilder<SecuritiesExample, SecuritiesExample.Criteria> builder =
            ExampleBuilder.create(SecuritiesExample.class, SecuritiesExample.Criteria.class);
        return securitiesMapper.selectByExample(builder.buildExamplePack(securities).getExample());
    }

    @Override
    public PageData<Securities> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<SecuritiesExample, SecuritiesExample.Criteria> builder =
            ExampleBuilder.create(SecuritiesExample.class, SecuritiesExample.Criteria.class);
        ExampleBuilder.ExamplePack<SecuritiesExample, SecuritiesExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(securitiesMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Securities securities) {
        ExampleBuilder<SecuritiesExample, SecuritiesExample.Criteria> builder =
            ExampleBuilder.create(SecuritiesExample.class, SecuritiesExample.Criteria.class);
        return securitiesMapper.countByExample(builder.buildExamplePack(securities).getExample());
    }
}
