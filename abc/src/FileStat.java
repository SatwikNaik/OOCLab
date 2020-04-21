import java.io.*;
public class FileStat {
    public static void main(String args[ ]) throws IOException
    {
        long nl=0,nw=0,nc=0; String line;
        BufferedReader br=new BufferedReader(new FileReader(args[0]));
        while ((line=br.readLine())!=null)
        {
            nl++;
            nc=nc+line.length();
            int i=0;
            boolean pspace=true;
            while (i<line.length())
            {
                char c=line.charAt(i++);
                boolean cspace=Character.isWhitespace(c);
                if (pspace&&!cspace)
                    nw++;
                pspace=cspace;
            }
        }
        System.out.println("Number of Characters"+nc);
        System.out.println("Number of Words"+nw);
        System.out.println("Number of Lines"+nl);
    }
}
