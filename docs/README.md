- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원

입력
1. 로또 구입 금액 입력(1000단위로 나누어 떨어지지 않는 경우 Exception 처리)
2. 당첨 번호 입력, 쉼표(,)를 기준으로 구분
3. 보너스 번호 입력

출력
1. 발행한 로또 수량 및 번호 출력, 오름차순으로 정리하여 보여줌
2. 당첨 내역 출력
3. 수익률 출력(소수 둘째자리에서 반올림 - 첫째자리까지만 표시)
4. 에러 발생시 [ERROR]로 시작하는 문구 처리

조건
- 각 메서드 depth가 3이 넘지 말아야함(while 안에 if 들어가면 depth = 2)
- 한 메서드 15줄 이내로 구성
- else 사용 금지
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- Enum 사용

필요기능
1. 로또 구입 금액 입력
2. 1~45의 로또 번호 6개를 생성
3. 생성된 사용자 로또 번호 저장
4. 당첨 번호 입력
5. 보너스 번호 입력(당첨 번호와 달라야함)
6. 당첨 번호와 사용자가 뽑은 번호가 얼마나 일치하는지 확인
	- 번호 하나하나 비교하는 동작으로 변환 가능
7. 보너스 번호가 사용자가 뽑은 번호 안에 있는지 확인
8. 등수 구하기
9. 수익률 계산

기능 구현 목록
[1] 로또 구입 금액 입력
- 로또 구입 금액을 입력받는다(장당 1000원)
- 구입 금액이 1000원으로 나누어 떨어지지 않는 경우

[2] 1~45의 로또 번호 6개를 생성
- Lotto 객체 return
- Random을 사용해 난수 생성
- 중복되는 숫자가 없도록 생성(visited or 뽑은 숫자 체크)
