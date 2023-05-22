def factorial_repetition(n: int) -> int:
    """
    팩토리얼 계산 함수
    :param n: 정수
    :return: 정수, n!
    """
    result = 1
    for i in range(2, n + 1):
        result = result * i
    return result


def factorial_recursion(n: int) -> int:
    """
    팩토리얼 계산 함수(재귀)
    :param n:  정수
    :return:  정수, n!
    """
    if n == 1:
    # n이 1이라면
        return 1
        #1 반환
    else:
    #그렇지 않다면
        return n * factorial_recursion(n - 1)
        #재귀함수로 팩토리얼 계산


if __name__ == "__main__":
    number = int(input("정수 입력 : "))
    print(factorial_recursion(number))
    print(factorial_repetition(number))
