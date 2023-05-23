const int speakerPin = 9; 
//부저를 연결한 핀 번호
char noteNames[] = {'C','D','E','F','G','a','b'};
//계이름
unsigned int frequencies[] = 
{262,294,330,349,392,440,494};
//계이름에 맞는 주파
const byte noteCount = sizeof(noteNames); 
//각 음들의 사이즈
char score[] = 
"CCGGaaGFFEEDDC GGFFEEDGGFFEED CCGGaaGFFEEDDC"; 
//음계
const byte scoreLen = sizeof(score); 
//음계의 사이즈
void setup()
{
}
void loop()
{
  for (int i = 0; i < scoreLen; i++)
  //음계 만큼 반복
  {
    int duration = 333; 
    playNote(score[i], duration);
    //각 음을 duration만큼 딜레이를 주고 재생
  }
  delay(4000); 
  //노래가 끝나면 4초 정지
}
void playNote(char note, int duration)
//음계, 딜레이를 매개변수로 받는 함수
{
  for (int i = 0; i < noteCount; i++)
  //
  {
    if (noteNames[i] == note)
    //계이름과 음계가 일치한다면
    tone(speakerPin, frequencies[i], duration); 
    //핀 설정, 주파수 설정, 딜레이 설정
  }
  delay(duration);
  //duration만큼 딜레이
}
