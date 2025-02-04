# 사이드 프로젝트: 게시판 만들기
## 1. 프로젝트 구성

### 1.1 환경설정
* JDK Ver.: Java 17
* 빌드 툴: gradle
* 세부정보 (build.gradle)
  ```text
  plugins {
    id 'java'
    id 'org.springframework.boot' version '3.4.2'
    id 'io.spring.dependency-management' version '1.1.7'
  }
  
  ...
  
  dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    runtimeOnly 'com.h2database:h2'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
  }
  ```
  
### 1.2 웹 페이지
  * 홈 (home)
  * 로그인 (login)
  * 회원가입 (signup)
  * 게시판 (list)
  * 게시글 작성 (writePostForm)

## 2. 프로젝트 변경 이력
* 2025.02.04: 최초 작성
  * 페이지 템플릿 추가
  * HomeController, BoardController 생성