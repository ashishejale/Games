print("Hello Player! Welcome to my first text based game!")

play = input("Do you want to play? (Yes/No)").lower()

if play == "yes":
    print("Lets begin...")

    name = input("What is your name? ")
    age = int(input("Ok, how old are you? "))

    if age >= 18:

        left_or_right = input(
            "Now, first choice! You are stranded in a forest... you see two paths in the clearing. Where do you want to go?(Left/Right) ").lower()
        if left_or_right == "left":
            print("You follow the left path and wild monkeys start chasing after you...  They catch up and attack you! You lose trail and are injured.. You lose! ")

        else:
            eat_or_not = input(
                "Taking the right path you reach a meadow with some berry bushes! Do you want to stop for a snack?(Yes/No) ").lower()
            if eat_or_not == "no":
                around_or_across = input(
                    "You are not hungry so you move on. After a while you see a large lake! Do you swin across or you walk around the lake? (Around/Across) ").lower()
                if around_or_across == "around":
                    print("After reaching the other side of lake you see a small village not so far away. You go there and ask for help. The vilagers are kind and help you.")
                    print("CONGRACTULATIONS...!!! You survived... You won!")
                else:
                    print(
                        "While swimming across the lake you were bitten by something. You lose conciousness and drown. You lose..!")

            else:
                print("Your stomach hurts! The berries must be poisonous. you lose...!")
    elif age < 18:
        print("You are not old enugh to play this game,",
              name, ". You need to be at leaast 18 years old!")
else:
    print("Ok, maybe some other time!")
