# restful-web-service-securityservice
판다 (PANDA APP SERVICE)
=====================
평생 잊혀지지 않을 선물, 셀럽들의 영상 메세지 제작 플랫폼 PANDA

![image](https://user-images.githubusercontent.com/71881747/123388751-2118f980-d5d4-11eb-9cbd-68de0e44a691.png)

![image](https://user-images.githubusercontent.com/71881747/123388694-0a72a280-d5d4-11eb-8087-7ce2703fd7e2.png)

프로젝트를 계획한 이유

유명한 연예인으로부터 영상메세지를 받는 것은 오래 추억으로 남을 일이지만 이러한 요청을 보내는 것은 매우 어려운 일입니다. 
누구나 쉽게 유명한 연예인으로부터 영상메세지를 부탁할 수 있는 플랫폼이 없을까 하는 생각으로 프로젝트를 시작하게 되었습니다.

---------------
- 팀 구성: 백엔드 2명, 프론트엔드 2명 총 4명
- 저는 이 프로젝트에서 백엔드파트를 맡아 RESTful API 구축을 수행하였습니다.
- 개발기간: 21.03 ~ 21.06.03(목)
------------------

사용한 기술
- 백엔드: Spring framework(Java), Restful API, JPA, JWT
- 프톤르엔드: React Native(하이브리드앱)
- 데이터베이스: MySQL
- 배포: AWS ec2

-------------------
구현된 기능
- 로그인 
- 신청가능한 연예인 리스트 조회
- 동영상 신청서 작성 기능
- 연예인들이 신청받은 동영상 요청 사항 리스트 조회
- 연예인이 업로드한 동영상이 AWS S3(파일 서버)에 올라가게 구현
- 유저가 선물받은 동영상을 앱 내에서 파일 서버로부터 불러와 볼 수 있게 구현 
------

![image](https://user-images.githubusercontent.com/71881747/123389734-2591e200-d5d5-11eb-9bcd-65d07b472c6b.png)




