#define LED_PIN LED_BUILTIN

void setup() {
  pinMode(2, OUTPUT);  // LED 핀을 출력으로 설정합니다.
  pinMode(3, OUTPUT);  // LED 핀을 출력으로 설정합니다.
  pinMode(4, OUTPUT);  // LED 핀을 출력으로 설정합니다.
}

void loop() {
  digitalWrite(2, HIGH);  // 첫 번째 LED 켜기
  delay(1000);                // 0.5초 동안 기다리기
  digitalWrite(2, LOW);   // 첫 번째 LED 끄기

  
  digitalWrite(3, HIGH);  // 두 번째 LED 켜기
  delay(1000);                // 0.5초 동안 기다리기
  digitalWrite(3, LOW);   // 두 번째 LED 끄기

  
  digitalWrite(4, HIGH);  // 세 번째 LED 켜기
  delay(1000);                // 0.5초 동안 기다리기
  digitalWrite(4, LOW);   // 세 번째 LED 끄기
}
