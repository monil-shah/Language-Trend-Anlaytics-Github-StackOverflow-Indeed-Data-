val rddgit =  sc.textFile("/user/mds747/Githublang")
val rddgit2array = sc.broadcast(rddgit.collect())
val data = sc.textFile("/user/mds747/cleaning_output_final.txt")
rddgit2array.value.foreach{ x=> {
			val lang = data.filter(line=>line.contains(x))
			lang.saveAsTextFile(s"/user/mds747/project/$x")
			}
		           }

var result = rddgit2array.value.map(line=>{
				val lang = data.filter(x=>x.contains(line))
				val count = lang.count()
				(line,count)
				}
			        )
val Output =sc.parallelize(result)
output.saveAsTextFile("/user/mds747/project/x1")