## 프로젝트 개요
이 프로젝트는 **Spring Framework (Spring MVC)** 기반의 전통적인 웹 애플리케이션입니다.  
사용자 로그인 및 인증 기능을 중심으로 구성되어 있으며, XML 기반의 설정 파일(servlet-context.xml, root-context.xml, web.xml)을 통해 구성되었습니다.  
JSP를 이용한 뷰(View) 레이어와 Log4j를 활용한 로깅 기능을 포함하고 있습니다.

## 주요 기능
- **사용자 인증 및 로그인**
  - 사용자 로그인 폼 제공 (login.jsp)
  - POST 방식의 로그인 요청을 처리하여, 인증 성공 시 홈 페이지로 리다이렉트
  - UserService와 UserDAO를 통해 DB에 저장된 사용자 정보를 검증
- **JSP 기반 뷰 제공**
  - 로그인 성공 후 홈 페이지 (home.jsp) 제공
- **전통적인 Spring MVC 설정**
  - XML 기반의 Spring 설정 파일(servlet-context.xml, root-context.xml, web.xml)을 이용하여 애플리케이션 구성
- **로깅**
  - Log4j를 활용하여 애플리케이션 로그 관리

## 기술 스택
- **언어**: Java
- **프레임워크**: Spring Framework (Spring MVC)
- **데이터 액세스**: Spring JdbcTemplate
- **뷰 기술**: JSP
- **로깅**: Log4j
- **빌드 도구**: Maven

---

## 🧑‍💻 개발자 정보  
- **개발자**: 오승안 / OH SEUNG ANH 
- **이메일**: dhtmddks98@naver.com, ahn980321@gmail.com
- **GitHub**: https://github.com/OurOh
- **개인블로그**: https://ouroh.tistory.com/

## 폴더 구조 설명
```plaintext
.settings
src/main/
├── java/com/mycompany/
│   ├── controller/
│   │   └── LoginController.java
│   ├── dao/
│   │   └── UserDAO.java
│   ├── model/
│   │   └── User.java
│   └── service/
│       └── UserService.java
├── resources/
│   └── log4j.xml
└── webapp/WEB-INF/
    ├── spring/
    │   ├── appServlet/
    │   │   └── servlet-context.xml
    │   └── root-context.xml
    ├── views/
    │   ├── home.jsp
    │   └── login.jsp
    └── web.xml
test/
└── resources/
    └── log4j.xml
target/
├── classes/
│   └── com/mycompany/...
├── m2e-wtp/web-resources/META-INF
└── maven/com.mycompany/myapp/
    ├── pom.properties
    ├── pom.xml
    └── MANIFEST.MF
.loginSQL.sql
.classpath
.project
.springBeans
pom.xml
