package cn.interheart.api.service;

import cn.interheart.api.entity.User;
import cn.interheart.api.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by think on 2017/4/7.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public void insert(User user){
        userMapper.insert(user);
    }

    public void login(User user){
        userMapper.selectUserByLogin(user);
    }

}
