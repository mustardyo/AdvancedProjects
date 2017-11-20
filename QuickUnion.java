public class QuickUnion implements UnionFind
{
    private int[] id;
    private int[] iother;
    private int length;
        
    public QuickUnion(int n) 
    {
       length = n;
       id = new int[n];
       iother = new int[n];
       for (int i = 0; i < length; i++)
       {
    	   id[i] = i;
    	   iother[i] = 1;
       }
    }
    
    public int find(int k)
    {

    	while(k != id[k])
        {
            id[k] = id[id[k]];  
            k = id[k];
        }
        return id[k];
    }

    public void union(int p, int q)
    {
        int i = find(p);
        int j = find(q);
        if(iother[i] < iother[j])
        {
            id[i] = j;
            iother[j] += iother[i];
        }
        else
        {
            id[j] = i;
            iother[i] += iother[j];
        }
    }
}
