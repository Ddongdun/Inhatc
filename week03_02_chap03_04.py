# week03_02_chap03_04

def add_data(friend):
    katok.append(None)
    katok[len(katok) - 1] = friend


def insert_data(position, friend):
    if position < 0 or position > len(katok):
        print("데이터를 삽입할 범위를 벗어났습니다.")
        return

    katok.append(None)

    for i in range(len(katok) - 1, position, -1):
        katok[i] = katok[i - 1]
        katok[i - 1] = None

    katok[position] = friend


def delete_data(position):
    if position < 0 or position > len(katok):
        print("데이터를 삭제할 범위를 벗어났습니다.")
        return

    k_len = len(katok)
    katok[position] = None  # 데이터 삭제

    for i in range(position + 1, k_len):
        katok[i - 1] = katok[i]
        katok[i] = None  # 배열의 제일 위치 삭제

    del (katok[k_len - 1])


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
