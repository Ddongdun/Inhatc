#define LED_PIN 3
void setup()
{ 
  Serial.begin(9600); 
  pinMode(LED_PIN, OUTPUT);
} 
void loop() 
{ 
  int sensorValue = analogRead(A0);
  //A0포트를 이용해 아날로그 값을 입력받는다
  int ledBrightness = map(sensorValue, 0, 1023, 0, 255);
  //센서로 읽어온 값을 map함수를 이용해 LED의 밝기로 변경한다
  analogWrite(LED_PIN, ledBrightness); 
  //LED_PIN포트의 전압을 ledBrightness만큼 설정
}
