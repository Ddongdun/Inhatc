## 함수 선언 부분 ##
import random


class TreeNode:
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


root_book, root_auth = None, None
#책 이름의 루트노드, 작가의 루트노드 지정
book_array = [['어린왕자', '쌩떽쥐베리'], ['이방인', '까뮈'], ['부활', '톨스토이'],
              ['신곡', '단테'], ['돈키호테', '세브반테스'], ['동물농장', '조지오웰'],
              ['데미안', '헤르만헤세'], ['파우스트', '괴테'], ['대지', '펄벅']]
random.shuffle(book_array)
#순서 변경

node = TreeNode()
#노드 생성
node.data = book_array[0][0]
#노드의 데이터는 0, 0으로 지정
root_book = node
#루트 노드로 지정

for book in book_array[1:]:
#book_array의 1번째부터 반복
    name = book[0]
    #book_array의 0행 데이터 지정
    node = TreeNode()
    #노드 생성
    node.data = name
    #데이터를다넣는다

    current = root_book
    #루트 노드부터 시작
    while True:
    #무한 반복
        if name < current.data:
        #데이터가 현재 노드의 데이터보다 작다면
            if current.left is None:
            #현재 노드의 왼쪽이 비었다면
                current.left = node
                #현재 노드의 왼쪽에 노드 지정
                break
                #탈출
            current = current.left
            #현재 노드의 왼쪽으로 이동
        else:
        #그렇지 않다면
            if current.right is None:
            #현재 노드의 오른쪽이 비었다면
                current.right = node
                #현재 노드의 오른쪽에 노드 지정
                break
                #탈출
            current = current.right
            #현재 노드의 오른쪽으로 이동

print(f"책 이름 트리 구성 완료! 루트 노드는 {root_book.data}")

node = TreeNode()
#노드 생성
node.data = book_array[0][1]
#노드의 데이터에 이름을 넣는다
root_auth = node
#루트 노드 지정

for book in book_array[1:]:
#book_array의 1번째부터 반복
    name = book[1]
    #book_array의 1행 데이터 지정
    node = TreeNode()
    #노드 생성
    node.data = name
    #데이터를 넣는다

    current = root_auth
    #루트 노드부터 시작
    while True:
    #무한반복
        if name < current.data:
        #데이터가 현재 노드의 데이터보다 작다면
            if current.left is None:
            #현재 노드의 왼쪽이 비었다면
                current.left = node
                #현재 노드의 왼쪽에 노드 지정
                break
                #탈출
            current = current.left
            #현재 노드의 왼쪽으로 이동
        else:
        #그렇지 않다면
            if current.right is None:
            #현재 노드의 오른쪽이 비었다면
                current.right = node
                #현재 노드의 오른쪽에 노드 지정
                break
                #탈출
            current = current.right
            #현재 노드의 왼쪽 노드로 이동

print(f"작가 이름 트리 구성 완료! 루트 노드는 {root_auth.data}")

while True:
    book_or_auth = int(input('책검색(1), 작가검색(2)-->'))
    if book_or_auth == 1:
        find_name = input('검색할 책-->')
        root = root_book
        break
    elif book_or_auth == 2:
        find_name = input('검색할 작가-->')
        root = root_auth
        break
    else:
        print("메뉴에서 골라주세요")

current = root
while True:
    if find_name == current.data:
        print(find_name, '을(를) 찾음.')
        break
    elif find_name < current.data:
        if current.left is None:
            print(find_name, '이(가) 목록에 없음')
            break
        current = current.left
    else:
        if current.right is None:
            print(find_name, '이(가) 목록에 없음')
            break
        current = current.right
