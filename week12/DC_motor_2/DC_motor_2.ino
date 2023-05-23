const int IN[4] = {6,5,4,3};
void setup() {
  for(int i=0;i<4;i++){
    pinMode(IN[i], OUTPUT);
  }
}
void loop() {
  STOP(1500);
  Forward(1500);
  Left(1500);
  Right(1500);
  Backward(1500);
}

void STOP(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],LOW);
  delay(time);
}

void Forward(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],HIGH);
  delay(time);
}

void Left(int time){
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],LOW);
  digitalWrite(IN[3],HIGH);
  delay(time);
}

void Right(int time){
  digitalWrite(IN[0],LOW);
  digitalWrite(IN[1],HIGH);
  digitalWrite(IN[2],HIGH);
  digitalWrite(IN[3],LOW);
  delay(time);
}


void Backward(int time){
  digitalWrite(IN[0],HIGH);
  digitalWrite(IN[1],LOW);
  digitalWrite(IN[2],HIGH);
  digitalWrite(IN[3],LOW);
  delay(time);
}