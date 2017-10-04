# Created by: Jenny Trac
# Group members: Malcolm, Gavin
# Created on: Oct 3 2017
# This program asks you to the guess the number it's thinking

import ui

GUESS_THIS_NUMBER = 5

def guess_the_number_touch_up_inside(sender):
    # function checks if the number you guessed is right
    
    # input
    input_number = int(view['number_textfield'].text)
    
    # process
    if input_number == GUESS_THIS_NUMBER:
        view['answer_label'].text = "You guessed it right!"

view = ui.load_view()
view.present('sheet')
