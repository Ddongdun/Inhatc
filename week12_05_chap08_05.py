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
root = node

for name in nameAry[1:]:
#루트 노드 이후 노드를 초기화 및 연결
    node = TreeNode()
    node.data = name

    current = root
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

delete_name = input("삭제할 아이돌 그룹은 ?")

current = root
#루트 노드부터 시작
parent = None
#부모 노드는 넌 값
while True:
#무한 반복
    if delete_name == current.data:
    #삭제할 데이터와 현재 노드의 데이터가 같다면
        if current.left is None and current.right is None:
        #현재 노드의 왼쪽과 오른쪽이 모두 비어있다면
            if parent.left == current:
            #부모 노드의 왼쪽이 현재 노드라면
                parent.left = None
                #왼쪽 노드 삭제
            else:
            #오른쪽 이라면
                parent.right = None
                #오른쪽 노드 삭제
            del current
            #노드 삭제

        elif current.left is not None and current.right is None:
        #현재 노드의 왼쪽이 비어있지 않고 오른쪽이 비어있다면
            if parent.left == current:
            #부모 노드의 왼쪽이 현재 노드라면
                parent.left = current.left
                #부모 노드의 왼쪽과 현재 노드의 왼쪽을 연결한다
            else:
            #그렇지 않다면
                parent.right = current.left
                #부모 노드의 오른쪽과 현재 노드의 오른쪽을 연결한다
            del current
            #노드 삭제

        elif current.left is None and current.right is not None:
        #현재 노드의 왼쪽이 비어있고 오른쪽이 비어있지않다면   
            if parent.left == current:
            #부모 노드의 왼쪽이 현재 노드라면
                parent.left = current.right
                #부모 노드의 왼쪽과 현재 노드의 오른쪽 노드를 연결한다
            else:
            #그렇지 않다면
                parent.right = current.right
                #부모 노드의 오른쪽과 현재 노드의 오른쪽을 연결한다
            del current
            #노드 삭제

        print(delete_name, '이(가) 삭제됨.')
        #자식 노드가 2인 경우 삭제는 되나 트리가 두개로 나뉘어져 버림
        break
    elif delete_name < current.data:
        if current.left is None:
            print(delete_name, '이(가) 트리에 없음')
            break
        parent = current
        current = current.left
    else:
        if current.right is None:
            print(delete_name, '이(가) 트리에 없음')
            break
        parent = current
        current = current.right
