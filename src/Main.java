import java.util.* ;
import java.io.* ;

/**
 *
 * @author mostafa
 */
public class Main 
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> [] adjList = new ArrayList[n];
        for (int i = 0; i < n ; i++)
            adjList[i] = new ArrayList();
        for (int i = 0; i < n ; i++)
        {
            int p = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE ;
            for (int k = 0; k < p ; k++)
            {
                String str = br.readLine();
                int len = str.split(" ").length ;
                if(len<min)
                {
                    adjList[i].clear();
                    min = len;
                    adjList[i].add(k+1);
                }
                else if(len==min)
                    adjList[i].add(k+1);
            }
            if(i!=n-1)
                br.readLine();
        }
        for (int i = 0; i < adjList.length; i++) {
            for(int k : adjList[i])
                pr.print(k+" ");
            pr.println();
        }
        br.close();
        pr.close();
    }
    
    
    
    
}
