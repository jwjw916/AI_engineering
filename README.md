# 최종프로젝트 by 우리FIS 아카데미 1기 AI 엔지니어링
### 프로젝트 개요
- 주제: 투자자를 위한 인공지능 포트폴리오 전략 제안 서비스
- 기간: 2023.08.04 ~ 2023.09.19
- 팀원: 6명
### 주요 수행 내역
| 요구사항 번호         | 요구사항 명칭                                      | 요구사항 내용                                                        | 제약사항                                    | 중요도               | 해결방안                                    | 검수기준                          |
| --------------- | -------------------------------------------- | -------------------------------------------------------------- | --------------------------------------- | ----------------- | --------------------------------------- | ----------------------------- |
| 구현-1            | 회원가입/인증인가                                    | ID/PW 설정                                                       | ID : 영문 5자 이상<br>PW 대,소문자,기호 10자 이상     | 하                 | 제약사항을 바탕으로<br>로그인 기능 추가                 | 정규표현식과 분기문을 활용한<br>제약사항 준수 확인 |
| 구현-2            | 정보검색                                         | 일반 상품 검색                                                       | 공백 검색x<br>빈번한 오타에 대한 처리<br>페이지네이션 - 10개 | 하                 | 텍스트 분석 기법 활용<br>해시테이블 활용 매칭<br>         | 제약사항대로 정상동작 확인                |
| 구현-3            | 게시판 검색                                       | 공지사항 게시판 구축                                                    | 사용자가 작성불가능                              | 하                 | 관리자 인가를 통한 게시물 작성                       | 검색된 제목의 키워드와 내용물 간 정상 매칭 확인   |
| 구현-3            | 게시판 검색                                       | 공지사항 게시물 키워드 검색 | 제목의 키워드 제한<br>다른 페이지로 넘어가도<br>공지사항이 사라지지 않도록 | 하                                                              | 페이지네이션 구현                               | 게시판 목록<br>정상동작 확인 |
| 구현-4            | 추천기능                                         | 인공지능 모델 사용                                                     | 시계열 데이터 사용                              | 상                 | 시계열 데이터에 최적화된<br>모델인지 확인                | 모델 성능 확인                      |
| 구현-4            | 추천기능                                         | 사전 설문조사         | \- 투자성향 5개<br>\- 질문지 20개                     | 중                                                              | 사전 설문을 통해 수요파악                          | 군집화 확인            |
| 구현-4            | 추천기능                                         | 포트폴리오 추천        | 자산군 6가지 이상                                   | 상                                                              | 데이터 수집을 통해                              | 백테스팅 결과 확인        |
| 구현-5            | 사용자 정보                                       | 회원정보 수정                                                        | PW 확인 후 변경가능                            | 하                 | 제약사항을 바탕으로 수정기능 추가                      | 회원 정보 수정 완료                   |
| 구현-5            | 사용자 정보                                       | 회원 탈퇴           | PW 확인 후 탈퇴가능                                 | 하                                                              | 제약사항을 바탕으로 탈퇴기능 추가                      | 회원 탈퇴 완료          |
| 구현-6            | MLOps                                        | 데이터 파이프라인을<br>활용한 모델서빙                                         | 성능 속도 안정<br>데이터 정합성                     | 상                 | python 기반 웹프레임워크 사용<br>MLflow같은 tool 고려 | 로그 확인                         |
| 구현-7            | 인공지능모델                                       | 추천서비스 알고리즘 설계                                                  | 평가지표 일정 성능 이상 확보                        | 상                 | 변동성, 샤프지수 등 활용<br>성능 평가 및 학습 반복         | 평가지표 성능 확보 여부 확인              |
| 구현-8            | 피쳐엔지니어링                                      | 데이터 전처리                                                        | 이상치, NULL 값 처리 (기준)                     | 중                 | 산술평균 활용                                 | isnull, isnan로 확인             |
| 구현-9            | 개발환경구축                                       | 파이썬 가상 환경 구축                                                   | 파이썬 버전 및 라이브러리 통일                       | 중                 | 도커이미지 활용                                | 동일 버전인지 확인                    |
| 구현-10           | 인프라구축                                        | 클라우드에 DB와 학습 환경 연결<br>& DB와 화면단 연결                         | CI/CD 연결<br>웹서버<br>추론api<br>db 용 서버     | 중                 | aws 사용                                  | 연결 여부 확인                      |
| 구현-11           | 상품비교                                         | 포트폴리오 상품 비교                                                    | 상품 1개씩 따로 선택 가능                         | 상                 | 상품 1개 선택 시 이후에 다시 상품 1개<br>선택 완료되면 비교됨  | 상품 비교 페이지 정상동작 확인             |
| 구현-12           | 대시보드                                         | 투자성향별 포트폴리오 확인                                                 | 시각 요소의 동적 반응                            | 상                 | 파이차트 활용                                 | 성향별 대시보드 변화 여부 확인             |
| 구현-13           | 외부api 활용                                     | 주가 데이터 수집<br>사용자 화면 출력                                         | 유료api 가격 제한<br>사용자 화면에서의 데이터 보호         | 상                 | FinanceDataReader 패키지 활용                | 연결 확인 및 대시보드 정상동작             |
| 구현-14           | 포트폴리오 전략                                     | 전통적인 포트폴리오전략과 그 외의 포트폴리오 전략 제시<br>주식, 채권, 대안자산을 세분화하여 투자상품군 구성 | 3개 이상 포트폴리오 구성                          | 상                 | 블랙 리터만 모델 활용<br>및 새로운 알고리즘 설계           | 차별점 확인                        |


### WBS
```mermaid
gantt

    dateFormat YYYY-MM-DD
    title 프로젝트 일정
    section 구축
    가상환경:done, a1, 2023-08-02,  1w
    MySql 연결 :done, a2, 2023-08-02, 1w
    도커 이미지 빌드 :done, a3, 2023-08-02, 1w
    AWS - 웹 서버용 - EC2 :done, a4, 2023-08-02, 1w
    AWS - DB용 - EC2 :done, a5, 2023-08-02, 1w
    AWS - 모델용 - EC2 :done, a6, 2023-08-02, 1w
    section 데이터분석
    주식 csv , 채권 csv , 나라별 csv :done, a7, 2023-08-02, 2w
    크롤링 + 클렌징 :done, a8, 2023-08-02, 2w
    컬럼 정의, 관계도 :done, a9, 2023-08-02, 2w
    이상, 결측치 처리 :done, a10, 2023-08-02, 2w
    section 모델링
    파생 변수 상관관계 도출 :done, a1, 2023-08-12, 1w
    ML/DL 선택해서 만들기 :done, a2, 2023-08-12, 1w
    주가 예측 (추종지수) :done, a3, 2023-08-12,  1w
    자산군 설정 (주식/채권/금) :done, a4, 2023-08-12, 1w
    자산 포트폴리오 비율 설정 :done, a5, 2023-08-12,  1w
    전통적인 방법 자산 포트폴리오 비율 설정 :done, a6, 2023-08-12,  2w
    신 AI 기법 자산 포트폴리오 비율 설정 :done, a7, 2023-08-12,  2w
    모델 가중치 업데이트:done, a9, 2023-08-20,  1w
    모델 변수 바꿔보기 :done, a10, 2023-08-20,  1w
    모델 성능 평가 :done, a11, 2023-08-20,  1w
    인퍼런스 API 올리기 :done, a12, 2023-08-20,  1w
    section 프론트엔드
    메인페이지 :a11, 2023-08-28, 14d
    회원가입페이지 :a12, 2023-08-28, 14d
    로그인페이지 :a13, 2023-08-28, 14d
    개인정보페이지 :a14, 2023-08-28, 14d
    개인정보 수정시 비밀번호 입력 페이지 :a15, 2023-08-28, 14d
    개인정보 수정 페이지 :a16, 2023-08-28, 14d
    회원 탈퇴 페이지 :a17, 2023-08-28, 14d
    추천서비스시작페이지 :a18, 2023-08-28, 14d
    추천서비스설문조사페이지  :a19, 2023-08-28, 14d
    추천서비스 결과페이지 :a20, 2023-08-28, 14d
    상품 검색 결과페이지 :a21, 2023-08-28, 14d
    상품 상세 페이지 :a22, 2023-08-28, 14d
    공지사항 게시판 목록 페이지 :a23, 2023-08-28, 14d
    공지사항 게시물 상세 페이지 :a24, 2023-08-28, 14d
    공지사항 게시물 검색 결과 목록 페이지 :a25, 2023-08-28, 14d
    상품 비교 페이지 :a26, 2023-08-28, 14d
    자산별 대시보드페이지 (템플릿) :a27, 2023-08-28, 14d
    대시보드 붙이기 - API 쓸거면 Plotoy 같은 :a28, 2023-08-28, 14d
    section 백엔드
    회원가입 + 수정 + 탈퇴 :a29, 2023-08-28, 14d
    로그인 + 로그아웃 :a30, 2023-08-28, 14d
    추천서비스 추론 요청 :a31, 2023-08-28, 14d
    상품검색 - DB or ELK - 야후파이낸스API :a32, 2023-08-28, 14d
    게시판검색 - DB or ELK :a33, 2023-08-28, 14d
    게시판 :a34, 2023-08-28, 14d
    상품 & 상품비교결과 :a35, 2023-08-28, 14d
    단위테스트 :a36, 2023-09-02, 1w
```



