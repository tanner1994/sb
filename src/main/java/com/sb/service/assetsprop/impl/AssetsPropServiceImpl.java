package com.sb.service.assetsprop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.assetsprop.AssetsPropMapper;
import com.sb.dao.assetsprop.model.AssetsProp;
import com.sb.dao.assetsprop.model.AssetsPropExample;
import com.sb.service.assetsprop.AssetsPropService;

/**
 * 资产属性Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class AssetsPropServiceImpl implements AssetsPropService {

    @Autowired
    private AssetsPropMapper assetsPropMapper;

    @Override
    public Integer create(AssetsProp assetsProp) {
        assetsPropMapper.insertSelective(assetsProp);
        return assetsProp.getId();
    }

    @Override
    public void deleteById(Integer id) {
        assetsPropMapper.deleteByPrimaryKey(id);
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
    public void updateById(AssetsProp assetsProp) {
        assetsPropMapper.updateByPrimaryKeySelective(assetsProp);
    }

    @Override
    public void updateByIdInBatch(List<AssetsProp> assetsProps) {
        if (CollectionUtils.isEmpty(assetsProps))
            return;
        for (AssetsProp assetsProp : assetsProps) {
            this.updateById(assetsProp);
        }
    }

    @Override
    public AssetsProp findById(Integer id) {
        return assetsPropMapper.selectByPrimaryKey(id);
    }

    @Override
    public AssetsProp findOne(AssetsProp assetsProp) {
        ExampleBuilder<AssetsPropExample, AssetsPropExample.Criteria> builder =
            ExampleBuilder.create(AssetsPropExample.class, AssetsPropExample.Criteria.class);
        List<AssetsProp> assetsProps =
            assetsPropMapper.selectByExample(builder.buildExamplePack(assetsProp).getExample());
        if (assetsProps.size() > 0) {
            return assetsProps.get(0);
        }
        return null;
    }

    @Override
    public List<AssetsProp> findList(AssetsProp assetsProp) {
        ExampleBuilder<AssetsPropExample, AssetsPropExample.Criteria> builder =
            ExampleBuilder.create(AssetsPropExample.class, AssetsPropExample.Criteria.class);
        return assetsPropMapper.selectByExample(builder.buildExamplePack(assetsProp).getExample());
    }

    @Override
    public PageData<AssetsProp> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<AssetsPropExample, AssetsPropExample.Criteria> builder =
            ExampleBuilder.create(AssetsPropExample.class, AssetsPropExample.Criteria.class);
        ExampleBuilder.ExamplePack<AssetsPropExample, AssetsPropExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(assetsPropMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(AssetsProp assetsProp) {
        ExampleBuilder<AssetsPropExample, AssetsPropExample.Criteria> builder =
            ExampleBuilder.create(AssetsPropExample.class, AssetsPropExample.Criteria.class);
        return assetsPropMapper.countByExample(builder.buildExamplePack(assetsProp).getExample());
    }
}
