#define LED_PIN 7
void setup()
{
  Serial.begin(9600);
  pinMode(LED_PIN, OUTPUT);
}
void loop()
{
  int luminance = analogRead(A0);
  Serial.println(luminance);
  if(luminance >= 400)
  {
    digitalWrite(LED_PIN, HIGH);
  }
  else
  {
    digitalWrite(LED_PIN, LOW);
  }
  delay(1000);
}