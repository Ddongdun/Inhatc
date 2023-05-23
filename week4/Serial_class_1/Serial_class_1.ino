void setup() {
  Serial.begin(9600);
  Serial.println();

  char c = 'a';
  Serial.println(c);
  Serial.println(c, DEC);
  Serial.println(c, BIN);
  Serial.println(c, HEX);
  /*
  a
  97
  1100001
  61
  */

  float f = 35.657;
  Serial.println(f);
  Serial.println(f, DEC);
  Serial.println(f, BIN);
  Serial.println(f, HEX);
  /*
  35.66
  35.6570014953
  35.66
  35.6570014953613281
  */
}

void loop() {
  // put your main code here, to run repeatedly:

}
