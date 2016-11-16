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


public class CleaningReducer extends Reducer<Text, Text, Text, Text> {
	
	@Override
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
		
		StringBuilder value = new StringBuilder();
		for (Text text : values) {
			String[] data = text.toString().split("  ");
			String description = data[3].toLowerCase();
			if(description.contains("c++")){
				value.append("C++,");
			}else if(description.contains("python")){
				value.append("Python,");
			}else if(description.contains("java")){
				value.append("Java,");
			}else if(description.contains("c#")){
				value.append("C#,");
			}else if(description.contains("php")){
				value.append("PHP,");
			}else if(description.contains("html")){
				value.append("HTML,");
			}else if(description.contains("css")){
				value.append("CSS,");
			}else if(description.contains("android")){
				value.append("Android,");
			}else if(description.contains("ios")){
				value.append("iOS,");
			}else if(description.contains("nodejs")){
				value.append("NodeJS,");
			}else if(description.contains("angularjs")){
				value.append("AngularJS,");
			}else if(description.contains("javascript")){
				value.append("Javascript,");
			}else if(description.contains("vb")){
				value.append("VB,");
			}else if(description.contains("mysql")){
				value.append("MySQL,");
			}else if(description.contains("sql")){
				value.append("sql,");
			}else if(description.contains("msoffice")){
				value.append("MSOffice,");
			}else if(description.contains("bigdata")){
				value.append("BigData,");
			}else if(description.contains("hadoop")){
				value.append("Hadoop,");
			}else if(description.contains("mapreduce")){
				value.append("MapReduce,");
			}else if(description.contains("hive")){
				value.append("Hive,");
			}else if(description.contains("impala")){
				value.append("Impala,");
			}else if(description.contains("scala")){
				value.append("Scala,");
			}else if(description.contains("pig")){
				value.append("PIG");
			}
			/*Can be more languages and technologies as per requirement*/
		}
		
		if(value.length() == 0){
			value.append("nothing");
		}
		
		context.write(new Text(key), new Text(value.toString()));
		
	}
}
