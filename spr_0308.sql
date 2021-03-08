-- �ý��ۿ��� ���� ��¥ ��������
SELECT SYSDATE FROM DUAL;

-- ������ �����ϱ�
/*
UPDATE [������ ���̺�]
SET [������ ��1] = [������], [������ ��2] = [������] ~ [������ ��Z] = [������]
[WHERE �����͸� ������ ��� ���� ����]
�� ������ ��� ���̺� ���� ������ ��� ���� �����Ͱ� �����
*/

CREATE TABLE DEPT_TEMP2
AS SELECT * FROM DEPT;

UPDATE DEPT_TEMP2
SET LOC='SEOUL';

ROLLBACK;

UPDATE DEPT_TEMP2
SET DNAME = 'DATABASE', LOC= 'SEOUL'
WHERE DEPTNO = 40; --DEPTNO�� 40�� ��쿡�� ����

SELECT * FROM DEPT_TEMP2;

/*
1�к��� [EMP_TEMP ���̺��� �޿�(SAL)�� 2500������ ����� ������� �߰� ����(COMM)�� 50���� ����]
UPDATE EMP_TEMP
SET COMM = 50
WHERE SAL <= 2500;
*/

-- ������ ����
/*
DELETE FROM [������ ǥ �̸�]
[WHERE �����͸� ������ ��� ���� ����]
*/

CREATE TABLE EMP_TEMP2
AS SELECT * FROM EMP;

DELETE FROM EMP_TEMP2
WHERE JOB = 'MANAGER'; --JOB�� MANAGER�� ��츸 ����

SELECT * FROM EMP_TEMP2;

ROLLBACK;

COMMIT;

-- ���� ������
/*
UNION (������)
�� ������ : ����Ϸ��� �� ������ �ڷ����� �������� ��ġ�Ͽ��� �Ѵ�.
*/

SELECT *
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT *
FROM EMP
WHERE DEPTNO = 20;
 --���� �ڵ带 �ٸ��� �ۼ��ϴ� �� (UNION�� ������� ���� ���)
 SELECT *
 FROM EMP
 WHERE DEPTNO IN (10, 20);
 
 SELECT *
 FROM EMP
 MINUS
 SELECT *
 FROM EMP
 WHERE DEPTNO = 10;
 -- ���� �ڵ带 �ٸ��� �ۼ��ϴ� ��
 SELECT *
 FROM EMP
 WHERE DEPTNO != 10;
 
 SELECT *
 FROM EMP
 INTERSECT
 SELECT *
 FROM EMP
 WHERE DEPTNO = 10;
 
 SELECT 1+2*3 FROM DUAL;
 
 SELECT *
 FROM EMP
 WHERE ENAME LIKE '%LA%'
 AND DEPTNO = 30
 OR JOB = 'SALESMAN'
 AND COMM IS NULL;
 /*
 �켱 ���� AND > OR
 ���� OR�� �켱 ������ ���̰� �ʹٸ� �ش� �κ��� ��ȣ�� ���δ� ���� �����Ѵ�.
 (DEPTNO 30 OR JOB 'SALESMAN')
 */
 
 -- ����Ŭ �Լ�
 -- �롤�ҹ��� ��ȯ
 SELECT ENAME, UPPER(ENAME), LOWER(ENAME), INITCAP(ENAME)
 FROM EMP;
 
 SELECT *
 FROM EMP
 WHERE UPPER(ENAME) LIKE UPPER('%james%');
 -- UPPER�Լ��� ���ڿ� ���ϱ� (ENAME JAMES �ܾ ������ �����͸� �˻�)
 
 SELECT UPPER(ENAME)
 FROM EMP;
 
 -- ���� ����(LENGTH)
 SELECT ENAME, LENGTH(ENAME)
 FROM EMP;
 
 -- WHERE���� ��� (���ڿ� ���̷� ���� �˻�)
 SELECT ENAME, LENGTH(ENAME)
 FROM EMP
 WHERE LENGTH(ENAME) >= 5;
 
 --LENGTH(���ڼ�)�� LENGTHB(����Ʈ�뷮)
 SELECT LENGTH('�ѱ�'), LENGTHB('�ѱ�')
 FROM DUAL;
 
 -- SUBSTR (���ڿ� �Ϻθ� ����)
 SELECT ENAME, JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5)
 FROM EMP;
 /*
 SELECT ENAME, SUBSTR(ENAME, 3)
 FROM EMP;
 */
 
 -- INSTR
 SELECT INSTR ('HELLO, ORACLE!', 'L') AS INSTR_1,
 INSTR ('HELLO, ORACLE!', 'L', 5) AS INSTR_2,
 INSTR ('HELLP, ORACLE!', 'L', 2, 2) AS INSTR_3
 FROM DUAL;
 SELECT INSTR ('HELLO, ORACLE!', 'Q') AS FINDQ
 FROM DUAL;
 
 -- REPLACE
SELECT '010-1234-5678' AS ��ȭ��ȣ,
REPLACE('010-1234-5678', '-', ' ') AS ��ü��ȣ1,
REPLACE('010-1234-5678', '-') AS ��ü��ȣ2,
REPLACE('010-1234-5678', '-', '��') AS ��ü��ȣ3
FROM DUAL;
SELECT ENAME,
REPLACE(ENAME, 'A', '�ע�') AS �����
FROM EMP;

--LPAD, RPAD
SELECT
RPAD ('450815-', 14, '*') AS �ֹε��_��ȣ,
RPAD ('010-1234-', 13, '*') AS �޴���ȭ_��ȣ
FROM DUAL;
SELECT 'ORACLE',
LPAD (' ORACLE', 10, '��'),
RPAD ('ORACLE ', 10, '��'),
LPAD ('ORACLE', 10),
RPAD ('ORACLE', 10)
FROM DUAL;

--CONCAT
SELECT CONCAT(EMPNO, ENAME),
CONCAT(EMPNO, CONCAT('_O_', ENAME))
FROM EMP
WHERE ENAME = 'JAMES';
--CONCAT�Լ� ȣȯ ������ ������
SELECT EMPNO || ENAME,
EMPNO||':'||ENAME
FROM EMP
WHERE ENAME = 'JAMES';

--TRIM (�׵θ��� �ڸ���)
SELECT '[' || TRIM(' _ _Oracle_ _ ') || ']' AS TRIM,
'[' || TRIM(LEADING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_LEADING, --�����ϴ� ���� ���� ����
'[' || TRIM(TRAILING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_TRAILING, --������� ������ ���� ����
'[' || TRIM(BOTH FROM ' _ _Oracle_ _ ') || ']' AS TRIM_BOTH --���� ���� ����
FROM DUAL;

SELECT '[' || TRIM('_' FROM  '_ _Oracle_ _') || ']' AS TRIM,
'[' || TRIM(LEADING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_LEADING, --�����ϴ� ���� ���� ����
'[' || TRIM(TRAILING '_'  FROM '_ _Oracle_ _') || ']' AS TRIM_TRAILING, --������� ������ ���� ����
'[' || TRIM(BOTH '_' FROM '_ _Oracle_ _') || ']' AS TRIM_BOTH --���� ���� ����
FROM DUAL;

-- ROUND : ������ ������ Ư�� ��ġ���� �ݿø��� ���� ��ȯ
SELECT ROUND(1234.5678) AS ROUND,
ROUND(1234.5678, 0) AS ROUND_0,
ROUND(1234.5678, 1) AS ROUND_1, --�Ҽ��� ù° �ڸ��������� �ݿø�
ROUND(1234.5678, 2) AS ROUND_2, --�Ҽ��� ��° �ڸ��������� �ݿø�
ROUND(1234.5678, -1) AS ROUND_MINUS1, -- ���ؿ��� -1(���� ù° �ڸ��������� �ݿø�)
ROUND(1234.5678, -2) AS ROUND_MINUS2  -- ���ؿ��� -2(���� ��° �ڸ��������� �ݿø�)
FROM DUAL;

-- TRUNC : ������ ������ Ư�� ��ġ���� ������ ���� ��ȯ
SELECT TRUNC(1234.5678) AS TRUNC,
TRUNC(1234.5678, 0) AS TRUNC_0,
TRUNC(1234.5678, 1) AS TRUNC_1, --�Ҽ��� ù° �ڸ��������� ����
TRUNC(1234.5678, 2) AS TRUNC_2, --�Ҽ��� ��° �ڸ��������� ����
TRUNC(1234.5678, -1) AS TRUNC_MINUS1, -- ���ؿ��� -1(���� ù° �ڸ��������� ����)
TRUNC(1234.5678, -2) AS TRUNC_MINUS2  -- ���ؿ��� -2(���� ��° �ڸ��������� ����)
FROM DUAL;

-- MOD : ���ڸ� ���� ������ ���� ����
SELECT MOD(15,6), MOD(10,2), MOD(11,2)
FROM DUAL;

-- SYSDATE�� ��¥ ����ϱ�
SELECT SYSDATE AS NOW, --���� ��¥
SYSDATE+1 AS TOMORROW, --���� ��¥ + 1
SYSDATE-1 AS YESTERDAY --���� ��¥ - 1
FROM DUAL;

-- ADD_MONTHS�� �� ���� �� ���� ����/���� ��¥ ����ϱ�
SELECT SYSDATE,
ADD_MONTHS(SYSDATE, 3) AS AFT3MH,
ADD_MONTHS(SYSDATE, -4) AS BFR4MH
FROM DUAL;

SELECT EMPNO, ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 120) AS �Ի�10�ֳ�_���
FROM EMP;

SELECT EMPNO, ENAME, HIREDATE, SYSDATE
FROM EMP
WHERE SYSDATE < ADD_MONTHS(HIREDATE, 480);

-- �� ��¥ ���� ���� �� ���̸� ���ϴ� MONTHS_BETWEEN
SELECT ENAME, HIREDATE, SYSDATE,
MONTHS_BETWEEN(HIREDATE, SYSDATE) AS MONTH1, -- �Ի��Ͽ��� ���� ��¥�� ��
MONTHS_BETWEEN(SYSDATE, HIREDATE) AS MONTH2, -- ���� ��¥���� �Ի����� ��
TRUNC(MONTHS_BETWEEN(SYSDATE,HIREDATE)) AS �ټ�����, -- �Ҽ��� ���� �ڸ��� ����
CEIL(MONTHS_BETWEEN(SYSDATE,HIREDATE)) AS �ټ����� -- �Ҽ��� ���Ͽ��� ����� ū ������
FROM EMP;
-- ���ƿ��� ���� NEXT_DAY, ���� ������ ��¥ LAST_DAY
SELECT SYSDATE,
NEXT_DAY(SYSDATE,'������') AS ����_������,
LAST_DAY(SYSDATE) AS �̹���_��������
FROM DUAL;

-- 174P
-- Q1
SELECT EMPNO,
RPAD(SUBSTR(EMPNO,1,2),4,'*') AS MASKING_EMPNO,
ENAME,
RPAD(SUBSTR(ENAME,1,1),5,'*') AS MASKING_ENAME
FROM EMP
WHERE LENGTH(ENAME) >= 5 AND LENGTH(ENAME) < 6;
-- Q2
SELECT EMPNO, ENAME, SAL,
TRUNC(SAL/21.5,2) AS DAY_PAY,
ROUND((SAL/21.5)/8,1) AS TIME_PAY
FROM EMP;

-- 288-289P
-- Q1
CREATE TABLE Q288_1 AS SELECT * FROM EMP;

SELECT *
FROM Q288_1;

UPDATE Q288_1;
SET DEPTNO = 40
WHERE SAL > (SAL+12 --ŵ

SELECT SAL
FROM Q288_1;

-- Q2