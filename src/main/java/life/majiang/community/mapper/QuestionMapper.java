package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modify, creator, tag) values (#{title}, #{description}, #{gmt_create}, #{gmt_modify}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();
}