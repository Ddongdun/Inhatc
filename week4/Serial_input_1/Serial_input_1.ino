void setup() {
  Serial.begin(9600);
  Serial.println();
}

void loop() {
  while(Serial.available()){
    char c = Serial.read();
    Serial.print(c);
  }
  /*
  1234
  abcd
  */

}
