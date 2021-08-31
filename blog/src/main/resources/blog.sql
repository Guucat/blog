/*
 Navicat Premium Data Transfer

 Source Server         : mysql5.7
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 31/08/2021 21:03:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bg_article
-- ----------------------------
DROP TABLE IF EXISTS `bg_article`;
CREATE TABLE `bg_article`  (
  `article_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `user_id` int(3) NOT NULL COMMENT '用户id',
  `article_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章标题',
  `article_text` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '文章文本内容',
  `article_like` int(3) NULL DEFAULT 0 COMMENT '文章点赞数',
  `article_date` date NOT NULL COMMENT '文章发表时间',
  PRIMARY KEY (`article_id`) USING BTREE,
  INDEX `article_user_id`(`user_id`) USING BTREE,
  CONSTRAINT `article_user_id` FOREIGN KEY (`user_id`) REFERENCES `bg_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bg_article
-- ----------------------------
INSERT INTO `bg_article` VALUES (1, 1, '我是谁', '我是谁，我在哪，我要干什么', 0, '2021-08-25');
INSERT INTO `bg_article` VALUES (2, 1, '机器', '机器是工具...', 0, '2021-08-30');
INSERT INTO `bg_article` VALUES (3, 2, '动画片', '众所周知，动漫不是动画片...', 0, '2021-08-30');

-- ----------------------------
-- Table structure for bg_comment
-- ----------------------------
DROP TABLE IF EXISTS `bg_comment`;
CREATE TABLE `bg_comment`  (
  `comment_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `user_id` int(3) NOT NULL COMMENT '用户id',
  `article_id` int(3) NOT NULL COMMENT '文章id',
  `comment_text` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `comment_like` int(3) NULL DEFAULT 0 COMMENT '评论点赞数',
  `comment_parent` int(3) NOT NULL COMMENT '父评论id,若为文章的评论，则为0',
  `comment_date` date NOT NULL COMMENT '评论时间',
  PRIMARY KEY (`comment_id`) USING BTREE,
  INDEX `comment_user_id`(`user_id`) USING BTREE,
  INDEX `comment_farticle_id`(`article_id`) USING BTREE,
  CONSTRAINT `comment_farticle_id` FOREIGN KEY (`article_id`) REFERENCES `bg_article` (`article_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `comment_user_id` FOREIGN KEY (`user_id`) REFERENCES `bg_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bg_comment
-- ----------------------------
INSERT INTO `bg_comment` VALUES (1, 2, 1, '说得好', 0, 0, '2021-08-11');
INSERT INTO `bg_comment` VALUES (2, 3, 1, '不错的文章', 0, 0, '2021-08-26');
INSERT INTO `bg_comment` VALUES (3, 2, 1, '确实是这样', 0, 1, '2021-08-11');

-- ----------------------------
-- Table structure for bg_user
-- ----------------------------
DROP TABLE IF EXISTS `bg_user`;
CREATE TABLE `bg_user`  (
  `user_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `user_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `user_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bg_user
-- ----------------------------
INSERT INTO `bg_user` VALUES (1, 'Jack', '123**', '1027804480@qq.com');
INSERT INTO `bg_user` VALUES (2, 'MAp', '165156', '@qq');
INSERT INTO `bg_user` VALUES (3, 'ap', 'qwe21', '0086');
INSERT INTO `bg_user` VALUES (4, 'adc', '10086', 'advqwe21ds');

SET FOREIGN_KEY_CHECKS = 1;
