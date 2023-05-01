def is_stack_full() -> bool:
    global SIZE, stack, top
    if top >= SIZE - 1:
        return True
    else:
        return False


def is_stack_empty() -> bool:
    global SIZE, stack, top
    if top == -1:
        return True
    else:
        return False


def pop() -> str:
    global SIZE, stack, top
    if is_stack_empty():
        print("스택이 비었습니다.")
        return None
    data = stack[top]
    stack[top] = None
    top = top - 1
    return data


def push(data):
    global SIZE, stack, top
    if (is_stack_full()):
        print("스택이 꽉 찼습니다.")
        return
    top = top + 1
    stack[top] = data


def peek() -> str:
    global SIZE, stack, top
    if is_stack_empty():
        print("스택이 비었습니다.")
        return None
    return stack[top]


SIZE = 5
stack = ["커피", None, None, None, None]
top = 0

print(stack)
print(peek())
print(stack)
