val indeedData = sc.textFile("/dataset.txt")
val githubOutput = sc.textFile("/output.txt")

val githubD = sc.broadcast(githubOutput.collect())

val result = githubD.value.map( line => {
	val lang = indeedData.filter(x => x.contains(x))
	val cout = lang.count
	(x, cout)
	})
	
import scala.collection.immutable.ListMap

val mResult = ListMap(result.toSeq.sortWith(_._2 > _._2):*)).toSeq
val mapResult = sc.parallelize(mResult)
mapResult.saveAsTextFile("/Project/OverallCount")