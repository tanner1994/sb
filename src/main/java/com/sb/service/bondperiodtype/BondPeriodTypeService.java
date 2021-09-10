package com.sb.service.bondperiodtype;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.bondperiodtype.model.BondPeriodType;

/**
 * 债券付息周期Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
public interface BondPeriodTypeService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Integer create(BondPeriodType bondPeriodType);

    /**
     * 主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateById(BondPeriodType bondPeriodType);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateByIdInBatch(List<BondPeriodType> bondPeriodTypes);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    BondPeriodType findById(Integer id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    BondPeriodType findOne(BondPeriodType bondPeriodType);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    List<BondPeriodType> findList(BondPeriodType bondPeriodType);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PageData<BondPeriodType> findPage(PageWrap<BondPeriodType> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    long count(BondPeriodType bondPeriodType);
}
