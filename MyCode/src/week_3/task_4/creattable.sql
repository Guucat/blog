#学生表:student(学号,学生姓名,出生年月,性别)
CREATE TABLE `student` (
                           `student_id` int NOT NULL,
                           `student_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                           `birth` date DEFAULT NULL,
                           `sex` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`student_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

#成绩表:score(学号,课程号,成绩)
CREATE TABLE `score` (
                         `student_id` int DEFAULT NULL,
                         `course_id` int DEFAULT NULL,
                         `score` varchar(255) DEFAULT NULL,
                         KEY `student_id` (`student_id`),
                         KEY `course_id` (`course_id`),
                         CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
                         CONSTRAINT `student_id` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

#课程表:course(课程号,课程名称,教师号)
CREATE TABLE `course` (
                          `course_id` int NOT NULL,
                          `course_name` varchar(255) DEFAULT NULL,
                          `teacher_id` int DEFAULT NULL,
                          PRIMARY KEY (`course_id`),
                          KEY `teacher_id` (`teacher_id`),
                          CONSTRAINT `teacher_id` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

#教师表:teacher(教师号,教师姓名)
CREATE TABLE `teacher` (
                           `teacher_id` int NOT NULL,
                           `teacher_name` varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
