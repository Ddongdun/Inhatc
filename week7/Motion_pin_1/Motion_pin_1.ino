#define MOTION_PIN 7
void setup() {
  Serial.begin(9600);
  pinMode(MOTION_PIN, INPUT);

}

void loop() {
  if(digitalRead(MOTION_PIN) == 1){
    Serial.println("MOTION Detect!");
  }
  delay(1000);
  

}
