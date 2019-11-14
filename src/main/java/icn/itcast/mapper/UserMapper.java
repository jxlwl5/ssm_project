package icn.itcast.mapper;

import icn.itcast.domain.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户信息
    List<User> findAll();
}
