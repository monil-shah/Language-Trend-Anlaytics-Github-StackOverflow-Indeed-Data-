import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
public class clean_mapper extends Mapper<LongWritable, Text, Text, Text> {
private Text key;
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
String line = value.toString();
String[] cols= line.split(",");
int smoothing = 0;
if(cols[2].length() != 0)
{
	for(int i=0;i<5;i++)
{
	if(cols[i].length() == 0)
{
	cols[i]=String.valueOf(smoothing);
}
}
	context.write(new Text(cols[2]), new Text(cols[0]+" "+cols[1]+" "+cols[3]+" "+cols[4]));
}
	

}}


