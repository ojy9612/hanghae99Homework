# hanghae99Homework02




5. CORS 해결하기
- CORS는 한 도메인이 다른 도메인 (도메인 간 요청)을 가진 리소스에 액세스 할 수 있게하는 보안 메커니즘이다.
- CORS는 동일한 출처의 리소스에만 접근하도록 제한한다. 여기서 출처는 프로토콜, 호스트명, 포트가 같다는 것을 의미한다.
- CORS를 가장 쉽게 적용시키는 방법은 JWT토큰을 사용하는 것이라고 생각해 Session대신 Jwt를 적용했다.



# 트러블슈팅!
1. 스파르타 강의에서는 UserDetailsImpl에 User 객체를 넣어서 관리 했지만 객체를 넣을 경우 db쿼리문이 계속 발생하는 문제가 있다.(강의에서 정정하는것을 퀴즈로 내주고 답은 공개하지 않았다.) 
- 해결 - UserDetailsImpl의 User객체를 id,password,roles String타입으로 바꿔서 저장했다.

2. (should be mapped with insert="false" update="false") 에러 board테이블에서 자꾸 해당 에러가 뜬다.
- 해결 - JoinColumn의 name이 중복되서 나타나는 문제였다. name은 내 테이블에 설정한 문자로 컬럼을 생성하라는 뜻으로 상대 테이블과 매핑시켜주는 역할을 하지 않는다.