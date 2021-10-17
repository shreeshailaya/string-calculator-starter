package calculator;

import java.util.ArrayList;

class StringCalculator {
	private String delimiter=",|\n";
	private String numbersAndDelimeter;
	ArrayList<Integer> intarr = new ArrayList<>();


    public int add(String input) throws RuntimeException {
    	
    	if(!isStringEmpty(input))
    	{
    		
    		if(input.length()==1)
            {
            	return Integer.parseInt(input);
            }
    		if(customDelimiterCheck(input))
            {
    			System.out.print(parseCustomDelimiterAndCalculate(input));
            	return parseCustomDelimiterAndCalculate(input);
            }
    		if(presentNegative(input))
    		{
    			negativeNumberExpection(input);
    		}
            
            return calculate(splitByDelimiter(input));
            
    		
    		
    		
    	}else 
    	{
    		return 0;
    	}
        
        
        
    }
    
    public boolean isStringEmpty(String input)
    {
    	if(input.length()==0)
    		return true;
    	else
    		return false;
    }
    
    public String [] splitByDelimiter(String input)
    {
    	return input.split(delimiter);
    }
    
    public int calculate(String [] splitByDelimiter )
    {
    	int result=0;
    	for(String s : splitByDelimiter)
    	{
    		result += Integer.parseInt(s);
    	}
    	return result;
    }
    
    public boolean customDelimiterCheck(String input)
    {
    	if(input.startsWith("//"))
    		return true;
    	else 
    		return false;	
    }
    
    public int parseCustomDelimiterAndCalculate(String input)

    {
    	delimiter = String.valueOf(input.charAt(2));
    	int newLineIndex = input.indexOf("\n");
    	numbersAndDelimeter = input.substring(newLineIndex + 1);
    	return calculate(splitByDelimiter(numbersAndDelimeter));
    }
    public void negativeNumberExpection(String input)
    {
    	
    	String rte = "Negative not allow"+intarr;
    	if(presentNegative(input))
    		throw new RuntimeException( rte );
    	
    	
    }
    
    public boolean presentNegative(String input)
    {
    	String [] strarr = input.split(delimiter);
    	for(String s : strarr)
    	{
    		int no = Integer.parseInt(s);
    		if(no<0)
    		{
    			intarr.add(no);
    		}
    	}
    	if(intarr.size()>0)
    		return true;
    	else
    		return false;
    	
    }
}