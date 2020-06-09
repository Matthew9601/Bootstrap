package life.majiang.community.model;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Long gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Long getGmt_modify() {
        return gmt_modify;
    }

    public void setGmt_modify(Long gmt_modify) {
        this.gmt_modify = gmt_modify;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getView_counter() {
        return view_counter;
    }

    public void setView_counter(Integer view_counter) {
        this.view_counter = view_counter;
    }

    public Integer getComment_counter() {
        return comment_counter;
    }

    public void setComment_counter(Integer comment_counter) {
        this.comment_counter = comment_counter;
    }

    public Integer getLike_counter() {
        return like_counter;
    }

    public void setLike_counter(Integer like_counter) {
        this.like_counter = like_counter;
    }
}
