#define LED_PIN LED_BUILTIN
#define LED_ON  HIGH
#define LED_OFF LOW

String inputVal;
int ledVal;

void setup() {
  Serial.begin(9600);
  Serial.println("LED Control Example");
  pinMode(LED_PIN, OUTPUT);
}

void loop() {
  inputVal = Serial.readString();
  
  if (inputVal == "on"){
    Serial.println("LED ON");
    ledVal = LED_ON;
  }
  else if (inputVal == "off"){
    Serial.println("LED OFF");
    ledVal = LED_OFF;
  }
  digitalWrite(LED_PIN, ledVal);
}
