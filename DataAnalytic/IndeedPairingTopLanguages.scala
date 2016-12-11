val githubOutput = sc.textFile("/Project/LangListRanked.txt")
val githubD = sc.broadcast(githubOutput.collect())
val data = sc.textFile("/Project/Analytics/Java/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/javapaircount")

val data = sc.textFile("/Project/Analytics/C#/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/C#paircount")

val data = sc.textFile("/Project/Analytics/C++/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/C++paircount")

val data = sc.textFile("/Project/Analytics/ADA/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/Adapaircount")

val data = sc.textFile("/Project/Analytics/Arc/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/arcpaircount")

val data = sc.textFile("/Project/Analytics/ASP/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/asppaircount")

val data = sc.textFile("/Project/Analytics/CSS/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/CSSpaircount")

val data = sc.textFile("/Project/Analytics/HTML/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/htmlpaircount")

val data = sc.textFile("/Project/Analytics/Javascript/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/Javascriptpaircount")

val data = sc.textFile("/Project/Analytics/Objective-C/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/objcpaircount")

val data = sc.textFile("/Project/Analytics/PHP/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/phppaircount")

val data = sc.textFile("/Project/Analytics/Python/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/pythonpaircount")

val data = sc.textFile("/Project/Analytics/Ruby/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/rubypaircount")

val data = sc.textFile("/Project/Analytics/SAS/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/saspaircount")

val data = sc.textFile("/Project/Analytics/Scala/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/scalapaircount")

val data = sc.textFile("/Project/Analytics/Shell/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/shellpaircount")

val data = sc.textFile("/Project/Analytics/groovy/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/groovypaircount")

val data = sc.textFile("/Project/Analytics/Cucumber/*")
var result = githubD.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				})
				
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/Project/AnalyticsResult/Cucumberpaircount")