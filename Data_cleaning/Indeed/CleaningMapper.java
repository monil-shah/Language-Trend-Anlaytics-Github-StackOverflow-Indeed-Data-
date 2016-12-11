import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CleaningMapper extends
		Mapper<LongWritable, Text, Text, Text> {

	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		String line = value.toString();
		String[] data = line.split("  ");
		StringBuilder newValue = new StringBuilder();
		for(int i = 1 ; i < data.length ; i++ ){
			if(i != data.length - 1){
				newValue.append(data[i]+"  ");
			}else{
				newValue.append(data[i]);
			}
		}
		context.write(new Text(data[0]), new Text(newValue.toString()));

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
