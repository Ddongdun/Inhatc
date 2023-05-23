#define LED_PIN 3
void setup()
{ 
  Serial.begin(9600); 
  pinMode(LED_PIN, OUTPUT);
} 
void loop() 
{ 
  int sensorValue = analogRead(A0);
  int ledBrightness = map(sensorValue, 0, 1023, 0, 255);
  //센서로 읽어온 값을 map함수를 이용해 LED의 밝기로 변경한다
  analogWrite(LED_PIN, ledBrightness); 
}
