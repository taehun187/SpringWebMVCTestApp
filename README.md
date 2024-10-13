# SpringWebMVC_Practice

폴더 및 파일 설명

1. src/main/java/com/taehun/controller
ContactController.java
이 컨트롤러는 사용자의 연락처 정보를 처리합니다. /contact로 시작하는 요청을 처리하며, 사용자가 입력한 정보를 받아 데이터베이스에 저장하거나, 사용자에게 보여줄 정보를 모델에 담아 JSP로 전달하는 역할을 합니다.

FileController.java
이 컨트롤러는 파일 업로드와 다운로드 기능을 담당합니다. 사용자가 업로드한 파일을 서버에 저장하고, 필요한 경우 해당 파일을 다운로드할 수 있도록 처리합니다.

2. src/main/java/com/taehun/service
ContactService.java
비즈니스 로직을 처리하는 서비스 계층입니다. 데이터베이스와 직접 연결된 DAO 계층과 상호작용하며, 연락처 정보를 추가, 수정, 삭제하는 로직을 포함하고 있습니다.

FileService.java
파일과 관련된 로직을 처리합니다. 업로드된 파일을 저장하거나, 저장된 파일을 불러오는 기능이 포함되어 있습니다.

3. src/main/java/com/taehun/dao
ContactDao.java
연락처 정보와 관련된 데이터베이스 작업을 처리하는 DAO(Data Access Object)입니다. Hibernate를 이용하여 CRUD 작업을 수행합니다.

FileDao.java
파일 정보를 데이터베이스에 저장하고, 불러오는 작업을 처리하는 DAO입니다. 파일의 메타데이터를 관리합니다.

4. src/main/webapp/WEB-INF/views
contact.jsp
사용자의 연락처 정보를 입력받는 폼과 이를 표시하는 JSP 파일입니다. Spring MVC에서 모델로 전달받은 데이터를 바탕으로 동적으로 HTML 페이지를 생성합니다.

fileUpload.jsp
파일 업로드 기능을 제공하는 JSP 파일입니다. 사용자가 파일을 업로드할 수 있는 인터페이스를 제공하고, 업로드된 파일의 상태를 표시합니다.

5. src/main/resources
application.properties
프로젝트의 설정 파일입니다. 데이터베이스 연결 정보(Hibernate 설정), 파일 저장 경로 등을 설정할 수 있습니다.
