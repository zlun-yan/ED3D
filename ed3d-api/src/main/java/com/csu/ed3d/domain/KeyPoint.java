package com.csu.ed3d.domain;

import java.util.Date;

public class KeyPoint {
    private Integer kpoint_id;
    private Integer course_id;
    private String name;
    private Integer parent_id;
    private Date add_time;
    private Integer sort;
    private Integer play_count;
    private Integer is_free;
    private String video_url;
    private String replayUrl;
    private Integer teacher_id;
    private String play_time;
    private Integer kpoint_type;
    private String video_type;
    private String file_type;
    private String content;
    private Integer page_count;
    private Date live_begin_time;
    private Date libe_end_time;
    private String intoLiveRoom;
    private String supplier;
    private String openType;
    private Integer autoReplay;
    private Integer maxUsers;

    public Integer getKpoint_id() {
        return kpoint_id;
    }

    public void setKpoint_id(Integer kpoint_id) {
        this.kpoint_id = kpoint_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getPlay_count() {
        return play_count;
    }

    public void setPlay_count(Integer play_count) {
        this.play_count = play_count;
    }

    public Integer getIs_free() {
        return is_free;
    }

    public void setIs_free(Integer is_free) {
        this.is_free = is_free;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getReplayUrl() {
        return replayUrl;
    }

    public void setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getPlay_time() {
        return play_time;
    }

    public void setPlay_time(String play_time) {
        this.play_time = play_time;
    }

    public Integer getKpoint_type() {
        return kpoint_type;
    }

    public void setKpoint_type(Integer kpoint_type) {
        this.kpoint_type = kpoint_type;
    }

    public String getVideo_type() {
        return video_type;
    }

    public void setVideo_type(String video_type) {
        this.video_type = video_type;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPage_count() {
        return page_count;
    }

    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }

    public Date getLive_begin_time() {
        return live_begin_time;
    }

    public void setLive_begin_time(Date live_begin_time) {
        this.live_begin_time = live_begin_time;
    }

    public Date getLibe_end_time() {
        return libe_end_time;
    }

    public void setLibe_end_time(Date libe_end_time) {
        this.libe_end_time = libe_end_time;
    }

    public String getIntoLiveRoom() {
        return intoLiveRoom;
    }

    public void setIntoLiveRoom(String intoLiveRoom) {
        this.intoLiveRoom = intoLiveRoom;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public Integer getAutoReplay() {
        return autoReplay;
    }

    public void setAutoReplay(Integer autoReplay) {
        this.autoReplay = autoReplay;
    }

    public Integer getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }
}
