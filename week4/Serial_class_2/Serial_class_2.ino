void setup() {
  Serial.begin(9600);
  Serial.println();

  Serial.println("-----문자");
  char c = 'a';
  Serial.println(c);
  Serial.write(c);
  /*
  -----문자
  a
  a
  */

  Serial.println("\n-----문자열");
  char s[] = "abc";
  Serial.println(s);
  Serial.write(s);
  /*
  -----문자열
  abc
  abc
  */

  Serial.println("\n-----byte");
  byte b = 97;
  Serial.println(b);
  Serial.write(b);
  Serial.println();
  /*
  -----byte
  97
  a
  */

}

void loop() {
  // put your main code here, to run repeatedly:

}
