### 기능 분리 - 도메인 기준
**입력기**
- 금액 입력기
  - 금액 입력 및 예외 처리
- 당첨 번호 입력기
  - 당첨 번호 입력 및 예외 처리

출력기
- 시스템 출력기
  - 시스템 메세지 출력
- 발행 로또 출력기
  - 발행한 n매의 로또 출력
- 당첨 통계 출력기
  - 당첨 번호와 일치한 갯수(보너스 일치 여부 포함) 확인

연산기 
- 로또 컴퓨터
  - 입력값에 따른 로또 게임 진행
- 난수 발생기
  - 7자리의 난수 발생(중복 불허)
- 결과 판정기
