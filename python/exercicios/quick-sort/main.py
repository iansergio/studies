# Roda localmente, ou seja, não precisa de criar uma nova lista o que o torna muito eficiente em relacao a espaço

def quicksort(array):
    if len(array) <= 1:
        return array
    
    pivot = array[0]
    left = []
    right = []
    
    for num in array[1:]:
        if num < pivot:
            left.append(num)
        else:
            right.append(num)
        print(left,right)
        
    return quicksort(left) + [pivot] + quicksort(right)

arr = [4, 7, 2, 6, 4, 1, 8, 3]
print(quicksort(arr))