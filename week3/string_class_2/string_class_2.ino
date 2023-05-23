void setup() {
  Serial.begin(9600);
  Serial.println();

  int h = 9;
  //시간
  String hstr = String(h); 
  //문자열 변환

  int m = 8;
  //분
  String mstr = String(m); 
  //문자열 변환

  if(mstr.length() == 1){
  //한자릿수라면  
    mstr = '0' + mstr;
    //앞에 0을 붙여준다
  }

  int s = 35;
  //초
  String sstr = String(s);
  //문자열 변환

  float t = 27.56;
  //소수점 초
  String tstr = String(t, 1);
  //문자열 변환
  //소수점 이하 자릿수는 1
  
  String longstr = hstr + ":" + mstr + ":" + sstr + ":" + tstr;
  //+를 이용해 한 변수에 넣어준다
  Serial.println(longstr);
  //출력
  //9:08:35:27.6

}

void loop() {
  // put your main code here, to run repeatedly:

}
