package com.cicd.git.domain.model;

import com.cicd.git.util.JacksonJson;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class ProjectSharedGroup {

    private Long groupId;
    private String groupName;
    private String groupFullPath;
    private AccessLevel groupAccessLevel;

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AccessLevel getGroupAccessLevel() {
        return (groupAccessLevel);
    }

    public void setGroupAccessLevel(AccessLevel accessLevel) {
        this.groupAccessLevel = accessLevel;
    }

    public String getGroupFullPath() {
        return groupFullPath;
    }

    public void setGroupFullPath(String groupFullPath) {
        this.groupFullPath = groupFullPath;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}

