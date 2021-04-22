package example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import example.model.User;

@Mapper
public interface SampleMybatis {
    List<User> selectAll();
}
