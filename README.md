# Language-Trend-Anlaytics-Github-StackOverflow-Indeed-Data-
In this Big Data Analytics project, we are finding the language trend analytics and its effect on the interview process using the data from Github API, Stackoverflow API and Indeed API

# Data Profiling
### Dataset 1 :  Stack Overflow-
            
            Data: Static Archival
            Type of file Download: XML Download

In /Dataprofiling/StackOverflow  
* Parse the XML File of Dataset using code in Data Transformation folder.
* profile_mapper.java, profile_reducer.java and profile.java is the code for profiling data.
* Output is a text file.

# Data Cleaning
### Dataset 1: StackOverflow

In /DataCleaning/StackOerflow
*  Parse the XML File of Dataset from profiling code.
*  Use the output of this file as input for clean_mapper.java
*  clean-mapper.java and clean_reducer.java is mapreduce code for cleaning the data.
*  clean.java is the driver code for mapreduce
*  Output for this is a text file.

# Data Analytic
### StackOverflow: 
     
     /DataAnalytic/StackOverflowAnalytics.scala - This code finds the Language Ranking on the basis of number of records.
                                                   Also , outputs new files for tags with each language from Github Rankings
                                                   
      /DataAnalytic/StackOverflowPairingtop20.scala  - This code finds the ranking of pairing  of top 20 languages from the dataset. The top 20 languages are collective ranking for Analytic iteration 1.
      
      /DataAnalytic/StackOverflow_answercount-score.hql - This is a hive file which ranks top 20 languages from StackOverflow Dataset on the basis of questions answered and the score received. The top 20 languages are from Analytic iteration-1.
