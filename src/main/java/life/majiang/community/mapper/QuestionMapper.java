package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modify, creator, tag) values (#{title}, #{description}, #{gmt_create}, #{gmt_modify}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from question limit #{offset}, #{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question where creator = #{user_id} limit #{offset}, #{size}")
    List<Question> listByUserId(@Param("user_id") Integer user_id, @Param(value = "offset") Integer offset, @Param(value = "size") Integer size);

    @Select("select count(1) from question where creator = #{user_id}")
    Integer countByUserId(@Param("user_id") Integer user_id);

    @Select("select * from question where id = #{id}")
    Question getById(@Param("id") Integer id);
}
