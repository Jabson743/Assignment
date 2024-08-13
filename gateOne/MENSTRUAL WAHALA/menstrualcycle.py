from datetime import datetime, timedelta

print("Welcome To The Menstrual Cycle Calculator")
print()

name = input("What Is Your Name: ")
print()

print("Hello", name, "You Are Welcome To Your Monthly Menstrual Cycle Calculator")
print()

print("Assumed Length Of Cycle Is Between 21 - 35 Days")
print()

last_flow_date = input("Enter The Date, Month And Year Of Your Last Menstrual Flow: ")
print()

last_flow_date = datetime.strptime(last_flow_date, "%d-%m-%Y")

cycle_length = int(input("Enter The Average Length Of Your Cycle In Days: "))
print()

next_menstrual_flow = last_flow_date + timedelta(days = cycle_length)

print("Your Next Menstrual Flow Starts On: ", next_menstrual_flow.strftime("%d-%m-%Y"))
print()

ovulation_date = next_menstrual_flow - timedelta(days = 14)

print("Your Ovulation Date Is: ", ovulation_date.strftime("%d-%m-%Y"))
print()

fertile_period_start = ovulation_date - timedelta(days = 7)

fertile_period_end = ovulation_date + timedelta(days = 2)

print("Your Fertile Period Is Between: ", fertile_period_start.strftime("%d-%m %Y"), "-", fertile_period_end.strftime("%d -%m- %Y") )
print()

safe_period_start = ovulation_date + timedelta(days = 5)

safe_period_end = next_menstrual_flow - timedelta(days = 5)

print("Your Safe Period Is Between: ", safe_period_start.strftime("%d-%m-%Y"), "-" , safe_period_end.strftime("%d -%m -%Y"))