package life.majiang.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmt_create;
    private Long gmt_modify;
    private Integer creator;
    private Integer view_counter;
    private Integer comment_counter;
    private Integer like_counter;
}