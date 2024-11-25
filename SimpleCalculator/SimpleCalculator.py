
# This is a simple calculator that can perform addition, subtraction, multiplication, and division on the terminal.
# Program is executed on the terminal using python SimpleCalculator.py
class SimpleCalculator:

    def addition(x, y):
        return x + y
    def subtraction(x, y):
        return x - y
    def multiplication(x, y):
        return x * y
    def division(x, y):
        return x / y 

def main():
    while True:
        print("\nSelect an operation:")
        print("+ (Addition)")
        print("- (Subtraction)")
        print("* (Multiplication)")
        print("/ (Division)")
        print("q (Quit)\n")

        op = input("Enter your choice: ")

        if op == 'q':
            print("Quitting program. Thank you for your service.\n")
            return

        if op not in ['+', '-', '*', '/']:
            print("Invalid input. Please choose an operation from those that are given.")
            continue

        try:

            x = float(input("Enter the first number: "))
            y = float(input("Enter the second number: "))

            if op == '+':
                print("The answer is", round(SimpleCalculator.addition(x, y), 7))
            elif op == '-':
                print("The answer is", round(SimpleCalculator.subtraction(x, y), 7))
            elif op == '*':
                print("The answer is", round(SimpleCalculator.multiplication(x, y), 7))
            elif op == '/':
                if y == 0:
                    print("Not applicable; cannot divide by 0")
                    continue
                print("The answer is", round(SimpleCalculator.division(x, y), 7))
        except ValueError:
            print("Invalid input. Please enter valid numbers.")
            continue

if __name__ == "__main__":
    main()           
