# week14_02_chap09_03.py
class Graph:
#그래프 클래스
    def __init__(self, size):
    #함수
        self.SIZE = size
        #사이즈
        self.graph = [[0 for _ in range(size)] for _ in range(size)]
        #그래프 구성


G1 = None
#넌 값
stack = []
#스택
visited_ary = []
#방문한 정점

G1 = Graph(4)
#4*4 크기의 배열을 만든다
G1.graph[0][2] = 1; G1.graph[0][3] = 1
G1.graph[1][2] = 1
G1.graph[2][0] = 1; G1.graph[2][1] = 1; G1.graph[2][3] = 1
G1.graph[3][0] = 1; G1.graph[3][2] = 1
#그래프를 갔다온 경로를 1로 선언

print('## G1 무방향 그래프 ##')
#출력
for row in range(4):
#행 4줄
    for col in range(4):
    #열 4줄
        print(G1.graph[row][col], end=' ')
        #배열에 넣는다
    print()
    #출력

current = 0
#시작 정점 A
stack.append(current)
#스택에 추가
visited_ary.append(current)
#방문한 배열에 추가

while len(stack) != 0:
#스택에 아무것도 없을 때 까지 반복
    next = None
    #다음 정점
    for vertex in range(4):
    #정점을 하나씩 방문
        if G1.graph[current][vertex] == 1:
        #방문해야하는 정점이라면
            if vertex in visited_ary:
            #방문한 적이 있는 정점이면 탈락
                pass
                #패스
            else:
            #방문한 적이 없으면
                next = vertex
                #다음 정점을 방문하지 않은 정점으로 지정
                break
                #탈출

    if next is not None:
    #다음에 방문할 정점이 있는 경우
        current = next
        #시작 정점을 다음 정점으로 지정
        stack.append(current)
        #스택에 추가
        visited_ary.append(current)
        #방문한 배열에 추가
    else:
    # 다음에 방문할 정점이 없는 경우
        current = stack.pop()
        #스택에서 팝을해 시작 정점에 추가
        print(stack)


print('방문 순서 -->', end='')
for i in visited_ary:
#방문한 정점만큼 반복
    print(chr(ord('A')+i), end='   ')
    #변환 출력
    print(i, end='   ')
    #출력