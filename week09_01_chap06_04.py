def is_stack_full() -> bool:
#스택이 꽉 찼는지 확인하는 함수 -> 불 값
    global SIZE, stack, top
    #전역 변수 선언
    if (top >= SIZE - 1):
    #탑 값이 사이즈-1보다 크거나 같다면 
        return True
        #트루
    else:
    #그렇지 않다면
        return False
        #폴스


def push(data):
#스택에 데이터를 넣는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if (is_stack_full()):
    #스택이 꽉 찼다면
        print("스택이 꽉 찼습니다.")
        #알려준다
        return
        #리턴 x
    top = top + 1
    #탑 값 + 1
    stack[top] = data
    #탑에 데이터를 넣는다


SIZE = 5
stack = ["커피", "녹차", "꿀물", "콜라", None]
top = 3

print(stack)
push("환타")
print(stack)
push("게토레이")
