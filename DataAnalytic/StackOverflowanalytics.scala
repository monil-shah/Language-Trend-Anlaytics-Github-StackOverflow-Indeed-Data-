val rddgit =  sc.textFile("/user/mds747/project/Githublang")
val rddgit2array = sc.broadcast(rddgit.collect())
val data = sc.textFile("/user/mds747/project/cleaning_output_final.txt")
rddgit2array.value.foreach{ x=> {
			val lang = data.filter(line=>line.contains(x))
			lang.saveAsTextFile(s"/user/mds747/project/subfiles/$x")
			}
		           }

var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
import scala.collection.immutable.ListMap
val sort_result =  ListMap(result.toSeq.sortWith(_._2 > _._2):_*).toSeq
val Output =sc.parallelize(sort_result)
output.saveAsTextFile("/user/mds747/project/sortedranking")
