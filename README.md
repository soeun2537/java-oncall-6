# 최종 코딩테스트

## ✏️ 구현 기능 목록

### ✔️ 정상 입력 처리

### 입력

- 월(숫자)과 시작 요일(일, 월, 화, 수, 목, 금, 토) 정보를 입력받는다.
    - 월에 대한 유효성을 검증한다.
        - 월은 숫자이어야 한다.
        - 월은 1~12 사이여야 한다.
        - 2월은 28일까지만 있다고 가정한다.
        - 월은 비어있을 수 없다.
    - 시작 요일에 대한 유효성을 검증한다.
        - 시작 요일은 (일, 월, 화, 수, 목, 금, 토) 형식이어야 한다.
        - 시작 요일은 비어있을 수 없다.
- 평일 비상 근무 순서를 입력 받는다.
    - 닉네임은 쉼표(,)로 구분한다.
    - 닉네임에 대한 유효성을 검증한다.
        - 닉네임은 문자여야 한다.
        - 닉네임은 중복될 수 없다.
        - 닉네임은 최대 5자여야 한다.
        - 인원은 최소 5명, 최대 35명이어야 한다.
        - 닉네임은 비어있을 수 없다.
- 휴일(토요일, 일요일, 법정공휴일) 비상 근무 순서를 입력받는다.
    - 닉네임은 쉼표(,)로 구분한다.
    - 닉네임에 대한 유효성을 검증한다.
        - 닉네임은 문자여야 한다.
        - 닉네임은 중복될 수 없다.
        - 닉네임은 최대 5자여야 한다.
        - 인원은 최소 5명, 최대 35명이어야 한다.
        - 닉네임은 비어있을 수 없다.

### 출력

- 비상 근무표를 출력한다.
- 평일이면서 법정공휴일의 경우에만 요일 뒤에 (휴일) 표기를 해야 한다.

### 기능

- [ ] 순번에 따라 월별로 날짜를 고려하여 비상 근무일을 배정한다.
- [ ] 회사에서는 평일과 휴일(토요일, 일요일, 법정공휴일) 비상 근무 순번을 다르게 운영하고 있다.
- [ ] 공휴일을 저장하여 관리한다.
- [ ] 비상 근무자는 평일 순번, 휴일 순번에 각각 1회 편성되어야 한다.
- [ ] 근무자 보호와 비상 근무 운영의 효율을 위해, 비상 근무자는 어떤 경우에도 연속 2일은 근무할 수 없다.
- [ ] 순번상 특정 근무자가 연속 2일 근무하게 되는 상황에는, 다음 근무자와 순서를 바꿔 편성한다.
    - [ ] 평일에 비상 근무를 서고 다음 날이 휴일이면서 연속 근무해야 할 경우, 다음 휴일 근무자와 순서를 바꿔서 근무한다.
    - [ ] 휴일에 비상 근무를 서고 다음 날이 평일이면서 연속 근무해야 할 경우, 다음 평일 근무자와 순서를 바꿔서 근무한다.
- [ ] 비상 근무자 배정 시 다음 근무자와 순서를 바꿔야 하는 경우에는, 앞의 날짜부터 순서를 변경해야 한다.

### ⚠️ 예외

IllegalArgumentException을 발생시키고, 에러 메시지를를 출력한 후, 입력이 올바르지 않은 부분부터 다시 입력 받는다.

- \[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.

### 검증 항목

- 월이 숫자가 아닐 경우
- 월이 1~12 사이가 아닐 경우
- 월이 비어있을 경우
- 시작 요일이 (일, 월, 화, 수, 목, 금, 토) 형식이 아닐 경우
- 시작 요일이 비어있을 경우
- 닉네임이 문자가 아닐 경우
- 닉네임이 중복될 경우
- 닉네임이 5자를 초과할 경우
- 인원이 최소 5명, 최대 35명이 아닐 경우

<br>

## 📌 최종 기능 명세

| Class | Method | Input | Output | Description |
|-------|--------|-------|--------|-------------|

<br>

## 💻 커밋 컨벤션

> [**AngularJS 커밋 컨벤션**](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고

| Type     | Description      |
|----------|------------------|
| feat     | 새로운 기능 추가        |
| fix      | 버그 수정            |
| docs     | 문서 변경            |
| style    | 코드 포맷 변경         |
| refactor | 코드 리팩토링          |
| test     | 테스트 추가 및 수정      |
| chore    | 빌드 작업 및 도구 관련 변경 |

<br>

## ✅ 체크 리스트

### 과제 진행 요구 사항

- [ ] java-oncall-6 비공개 저장소를 생성한다.
- [ ] 기능을 구현하기 전에 README.md에 구현할 기능 목록을 정리해 추가한다.
- [ ] Git의 커밋은 README.md에 정리된 기능 목록 단위로 나눈다. (AngularJS Git Commit Message Conventions 참고)
- [ ] docs/how-to-solve.md에서 미션 해결 전략 문항에 답변을 필수로 작성한다.

### 기능 요구 사항

- [ ] 기본적으로 순번에 따라 비상 근무일을 배정한다.
- [ ] 회사에서는 평일과 휴일(토요일, 일요일, 법정공휴일) 비상 근무 순번을 다르게 운영하고 있다.
- [ ] 평일 순번과 휴일 순번의 순서는 다를 수 있다.
- [ ] 비상 근무자는 평일 순번, 휴일 순번에 각각 1회 편성되어야 한다.
- [ ] 근무자 보호와 비상 근무 운영의 효율을 위해, 비상 근무자는 어떤 경우에도 연속 2일은 근무할 수 없다.
- [ ] 순번상 특정 근무자가 연속 2일 근무하게 되는 상황에는, 다음 근무자와 순서를 바꿔 편성한다.
    - [ ] 평일에 비상 근무를 서고, 다음 날이 휴일이면서 연속 근무해야 할 경우, 다음 휴일 근무자와 순서를 바꿔서 근무한다.
    - [ ] 휴일에 비상 근무를 서고, 다음 날이 평일이면서 연속 근무해야 할 경우, 다음 평일 근무자와 순서를 바꿔서 근무한다.
- [ ] 비상 근무자 배정 시 다음 근무자와 순서를 바꿔야 하는 경우에는, 앞의 날짜부터 순서를 변경해야 한다.

### 실행 결과 예시

```
비상 근무를 배정할 월과 시작 요일을 입력하세요> 5,월
평일 비상 근무 순번대로 사원 닉네임을 입력하세요> 준팍,도밥,고니,수아,루루,글로,솔로스타,우코,슬링키,참새,도리
휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> 수아,루루,글로,솔로스타,우코,슬링키,참새,도리,준팍,도밥,고니

5월 1일 월 준팍
5월 2일 화 도밥
5월 3일 수 고니
5월 4일 목 수아
5월 5일 금(휴일) 루루
5월 6일 토 수아
5월 7일 일 글로
5월 8일 월 루루
5월 9일 화 글로
5월 10일 수 솔로스타
5월 11일 목 우코
5월 12일 금 슬링키
5월 13일 토 솔로스타
5월 14일 일 우코
5월 15일 월 참새
5월 16일 화 도리
5월 17일 수 준팍
5월 18일 목 도밥
5월 19일 금 고니
5월 20일 토 슬링키
5월 21일 일 참새
5월 22일 월 수아
5월 23일 화 루루
5월 24일 수 글로
5월 25일 목 솔로스타
5월 26일 금 우코
5월 27일 토 도리
5월 28일 일 준팍
5월 29일 월 슬링키
5월 30일 화 참새
5월 31일 수 도리
```

### 프로그래밍 요구 사항

- [ ] JDK 21에서 실행 가능해야 한다.
- [ ] 프로그램의 시작점은 Application의 main()이다.
- [ ] build.gradle 파일은 변경할 수 없으며, 제공된 라이브러리만 사용해야 한다.
- [ ] 프로그램 종료 시 System.exit()를 호출하지 않는다.
- [ ] 별도의 지시가 없는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
- [ ] 자바 코드 컨벤션을 준수하여 프로그래밍한다. 기본적으로 Google Java Style Guide를 따른다.
- [ ] Indent(인덴트, 들여쓰기) depth는 최대 2까지만 허용한다. (메서드를 분리하는 것을 추천)
- [ ] 3항 연산자를 사용하지 않는다.
- [ ] 메서드는 한 가지 일만 하도록 최대한 작게 만든다.
- [ ] JUnit 5와 AssertJ를 사용하여 테스트 코드를 작성한다.
- [ ] else 예약어 및 switch-case 문 사용을 금지한다.
- [ ] Enum을 사용하여 구현한다.
- [ ] UI 로직((System.out, System.in, Scanner)을 제외한 구현 기능에 대해 단위 테스트를 작성한다.
- [ ] 메서드 길이는 10라인을 초과하지 않는다.
- [ ] 입출력을 담당하는 클래스를 별도로 구현한다.
    - [ ] 클래스 이름, 메서드 반환 유형, 시그니처 등은 자유롭게 수정할 수 있다.
- [ ] camp.nextstep.edu.missionutils에서 제공하는 DateTimes 및 Console API를 사용하여 구현해야 한다.
    - [ ] Console.readLine()을 사용하여 사용자 입력을 처리한다.