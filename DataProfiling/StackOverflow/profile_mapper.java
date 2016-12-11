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
public class profile_mapper extends Mapper<LongWritable, Text, Text, Text> {
private Text key;
public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
String line = value.toString();
String[] cols= line.split(",");
if(cols[0].length() != 0)
context.write(new Text("Comment Count"), new Text(cols[0]));
if(cols[1].length() != 0)
context.write(new Text("Answer Count"), new Text(cols[1]));
if(cols[2].length() != 0)
context.write(new Text("Tags"), new Text(cols[2]));
if(cols[3].length() != 0)
context.write(new Text("View Count"),new Text(cols[3]));
if(cols[4].length() != 0)
context.write(new Text("Score"), new Text(cols[4]));

}}

