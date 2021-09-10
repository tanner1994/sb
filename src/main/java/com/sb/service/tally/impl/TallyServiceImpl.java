package com.sb.service.tally.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.tally.TallyMapper;
import com.sb.dao.tally.model.Tally;
import com.sb.dao.tally.model.TallyExample;
import com.sb.service.tally.TallyService;

/**
 * 记账Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class TallyServiceImpl implements TallyService {

    @Autowired
    private TallyMapper tallyMapper;

    @Override
    public Integer create(Tally tally) {
        tallyMapper.insertSelective(tally);
        return tally.getId();
    }

    @Override
    public void deleteById(Integer id) {
        tallyMapper.deleteByPrimaryKey(id);
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
    public void updateById(Tally tally) {
        tallyMapper.updateByPrimaryKeySelective(tally);
    }

    @Override
    public void updateByIdInBatch(List<Tally> tallys) {
        if (CollectionUtils.isEmpty(tallys))
            return;
        for (Tally tally : tallys) {
            this.updateById(tally);
        }
    }

    @Override
    public Tally findById(Integer id) {
        return tallyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Tally findOne(Tally tally) {
        ExampleBuilder<TallyExample, TallyExample.Criteria> builder =
            ExampleBuilder.create(TallyExample.class, TallyExample.Criteria.class);
        List<Tally> tallys = tallyMapper.selectByExample(builder.buildExamplePack(tally).getExample());
        if (tallys.size() > 0) {
            return tallys.get(0);
        }
        return null;
    }

    @Override
    public List<Tally> findList(Tally tally) {
        ExampleBuilder<TallyExample, TallyExample.Criteria> builder =
            ExampleBuilder.create(TallyExample.class, TallyExample.Criteria.class);
        return tallyMapper.selectByExample(builder.buildExamplePack(tally).getExample());
    }

    @Override
    public PageData<Tally> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<TallyExample, TallyExample.Criteria> builder =
            ExampleBuilder.create(TallyExample.class, TallyExample.Criteria.class);
        ExampleBuilder.ExamplePack<TallyExample, TallyExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(tallyMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Tally tally) {
        ExampleBuilder<TallyExample, TallyExample.Criteria> builder =
            ExampleBuilder.create(TallyExample.class, TallyExample.Criteria.class);
        return tallyMapper.countByExample(builder.buildExamplePack(tally).getExample());
    }
}
