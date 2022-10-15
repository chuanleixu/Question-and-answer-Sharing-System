/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100239
 Source Host           : localhost:3306
 Source Schema         : houseServer

 Target Server Type    : MySQL
 Target Server Version : 100239
 File Encoding         : 65001

 Date: 15/10/2022 22:06:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '答案id',
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '答案内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `liked_count` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '被围观数',
  `ques_id` int(11) DEFAULT NULL COMMENT '对应问题id',
  `user_id` int(11) DEFAULT NULL COMMENT '回答用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of answer
-- ----------------------------
BEGIN;
INSERT INTO `answer` VALUES (1, '未来城三期很不错', '2022-10-03 11:53:56', '4', 1, 1);
INSERT INTO `answer` VALUES (2, 'weikaichenghaikeyi ', '2022-10-07 20:12:39', '3', 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL COMMENT '留言id',
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '评论内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `like_num` int(11) DEFAULT NULL COMMENT '获赞数',
  `story_id` int(11) DEFAULT NULL COMMENT '所在分享信息id',
  `user_id` int(11) DEFAULT NULL COMMENT '评论用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `id` bigint(20) NOT NULL COMMENT '关注信息id',
  `followed_user_id` int(11) DEFAULT NULL COMMENT '被关注用户id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of follow
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` bigint(20) DEFAULT NULL COMMENT '消息id',
  `from_userid` int(11) DEFAULT NULL COMMENT '发出者id',
  `type` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '消息类型',
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '消息内容',
  `user_id` int(11) DEFAULT NULL COMMENT '接收者id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of message
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '问题id',
  `content` text COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '问题内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_free` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '是否免费',
  `ques_user_id` int(11) DEFAULT NULL COMMENT '提问用户id',
  `quesd_user_id` int(11) DEFAULT NULL COMMENT '被问用户id',
  `quesd_user_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '被提问用户姓名',
  `ques_user_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '提问用户姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of question
-- ----------------------------
BEGIN;
INSERT INTO `question` VALUES (2, '老师，请问最新的未来城三期怎么样', '2022-10-03 11:19:15', '0', 2, 1, '??', '??');
INSERT INTO `question` VALUES (3, '老师，请问最新的未来城三期怎么样', NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for story
-- ----------------------------
DROP TABLE IF EXISTS `story`;
CREATE TABLE `story` (
  `id` bigint(20) NOT NULL COMMENT '分享id',
  `content` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `is_free` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `look_num` int(11) DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_avatar_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of story
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `avatar_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像地址',
  `is_famous` int(11) DEFAULT NULL COMMENT '是否为名人',
  `simple_desc` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '个人简介',
  `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '姓名',
  `open_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户标识符',
  `account` decimal(10,0) DEFAULT NULL COMMENT '余额',
  `is_quesd` tinyint(4) DEFAULT 0 COMMENT '是否是被提问的人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, NULL, NULL, '辣哥', '辣哥', '0239304', NULL, 1);
INSERT INTO `user` VALUES (2, NULL, NULL, '一条咸鱼', '咸鱼', '33829038', NULL, 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
