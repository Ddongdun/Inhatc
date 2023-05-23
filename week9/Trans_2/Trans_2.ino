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
  analogWrite(LED_PIN, ledBrightness); 
}