package com.sb.service.stocksort.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.stocksort.StockSortMapper;
import com.sb.dao.stocksort.model.StockSort;
import com.sb.dao.stocksort.model.StockSortExample;
import com.sb.service.stocksort.StockSortService;

/**
 * 库存组织Service实现
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
@Service
public class StockSortServiceImpl implements StockSortService {

    @Autowired
    private StockSortMapper stockSortMapper;

    @Override
    public Integer create(StockSort stockSort) {
        stockSortMapper.insertSelective(stockSort);
        return stockSort.getId();
    }

    @Override
    public void deleteById(Integer id) {
        stockSortMapper.deleteByPrimaryKey(id);
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
    public void updateById(StockSort stockSort) {
        stockSortMapper.updateByPrimaryKeySelective(stockSort);
    }

    @Override
    public void updateByIdInBatch(List<StockSort> stockSorts) {
        if (CollectionUtils.isEmpty(stockSorts))
            return;
        for (StockSort stockSort : stockSorts) {
            this.updateById(stockSort);
        }
    }

    @Override
    public StockSort findById(Integer id) {
        return stockSortMapper.selectByPrimaryKey(id);
    }

    @Override
    public StockSort findOne(StockSort stockSort) {
        ExampleBuilder<StockSortExample, StockSortExample.Criteria> builder =
            ExampleBuilder.create(StockSortExample.class, StockSortExample.Criteria.class);
        List<StockSort> stockSorts = stockSortMapper.selectByExample(builder.buildExamplePack(stockSort).getExample());
        if (stockSorts.size() > 0) {
            return stockSorts.get(0);
        }
        return null;
    }

    @Override
    public List<StockSort> findList(StockSort stockSort) {
        ExampleBuilder<StockSortExample, StockSortExample.Criteria> builder =
            ExampleBuilder.create(StockSortExample.class, StockSortExample.Criteria.class);
        return stockSortMapper.selectByExample(builder.buildExamplePack(stockSort).getExample());
    }

    @Override
    public PageData<StockSort> findPage(PageWrap pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<StockSortExample, StockSortExample.Criteria> builder =
            ExampleBuilder.create(StockSortExample.class, StockSortExample.Criteria.class);
        ExampleBuilder.ExamplePack<StockSortExample, StockSortExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(stockSortMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(StockSort stockSort) {
        ExampleBuilder<StockSortExample, StockSortExample.Criteria> builder =
            ExampleBuilder.create(StockSortExample.class, StockSortExample.Criteria.class);
        return stockSortMapper.countByExample(builder.buildExamplePack(stockSort).getExample());
    }
}
