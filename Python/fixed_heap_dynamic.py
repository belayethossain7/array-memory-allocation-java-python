 # c) Fixed Heap Dynamic
class HeapArray:
    def __init__(self):
        self.arr = [i * 10 for i in range(5)]
    def show(self):
        for i in self.arr:
            print(i)

h = HeapArray()
h.show()

