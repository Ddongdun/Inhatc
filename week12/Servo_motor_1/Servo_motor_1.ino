#include <Servo.h>
#define SERVO_PIN 9
//서보 모터 핀
Servo servo;
//서보모터 라이브러리
int pos = 0;
//각도
void setup() {
  servo.attach(SERVO_PIN);
  //서보모터 핀 활성화
}
void loop() {
  for(pos = 0; pos < 180; pos += 1) {
  //0도 ~ 180도 까지
    servo.write(pos);
    //모터 회전
    delay(5);
    //딜레이
  }
  for(pos = 180; pos>=1; pos-=1) {
  //역회전
    servo.write(pos);
    //모터 회전
    delay(5);
    //딜레이
  }
}
