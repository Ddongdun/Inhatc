#include <Wire.h>
#include <LiquidCrystal_I2C.h>
//LCD라이브러리
LiquidCrystal_I2C lcd(0x27,16,2);
//사용할 lcd의 주소, 행, 열 값 지정
void setup(){
  lcd.init();
  lcd.backlight();
  //lcd 초기화
}
void loop(){
  lcd.setCursor(2,0);
  //2행 0열로 커서 이동(0부터 시작)
  lcd.print("First line!");
  //출력
  lcd.setCursor(2,1);
  //2행 1열로 커서 이동
  lcd.print("Second line!");
  //출력
  delay(1000);
  //1초 딜레이
  lcd.clear();
  //lcd 초기화
  delay(1000);
  //1초 딜레이
}
