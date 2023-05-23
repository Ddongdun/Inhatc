const int IN[4] = {6,5,4,3};
//포트 번호 
void setup() {
  for(int i=0;i<4;i++){
  //포트 개수 만큼 반복
    pinMode(IN[i], OUTPUT);
    //출력으로정설정
  }
}
void loop() {
  STOP(1500);
  //정지
  Forward(1500);
  //앞
  Left(1500);
  //왼쪽
  Right(1500);
  //오른쪽
  Backward(1500);
  //뒤
}

void STOP(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],LOW);
  //모두 LOW or HIGH일때 모터 정지
  delay(time);
}

void Forward(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],HIGH);
  delay(time);
  //시계 방향으로 모터 회전
}

void Left(int time){
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],HIGH);
  delay(time);
  //왼쪽 반시계, 오른쪽 시계 방향 회전
}

void Right(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[2],HIGH);
  digitalWrite(IN[3],LOW);
  delay(time);
  //왼쪽 시계, 오른쪽 반시계 방향 회전
}


void Backward(int time){
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],HIGH);
  digitalWrite(IN[3],LOW);
  delay(time);
  //반시계 회전
}
