> The two oldest ages function/method needs to be completed. It should take an array of numbers as its argument and return the two highest numbers within the array. The returned value should be an array in the format [second oldest age, oldest age].
>
> The order of the numbers passed in could be any order. The array will always include at least 2 items.
>
> For example:
> ```
> two_oldest_ages([1, 3, 10, 0]) # should return [3, 10]
> ```
>

- Python3
```py
def two_oldest_ages(ages):
    return sorted(ages)[-2:]
```

python 문법을 다 까먹어서 python문법 연습삼아 풀이
 - `.sort()` 는 None을 return 하므로 `sorted(xxx)` 를 사용
 - `[-2:]` len를 입력할 필요 없이 -2를 입력하면 len-2