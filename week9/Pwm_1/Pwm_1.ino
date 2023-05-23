void setup()
{
  pinMode(3, OUTPUT);
}
void loop()
{
int lp;
  for(lp=0;lp<256;lp++)
  {
    analogWrite(3, lp);
    delay(1);
  }
}
