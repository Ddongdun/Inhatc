class TreeNode():
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


node1 = TreeNode()
node1.data = '화사'

node2 = TreeNode()
node2.data = '솔라'
node1.left = node2

node3 = TreeNode()
node3.data = '문별'
node1.right = node3

node4 = TreeNode()
node4.data = '휘인'
node2.left = node4

node5 = TreeNode()
node5.data = '쯔위'
node2.right = node5

node6 = TreeNode()
node6.data = '선미'
node3.left = node6

node7 = TreeNode()
node7.data = '해린'
node3.right = node7

node8 = TreeNode()
node8.data = '윈터'
node4.left = node8


def preorder(node):
#전위 순회
    if node is None:
    #노드가 비었다면
        return
        #리턴
    print(node.data, end='->')
    #노드 데이터 출력
    preorder(node.left)
    #왼쪽 데이터 진입
    preorder(node.right)
    #오른쪽 데이터 진입


def inorder(node):
#중위 순회
    if node is None:
    #노드가 비었다면
        return
        #리턴
    inorder(node.left)
    #왼쪽 데이터 진입
    print(node.data, end='->')
    #노드 데이터 출력
    inorder(node.right)
    #오른쪽 데이터 진입


def postorder(node):
#후위 순회
    if node is None:
    #노드가 비었다면
        return
        #리턴
    postorder(node.left)
    #왼쪽 데이터 진입
    postorder(node.right)
    #오른쪽 데이터 진입
    print(node.data, end='->')
    #노드 데이터 출력


print(node1.data, end=' ')
print()
print(node1.left.data, node1.right.data, end=' ')
print()
print(node1.left.left.data, node1.left.right.data, node1.right.left.data, node1.right.right.data, end=' ')
print()
print(node1.left.left.left.data, end='')
print()

print('전위 순회 : ', end='')
preorder(node1)
print('끝')

print('중위 순회 : ', end='')
inorder(node1)
print('끝')

print('후위 순회 : ', end='')
postorder(node1)
print('끝')
