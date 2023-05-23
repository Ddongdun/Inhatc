void setup() {
  pinMode( 9,OUTPUT);
  pinMode( 3,OUTPUT);
  pinMode( 2,OUTPUT);
  pinMode( 12,OUTPUT);
  pinMode( 15,OUTPUT);
  pinMode( 11,OUTPUT);
  pinMode( 7,OUTPUT);
  pinMode( 6,OUTPUT);
  pinMode( 13,OUTPUT);
  pinMode( 8,OUTPUT);
  pinMode( 17,OUTPUT);
  pinMode( 10,OUTPUT);
  pinMode( 5,OUTPUT);
  pinMode( 16,OUTPUT);
  pinMode( 4,OUTPUT);
  pinMode( 14,OUTPUT);
}

void loop() {
  // Col
  digitalWrite( 9,HIGH);
  digitalWrite( 3,LOW);
  digitalWrite( 2, LOW);
  digitalWrite( 12, LOW);
  digitalWrite( 15, LOW);
  digitalWrite( 11, LOW);
  digitalWrite( 7, LOW);
  digitalWrite( 6, LOW);
  // Row
  digitalWrite( 13, LOW);
  digitalWrite( 8, HIGH);
  digitalWrite( 17, HIGH);
  digitalWrite( 10, HIGH);
  digitalWrite( 5, HIGH);
  digitalWrite( 16, HIGH);
  digitalWrite( 4, HIGH);
  digitalWrite( 14, HIGH);


}
