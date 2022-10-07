package com.cicd.git.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@RequiredArgsConstructor
@RequestMapping("/gitlab")
@RestController
public class GitLabController {

    final GitLabService gitLabervice;

    @GetMapping(value = "/v1/projectName")
    private List<Project> gitLabProjectforProjectName(@RequestParam String projectName){
        return gitLabervice.getGitLabProjectForProjectName(projectName);
    }

    @GetMapping(value = "/v1/userName")
    private List<Project> getGitLabProjectForUserName(@RequestParam String userName){
        return gitLabervice.getGitLabProjectForUserName(userName);
    }

}
