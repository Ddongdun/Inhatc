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
#0번 데이터를 넣는다
root = node
#루트 노드로 지정

for name in nameAry[1:]:
#name을 nameAry의 1번부터 반복
    node = TreeNode()
    #트리 노드 생성
    node.data = name
    #데이터를 넣는다

    current = root
    #현재 노드를 루트로 지정
    while True:
    #무한반복
        if name < current.data:
        #데이터가 현재 데이터보다 작다면
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

print("이진 탐색 트리 구성 완료!")
