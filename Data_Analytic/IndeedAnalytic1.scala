val indeedData = sc.textFile("/dataset.txt")
val githubOutput = sc.textFile("/output.txt")

val githubD = sc.broadcast(githubOutput.collect())

githubD.value.foreach{ line => {
	val lang = indeedData.filter(x => x.contains(line))
	lang.saveAsTextFile(s"/Project/Analytics/$line")
	}}