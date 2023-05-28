void setup()
{
  pinMode(3, OUTPUT);
  //3번 핀 출력모드로 설정 
}
void loop()
{
int lp;
//값을 저장할 변수
  for(lp=0;lp<256;lp++)
  //pwm의 범위까지 반복
  {
    analogWrite(3, lp);
    //3번 핀의 전압을 lp만큼 설정
    delay(1);
    //1ms 딜레이
  }
}
