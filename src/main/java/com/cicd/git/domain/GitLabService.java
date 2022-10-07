package com.cicd.git.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Slf4j
@RequiredArgsConstructor
@Service
public class GitLabService {

    final GitLabFeignClient gitLabFeignClient;

    public List<Project> getGitLabProjectForProjectName(String project){

        return gitLabFeignClient.searchProjectsForProjectName("projects",project);
    }

    public List<Project> getGitLabProjectForUserName(String userName){

        return gitLabFeignClient.searchProjectsForUserName(userName);
    }
}
