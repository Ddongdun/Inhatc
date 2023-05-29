def is_stack_full() -> bool:
#스택이 꽉 찼는지 확인하는 함수
    global SIZE, stack, top
    #전역 변수 선언 
    if top >= SIZE - 1:
    #탑이 사이즈 - 1 보다 크다면
        return True
        #리턴 트루
    else:
    #그렇지 않다면
        return False
        #리턴 폴스


def is_stack_empty() -> bool:
#스택이 비었는지 확인하는 함수
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
#데이터 추출 함수
    global SIZE, stack, top
    #전역 변수 선언
    if is_stack_empty():
    #스택이 비어있다면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    data = stack[top]
    #탑의 데이터를 저장한다
    stack[top] = None
    #탑 데이터 삭제
    top = top - 1
    #탑 값 - 1
    return data
    #저장한 데이터 리턴 


def push(data):
#데이터 삽입 함수    
    global SIZE, stack, top
    #전역 변수 선언 
    if is_stack_full():
    #스택이 꽉 찼다면
        print("스택이 꽉 찼습니다.")
        #알려준다
        return
        #리턴 x
    top = top + 1
    #탑 값 + 1
    stack[top] = data
    #탑에 데이터 삽입


def peek() -> str:
#탑의 데이터 알려주는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if is_stack_empty():
    #스택이 비어있다면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    return stack[top]
    #탑의 데이터 리턴


SIZE = int(input("스택 크기 입력 : "))
#스택 크기를 입력받는다
stack = [None for _ in range(SIZE)]
#사이즈 크기 만큼 스택 생성
top = -1
#탑 값은 -1부터 시작

if __name__ == "__main__":
#메인 함수
    #select = input("삽입(I)/추출(E)/확인(V)/종료(X) 중 하나를 선택 ==> ")

    #while select != 'X' and select != 'x':
    while True:
    #무한 반복
        menu = input("삽입(I)/추출(E)/확인(V)/종료(X) 중 하나를 선택 ==> ")
        #메뉴 입력
        if menu == 'I' or menu == 'i':
        #i를 입력 받으면
            data = input("입력할 데이터 ==> ")
            #데이터를 입력 받고
            push(data)
            #스택에 넣는다
            print("스택 상태 : ", stack)
            #현재 스택 상태 출력
        elif menu == 'E' or menu == 'e':
        #e를 입력 받으면
            data = pop()
            #데이터를 추출해 저장
            print("추출된 데이터 ==> ", data)
            #추출한 데이터 출력
            print("스택 상태 : ", stack)
            #현재 스택 상태 출력
        elif menu == 'V' or menu == 'v':
        #v를 입력받으면
            data = peek()
            #탑의 데이터 저장
            print("확인된 데이터 ==> ", data)
            #저장한 데이터 출력
            print("스택 상태 : ", stack)
            #현재 스택 상태 출력
        elif menu == 'X' or menu == 'x':
        #x를 입력 받으면
            break
            #종료
        else:
        #이 외의 입력은
            print("입력이 잘못됨")
            #다시 돌아간다



    print("프로그램 종료!")
