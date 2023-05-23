#include <Stepper.h>
#define IN1 8
#define IN2 9
#define IN3 10
#define IN4 11
//360˚ 회전
const int stepsPerRevolution = 2048; 
Stepper myStepper(stepsPerRevolution,IN4,IN2,IN3,IN1);
void setup() {
  myStepper.setSpeed(14); 
}
void loop() {
  myStepper.step(stepsPerRevolution); //시계 반대방향
  delay(500);
  myStepper.step(-stepsPerRevolution); //시계 방향
  delay(500);
}