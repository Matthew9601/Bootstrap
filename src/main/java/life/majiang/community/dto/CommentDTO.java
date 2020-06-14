package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commenter;
    private Long gmtCreate;
    private Long gmtModify;
    private Long likeCounter;
    private String content;
    private User user;
}
