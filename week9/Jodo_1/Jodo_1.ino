void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  Serial.println(analogRead(A0));
  //A0 포트로 아날로그 값을 입력받아 출력한다
  delay(1000);
  //딜레이 1초
}
