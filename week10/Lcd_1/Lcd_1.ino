#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27,16,2);
void setup(){
  lcd.init();
  lcd.backlight();
}
void loop(){
  lcd.setCursor(2,0);
  lcd.print("First line!");
  lcd.setCursor(2,1);
  lcd.print("Second line!");
  delay(1000);
  lcd.clear();
  delay(1000);
}