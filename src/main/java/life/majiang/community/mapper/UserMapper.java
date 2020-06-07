package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modify) values (#{name}, #{account_id}, #{token}, #{gmt_create}, #{gmt_modify})")
    void insert(User user);

}
