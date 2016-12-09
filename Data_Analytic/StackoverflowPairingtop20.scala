val data = sc.textFile("/user/mds747/project/subfiles/<java>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/javapaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<c#>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/csharppaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<c++>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/c++paircount")

val data = sc.textFile("/user/mds747/project/subfiles/<c>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/cpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<javascript>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/javascriptpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<php>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/phppaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<python>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/pythonpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<css>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/csspaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<schema>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/schemapaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<hlsl>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/hlslpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<r>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/Rpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<plsql>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/PLSQLpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<html>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/htmlpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<mask>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/maskpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<lua>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/luapaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<objective-c>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/objective-cpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<plpgsql>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/plpgsqlpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<powershell>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/powershellpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<brainfuck>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/brainfuckpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<haskell>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/haskellpaircount")

val data = sc.textFile("/user/mds747/project/subfiles/<swift>/*")
var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
Output.saveAsTextFile("/user/mds747/project/swiftpaircount")