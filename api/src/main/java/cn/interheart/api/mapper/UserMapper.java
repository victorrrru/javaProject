package cn.interheart.api.mapper;

import cn.interheart.api.entity.User;
import cn.interheart.api.entity.UserExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectUserByLogin(User user);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}