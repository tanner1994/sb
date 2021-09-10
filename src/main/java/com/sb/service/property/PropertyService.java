package com.sb.service.property;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.property.model.Property;

/**
 * 证券属性Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
public interface PropertyService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    String create(Property property);

    /**
     * 主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteById(String id);

    /**
     * 批量主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteByIdInBatch(List<String> ids);

    /**
     * 主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateById(Property property);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateByIdInBatch(List<Property> propertys);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Property findById(String id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Property findOne(Property property);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    List<Property> findList(Property property);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PageData<Property> findPage(PageWrap<Property> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    long count(Property property);
}
