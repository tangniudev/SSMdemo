package com.xiao.Service.Impl;
import com.xiao.Mapper.UserMapper;
import com.xiao.Pojo.User;
import com.xiao.Service.UserService;
import com.xiao.Mapper.UserMapper;
import com.xiao.Pojo.User;
import com.xiao.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() throws Exception {
        List<User> list = userMapper.getAll();
        return list;
    }
}
