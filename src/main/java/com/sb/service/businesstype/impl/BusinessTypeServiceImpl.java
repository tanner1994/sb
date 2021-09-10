package com.sb.service.businesstype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.businesstype.BusinessTypeMapper;
import com.sb.dao.businesstype.model.BusinessType;
import com.sb.dao.businesstype.model.BusinessTypeExample;
import com.sb.service.businesstype.BusinessTypeService;

/**
 * 业务类别Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class BusinessTypeServiceImpl implements BusinessTypeService {

    @Autowired
    private BusinessTypeMapper businessTypeMapper;

    @Override
    public Integer create(BusinessType businessType) {
        businessTypeMapper.insertSelective(businessType);
        return businessType.getId();
    }

    @Override
    public void deleteById(Integer id) {
        businessTypeMapper.deleteByPrimaryKey(id);
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
    public void updateById(BusinessType businessType) {
        businessTypeMapper.updateByPrimaryKeySelective(businessType);
    }

    @Override
    public void updateByIdInBatch(List<BusinessType> businessTypes) {
        if (CollectionUtils.isEmpty(businessTypes))
            return;
        for (BusinessType businessType : businessTypes) {
            this.updateById(businessType);
        }
    }

    @Override
    public BusinessType findById(Integer id) {
        return businessTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public BusinessType findOne(BusinessType businessType) {
        ExampleBuilder<BusinessTypeExample, BusinessTypeExample.Criteria> builder =
            ExampleBuilder.create(BusinessTypeExample.class, BusinessTypeExample.Criteria.class);
        List<BusinessType> businessTypes =
            businessTypeMapper.selectByExample(builder.buildExamplePack(businessType).getExample());
        if (businessTypes.size() > 0) {
            return businessTypes.get(0);
        }
        return null;
    }

    @Override
    public List<BusinessType> findList(BusinessType businessType) {
        ExampleBuilder<BusinessTypeExample, BusinessTypeExample.Criteria> builder =
            ExampleBuilder.create(BusinessTypeExample.class, BusinessTypeExample.Criteria.class);
        return businessTypeMapper.selectByExample(builder.buildExamplePack(businessType).getExample());
    }

    @Override
    public PageData<BusinessType> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<BusinessTypeExample, BusinessTypeExample.Criteria> builder =
            ExampleBuilder.create(BusinessTypeExample.class, BusinessTypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<BusinessTypeExample, BusinessTypeExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(businessTypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(BusinessType businessType) {
        ExampleBuilder<BusinessTypeExample, BusinessTypeExample.Criteria> builder =
            ExampleBuilder.create(BusinessTypeExample.class, BusinessTypeExample.Criteria.class);
        return businessTypeMapper.countByExample(builder.buildExamplePack(businessType).getExample());
    }
}
