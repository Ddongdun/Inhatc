#include <DHT.h>

#define DHT11_PIN 4
#define DHTTYPE DHT11

DHT dht(DHT11_PIN, DHTTYPE);



void setup() {
  Serial.begin(9600);
  Serial.print("DHT TEST PROGRAM");
  Serial.println();
  Serial.println("Type, \tHumidity (%), tTemperature (C)");

}

void loop() {
  Serial.print("DHT11, \t");
  Serial.print(dht.readHumidity());
  Serial.print(",\t");
  Serial.println(dht.readTemperature());
  delay(2000);
}
