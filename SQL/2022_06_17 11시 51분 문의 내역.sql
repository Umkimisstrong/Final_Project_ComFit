SELECT USER
FROM DUAL;
--==>>COMFIT

DESC ASK;

SELECT *
FROM ASK;

--�� ���� ���� ����
DELETE
FROM ASK
WHERE ASK_ID='ask_2';

COMMIT;

--�� ���� �Է� ����
INSERT INTO ASK (ASK_ID, ASK_TITLE,ASK_CONTENTS,U_ID,ASK_CATE_ID,ALARM_CODE)
VALUES(CONCAT('ask_',ASK_INSERT_SEQ.NEXTVAL),'��','��','test2','3','1');

--�� ������ ����
CREATE SEQUENCE ASK_INSERT_SEQ
    MAXVALUE 9999999999999999999999999999
    NOCACHE;
    
COMMIT;