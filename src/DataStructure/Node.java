package DataStructure;
import java.util.*;
public class Node 
{
	char char_data;
	ArrayList<Node> children;
        boolean isTerminating ;
	Node()
	{
        children = new ArrayList<>();
      	for(int i=0 ;i < 27 ; i++)
        {
          children.add(null);
        }
        isTerminating = false ;
	}
	
}
