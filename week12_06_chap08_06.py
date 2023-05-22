## 함수 선언 부분 ##
import random


class TreeNode:
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


root_book, root_auth = None, None
book_array = [['어린왕자', '쌩떽쥐베리'], ['이방인', '까뮈'], ['부활', '톨스토이'],
              ['신곡', '단테'], ['돈키호테', '세브반테스'], ['동물농장', '조지오웰'],
              ['데미안', '헤르만헤세'], ['파우스트', '괴테'], ['대지', '펄벅']]
random.shuffle(book_array)

node = TreeNode()
node.data = book_array[0][0]
root_book = node

for book in book_array[1:]:
    name = book[0]
    node = TreeNode()
    node.data = name

    current = root_book
    while True:
        if name < current.data:
            if current.left is None:
                current.left = node
                break
            current = current.left
        else:
            if current.right is None:
                current.right = node
                break
            current = current.right

print(f"책 이름 트리 구성 완료! 루트 노드는 {root_book.data}")

node = TreeNode()
node.data = book_array[0][1]
root_auth = node

for book in book_array[1:]:
    name = book[1]
    node = TreeNode()
    node.data = name

    current = root_auth
    while True:
        if name < current.data:
            if current.left is None:
                current.left = node
                break
            current = current.left
        else:
            if current.right is None:
                current.right = node
                break
            current = current.right

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
