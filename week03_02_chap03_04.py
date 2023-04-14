# week03_02_chap03_04

def add_data(friend):
    katok.append(None)
    #배열 맨 뒤 빈칸 추가
    katok[len(katok) - 1] = friend
    #배열 맨 뒤에 빈칸을 추가해 길이가 1씩 늘어났으므로 -1을 해서 넣어준다


def insert_data(position, friend):
    if position < 0 or position > len(katok):
    #넣을 위치가 0보다 작고 배열보다 크면
        print("데이터를 삽입할 범위를 벗어났습니다.")
        return

    katok.append(None)
    #배열 맨 뒤 빈칸 추가

    for i in range(len(katok) - 1, position, -1):
    #배열 맨 뒤에 빈칸을 추가했으므로 -1만큼 시작, 원하는 자리가 나올때까지 -1씩 줄이면서 반복
        katok[i] = katok[i - 1]
        #뒤로 한칸씩 땡겨준다
        katok[i - 1] = None
        #땡기고 빈 자리는 남긴다

    katok[position] = friend
    #원하는 자리에 넣는다
    #맨 끝에 데이터가 들어갈 경우 포문은 동작하지 않는다


def delete_data(position):
    if position < 0 or position > len(katok):
    #삽입할 위치가 0보다 작고 배열보다 크다면
        print("데이터를 삭제할 범위를 벗어났습니다.")
        return

    k_len = len(katok)
    #배열의 길이 저장
    katok[position] = None  
    #삭제를 원하는 곳의 데이터 삭제

    for i in range(position + 1, k_len):
    #삭제된 데이터의 다음위치부터 배열의 크기만큼 반복
        katok[i - 1] = katok[i]
        #앞으로 한칸씩 당겨준다
        katok[i] = None  
        #남는 칸은 빈칸으로 남겨둔다
        

    del (katok[k_len - 1])
    #맨 마지막 칸 삭제


katok = list()

if __name__ == "__main__":
    while True:
        menu = input("선택하세요(1: 추가, 2: 삽입, 3: 삭제, 4: 종료)--> ")

        if menu == "1":
            data = input("추가할 데이터--> ")
            add_data(data)
            print(katok)
        elif menu == "2":
            pos = int(input("삽입할 위치--> "))
            data = input("추가할 데이터--> ")
            insert_data(pos, data)
            print(katok)
        elif menu == "3":
            pos = int(input("삭제할 위치--> "))
            delete_data(pos)
            print(katok)
        elif menu == "4":
            print(katok)
            break
        else:
            print("1~4 중 하나를 입력하세요.")
