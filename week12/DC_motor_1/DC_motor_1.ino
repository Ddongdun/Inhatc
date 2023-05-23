const int IN[2] = {6,5};
//포트 번호
void setup() {
  for(int i=0;i<2;i++){
  //포트 번호 개수만큼 반복
    pinMode(IN[i], OUTPUT);
    //출력포트로 변경
  }
}
void loop() {
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  //반시계 방향 회전
  delay(1000);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[0],LOW);
  //시계 방향 회전
  delay(1000);
}
