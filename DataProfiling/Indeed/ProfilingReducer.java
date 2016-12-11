import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class ProfilingReducer extends Reducer<Text, Text, Text, Text> {
	
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
		
		switch(key.toString()){
		
		case "Job Key":
			
			int maxLength = 0;
			
			for (Text text : values) {
				
				if(text.toString().length() > maxLength){
					maxLength = text.toString().length(); 
				}
				
			}
			
			context.write(new Text(key), new Text("String  " + "UniqueCode  " + maxLength));
			
			break;
		case "Date":
			
			Date maxDate = null, minDate = null;
			for (Text text : values) {
				
				DateFormat format = new SimpleDateFormat("E, d MMMM yyyy HH:mm:ss z", Locale.ENGLISH);
		    	Date date;
				try {
					date = format.parse(text.toString());
					if(maxDate == null){
						maxDate = date;
					}else if(maxDate.compareTo(date) < 0){
						maxDate = date;
					}
					if(minDate == null){
						minDate = date;
					}else if(minDate.compareTo(date) > 0){
						minDate = date;
					}
				} catch (ParseException e) {
					System.out.println(e.toString());
				}
				
			}
			
			context.write(new Text(key), new Text("String  " + "Date  From " + minDate + " to " + maxDate));
			
			break;
		case "Company":
			maxLength = 0;
			
			for (Text text : values) {
				
				if(text.toString().length() > maxLength){
					maxLength = text.toString().length(); 
				}
				
			}
			
			context.write(new Text(key), new Text("String  " + "Name  " + maxLength));
			break;
		case "Location":
			maxLength = 0;
			
			for (Text text : values) {
				
				if(text.toString().length() > maxLength){
					maxLength = text.toString().length(); 
				}
				
			}
			
			context.write(new Text(key), new Text("String  " + "City, State  " + maxLength));
			break;
		case "Description":
			maxLength = 0;
			
			for (Text text : values) {
				
				if(text.toString().length() > maxLength){
					maxLength = text.toString().length(); 
				}
				
			}
			
			context.write(new Text(key), new Text("String  " + "JobDescription  " + maxLength));
			break;
		
		}		
	}
}
