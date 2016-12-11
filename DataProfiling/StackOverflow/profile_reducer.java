import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class profile_reducer
  extends Reducer<Text, Text, Text, Text> {
  
  @Override
  public void reduce(Text key, Iterable<Text> values,
      Context context)
      throws IOException, InterruptedException {
    int buffer;
//	String tags= "Tags";
//	Text tag = new Text("Tags");
    int maxValue = Integer.MIN_VALUE;
	int maxValue1 = Integer.MIN_VALUE;
	int minValue = Integer.MAX_VALUE;
    for (Text value : values) {
	String count1 = value.toString();
	if(key.toString().equals("Tags"))
	{
	buffer = count1.length();
	maxValue1 = Math.max(maxValue, buffer);
//	context.write(key, new Text(String.valueOf(maxValue)));
	}
	else	
	{
	String count = value.toString();
	buffer = Integer.parseInt(count);
     	 maxValue = Math.max(maxValue,buffer);
	minValue = Math.min(minValue,buffer);
	}
   }
	if(key.toString().equals("Tags"))
	context.write(key, new Text("MaxLength:"+" "+String.valueOf(maxValue1)));
	else
    	context.write(key,new Text("MaxValue:"+" "+String.valueOf(maxValue)+" "+"MinValue: "+" "+String.valueOf(minValue)));
  }
}
