public class StringStack 
{
	private int count; 
	private String[] stack;
	public StringStack(int maxSize) {
        stack = new String[maxSize];
        count = 0;
    }
    
    public void push(String str) 
    {
        stack[count] = str;
        count++;
    }
    
    public String pop() {
    	count--;
    	return stack[count];
    }
}

