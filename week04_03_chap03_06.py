# week04_03_chap03_06

def print_poly(t_x, f_x):
    """
    다항식 문자열 출력(display) 함수.
    :param t_x: 정수 타입의 지수를 원소로 하는 리스트(배열)
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트(배열)
    :return: 다항식 문자열
    """
    poly_str = "F(x) = "

    for i in range(len(fx)):
        coef = f_x[i]
        term = t_x[i]

        if coef >= 0:
            poly_str = poly_str + "+"
        poly_str = poly_str + f"{coef}x^{term} "

    return poly_str


def calc_poly(x_value, t_x, f_x):
    """
    다항식 산술 연산 함수
    :param x_value: 독립 변수 정수 x (입력 값)
    :param t_x: 정수 타입의 지수를 원소로 하는 리스트(배열)
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트(배열)
    :return: 다항식 산술 연산 계산 값, 정수
    """
    ret_value = 0

    for i in range(len(fx)):
        coef = f_x[i]
        term = t_x[i]

        ret_value = ret_value + coef * x_value ** term

    return ret_value

tx = [20, 3, 1]
fx = [1, 7, -2]  # F(x) = +1x^20 +7x^3 -2x^1

if __name__ == "__main__":
    print(print_poly(tx, fx))

    x = int(input("X 값 : "))
    print(calc_poly(x, tx, fx))

