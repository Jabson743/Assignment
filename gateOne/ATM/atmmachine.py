amount = 0.0
balance = 0.0
current_balance = 0.0

print("Welcome To GT Bank. Banking At Your Convenience.")

print("Create An Account")
first_name = input("Enter Your First Name: ")
last_name = input("Enter Your Last Name: ")
pin_number = input("Enter Your Pin: ")

#print("Pin Created. You Now Have Access To Your Account.")
#print("Dear", first_name, last_name, "Your Account Is Successfully Created")



choice = 1
stopper = True
while (True):
    choices = """
    1. View Account Details
    2. Deposit Money
    3. Withdraw Money
    4. Check Account Balance
    5. Transfer
    6. Change Pin
    7. Close Account
    99. ExitApp
    """
    print(choices)
    choice = input("Press 1 To Get Started Oor (-1) To Quit): ")
    if choice == "-1":
        break;

match choices:
	case 1: 
		print("FirstName: ", first_name)
		print("LastName: ", last_name)
		print("Welcome", first_name, last_name, "To GT Bank")



	