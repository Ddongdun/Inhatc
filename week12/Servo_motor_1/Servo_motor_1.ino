#include <Servo.h>
#define SERVO_PIN 9
Servo servo;
int pos = 0;
void setup() {
  servo.attach(SERVO_PIN);
}
void loop() {
  for(pos = 0; pos < 180; pos += 1) {
    servo.write(pos);
    delay(5);
  }
  for(pos = 180; pos>=1; pos-=1) {
    servo.write(pos);
    delay(5);
  }
}