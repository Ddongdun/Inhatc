void setup() {
  Serial.begin(9600);
  Serial.println();

  String today;
  String month = "3월";
  String day = "14일";

  today = month + " " + day;
  Serial.println(today);

  today = month + " " + day + " " + String("사물인터넷 수업");
  Serial.println(today);

  today = String("Today is") + " " + "Pi Day";
  Serial.println(today);

}

void loop() {
  // put your main code here, to run repeatedly:

}
