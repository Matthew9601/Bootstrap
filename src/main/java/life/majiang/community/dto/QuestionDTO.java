package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModify;
    private Long creator;
    private Integer viewCounter;
    private Integer commentCounter;
    private Integer likeCounter;
    private User user;
}
