int cnt;
float temp;
String name;

void setup() {
  Serial.begin(9600);
  Serial.println();
}

void loop() {
  while(Serial.available()) {
    char c = Serial.read();
    if (c == 'c') {
      cnt = Serial.parseInt();
      Serial.print("count=");
      Serial.println(cnt);
    }
    else if (c == 't') {
      temp = Serial.parseFloat();
      Serial.print("temp=");
      Serial.println(temp);
    }
    else if (c == 'n') {
      name = Serial.readStringUntil(';');
      Serial.print("name=");
      Serial.println(name.c_str());
    }
    /*
    count=125
    temp=26.60
    name= gildong
    */
  }
}

