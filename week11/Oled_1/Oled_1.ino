#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64

#define OLED_RESET 4

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);
//adafruit 라이브러리로 display 설정

void setup() {
  display.begin(SSD1306_SWITCHCAPVCC, 0x3c);  
  //디스플레이 초기화

}

void loop() {
  display.clearDisplay();
  //디스플레이 비움
  display.setTextSize(1);
  //디스플레이 글씨 크기 설정
  display.setTextColor(WHITE);
  //디스플레이 폰트 색 설정
  display.setCursor(0,0);
  //커서 위치 설정
  display.println("INHATC");
  //출력
  display.display();
  //디스플레이에 표시
}
