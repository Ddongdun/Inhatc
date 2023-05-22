def pop() -> str:
#데이터를 추출하는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if top == -1:
    #탑 값이 -1이라면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    data = stack[top]
    #탑의 데이터 저장
    stack[top] = None
    #탑을 비운다
    top = top - 1
    #탑 값 - 1
    return data
    #저장한 탑 데이터 리턴


SIZE = 5
stack = ["커피", None, None, None, None]
top = 0

print(stack)
print(pop())
print(stack)
print(pop())
