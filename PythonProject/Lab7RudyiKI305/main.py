import sys

# введення розміру квадратної матриці і перевірка на дійсність його
nRows = int(input("Введіть розмір квадратної матриці (не менше 3!): "))
if nRows < 3:
    print("Розмір матриці менше, ніж 3!!!")
    sys.exit()

# введення символа заповнювача квадратної матриці і первірка на те, чи він 1
symbol = input("Введіть символ-заповнювач: ")
if len(symbol) != 1:
    print("Потрібно ввести лише один символ!")
    sys.exit()
print()

arr = []
n = nRows
for i in range(nRows):
    if i < nRows and n > 0:
        arr.append([0 for i in range(n)])
        n -= 2;

temp  = 0
for i in range(len(arr)):
    for j in range(i):
        print(" ", end=" ")
    for j in range(len(arr[i])):
        arr[i][j]=symbol
        print(arr[i][j], end=" ")
    print()

for i in range(len(arr)):
    print()