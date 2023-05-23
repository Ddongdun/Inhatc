#define DOT { \
{0,0,1,1,1,1,0,0}, \
{0,1,0,0,0,0,1,0}, \
{1,0,1,0,0,1,0,1}, \
{1,0,0,0,0,0,0,1}, \
{1,0,1,0,0,1,0,1}, \
{1,0,0,1,1,0,0,1}, \
{0,1,0,0,0,0,1,0}, \
{0,0,1,1,1,1,0,0} \
}
//얼굴을 표현할 배열
byte col = 0;
//column 변수
byte leds[8][8];

int pins[17]= {-1, 5, 4, 3, 2, 14, 15, 16, 17, 13, 12, 11, 10, 9, 8, 7, 6};
//도트 매트릭스 핀들을 배열로 선언
int cols[8] = {pins[13], pins[3], pins[4], pins[10], pins[6],pins[11], pins[15], pins[16]};
//콜 핀
int rows[8] = {pins[9], pins[14], pins[8], pins[12], pins[1],pins[7], pins[2], pins[5]};
//로우 핀
int pattern[8][8] = DOT;
//led가 켜지고 꺼지는 패턴



void setup() {
  for(int i = 1;i<=16;i++){
    //차례로 출력모드 설정
    pinMode(pins[i], OUTPUT);
    //핀 모드를 출력으로 바꿈
  }

  for(int i =1;i<=8;i++){
    //초기화
    digitalWrite(cols[i-1], LOW);
    //콜 핀을 Low로 변경
  }

  for(int i =1;i<=8;i++){
    //초기화
    digitalWrite(rows[i-1], LOW);
    //로우 핀을 Low로경변경
  }

}

void loop() {
  display();
  //display 함수 반복
  delay(2);
  //2ms 딜레이

}

void display(){
  digitalWrite(cols[col], LOW);
  //다음 column으로 넘어가기 전에 이전led를 끈다
  col++;
  //현재 column
  if (col == 8) {
  //column이 끝까지 증가했다면
  col = 0;
  //0으로 초기화
  }
  for (int row = 0; row < 8; row++) {
    //한 줄씩 키는 반복문
    if (pattern[col][7 - row] == 1) {
    //패턴에 저장된 배열 값이 1이라면
    digitalWrite(rows[row], LOW); 
    // LED ON
    }
    else {
    digitalWrite(rows[row], HIGH); 
    // LED OFF
    }
  }
    digitalWrite(cols[col], HIGH);
} 

