package com.sb.service.user;

import java.util.List;

import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.dao.user.model.User;

/**
 * 示例Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
public interface UserService {

    /**
     * 创建
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    Integer create(User user);

    /**
     * 主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    void updateById(User user);

    /**
     * 批量主键更新
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    void updateByIdInBatch(List<User> users);

    /**
     * 主键查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    User findById(Integer id);

    /**
     * 条件查询单条记录
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    User findOne(User user);

    /**
     * 条件查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    List<User> findList(User user);

    /**
     * 分页查询
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    PageData<User> findPage(PageWrap<User> pageWrap);

    /**
     * 条件统计
     * 
     * @author 蛋挞的胖可乐
     * @date 2021/09/10 11:23
     */
    long count(User user);
}
