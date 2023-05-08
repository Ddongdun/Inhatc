import webbrowser
import time

url = input("url 입력 : ")
webbrowser.open("http://" + url)
time.sleep(3)
webbrowser.open("http://www.inhatc.ac.kr")
