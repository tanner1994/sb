package com.sb.service.property.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.property.PropertyMapper;
import com.sb.dao.property.model.Property;
import com.sb.dao.property.model.PropertyExample;
import com.sb.service.property.PropertyService;

/**
 * 证券属性Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public String create(Property property) {
        propertyMapper.insertSelective(property);
        return property.getId();
    }

    @Override
    public void deleteById(String id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids))
            return;
        for (String id : ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Property property) {
        propertyMapper.updateByPrimaryKeySelective(property);
    }

    @Override
    public void updateByIdInBatch(List<Property> propertys) {
        if (CollectionUtils.isEmpty(propertys))
            return;
        for (Property property : propertys) {
            this.updateById(property);
        }
    }

    @Override
    public Property findById(String id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Property findOne(Property property) {
        ExampleBuilder<PropertyExample, PropertyExample.Criteria> builder =
            ExampleBuilder.create(PropertyExample.class, PropertyExample.Criteria.class);
        List<Property> propertys = propertyMapper.selectByExample(builder.buildExamplePack(property).getExample());
        if (propertys.size() > 0) {
            return propertys.get(0);
        }
        return null;
    }

    @Override
    public List<Property> findList(Property property) {
        ExampleBuilder<PropertyExample, PropertyExample.Criteria> builder =
            ExampleBuilder.create(PropertyExample.class, PropertyExample.Criteria.class);
        return propertyMapper.selectByExample(builder.buildExamplePack(property).getExample());
    }

    @Override
    public PageData<Property> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<PropertyExample, PropertyExample.Criteria> builder =
            ExampleBuilder.create(PropertyExample.class, PropertyExample.Criteria.class);
        ExampleBuilder.ExamplePack<PropertyExample, PropertyExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(propertyMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Property property) {
        ExampleBuilder<PropertyExample, PropertyExample.Criteria> builder =
            ExampleBuilder.create(PropertyExample.class, PropertyExample.Criteria.class);
        return propertyMapper.countByExample(builder.buildExamplePack(property).getExample());
    }
}
