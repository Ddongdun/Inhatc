#define TRIG_PIN 8
#define ECHO_PIN 9
int distance;
void setup() {
  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);
  Serial.begin(9600);
}
void loop() {
  digitalWrite(TRIG_PIN, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG_PIN, LOW);
  distance = pulseIn(ECHO_PIN, HIGH) / 58;
  if(distance <= 2000){
    Serial.print("Distance(cm) = ");
    Serial.println(distance);
  }
  else{
    Serial.println("ERROR!!");
  }
  delay(1000);
}