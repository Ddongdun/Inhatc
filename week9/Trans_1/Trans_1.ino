void setup() 
{ 
  Serial.begin(9600);
} 
void loop() 
{ 
  int sensorValue = analogRead(A0); 
  //A0포트로 아날로그값을 입력 받아 저장
  Serial.println(sensorValue);
  //출력
} 
