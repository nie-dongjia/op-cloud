/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : 127.0.0.1
 Source Database       : DB_OpenPlatForm

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : utf-8

 Date: 03/09/2018 21:58:16 PM
*/
-- 生成DB_BusinessCenter数据库  
DROP DATABASE IF EXISTS OP_Cloud_Goods;
CREATE DATABASE OP_Cloud_Goods CHARACTER SET utf8mb4 ;
USE OP_Cloud_Goods;
-- ----------------------------
--  Table structure for `Goods_BD_GoodsInfo`
-- ----------------------------
DROP TABLE IF EXISTS `GC_BD_GoodsInfo`;
CREATE TABLE `GC_BD_GoodsInfo` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` VARCHAR(80) DEFAULT "" COMMENT '名称',
  `createTime` DATETIME NOT NULL COMMENT '生成时间',
  `lastUpdateTime` TIMESTAMP COMMENT '最后修改时间',
  `description` VARCHAR(200) DEFAULT "" COMMENT '描述',
  `creatorId` BIGINT(20) DEFAULT 0 COMMENT ' 创建者Id',
  `lastUpdateUserId` BIGINT(20) DEFAULT 0 COMMENT '最后修改者',
  `deleted` TINYINT(1) DEFAULT 0 COMMENT '删除标记 ',
  `version` BIGINT(20) DEFAULT 0 COMMENT '当前版本号',
  `dedupKey` VARCHAR(80) DEFAULT "" COMMENT 'key to pretend order duplication',
  
  `salary`   DECIMAL(9,2) DEFAULT 0 COMMENT '销售单价',
  `price`    DECIMAL(9,2) DEFAULT 0 COMMENT '单价',
  `code` VARCHAR(50) DEFAULT "" COMMENT 'code',
  `status` INT(3) DEFAULT 0   COMMENT '状态 0 正常' ,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='GC_BD_GoodsInfo 商品主表';
















