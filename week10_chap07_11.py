## 함수 선언 부분 ##
def is_queue_full():
#큐가 꽉 차있는지 확인하는 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if (rear + 1) % SIZE == front:
    #꼬리값 + 1을 사이즈로 나눈 나머지가 머리값과 같다면
        return True
        #True 반환
    else:
    #그렇지 않다면
        return False
        #False 반환


def is_queue_empty():
#큐가 비어있는지 확인하는 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if front == rear:
    #머리값과 꼬리값이 같다면
        return True
        #True 반환
    else:
    #그렇지 않다면
        return False
        #False 반환


def enQueue(data):
#큐에 데이터를 삽입하는 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_full():
    #큐가 꽉 찼다면
        print("큐가 꽉 찼습니다.")
        #알려준다
        return None
        #넌 값 리턴
    rear = (rear + 1) % SIZE
    #꼬리 값 지정
    queue[rear] = data
    #데이터 삽입


def deQueue():
#데이터를 삭제하는 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_empty():
    #큐가 비어있다면
        print("큐가 비었습니다.")
        #알려준다
        return None
        #넌 값 반환
    front = (front + 1) % SIZE
    #머리값 지정
    data = queue[front]
    #큐의 데이터 저장
    queue[front] = None
    #데이터 삭제
    return data
    #저장한 데이터 반환


def peek():
#데이터 추출 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_empty():
    #큐가 비어있다면
        print("큐가 비었습니다.")
        #알려준다
        return None
        #넌 값 반환
    return queue[(front + 1) % SIZE]
    #데이터 반환


## 전역 변수 선언 부분 ##
SIZE = int(input("큐의 크기를 입력하세요 ==> "))
queue = [None for _ in range(SIZE)]
front = rear = 0

## 메인 코드 부분 ##
if __name__ == "__main__":
    while True:
        menu = input("삽입(I)/추출(E)/확인(V)/종료(X) 중 하나를 선택 ==> ")
        if menu == 'I' or menu == 'i':
            data = input("입력할 데이터 ==> ")
            enQueue(data)
            print("큐 상태 : ", queue)
        elif menu == 'E' or menu == 'e':
            data = deQueue()
            print("추출된 데이터 ==> ", data)
            print("큐 상태 : ", queue)
        elif menu == 'V' or menu == 'v':
            data = peek()
            print("확인된 데이터 ==> ", data)
            print("큐 상태 : ", queue)
        elif menu == 'X' or menu == 'x':
            break
        else:
            print("입력이 잘못됨")
    print("프로그램 종료!")
