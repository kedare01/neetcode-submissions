def concatenate(s1: str, s2: str) -> str:
    num=s1+s2

    if len(num) > 10:
    
        return "Too long!"
    return num



# do not modify below this line
print(concatenate("He", "llo"))
print(concatenate("Hello ", "world!"))
print(concatenate("Length", "of10"))
