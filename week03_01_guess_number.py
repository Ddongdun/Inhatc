import random #난수 생성

chance = 7

answer = random.randrange(1, 101)
#1부터 101보다 작은 수
while True:
    guess = int(input("정수 입력 : "))
    #답을 입력받는다
    if answer == guess:
    #만약 정답과 입력값이 같다면
        print("정답입니다!")
        break

    elif answer > guess :
    #만약 정답이 입력값보다 크다면
        chance = chance - 1
        #기회 1 소모
        print("입력하신 값보다 큰 수 입니다")
        #업다운 출력
        if chance == 0:
        #기회를 전부 소모했다면
            print(f"정답은 {answer}입니다")
            #정답 공개
            break
            #탈출
        print(f"기회가 {chance}번 남았습니다")
    elif answer < guess:
    #만약 정답이 입력값보다 작다면
        chance = chance - 1
        #기회 1 소모
        print("입력하신 값보다 작은 수 입니다")
        #업다운 출력
        if chance == 0:
        #기회를 전부 소모했다면
            print(f"정답은 {answer}입니다")
            #정답 공개
            break
            #탈출
        print(f"기회가 {chance}번 남았습니다")
        #남은 횟수 출력