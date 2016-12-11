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
			}
			if(description.contains("python")){
				value.append("Python,");
			}
			if(description.contains("java")){
				value.append("Java,");
			}
			if(description.contains("c#")){
				value.append("C#,");
			}
			if(description.contains("php")){
				value.append("PHP,");
			}
			if(description.contains("html")){
				value.append("HTML,");
			}
			if(description.contains("css")){
				value.append("CSS,");
			}
			if(description.contains("android")){
				value.append("Android,");
			}
			if(description.contains("ios")){
				value.append("iOS,");
			}
			if(description.contains("nodejs")){
				value.append("NodeJS,");
			}
			if(description.contains("angularjs")){
				value.append("AngularJS,");
			}
			if(description.contains("javascript")){
				value.append("Javascript,");
			}
			if(description.contains("vb")){
				value.append("VB,");
			}
			if(description.contains("mysql")){
				value.append("MySQL,");
			}
			if(description.contains("sql")){
				value.append("sql,");
			}
			if(description.contains("msoffice")){
				value.append("MSOffice,");
			}
			if(description.contains("bigdata")){
				value.append("BigData,");
			}
			if(description.contains("analytics")){
				value.append("Analytics,");
			}
			if(description.contains("data science")){
				value.append("Data Science,");
			}
			if(description.contains("machine learning")){
				value.append("Machine Learning,");
			}
			if(description.contains("artificial intelligence")){
				value.append("Artificial Intelligence,");
			}
			if(description.contains("ai")){
				value.append("AI,");
			}
			if(description.contains("ml")){
				value.append("ML,");
			}
			if(description.contains("hadoop")){
				value.append("Hadoop,");
			}
			if(description.contains("mapreduce")){
				value.append("MapReduce,");
			}
			if(description.contains("hive")){
				value.append("Hive,");
			}
			if(description.contains("impala")){
				value.append("Impala,");
			}
			if(description.contains("scala")){
				value.append("Scala,");
			}
			if(description.contains("pig")){
				value.append("PIG,");
			}
			if(description.contains("nosql")){
				value.append("NoSQL,");
			}
			if(description.contains("django")){
				value.append("Django,");
			}
			if(description.contains("flask")){
				value.append("Flask,");
			}
			if(description.contains("augmented reality")){
				value.append("Augmented Reality,");
			}
			/*Can be more languages and technologies as per requirement*/
		}
		
		if(value.length() == 0){
			value.append("nothing");
		}
		
		context.write(new Text(key), new Text(value.toString()));
		
	}
}
