val allData = sc.textFile("/dataset.txt")

val javaJobs = allData.filter(line => line.contains("Java"))
val count = javaJobs.count()
javaJobs.saveTextToFile("/javaResult")
sc.parallelize(Seq(count)).saveAsTextFile("/javaCount")

val csharpJobs = allData.filter(line => line.contains("C#"))
val count = csharpJobs.count()
csharpJobs.saveTextToFile("/csharpResult")
sc.parallelize(Seq(count)).saveAsTextFile("/csharpCount")

val cplusJobs = allData.filter(line => line.contains("C++"))
val count = cplusJobs.count()
cplusJobs.saveTextToFile("/cplusResult")
sc.parallelize(Seq(count)).saveAsTextFile("/cplusCount")

val pythonJobs = allData.filter(line => line.contains("python"))
val count = pythonJobs.count()
pythonJobs.saveTextToFile("/pythonResult")
sc.parallelize(Seq(count)).saveAsTextFile("/pythonCount")

val htmlJobs = allData.filter(line => line.contains("HTML"))
val count = htmlJobs.count()
htmlJobs.saveTextToFile("/htmlResult")
sc.parallelize(Seq(count)).saveAsTextFile("/htmlCount")