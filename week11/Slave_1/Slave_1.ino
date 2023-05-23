#include <Wire.h>
#define SLAVE_ADDR 9 // 슬레이브 ID 지정
int LED = 13; // Define LED Pin
int rd; // Variable for received data
int br; // Variable for blink rate
void setup() {
  pinMode(LED, OUTPUT);
  //LED 출력포트 설정
  Wire.begin(SLAVE_ADDR); 
  //슬레이브 모드로 자신의 번호 지정 후 초기화
  Wire.onReceive(receiveEvent);
  //마스터로부터 데이터가 수신되면 receiveEvent함수 동작
  Serial.begin(9600);
  //딜레이
  Serial.println("I2C Slave Demonstration");
  //출력
}

void receiveEvent() {
  rd = Wire.read(); 
  //I2C로 데이터를 읽어온다
  Serial.println(rd); 
  //읽어온 데이터 출력
}
void loop() {
  delay(50);
  //딜레이
  br = map(rd, 1, 255, 100, 2000); 
  //읽어온 데이터를 map함수를 통해 시간으로 변
  digitalWrite(LED, HIGH);
  //led를 켬
  delay(br);
  //br만큼 딜레이
  digitalWrite(LED, LOW);
  //led를 끔
  delay(br);
  //br만큼 딜레이
}
