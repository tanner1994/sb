package com.sb.service.org;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.org.model.Org;

/**
 * 组织Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
public interface OrgService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Integer create(Org org);

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
    void updateById(Org org);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateByIdInBatch(List<Org> orgs);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Org findById(Integer id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Org findOne(Org org);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    List<Org> findList(Org org);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PageData<Org> findPage(PageWrap<Org> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    long count(Org org);
}
