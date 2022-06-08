--1. 은행(BANK) 테이블
CREATE TABLE BANK 
( BANK_ID  NUMBER
, BANK_NAME VARCHAR2(20) NOT NULL
, CONSTRAINT BANK_ID_PK PRIMARY KEY(BANK_ID)
);
--==>> Table BANK이(가) 생성되었습니다.

-- 은행 시퀀스 생성
CREATE SEQUENCE BANK_SEQ
NOCACHE;
--==>> Sequence BANK_SEQ이(가) 생성되었습니다.

--2. 공지사항 카테고리 (ANNOUNCE_CATEGORY) 테이블
CREATE TABLE ANNOUNCE_CATEGORY
( ANOUN_CATE_ID     NUMBER
, ANOUN_CATE_NAME   VARCHAR2(20) NOT NULL
, CONSTRAINT ANOUN_CATE_ID_PK PRIMARY KEY(ANOUN_CATE_ID)
);
--==>> Table ANNOUNCE_CATEGORY이(가) 생성되었습니다.

-- 공지사항 시퀀스 생성
CREATE SEQUENCE ANNOUNCE_CATEGORY_SEQ
NOCACHE;
--==>>Sequence ANNOUNCE_CATEGORY_SEQ이(가) 생성되었습니다.


--3. 문의 카테고리 ASK_CATEGORY 테이블
CREATE TABLE ASK_CATEGORY
( ASK_CATE_ID   NUMBER
, ASK_CATE_NAME VARCHAR2(20) NOT NULL
, CONSTRAINT ASK_CATE_ID_PK PRIMARY KEY(ASK_CATE_ID)
);
--==>> Table ASK_CATEGORY이(가) 생성되었습니다.

--문의 카테고리 시퀀스 생성
CREATE SEQUENCE ASK_CATEGORY_SEQ
NOCACHE;
--==>>Sequence ASK_CATEGORY_SEQ이(가) 생성되었습니다.

--4. FAQ 테이블 생성
CREATE TABLE FAQ
( FAQ_ID NUMBER
, FAQ_TITLE VARCHAR2(30) NOT NULL
, FAQ_CONTENTS VARCHAR2(300) NOT NULL
, CONSTRAINT FAQ_ID_PK PRIMARY KEY(FAQ_ID)
);
--==>> Table FAQ이(가) 생성되었습니다.

-- FAQ 시퀀스 생성
CREATE SEQUENCE FAQ_SEQ
NOCACHE;
--==>> Sequence FAQ_SEQ이(가) 생성되었습니다.


--5. 관리자(admin) 테이블 생성
CREATE TABLE ADMIN
( AD_ID VARCHAR2(20)
, AD_PW VARCHAR2(20)  NOT NULL
, CONSTRAINT AD_ID_PK PRIMARY KEY(AD_ID)
);
--==>> Table ADMIN이(가) 생성되었습니다.

--6. 차단 카테고리(BAN_CATEGORY) 테이블 생성
CREATE TABLE BAN_CATEGORY
( BAN_CATE_ID NUMBER
, BAN_CATE_NAME VARCHAR2(30) NOT NULL
, CONSTRAINT BAN_CATE_ID_PK PRIMARY KEY(BAN_CATE_ID)
);
--==>> Table BAN_CATEGORY이(가) 생성되었습니다.

-- 차단 카테고리 시퀀스 (BAN_CATEGORY_SEQ) 생성
CREATE SEQUENCE BAN_CATEGORY_SEQ
NOCACHE;
--==>> Sequence BAN_CATEGORY_SEQ이(가) 생성되었습니다.

--7. 상품 카테고리(PRODUCT_CATEGORY) 생성
CREATE TABLE PRODUCT_CATEGORY
( PD_CATEGORY_ID NUMBER
, CATEGORY_NAME VARCHAR2(20) NOT NULL
, CONSTRAINT PD_CATEGORY_ID_PK PRIMARY KEY(PD_CATEGORY_ID)
);
--==>> Table PRODUCT_CATEGORY이(가) 생성되었습니다.

-- 상품카테고리 시퀀스(PRODUCT_CATEGORY_SEQ) 생성
CREATE SEQUENCE PRODUCT_CATEGORY_SEQ
NOCACHE;
--==>> Sequence PRODUCT_CATEGORY_SEQ이(가) 생성되었습니다.

--8 AS 가능여부 테이블 (PRODUCT_AS) 생성
CREATE TABLE PRODUCT_AS
( PD_AS_ID NUMBER
, PD_AS_NAME VARCHAR(20) NOT NULL
, CONSTRAINT PD_AS_ID_PK PRIMARY KEY(PD_AS_ID)
);
--==>> Table PRODUCT_AS이(가) 생성되었습니다.

-- AS 가능 여부 시퀀스(PRODUCT_AS_SEQ) 생성 
CREATE SEQUENCE PRODUCT_AS_SEQ
NOCACHE;
--==>> Sequence PRODUCT_AS_SEQ이(가) 생성되었습니다.


--9 인증 종류 (AUTH_CATEGORY) 테이블 생성
CREATE TABLE AUTH_CATEGORY
( AU_CATE_ID NUMBER
, AU_NAME VARCHAR2(20) NOT NULL
, CONSTRAINT AU_CATE_ID_PK PRIMARY KEY(AU_CATE_ID)
);
--==>> Table AUTH_CATEGORY이(가) 생성되었습니다.

-- 인증종류 시퀀스 (AUTH_CATEGORY_SEQ) 생성
CREATE SEQUENCE AUTH_CATEGORY_SEQ
NOCACHE;
--==>> Sequence AUTH_CATEGORY_SEQ이(가) 생성되었습니다.


-- 









