#include <Wire.h>

void setup() {
  Wire.begin();
  Serial.begin(9600);
  Serial.println("I2C Scanner");
}

void loop() {
  byte error, address;
  int nDevices;
  Serial.println("Scanning...");
  nDevices = 0;
  //저장할 디바이스 개수
  for(address = 1;address < 127; address++){
  //슬레이브의 주소값을 지정하기 위해 반복
    Wire.beginTransmission(address);
    //슬레이브의 주소값 지정
    error = Wire.endTransmission();
    //에러에 데이터 버퍼에 저장된 데이터를 전송
    if(error == 0){
    //데이터가 0이라면
      Serial.print("I2C device found at address 0x");
      //알려준다
      if(address < 16) 
      //주소가 16이하라면
        Serial.print("0");
        //알려준다
      Serial.print(address,HEX);
      //주소를 HEX코드로 알려줌
      Serial.println(" !");
      nDevices++;
      //알려진 디바이스 개수 추가
    }
    else if(error == 4){
    //데이터가 4라면
      Serial.print("Unknown error at address 0x");
      //찾지못함
      if(address < 16) 
        Serial.print("0");
      Serial.println(address,HEX);
    }
  }
  if(nDevices == 0){ 
  //찾은 디바이스가 0개라면
    Serial.println("NoI2C devices found\n");
    //알려준다
  }
  else{
    Serial.println("done\n");
    delay(5000);
  }
}


