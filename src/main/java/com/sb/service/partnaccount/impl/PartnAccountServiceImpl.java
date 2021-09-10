package com.sb.service.partnaccount.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.partnaccount.PartnAccountMapper;
import com.sb.dao.partnaccount.model.PartnAccount;
import com.sb.dao.partnaccount.model.PartnAccountExample;
import com.sb.service.partnaccount.PartnAccountService;

/**
 * 股东账号Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class PartnAccountServiceImpl implements PartnAccountService {

    @Autowired
    private PartnAccountMapper partnAccountMapper;

    @Override
    public Integer create(PartnAccount partnAccount) {
        partnAccountMapper.insertSelective(partnAccount);
        return partnAccount.getId();
    }

    @Override
    public void deleteById(Integer id) {
        partnAccountMapper.deleteByPrimaryKey(id);
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
    public void updateById(PartnAccount partnAccount) {
        partnAccountMapper.updateByPrimaryKeySelective(partnAccount);
    }

    @Override
    public void updateByIdInBatch(List<PartnAccount> partnAccounts) {
        if (CollectionUtils.isEmpty(partnAccounts))
            return;
        for (PartnAccount partnAccount : partnAccounts) {
            this.updateById(partnAccount);
        }
    }

    @Override
    public PartnAccount findById(Integer id) {
        return partnAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public PartnAccount findOne(PartnAccount partnAccount) {
        ExampleBuilder<PartnAccountExample, PartnAccountExample.Criteria> builder =
            ExampleBuilder.create(PartnAccountExample.class, PartnAccountExample.Criteria.class);
        List<PartnAccount> partnAccounts =
            partnAccountMapper.selectByExample(builder.buildExamplePack(partnAccount).getExample());
        if (partnAccounts.size() > 0) {
            return partnAccounts.get(0);
        }
        return null;
    }

    @Override
    public List<PartnAccount> findList(PartnAccount partnAccount) {
        ExampleBuilder<PartnAccountExample, PartnAccountExample.Criteria> builder =
            ExampleBuilder.create(PartnAccountExample.class, PartnAccountExample.Criteria.class);
        return partnAccountMapper.selectByExample(builder.buildExamplePack(partnAccount).getExample());
    }

    @Override
    public PageData<PartnAccount> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<PartnAccountExample, PartnAccountExample.Criteria> builder =
            ExampleBuilder.create(PartnAccountExample.class, PartnAccountExample.Criteria.class);
        ExampleBuilder.ExamplePack<PartnAccountExample, PartnAccountExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(partnAccountMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(PartnAccount partnAccount) {
        ExampleBuilder<PartnAccountExample, PartnAccountExample.Criteria> builder =
            ExampleBuilder.create(PartnAccountExample.class, PartnAccountExample.Criteria.class);
        return partnAccountMapper.countByExample(builder.buildExamplePack(partnAccount).getExample());
    }
}
