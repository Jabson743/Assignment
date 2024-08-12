print("Welcome To Semicolon MBTI Personality Test.")

name = input("What is your name: ")

number = int(input("Press 1 to start: "))

count = 0

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
				count +=1 

			elif(answer1 == "B"):
				print("Tend to work better under pressure and close to the deadlines")
				count += 1
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
				count += 1
			elif(answer2 == "B"):
				print("B. Contribute ideas and theories")
				count += 1
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
				count += 1
			elif(answer2 == "B"):
				print("B. Quiet time for yourself")
				count += 1
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
				count += 1
			elif(answer4 == "B"):
				print("B. Find it somewhat akward or draining")
				count += 1
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
				count += 1
			elif(answer5 == "B"):
				print("B. Dislike routine and enjoy spontaneity")
				count += 1
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
				count += 1			
			elif(answer5 == "B"):
				print("B. Rich with possibilities and potentials connections")
				count += 1
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
				count += 1
			elif(answer5 == "B"):
				print("B. Approach them with caution")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 8:
			print("Question 8")
			print("Qusetion 8. What do you do when your plans suddenly change?")
			print("A. Dislike unexpected changes and prefer to stick to the original plan")
			print("B. Adapt well to unexpected changes and enjoy the flexibility")

			answer8 = input()

			if(answer8 == "A"):
				print("A. Dislike unexpected changes and prefer to stick to the original plan")
				count += 1			
			elif(answer8 == "B"):
				print("B. Adapt well to unexpected changes and enjoy the flexibility")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 9:
			print("Question 9")
			print("Qusetion 9. How do you approach problem-solving?")
			print("A. Practical, actionable ideas")
			print("B. Imaginative, out-of-the-box concept")

			answer9 = input()

			if(answer9 == "A"):
				print("A. Practical, actionable ideas")
				count += 1			
			elif(answer9 == "B"):
				print("B. Imaginative, out-of-the-box concept")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 10:
			print("Question 10")
			print("Qusetion 10. How do you make decisions?")
			print("A. Based on practical considerations and real-world implications")
			print("B. Consider potential outcomes and future possiblities")

			answer10 = input()

			if(answer10 == "A"):
				print("A. Based on practical considerations and real-world implications")
				count += 1
			elif(answer10 == "B"):
				print("B. Consider potential outcomes and future possiblities")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")


		case 11:
			print("Question 11")
			print("Qusetion 11. How do handle new and unfamiliar situations?")
			print("A. Embrace them with enthusiams")
			print("B. Approach them with caution")

			answer11 = input()

			if(answer11 == "A"):
				print("A. Embrace them with enthusiams")
				count += 1			
			elif(answer11 == "B"):
				print("B. Approach them with caution")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 12:
			print("Question 12")
			print("Qusetion 12. When making decisions, do you rely more on your own insticts and feelings or seek input from others?")
			print("A. Rely on own instincts and feelings")
			print("B. Seek input from others")

			answer12 = input()

			if(answer12 == "A"):
				print("A. Rely on own instincts and feelings")
				count += 1			
			elif(answer12 == "B"):
				print("B. Seek input from others")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 13:
			print("Question 13")
			print("Qusetion 13. How do you typically recharge after a busy day?")
			print("A. Spending time with friends or engaging in a social activities")
			print("B. Having some alone time to relax and unwind")

			answer13 = input()

			if(answer13 == "A"):
				print("A. Spending time with friends or engaging in a social activities")
				count += 1			
			elif(answer13 == "B"):
				print("B. Having some alone time to relax and unwind")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 14:
			print("Question 14")
			print("Qusetion 14. When making decisions, what holds more weight for you?")
			print("A. Objective data and analysis")
			print("B. Personal values and the impact on people")

			answer14 = input()

			if(answer14 == "A"):
				print("A. Objective data and analysis")
				count += 1			
			elif(answer14 == "B"):
				print("B. Personal values and the impact on people")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 15:
			print("Question 15")
			print("Qusetion 15. How do you approach conflict resolution?")
			print("A. Focus on finding logical solutions and compromises")
			print("B. Positive and supportive team culture")

			answer15 = input()

			if(answer15 == "A"):
				print("A. Focus on finding logical solutions and compromises")
				count += 1			
			elif(answer15 == "B"):
				print("B. Positive and supportive team culture")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 16:
			print("Question 16")
			print("Qusetion 16. How do you cope with stress or pressure?")
			print("A. Analyse the situation logically and strategize a plan")
			print("B. Seek emotional support and consider the impact on relationships")

			answer16 = input()

			if(answer16 == "A"):
				print("A. Analyse the situation logically and strategize a plan")
				count += 1			
			elif(answer16 == "B"):
				print("B. Seek emotional support and consider the impact on relationships")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")


		case 17:
			print("Question 17")
			print("Qusetion 16. How do you approach work tasks?")
			print("A. Like to have a set plan and follow it step by step")
			print("B. Go with the flow and see where it takes you")

			answer17 = input()

			if(answer17 == "A"):
				print("A. Like to have a set plan and follow it step by step")
				count += 1			
			elif(answer17 == "B"):
				print("B. Go with the flow and see where it takes you")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 18:
			print("Question 18")
			print("Qusetion 18. How do you approach work tasks?")
			print("A. Enjoy it and find it easy to engage in")
			print("B. Find it somewhat akward or draining")

			answer18 = input()

			if(answer18 == "A"):
				print("A. Enjoy it and find it easy to engage in")
				count += 1			
			elif(answer18 == "B"):
				print("B. Find it somewhat akward or draining")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")

		case 19:
			print("Question 19")
			print("Qusetion 19. How do you feel about making plans and sticking to a schedule?")
			print("A. Enjoy making plans and prefer a structured schedule")
			print("B. Prefer flexibility and spontaneity, dislike strict schedule")

			answer19 = input()

			if(answer19 == "A"):
				print("A. Enjoy making plans and prefer a structured schedule")
				count += 1			
			elif(answer19 == "B"):
				print("B. Prefer flexibility and spontaneity, dislike strict schedule")
				count += 1
			else:
				print("Invalid option. Please select 'A' or 'B'.")









	