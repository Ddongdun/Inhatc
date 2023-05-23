#include <Wire.h>
#define SLAVE_ADDR 9
int analogPin = 0;
//아날로그 핀
int val = 0;
//변수
void setup() {
  Wire.begin();
}

void loop() {
  delay(50);
  val = map(analogRead(analogPin), 0, 1023, 255, 1);
  //아날로그 변수를 map함수를 이용해 저장
  Wire.beginTransmission(SLAVE_ADDR);
  //슬레이브 주소값 지정
  Wire.write(val);
  //I2C버스로 데이터를 보낸다
  Wire.endTransmission();
  //버퍼에 저장된 데이터 전송

}
