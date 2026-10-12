def add_two_numbers() -> int:
    sum=input()
        
    lst = list(map(lambda x: int(x),sum.split(",")))

    return lst[0]+lst[1]



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
