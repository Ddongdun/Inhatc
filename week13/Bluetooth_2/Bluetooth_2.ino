#include <SoftwareSerial.h>
#define BT_RXD 8
#define BT_TXD 7
#define LED_PIN 9
SoftwareSerial bluetooth(BT_RXD, BT_TXD);
void setup(){
  bluetooth.begin(9600);
  pinMode(LED_PIN, OUTPUT);
}
void loop(){
  if(bluetooth.available() > 0){
    int state = bluetooth.read() - 48;
    if(state == 1){
      digitalWrite(LED_PIN, HIGH);
    }
    else{
      digitalWrite(LED_PIN, LOW);
    }
  }
}