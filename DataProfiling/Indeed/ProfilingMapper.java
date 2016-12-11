import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class ProfilingMapper extends
		Mapper<LongWritable, Text, Text, Text> {

	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		String line = value.toString();
		String[] data = line.split("  ");

		context.write(new Text("Job Key"), new Text(data[0]));
		context.write(new Text("Date"), new Text(data[1]));
		context.write(new Text("Company"), new Text(data[2]));
		context.write(new Text("Location"), new Text(data[3]));
		context.write(new Text("Description"), new Text(data[4]));

	}
	
	public ArrayList<String> Split(String line){
		
		ArrayList<String> component = new ArrayList<String>();
		int i = 0;
		for(; i <= line.lastIndexOf(" "); i++){
			char c = line.charAt(i);
			if(c != ' ' && c != '\t' && c != '\n' && c != '\r'){
				component.add(""+c);
			}
			
		}
		
		component.add(line.substring(i, line.length()));
		
		return component;
		
	}
}
