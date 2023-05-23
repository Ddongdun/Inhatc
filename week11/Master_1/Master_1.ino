#include <Wire.h>
#define SLAVE_ADDR 9
int analogPin = 0;
int val = 0;
void setup() {
  Wire.begin();
}

void loop() {
  delay(50);
  val = map(analogRead(analogPin), 0, 1023, 255, 1);
  Wire.beginTransmission(SLAVE_ADDR);
  Wire.write(val);
  Wire.endTransmission();

}
