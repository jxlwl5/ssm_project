package icn.itcast.service.impl;

import icn.itcast.domain.User;
import icn.itcast.mapper.UserMapper;
import icn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
