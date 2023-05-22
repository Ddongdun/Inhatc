def is_stack_full() -> bool:
#스택이 꽉 찼는지 확인하는 함수 -> 불 값 리턴
    global SIZE, stack, top
    #전역 변수 선언
    if top >= SIZE - 1:
    #탑 값이 사이즈 - 1 보다 크거나 같다면
        return True
        #리턴 트루
    else:
    #그렇지 않다면
        return False
        #리턴 폴스


def is_stack_empty() -> bool:
#스택이 비었는지 확인하는 함수 -> 불 값 리턴
    global SIZE, stack, top
    #전역 변수 선언
    if top == -1:
    #탑 값이 -1이라면
        return True
        #리턴 트루
    else:
    #그렇지 않다면
        return False
        #리턴 폴스


def pop() -> str:
#데이터를 추출하는 함수
    global SIZE, stack, top
    #전역변수 선언
    if is_stack_empty():
    #스택이 비었다면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    data = stack[top]
    #탑의 데이터를 저장
    stack[top] = None
    #탑 데이터 삭제
    top = top - 1
    #탑값을 1 줄여준다
    return data
    #저장된 탑 데이터 리턴


def push(data):
#데이터를 삽입하는 함수
    global SIZE, stack, top
    #전역 변수선언
    if (is_stack_full()):
    #스택이 꽉 찼다면
        print("스택이 꽉 찼습니다.")
        #알려준다
        return
        #리턴 x
    top = top + 1
    #탑값 + 1
    stack[top] = data
    #탑에 데이터를 넣는


SIZE = 5
stack = ["커피", None, None, None, None]
top = 0

print(stack)
print(pop())
print(stack)
print(pop())
