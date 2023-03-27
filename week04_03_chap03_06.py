#week04_02_chap03_05_self
# 지수가 큰 경우 별도의 지수를 담는 리스트를 추가
## 함수 선언 부분 ##
def print_poly(f_x):
    """
    다항식 문자열 출력(display)함수
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트
    :return: 다항식 문자열
    """
    term = len(f_x) - 1  # 최고차항 숫자 = 배열길이-1
    poly_str = "P(x) = "  # 배열에 있는 값을 다항식으로 변환 후 출력

    for i in range(len(fx)):
        coef = f_x[i]  # 계수
        term = t_x[i]

        if coef >= 0:  # 계수가 양수이면서 동시가 i가 0이 아닐때
            poly_str = poly_str + "+"  # 부호를 붙여 양수로 만든다
        poly_str = poly_str + f"{coef}x^{term} "

    return poly_str  # 결과 값 반환


def calc_poly(x_Value, t_x, f_x):
    """
    다항식 산술 연산 함수
    :param x_Value: 독립 변수 정수 x (입력 값)
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트
    :param t_x: 정수 타입의 계수를 원소로 하는 리스트
    :return: 다항식 산술 연산 계산 값
    """
    ret_value = 0

    for i in range(len(fx)):
        coef = f_x[i]  # 계수
        term = t_x[i]
        ret_value += coef * x_Value ** term  # 항의 값 계산해서 변수에 더해준다
        term = term - 1  # 다음 차항

    return ret_value


## 전역 변수 선언 부분 ##
fx = [1, 7, -2]  # = 7x^3 -4x^2 +0x^1 +5x^0
tx = [20, 3, 1]

## 메인 코드 부분 ##
if __name__ == "__main__":
    help(print_poly)
    print(print_poly(tx, fx))

    x = int(input("X 값 : "))

    print(calc_poly(x, tx, fx))


