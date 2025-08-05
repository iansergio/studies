import pyautogui, time

pyautogui.moveTo(1528, 545)

time.sleep(2)
x = 0
times = 100000000000000 # Change this to the number of times you want it to click

while True:
    if x == times:
        print("Stopped Clicking")
        break

    else:
        pyautogui.rightClick()
        x += 1