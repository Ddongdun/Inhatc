#for 변수 in range(시작값, 끝값+1, 증가값)
for i in range(0, 3, 1):
    print("Python")
    '''
    Python
    Python
    Python
    '''
for i in(0, 1, 2):
    print("안녕하세요")
    '''
    안녕하세요
    안녕하세요
    안녕하세요
    '''

'''while True:
    print("ㅎ", end = "")
    #ㅎ 무한반복
    #Ctrl + c break'''

for i in range(1, 100):
    print("%d 번 실행했음" %i)
    break
    #continue - 블록의 남은 부분을 건너뛰고 반복문의 처음으로 돌아감
    # 1번 실행했음