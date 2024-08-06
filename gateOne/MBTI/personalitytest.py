print("Welcome To Semicolon MBTI Personality Test.")

name = input("What is your name: ")

number = int(input("Enter a number from 1 to 20"))

match(number):

	case 1:
		print("Question 1.")
		print("How do you approach deadlines?")
		print("A. Work diligently to meet deadlines well in advance")
		print("B. Tend to work better under pressure and close to the deadlines")

		answer1 = input()

		if(answer1 == "A"):
			print("A. Work diligently to meet deadlines well in advance")

		elif(answer1 == "B"):
			print("Tend to work better under pressure and close to the deadlines")

		else:
			print("Invalid option. Please select 'A' or 'B'.")

	case 2:
		print("Question 2.")
		print("In a group of discussion, do you prefer to stick to the facts and details or contribute ideas and theories?")
		print("A. Stick to facts and details")
		print("B. Contribute ideas and theories")
		
		answer2 = input()

		if(answer2 == "A"):
			print("A. Stick to facts and details")

		elif(answer2 == "B"):
			print("B. Contribute ideas and theories")

		else:
			print("Invalid option. Please select 'A' or 'B'.")


		