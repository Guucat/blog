#查询各科成绩最高和最低的分,以如下的形式显示:课程号,最高分,最低分
SELECT course_id AS "课程号", MAX(score) AS "最高分", MIN(score) AS "最低分" FROM score GROUP BY course_id;

#查询学生的总成绩并进行排名
SELECT student_id, SUM(score) FROM score GROUP BY student_id ORDER BY SUM(score) DESC;

#查询平均成绩大于60分的学生的学号和平均成绩
SELECT student_id, AVG(score) FROM score  GROUP BY student_id HAVING AVG(score) > 60 ORDER BY AVG(score) DESC;