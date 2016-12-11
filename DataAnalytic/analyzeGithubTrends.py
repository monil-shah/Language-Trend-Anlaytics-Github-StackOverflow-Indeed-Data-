import json
import datetime

dateStrings = ["2016-11-" + str(x) + "-0" for x in range(15,31)]
for i in dateStrings:
	
	# Retrieve inputs from date folders and store it as RDDs
	inputsRDD = sc.textFile("GithubFinalInput/" + i)

	#Compute Programming language counts for each input date
	progCount = inputsRDD.flatMap(lambda line: list(json.loads(line)["event_repo_languages"].keys())).map(lambda word: (word, 1)).reduceByKey(lambda v1,v2: v1 + v2)

	#Rank Programming languages based on count
	rankProgCount = progCount.sortBy(lambda a: a[1], ascending=False)

	#Save Ranks as text file for each date
	rankProgCount.saveAsTextFile("finalOutput/" + i)