#define LED_PIN 7
void setup()
{
  Serial.begin(9600);
  pinMode(LED_PIN, OUTPUT);
}
void loop()
{
  int luminance = analogRead(A0);
  //A0으로 아날로그 값을 입력받는다
  Serial.println(luminance);
  //저장받은 값 출력
  if(luminance >= 400)
  //밝기가 400이상이라면
  {
    digitalWrite(LED_PIN, HIGH);
    //LED를 켬
  }
  else
  //그렇지 않다면
  {
    digitalWrite(LED_PIN, LOW);
    //LED를 끈다
  }
  delay(1000);
  //1초 딜레이
}
