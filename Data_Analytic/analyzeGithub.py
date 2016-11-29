import json

inputsRDD = sc.textFile("input")

counts = inputsRDD.flatMap(lambda line: list(json.loads(line)["event_repo_languages"].keys())).map(lambda word: (word, 1)).reduceByKey(lambda v1,v2: v1 + v2).sortBy(lambda a: a[1], ascending=False)

counts.saveAsTextFile("SparkAnalyticOutput")