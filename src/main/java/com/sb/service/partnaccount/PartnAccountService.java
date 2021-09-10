package com.sb.service.partnaccount;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.partnaccount.model.PartnAccount;

/**
 * 股东账号Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 15:40
 */
public interface PartnAccountService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    Integer create(PartnAccount partnAccount);

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
    void updateById(PartnAccount partnAccount);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    void updateByIdInBatch(List<PartnAccount> partnAccounts);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PartnAccount findById(Integer id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PartnAccount findOne(PartnAccount partnAccount);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    List<PartnAccount> findList(PartnAccount partnAccount);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    PageData<PartnAccount> findPage(PageWrap<PartnAccount> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 15:40
     */
    long count(PartnAccount partnAccount);
}
