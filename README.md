# Prototype
This is prototype what i want do on springboot   
As well as a reminder, I aim for a gradual expansion into this project.

### Objective
0. 이번 프로젝트는 reactive 를 사용하지 않고 범용성을 위한 RDB(postgres) 사용
   1. 추후 1차 목표 달성 후 Reactive 로 전환
1. Dummy Domain 을 사용하기 위한 Controller, Service, Repository prototype 생성
2. Domain 간 Extension 을 사용
3. Kotest 기반 테스트 코드 작성
4. SpringSecurity & jwt 를 통한 인증
5. Data, Application load 를 줄익 위한 Redis 적용
6. Github Action 을 이용한 CI/CD 구축 및 배포

### TODO
0. RDB 연결 및 CRUD 생성
1. 스키마 작성
2. test 코드 작성
3. 인증 구현
4. 부하테스트
5. Redis 적용 및 부하테스트 비교
6. CI/CD 적용 및 AWS 배포
7. toy project 생성 후 project 간 message 처리
   1. toy project 는 python 기반이며 오픈소스를 사용한 주제로 선정 (미정)
8. Vue.js 를 사용하여 간단하게 뿌려보기