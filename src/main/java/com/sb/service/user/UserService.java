package com.sb.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sb.core.model.PageData;
import com.sb.core.model.PageWrap;
import com.sb.core.utils.ExampleBuilder;
import com.sb.dao.user.UserMapper;
import com.sb.dao.user.model.User;
import com.sb.dao.user.model.UserExample;
import com.sb.dao.user.model.UserExample.Criteria;

/**
 * 示例Service定义
 * 
 * @author 蛋挞的胖可乐
 * @date 2021/09/10 11:23
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Integer create(User user) {
        userMapper.insertSelective(user);
        return user.getId();
    }

    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids))
            return;
        for (Integer id : ids) {
            this.deleteById(id);
        }
    }

    public void updateById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void updateByIdInBatch(List<User> users) {
        if (CollectionUtils.isEmpty(users))
            return;
        for (User user : users) {
            this.updateById(user);
        }
    }

    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User findOne(User user) {
        ExampleBuilder<UserExample, Criteria> builder =
            ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        List<User> users = userMapper.selectByExample(builder.buildExamplePack(user).getExample());
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    public List<User> findList(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder =
            ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        return userMapper.selectByExample(builder.buildExamplePack(user).getExample());
    }

    public PageData<User> findPage(PageWrap<User> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        ExampleBuilder<UserExample, UserExample.Criteria> builder =
            ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        ExampleBuilder.ExamplePack<UserExample, UserExample.Criteria> pack =
            builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(userMapper.selectByExample(pack.getExample())));
    }

    public long count(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder =
            ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        return userMapper.countByExample(builder.buildExamplePack(user).getExample());
    }

}
