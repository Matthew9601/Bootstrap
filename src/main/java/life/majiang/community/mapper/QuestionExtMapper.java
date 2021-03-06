package life.majiang.community.mapper;

import life.majiang.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCounter(Question record);
    List<Question> selectRelated(Question question);
}