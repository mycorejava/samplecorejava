import java.util.*;

public class JavaStatements  
{  
	float addition()  
    {  
        return 5.0f;  
    }
	
    public static void main( String[] args )  
    {  
		// return statement
		JavaStatements obj = new JavaStatements();
		System.out.println( "No : " + obj.addition() ); 
		
	
		// nested if - else
        int age;  
        Scanner inputDevice = new Scanner( System.in );  
        System.out.print( "Please enter Age: " );  
        age = inputDevice.nextInt();  
        if ( age >= 18 && age <=35 )  {
            System.out.println( "between 18-35 " );  
			if(age==21){
				System.out.println( "Teenager in college!" );  
			}
		}	
        else if(age >35 && age <=60)  {
            System.out.println("between 36-60");  }
        else  {
            System.out.println( "not matched" );  }
			
		// break
        for ( int var = 0; var < 5; var++ )  
        {  
            System.out.println( "Var is : " + var );  
            if ( var == 3 )  {
				break;  
			}
        }  

		// continue
        for ( int var1 = 0; var1 < 4; var1++ )  
        {  
            for ( int var2 = 0; var2 < 4; var2++ )  
            {  
                if ( var2 == 2 ) { 
                    continue;  
				}
                System.out.println( "var1:" + var1 + ", var2:" + var2 );  
            }  
        }  
		
		

		
		// switch statement on int
		int day = 5; 
        String dayString=""; 
  
        // switch statement with int data type 
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
            break; 
        } 
        System.out.println(dayString); 
		
		
		// switch case on string
		String str = "Two"; 
        switch(str) 
        { 
            case "one": 
                System.out.println("one"); 
                break; 
            case "two": 
                System.out.println("two"); 
                break; 
            case "three": 
                System.out.println("three"); 
                break; 
            default: 
                System.out.println("no match"); 
				break;
        } 
		
		
		
		// for loop
		for (int x = 2; x <= 4; x++) 
            System.out.println("Value of x:" + x); 
			
        String array[] = {"Ron", "Harry", "Hermoine"}; 
		for (int x < 3; x >= 0; x--)
            System.out.println("Value of array :" + array[x]);
			
        //enhanced for loop 
        for (String x:array) 
        { 
            System.out.println(x); 
        } 		
			
		// 
		
		// while loop
		while (x <= 4) 
        { 
		    System.out.println("Value of x:" + x); 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        }
		
		// do while
		int x = 21; 
        do
        { 
            // The line will be printed even 
            // if the condition is false 
            System.out.println("Value of x:" + x); 
            x++; 
        } 
        while (x < 20); 
		
		
		
    }  
	
	int returnCall()  
    {  
        return 5;  
    } 
 
	
	
	
} 
