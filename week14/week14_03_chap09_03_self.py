# week14_03_chap09_03_self.py
class Graph:
#그래프 클래스
    def __init__ (self, size):
    #함수 선언
        self.SIZE = size
        #사이즈
        self.graph = [[0 for _ in range(size)] for _ in range(size)]
        #사이즈 * 사이즈의 그래프 생성


G1 = None
#그래프를 그릴 변수
stack = []
#스택 배열
visited_ary = []
#방문한 정점 배열
name_ary = ['문별', '솔라', '휘인', '쯔위', '선미', '화사']
#정점 배열
moon, sola, hwee, zzwe, sumi, hwas = 0, 1, 2, 3, 4, 5
#정점 배열을 숫자에 비유


G1 = Graph(6)
#6*6 사이즈의 그래프를 만든다
G1.graph[moon][sola] = 1; G1.graph[moon][hwee] = 1
G1.graph[sola][moon] = 1; G1.graph[sola][zzwe] = 1
G1.graph[hwee][moon] = 1; G1.graph[hwee][zzwe] = 1
G1.graph[zzwe][sola] = 1; G1.graph[zzwe][hwee] = 1; G1.graph[zzwe][sumi] = 1#; G1.graph[zzwe][hwas] = 1
G1.graph[sumi][zzwe] = 1#; G1.graph[sumi][hwas] = 1
#G1.graph[hwas][zzwe] = 1; G1.graph[hwas][sumi] = 1
#그래프를 그린다


print('## G1 무방향 그래프 ##')
#출력
for row in range(G1.SIZE):
#G1의 행 만큼 반복
    for col in range(G1.SIZE):
    #G1의 열 만큼 반복
        print(G1.graph[row][col], end=' ')
        #그래프를 출력
    print()
    #빈 칸 출력

current = 0
#시작 정점 A
stack.append(current)
#스택에 추가
visited_ary.append(current)
#방문한 정점 배열에 추가
stack_monitor = []


while len(stack) != 0:
#스택에 아무것도 없을 때 까지
    next = None
    #다음 정점을 담을 변수
    for vertex in range(G1.SIZE):
    #그래프의 크기 만큼 반복
        if G1.graph[current][vertex] == 1:
        #그래프가 방문해야한다면
            if vertex in visited_ary:
            #방문한 적이 있는 정점이라면
                pass
                #탈출
            else:
            #방문한 적이 없으면
                next = vertex
                #다음 정점으로 지정
                break
                #탈출

    if next is not None:
    #다음에 방문할 정점이 있는 경우
        current = next
        #시작 정점을 저장한 정점으로 지정
        stack.append(current)
        #스택에 추가
        visited_ary.append(current)
        #방문한 정점 배열에 추가
        # stack_monitor.append(name_ary[current])
        # print(stack_monitor)
    else:
    #다음에 방문할 정점이 없는 경우
        current = stack.pop()
        #스택에서 팝을 이용해 정점을 지정
        print(name_ary[current], end=' ')
        #팝을 이용해 가져온 정점 출력


print('\n방문 순서 -->', end='')
for i in visited_ary:
    print(name_ary[i], end='   ')
    #print(i, end='   ')