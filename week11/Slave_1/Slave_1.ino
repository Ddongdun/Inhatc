#include <Wire.h>
#define SLAVE_ADDR 9 // 슬레이브 ID 지정
int LED = 13; // Define LED Pin
int rd; // Variable for received data
int br; // Variable for blink rate
void setup() {
  pinMode(LED, OUTPUT);
  // Initialize I2C communications as Slave
  Wire.begin(SLAVE_ADDR); 
  // Function to run when data received from master
  Wire.onReceive(receiveEvent);
  // Setup Serial Monitor 
  Serial.begin(9600);
  Serial.println("I2C Slave Demonstration");
}

void receiveEvent() {
  rd = Wire.read(); // read one character from the I2C
  Serial.println(rd); // Print value of incoming data
}
void loop() {
  delay(50);
  br = map(rd, 1, 255, 100, 2000); // 수신된 값을 이용하여 delay
  //시간 계산
  digitalWrite(LED, HIGH);
  delay(br);
  digitalWrite(LED, LOW);
  delay(br);
}
