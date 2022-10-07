## GitLab API Read Me

API의 경우 주소외에 인증정보를 추가해야 하는데 GitLab API의 경우 다음과 같은 방식을 기본 제공한다.

OAUTH2
Personal Access Token
Session Cookie
GitLab CI Job token
https://docs.gitlab.com/ee/api/#authentication



## 프로젝트 이름으로 검색
## /search?scope=projects&search=[subject_name]
curl --request GET --header "PRIVATE-TOKEN: [access_token]" 'https://[git-url]/api/v4/search?scope=projects&search=[subject_name]' | jq
curl --request GET --header "PRIVATE-TOKEN: glpat-1yTxdMDavb-M7xLtEowJ" 'https://gitlab.com/api/v4/search?scope=projects&search=axon' | jq


## 특정 User 로 Gitlab 프로젝트 리스트 나열
## /users/:user_id/projects
curl --request GET --header "PRIVATE-TOKEN: [access_token]" 'https://[git-url]/api/v4/users/[user-name]/projects' | jq
curl --request GET --header "PRIVATE-TOKEN: glpat-1yTxdMDavb-M7xLtEowJ" 'https://gitlab.com/api/v4/users/evelyn.park/projects' | jq

