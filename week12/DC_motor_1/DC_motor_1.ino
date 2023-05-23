const int IN[2] = {6,5};
void setup() {
  for(int i=0;i<2;i++){
    pinMode(IN[i], OUTPUT);
  }
}
void loop() {
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  delay(1000);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[0],LOW);
  delay(1000);
}