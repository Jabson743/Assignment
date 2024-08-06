print("Welcome To Semicolon MBTI Personality Test.")

name = input("What is your name: ")

number = int(input("Press 1 to start: "))

for number in range(1, 21):

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

		case 3:
			print("Question 3.")
			print("When planning a weekend, do you lean towards social plans with friends or quiet time for yourself?")
			print("A. Social plans with friends")
			print("B. Quiet time for yourself")

			answer3 = input()

			if(answer3 == "A"):
				print("A. Social plans with friends")

			elif(answer2 == "B"):
				print("B. Quiet time for yourself")

			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 4:
			print("Question 4")
			print("How do you feel about small tasks?")
			print("A. Enjoy it and find it easy to engage in")
			print("B. Find it somewhat akward or draining")

			answer4 = input()

			if(answer4 == "A"):
				print("A. Enjoy it and find it easy to engage in")

			elif(answer4 == "B"):
				print("B. Find it somewhat akward or draining")

			else:
				print("Invalid option. Please select 'A' or 'B'.")


		case 5: 
			print("Question 5")
			print("How do you feel about routine and predictability?")
			print("A. Prefer routine and find comfort in predictability")
			print("B. Dislike routine and enjoy spontaneity")

			answer5 = input()

			if(answer5 == "A"):
				print("A. Prefer routine and find comfort in predictability")
			
			elif(answer5 == "B"):
				print("B. Dislike routine and enjoy spontaneity")

			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 6:
			print("Question 6")
			print("How do you receive information?")
			print("A. Clear and straightforward explanations")
			print("B. Rich with possibilities and potentials connections")

			answer6 = input()

			if(answer6 == "A"):
				print("A. Clear and straightforward explanations")
			
			elif(answer5 == "B"):
				print("B. Rich with possibilities and potentials connections")

			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 7:
			print("Question 7")
			print("How do handle new and unfamiliar situations?")
			print("A. Embrace them with enthusiams")
			print("B. Approach them with caution")

			answer7 = input()

			if(answer7 == "A"):
				print("A. Embrace them with enthusiams")
			
			elif(answer5 == "B"):
				print("B. Approach them with caution")

			else:
				print("Invalid option. Please select 'A' or 'B'.")














	