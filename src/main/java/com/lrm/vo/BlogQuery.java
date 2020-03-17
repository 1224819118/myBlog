package com.lrm.vo;

public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recomend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecomend() {
        return recomend;
    }

    public void setRecomend(boolean recomend) {
        this.recomend = recomend;
    }
}
