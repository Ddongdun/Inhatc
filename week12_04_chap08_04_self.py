## 함수 선언 부분 ##
class TreeNode:
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


## 전역 변수 선언 부분 ##
root = None
nameAry = ['블랙핑크', '레드벨벳', '마마무', '에이핑크', '걸스데이', '트와이스', '잇지', '여자친구']

## 메인 코드 부분 ##
node = TreeNode()
#루트 노드 생성
node.data = nameAry[0]
#노드의 데이터는 nameAry
root = node
#루트 노드 지정

for name in nameAry[1:]:
#루트 노드 이후 노드를 초기화 및 연결
    node = TreeNode()
    #루트 노드 생성
    node.data = name
    #노드의 데이터를 name에 저장

    current = root
    #루트 노드를 시작 노드로 지정
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
            #현재 노드의 왼쪽 노드로 이동
        else:
        #그렇지 않다면
            if current.right is None:
            #현재 노드의 오른쪽이 비었다면
                current.right = node
                #현재 노드의 오른쪽에 노드 지정
                break
                #탈출
            current = current.right
            #현재 노드의 오른쪽 노드로 이동

findName = input("찾는 아이돌 그룹은 ?")

current = root
#루트 노드를 시작 노드로 지정
while True:
#무한 반복
    if findName == current.data:
    #찾는 데이터가 현재 노드의 데이터라면
        print(findName, '을(를) 찾음.')
        #출력
        break
        #탈출
    elif findName < current.data:
    #찾는 데이터가 현재 노드의 데이터보다 작다면
        if current.left is None:
        #현재 노드의 왼쪽이 비었다면 
            print(findName, '이(가) 트리에 없음')
            #출력
            break
            #탈출
        current = current.left
        #현재 노드의 왼쪽 노드로 이동
    else:
    #그렇지 않다면
        if current.right is None:
        #현재 노드의 오른쪽이 비었다면
            print(findName, '이(가) 트리에 없음')
            #출력
            break
            #탈출
        current = current.right
        #현재 노드의 왼쪽 노드로 이동 
