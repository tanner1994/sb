package com.sb.service.tempsecurities.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.tempsecurities.TempSecuritiesMapper;
import com.sb.dao.tempsecurities.model.TempSecurities;
import com.sb.dao.tempsecurities.model.TempSecuritiesExample;
import com.sb.service.tempsecurities.TempSecuritiesService;

/**
 * 临时档案Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class TempSecuritiesServiceImpl implements TempSecuritiesService {

    @Autowired
    private TempSecuritiesMapper tempSecuritiesMapper;

    @Override
    public Integer create(TempSecurities tempSecurities) {
        tempSecuritiesMapper.insertSelective(tempSecurities);
        return tempSecurities.getId();
    }

    @Override
    public void deleteById(Integer id) {
        tempSecuritiesMapper.deleteByPrimaryKey(id);
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
    public void updateById(TempSecurities tempSecurities) {
        tempSecuritiesMapper.updateByPrimaryKeySelective(tempSecurities);
    }

    @Override
    public void updateByIdInBatch(List<TempSecurities> tempSecuritiess) {
        if (CollectionUtils.isEmpty(tempSecuritiess))
            return;
        for (TempSecurities tempSecurities : tempSecuritiess) {
            this.updateById(tempSecurities);
        }
    }

    @Override
    public TempSecurities findById(Integer id) {
        return tempSecuritiesMapper.selectByPrimaryKey(id);
    }

    @Override
    public TempSecurities findOne(TempSecurities tempSecurities) {
        ExampleBuilder<TempSecuritiesExample, TempSecuritiesExample.Criteria> builder =
            ExampleBuilder.create(TempSecuritiesExample.class, TempSecuritiesExample.Criteria.class);
        List<TempSecurities> tempSecuritiess =
            tempSecuritiesMapper.selectByExample(builder.buildExamplePack(tempSecurities).getExample());
        if (tempSecuritiess.size() > 0) {
            return tempSecuritiess.get(0);
        }
        return null;
    }

    @Override
    public List<TempSecurities> findList(TempSecurities tempSecurities) {
        ExampleBuilder<TempSecuritiesExample, TempSecuritiesExample.Criteria> builder =
            ExampleBuilder.create(TempSecuritiesExample.class, TempSecuritiesExample.Criteria.class);
        return tempSecuritiesMapper.selectByExample(builder.buildExamplePack(tempSecurities).getExample());
    }

    @Override
    public PageData<TempSecurities> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<TempSecuritiesExample, TempSecuritiesExample.Criteria> builder =
            ExampleBuilder.create(TempSecuritiesExample.class, TempSecuritiesExample.Criteria.class);
        ExampleBuilder.ExamplePack<TempSecuritiesExample, TempSecuritiesExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(tempSecuritiesMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(TempSecurities tempSecurities) {
        ExampleBuilder<TempSecuritiesExample, TempSecuritiesExample.Criteria> builder =
            ExampleBuilder.create(TempSecuritiesExample.class, TempSecuritiesExample.Criteria.class);
        return tempSecuritiesMapper.countByExample(builder.buildExamplePack(tempSecurities).getExample());
    }
}
