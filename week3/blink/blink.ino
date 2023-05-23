#define LED_PIN LED_BUILTIN
void setup() {
// put your setup code here, to run once:
  pinMode(LED_PIN, OUTPUT);
  Serial.begin(9600); //print를 하기 위해 반드시 선언되어야 함
  Serial.println("Setup");
}
void loop() {
// put your main code here, to run repeatedly:
  digitalWrite(LED_PIN, HIGH); // LED 꺼짐
  delay(1500); // 꺼진 상태를 1.5초(1500밀리초) 유지
  digitalWrite(LEDQA_PIN, LOW); // LED 켜짐
  delay(500); // 켜진 상태를 0.5초(500밀리초) 유지
  Serial.println("Hello Arduino");
}
