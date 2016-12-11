import json

import itertools

#Import data to RDD
inputRDD = sc.textFile("GithubFinalInput")

#Count of records
countRDD = inputRDD.count()

#Take different pairwise combinations of languages per RDD, sort it to avoid duplication and count the pairs
progCount = inputRDD.flatMap(lambda line: list(itertools.combinations(sorted(list(json.loads(line)["event_repo_languages"].keys())), 2))).map(lambda word: (word, 1)).reduceByKey(lambda v1,v2: v1 + v2)

#Normalize counts
normalizeProgCount = progCount.map(lambda (x, y): (x, y/float(countRDD)))

#Rank based on counts
rankProgCount = normalizeProgCount.sortBy(lambda a: a[1], ascending=False)

#Save as output file
rankProgCount.saveAsTextFile("ComboOut")