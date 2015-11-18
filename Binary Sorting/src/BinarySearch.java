import java.util.*;

public class BinarySearch
	{
		public static void main(String[] args)
			{
				System.out.println("Please input a number between 1 and 20. This will be the number of numbers. ");
				Scanner userInput = new Scanner(System.in);
				int num = userInput.nextInt();
				int elements[] = new int[num];
				
				if (num > 20 || num < 1)
					{
						System.out.println("Please start over and select a valid number.");
						System.exit(0);
					}
				System.out.println();
				System.out.println("You will now put in numbers. Please add them in ascending order.");
				for (int i = 0; i < elements.length; i++)
					{
						System.out.println("Please input digit #" + (i + 1));
						elements[i] = userInput.nextInt();
					}
				System.out.println();
				System.out.print("a= ");
				for (int j = 0; j < elements.length; j++)
					{
						System.out.print(elements[j] + ", ");
					}
				System.out.println();
				int target = elements[(int)((Math.random() * num))];
				System.out.println("Your target is " + target);
				int left = 0;
				int right = elements.length - 1;
				int counter = 0;
				int score=0;
				while (left <= right)
					{
						int middle = ((left + right) / 2);
						System.out.println("What is the right end?");
						int r = userInput.nextInt();
						if (r == right)
							{
								System.out.println("You are correct.");
								score++;
							} 
						else
							{
								System.out.println("You are wrong. The answer is " + right);
							}
						System.out.println("What is the left end?");
						int l = userInput.nextInt();
						if (l == left)
							{
								System.out.println("You are correct.");
								score++;
							} 
						else
							{
								System.out.println("You are wrong. The answer is " + left);
							}
						System.out.println("What is the middle?");
						int m = userInput.nextInt();
						if (m == middle)
							{
								System.out.println("You are correct.");
								score++;
							} 
						else
							{
								System.out.println("You are wrong. The answer is " + middle);
							}
						counter++;
						if (target < elements[middle])
							{
								right = (middle - 1);
							} 
						else if (target > elements[middle])
							{
								left = (middle + 1);
							} 
						else
							{
								System.out.println();
								System.out.println("The target is at position " + middle + ". It took " + counter + " passes to find.");
								System.out.println("Your score is "+ score +"/" + (counter*3));
								break;
							}
						System.out.println();
					}
			}

	}