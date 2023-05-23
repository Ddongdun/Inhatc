void setup() {
  Serial.begin(9600);
  Serial.println();

  String longstr = "9:08:35,27.6";

  int p1 = longstr.indexOf(":");
  //문자열의 처음부터 :를 찾아 반환
  //p1 = ":"
  int p2 = longstr.indexOf(":", p1+1);
  //p1의 다음값부터 :를 찾아 반환
  //p2 = ":"
  int p3 = longstr.indexOf(",", p2+1);
  //p2의 다음값부터 ,를 찾아 반환
  //p3 = ","

  String hstr = longstr.substring(0, p1);
  //처음부터 p1까지 잘라냄
  //hstr = 9
  String mstr = longstr.substring(p1+1, p2);
  //p1의 다음부터 p2까지 잘라냄
  //mstr = 08
  String sstr = longstr.substring(p2+1, p3);
  //p2의 다음부터 p3까지 잘라냄
  //sstr = 35
  String tstr = longstr.substring(p3+1);
  //p3의 다음부터 끝까지 잘라냄
  //tstr = 27.60

  int h = hstr.toInt();
  int m = mstr.toInt();
  int s = sstr.toInt();
  //정수로 변환
  float t = tstr.toFloat();
  //실수로 변환

  Serial.println(h);
  Serial.println(m);
  Serial.println(s);
  Serial.println(t);
  /*
  9
  8
  35
  27.60
  */


}

void loop() {
  // put your main code here, to run repeatedly:

}
