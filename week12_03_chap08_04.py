## 함수 선언 부분 ##
class TreeNode:
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


## 전역 변수 선언 부분 ##
root = None
nameAry = ['블랙핑크', '레드벨벳', '마마무', '에이핑크', '걸스데이', '트와이스']

## 메인 코드 부분 ##
node = TreeNode()
#트리 노드 생성
node.data = nameAry[0]
#0번 데이터를 집어 넣는다
root = node
#루트로 지정

for name in nameAry[1:]:
#어레이 1번부터 반복
    node = TreeNode()
    #트리 노드 생성
    node.data = name
    #노드에 데이터를 넣는다
    current = root
    #현재노드를 루트노드로 지정
    while True:
    #무한반복 
        if name < current.data:
        #넣을 데이터가 현재 노드의 데이터보다 작다면
            if current.left is None:
            #현재 노드의 왼쪽이 비었다면
                current.left = node
                #왼쪽에 넣는다
                break
                #탈출
            current = current.left
            #현재 노드의 왼쪽 노드로 이동
        else:
        #그렇지 않다면
            if current.right is None:
            #현재 노드의 오른쪽이 비었다면
                current.right = node
                #오른쪽에 넣는다
                break
                #탈출
            current = current.right
            #현재 노드의 오른쪽 노드로 이동

findName = '트와이스'
#찾을 노드의 데이터

current = root
#현재노드를 루트노드로 지정
while True:
#무한반복
    if findName == current.data:
    #찾을 데이터가 현재 노드의 데이터와 같다면
        print(findName, '을(를) 찾음.')
        #알려준다
        break
        #탈출
    elif findName < current.data:
    #찾을 데이터가 현재 노드의 데이터보다 작다면
        if current.left is None:
        #현재 노드의 왼쪽이 비었다면
            print(findName, '이(가) 트리에 없음')
            #찾을 수 없음
            break
            #탈출
        current = current.left
        #현재 노드의 왼쪽 노드로 이동
    else:
    #그렇지 않다면
        if current.right is None:
        #현재 노드의 오른쪽이 비었다면
            print(findName, '이(가) 트리에 없음')
            #찾을 수 없음
            break
            #탈출
        current = current.right
        #현재 노드의 오른쪽 노드로 이동
