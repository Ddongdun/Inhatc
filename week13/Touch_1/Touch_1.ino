#define TOUCH_PIN1 4
#define TOUCH_PIN2 5
#define TOUCH_PIN3 6
#define TOUCH_PIN4 7
#define LED_PIN1 8
#define LED_PIN2 9
#define LED_PIN3 10
#define LED_PIN4 11
void setup() {
pinMode(TOUCH_PIN1, INPUT);
pinMode(TOUCH_PIN2, INPUT);
pinMode(TOUCH_PIN3, INPUT);
pinMode(TOUCH_PIN4, INPUT);
pinMode(LED_PIN1, OUTPUT);
pinMode(LED_PIN2, OUTPUT);
pinMode(LED_PIN3, OUTPUT);
pinMode(LED_PIN4, OUTPUT);
}
void loop() {
  digitalWrite(LED_PIN1, LOW);
  digitalWrite(LED_PIN2, LOW);
  digitalWrite(LED_PIN3, LOW);
  digitalWrite(LED_PIN4, LOW);
  if(digitalRead(TOUCH_PIN1) == HIGH){
    digitalWrite(LED_PIN1, HIGH);
  }
  if(digitalRead(TOUCH_PIN2) == HIGH){
    digitalWrite(LED_PIN2, HIGH);
  }
  if(digitalRead(TOUCH_PIN3) == HIGH){
    digitalWrite(LED_PIN3, HIGH);
  }
  if(digitalRead(TOUCH_PIN4) == HIGH){
    digitalWrite(LED_PIN4, HIGH);
  }
  delay(50);
}