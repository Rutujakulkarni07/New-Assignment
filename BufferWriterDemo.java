import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
class BufferWriterDemo
{

	public static void main(String args[]) throws IOException
	{
		BufferedWriter bw= null;
		StringWriter sw= null;
		String s="ABCDEFGH";
		
		try{
			sw=new StringWriter();
			bw=new BufferedWriter(sw);
			
			for(char c:s.toCharArray())
			{
			bw.append(c);
			bw.flush();
			System.out.println(sw.getBuffer());
			}
		   }
		    catch(IOException e)
		   {
			e.printStackTrace();
		   }
		finally
   		{
			if(bw!=null)
			{
				bw.close();
			}
			if(sw!=null)
		
			{
			        sw.close();
			}		
	
		}
	}
}
			