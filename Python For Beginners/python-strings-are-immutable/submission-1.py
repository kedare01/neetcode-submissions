def remove_fourth_character(word: str) -> str:
    word_4=word[:3]
    word_n=word[4:]
    return word_4+word_n

# do not modify below this line
print(remove_fourth_character("NeetCode"))
print(remove_fourth_character("Hello"))
