def add_two_numbers() -> int:
    nums = input()
    lst = list(map(lambda x: int(x), nums.split(",")))
    return lst[0]+lst[1]



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
