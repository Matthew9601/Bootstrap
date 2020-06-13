package life.majiang.community.model;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.TYPE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.COMMENTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long commenter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.GMT_MODIFY
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long gmtModify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.LIKE_COUNTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private Long likeCounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMMENT.CONTENT
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.ID
     *
     * @return the value of COMMENT.ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.ID
     *
     * @param id the value for COMMENT.ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.PARENT_ID
     *
     * @return the value of COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.PARENT_ID
     *
     * @param parentId the value for COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.TYPE
     *
     * @return the value of COMMENT.TYPE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.TYPE
     *
     * @param type the value for COMMENT.TYPE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.COMMENTER
     *
     * @return the value of COMMENT.COMMENTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getCommenter() {
        return commenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.COMMENTER
     *
     * @param commenter the value for COMMENT.COMMENTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setCommenter(Long commenter) {
        this.commenter = commenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.GMT_CREATE
     *
     * @return the value of COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.GMT_CREATE
     *
     * @param gmtCreate the value for COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.GMT_MODIFY
     *
     * @return the value of COMMENT.GMT_MODIFY
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.GMT_MODIFY
     *
     * @param gmtModify the value for COMMENT.GMT_MODIFY
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.LIKE_COUNTER
     *
     * @return the value of COMMENT.LIKE_COUNTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public Long getLikeCounter() {
        return likeCounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.LIKE_COUNTER
     *
     * @param likeCounter the value for COMMENT.LIKE_COUNTER
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setLikeCounter(Long likeCounter) {
        this.likeCounter = likeCounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMMENT.CONTENT
     *
     * @return the value of COMMENT.CONTENT
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMMENT.CONTENT
     *
     * @param content the value for COMMENT.CONTENT
     *
     * @mbg.generated Fri Jun 12 19:17:00 PDT 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}