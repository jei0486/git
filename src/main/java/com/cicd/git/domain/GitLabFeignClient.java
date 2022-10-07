package com.cicd.git.domain;

import com.cicd.git.config.FeignConfig;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

//@Headers("PRIVATE-TOKEN: {token}")

@FeignClient(name="feign" , url ="https://dev-gitlab.jellyseul.com:2443/api/v4" , configuration = FeignConfig.class)
public interface GitLabFeignClient {

    /*
    * TODO
    *
    * gitlab access token 가져오는 api
    *
    * local gitlab 의 access token : JnaLxyMLoXe19Lzvoxdx
    * dev-gitlab.jellyseul.com "PRIVATE-TOKEN: JnaLxyMLoXe19Lzvoxdx"
    *
    *
    * */


    @GetMapping("/search")
    public List<Project> searchProjectsForProjectName(@RequestParam ("scope") String scope,@RequestParam("search") String search);


    @GetMapping("/users/{user_name}/projects")
    public List<Project> searchProjectsForUserName(@RequestParam String user_name);
}
