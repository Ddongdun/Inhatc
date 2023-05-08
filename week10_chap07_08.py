## 함수 선언 부분 ##
def is_queue_full():
#큐가 꽉 찼을때
    global SIZE, queue, front, rear
    #전역 변수 선언
    if rear != SIZE - 1:
    #큐의 뒷쪽이 비었을 때
        return False
        #False 반환
    elif rear == SIZE - 1 and front == -1:
    #큐가 꽉 찼을 때
        return True
        #True 반환
    else:
    # 앞쪽이 비었을 때
        for i in range(front + 1, SIZE):
        #
            queue[i - 1] = queue[i]
            queue[i] = None
        front -= 1
        rear -= 1
        return False


def is_queue_empty():
    global SIZE, queue, front, rear
    if front == rear:
        return True
    else:
        return False


def enQueue(data):
#큐 데이터 삽입
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_full():
    #큐가 꽉 찼다면
        print("큐가 꽉 찼습니다.")
        #알려준다
        return None
        #넌 값 리턴
    rear += 1
    #rear값 + 1
    queue[rear] = data
    #큐에 데이터를 넣어준다


def deQueue():
#큐 데이터 삭제
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_empty():
    #큐가 비어있다면
        print("큐가 비었습니다.")
        #알려준다
        return None
        #넌 값 반환
    front += 1
    #front 값 + 1
    data = queue[front]
    #삭제할 데이터를 저장
    queue[front] = None
    #데이터 삭제
    return data
    #데이터 반환


def peek():
#맨 앞 데이터를 알려주는 함수
    global SIZE, queue, front, rear
    #전역 변수 선언
    if is_queue_empty():
    #큐가 비어있다면
        print("큐가 비었습니다.")
        #알려준다
        return None
        #넌 값 반환
    return queue[front + 1]
    #데이터 반환


## 전역 변수 선언 부분 ##
SIZE = int(input("큐의 크기를 입력하세요 ==> "))
queue = [None for _ in range(SIZE)]
front = rear = -1

## 메인 코드 부분 ##
if __name__ == "__main__":
    select = input("삽입(I)/추출(E)/확인(V)/종료(X) 중 하나를 선택 ==> ")

    while select != 'X' and select != 'x':
        if select == 'I' or select == 'i':
            data = input("입력할 데이터 ==> ")
            enQueue(data)
            print("큐 상태 : ", queue)
        elif select == 'E' or select == 'e':
            data = deQueue()
            print("추출된 데이터 ==> ", data)
            print("큐 상태 : ", queue)
        elif select == 'V' or select == 'v':
            data = peek()
            print("확인된 데이터 ==> ", data)
            print("큐 상태 : ", queue)
        else:
            print("입력이 잘못됨")

        select = input("삽입(I)/추출(E)/확인(V)/종료(X) 중 하나를 선택 ==> ")

    print("프로그램 종료!")
