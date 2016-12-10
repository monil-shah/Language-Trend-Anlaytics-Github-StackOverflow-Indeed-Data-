create external table stack_overflow1(questioncount int,answercount int, tags string, commentcount int, score int)
          row format delimited fields terminated by ','
          location '/user/mds747/project/hiveInput1/';

select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<c#>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<javascript>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<c++>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<java>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<php>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<python>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<c>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<r>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<html>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<css>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<schema>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<hlsl>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<plsql>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<plpgsql>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<mask>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<lua>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<objective-c>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<powershell>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<brainfuck>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<swift>%';
select tags,sum(answer),sum(score) from stack_overflow1 where tags like '%<haskell>%';
 