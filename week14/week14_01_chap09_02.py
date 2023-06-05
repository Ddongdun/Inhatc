class Graph:
    def __init__ (self, size):
        self.SIZE = size
        self.graph = [[0 for _ in range(size)] for _ in range(size)]


def print_graph(g):
    print('  ', end=' ')
    for v in range(g.SIZE):
        print(name_ary[v], end=' ')
    print()
    for row in range(g.SIZE):
        print(name_ary[row], end=' ')
        for col in range(g.SIZE):
            print(g.graph[row][col], end='   ')
        print()
    print()


G1 = None
name_ary = ['문별', '솔라', '휘인', '쯔위', '선미', '화사']
moon, sola, hwee, zzwe, sumi, hwas = 0, 1, 2, 3, 4, 5


## 메인 코드 부분 ##
gSize = 6
G1 = Graph(gSize)
G1.graph[moon][sola] = 1; G1.graph[moon][hwee] = 1
G1.graph[sola][moon] = 1; G1.graph[sola][zzwe] = 1
G1.graph[hwee][moon] = 1; G1.graph[hwee][zzwe] = 1
G1.graph[zzwe][sola] = 1; G1.graph[zzwe][hwee] = 1; G1.graph[zzwe][sumi] = 1; G1.graph[zzwe][hwas] = 1
G1.graph[sumi][zzwe] = 1; G1.graph[sumi][hwas] = 1
G1.graph[hwas][zzwe] = 1; G1.graph[hwas][sumi] = 1

print('## G1 무방향 그래프 ##')
print_graph(G1)
