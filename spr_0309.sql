-- �� ��ȯ �Լ�
SELECT EMPNO, ENAME, EMPNO + '500'
--��Ģ�����δ� �������� '500'�� �����ʹ� �������� ���� ������ ���� ������ ���� ���ڷθ� �̷���� �������� ��� ��� �Ͻ��� �� ��ȯ(�ڵ� �� ��ȯ)
FROM EMP
WHERE ENAME = 'JAMES';

-- ���� �����ͷ� ��ȯ 'TO_CHAR'
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY.MM.DD AM HH24:MI:SS DAY') AS ����_��¥_�ð�_����
FROM DUAL;

/*
�� �ð� ���� �����ϱ�
- HH24 : 24�ð����� ǥ��
- HH, HH12 : 12�ð����� ǥ��
- MI : ��
- SS : ��
- AM, PM, A.M., P.M. : ����, ����

�� ��¥ ���� �����ϱ�
- CC : ����
- YYYY, RRRR : ���� (4�ڸ� ����)
- YY, RR : ���� (2�ڸ� ����)
- MM : �� (2�ڸ� ����)
- MON : ��(�� �� �̸� ����)
- MONTH : ��(�� �� �̸� ��ü)
- DD : �� (2�ڸ� ����)
- DDD : 1~366 (1�� �� ��ĥ)
- DY : ���� (�� ���� �̸� ����)
- DAY : ���� (�� ���� �̸� ��ü)
- W : 1~53 (1�� �� ���° ��)
*/

-- Ư�� �� ���� ��¥ ����ϱ�
/*
TO_CHAR([��¥ ������], '[��µǱ� ���ϴ� ���� ����]', 'NLS_DATE_LANGUAGE = ���');
*/
SELECT TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = KOREAN') AS �ѱ�,
TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = ENGLISH') AS ����,
TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS �Ϲ�
FROM DUAL;

-- ���� ������ ������ �����Ͽ� ����ϱ�
SELECT SAL,
TO_CHAR(SAL, '999,999') AS �������ڸ�, --9�� ���� ���ڸ��� �ǹ�(���ڸ��� �� ä��)
TO_CHAR(SAL, '00,999') AS ���ں��ڸ�, -- 0�� ���ڸ��� 0�� ä��
TO_CHAR(SAL, '$999,999') AS �޷�ǥ��, -- $�޷� ǥ��
TO_CHAR(SAL, 'L999,999') AS �������ڸ�, -- L �ش� ���� ȭ��� ���
TO_CHAR(SAL, '999,999.00') AS �Ҽ��� -- .���� �Ҽ���, ,���� õ������ ����
FROM EMP;

-- ���� �����ͷ� ��ȯ�ϴ� TO_NUMBER

SELECT 1300 + '1500'
FROM DUAL;

SELECT TO_NUMBER('1,300', '9999') + TO_NUMBER('2,500', '9999') AS ����_����
FROM DUAL;

-- ���� �����͸� ��¥ �����ͷ� ��ȯ�ϴ� TO_DATE
SELECT
TO_DATE('2021-03-09', 'YYYY.MM.DD') AS ��¥1,
TO_DATE('20210309', 'YYYY.MM.DD') AS ��¥2
FROM DUAL;

-- Ư�� ��¥ ���Ŀ� �Ի��� ��� ã��
SELECT *
FROM EMP
WHERE HIREDATE > TO_DATE('19810601', 'YYYY/MM/DD');

-- NULL���� ��ü�ϴ� NVL
SELECT ENAME, SAL, COMM, SAL*12+COMM AS ANNSAL,
NVL (COMM, 0), SAL*12+NVL(COMM, 0)
FROM EMP;

SELECT EMPNO, ENAME, COMM,
NVL2(COMM, '�ƴ�', '����'), NVL2(COMM, SAL*12+COMM, SAL*12)
FROM EMP;

-- DECODE�Լ�
SELECT EMPNO, ENAME, JOB, SAL,
DECODE(JOB,
'MANAGER', SAL*1.1,
'SALESMAN', SAL*1.05,
'ANALYST', SAL,
SAL*1.03) AS UPSAL
FROM EMP;

-- CASE��
SELECT EMPNO, ENAME, JOB, SAL,
CASE JOB --���� ������
WHEN 'MANAGER' THEN SAL*1.1
WHEN 'SALESMAN' THEN SAL*1.05
WHEN 'ANALYST' THEN SAL
ELSE SAL * 1.03
END AS UPSAL
FROM EMP;

-- ���� �����;��� CASE�� ���
SELECT EMPNO, ENAME, COMM,
CASE
WHEN COMM IS NULL THEN '�ش���� ����'
WHEN COMM=0 THEN '�������'
WHEN COMM>0 THEN '����:' || COMM
END AS ����ó�����
FROM EMP;

-- �׷� �Լ�
SELECT SUM(SAL)
FROM EMP;
/*
�ֿ� �׷� �Լ�
SUM : ������ �������� ��
COUNT : ������ �������� ����
MAX : ������ ������ �� �ִ�
MIN : ������ ������ �� �ּڰ�
AVG : ������ �������� ��հ� ��ȯ
*/

--GROUP BY���� ������� ������ ���̺� ��ü ���� �ϳ��� �׷����� ������
/*
SELECT ENAME, SUM(SAL) <- ��ó�� ������ �Լ��� ������ �Լ��� �̷��� ǥ�� ���·δ� ����� �� ����.
*/
SELECT SUM(COMM) -- SUM�� NULL�� ��� ���� ���ٰ� �Ǵ��ϰ� ��ü ������
FROM EMP;

-- ������ ������ ����ϴ� COUNT
SELECT COUNT(*)
FROM EMP;

SELECT COUNT(*)
FROM EMP
WHERE DEPTNO=30;
-- �� NULL���� ī��Ʈ �ȵ�

SELECT COUNT(COMM)
FROM EMP;
--WHERE COMM IS NOT NULL; (�� ����ص� ������� �Ȱ��� ��µȴ�.)

SELECT MAX(SAL)
FROM EMP
WHERE DEPTNO=30;

SELECT MIN(HIREDATE)
FROM EMP
WHERE DEPTNO=20;

SELECT AVG(SAL), TRUNC(AVG(SAL))
FROM EMP;

SELECT AVG(COMM)
FROM EMP
WHERE DEPTNO=30;

-- ��� ���� ���ϴ� ���� ���� ����ϴ� GROUP BY
SELECT DEPTNO, AVG(SAL), SUM(SAL), MAX(SAL), MIN(SAL)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
GROUP BY DEPTNO, JOB
HAVING AVG(SAL) >= 1500;

SELECT ENAME, SAL, ROUND(SAL*0.15,2) AS "ȸ��"
FROM EMP
WHERE SAL BETWEEN 1500 AND 3000;

SELECT DEPTNO, ENAME, SAL FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP);

CREATE TABLE EMP_COPY AS SELECT * FROM EMP;

SELECT * FROM EMP_COPY;

SELECT DEPTNO, ENAME, SAL FROM EMP_COPY
WHERE SAL > (SELECT AVG(SAL) FROM EMP_COPY);

ROLLBACK;

SELECT DEPTNO, ENAME, SAL, HIREDATE, SAL*1.10 AS �޿��λ� FROM EMP
WHERE HIREDATE > (SELECT MIN(HIREDATE) FROM EMP);

-- 288P Q3: 10�� �μ� ��� �� ��� �޿����� ���� �޿��� �޴� �������� 40�� �μ��� �̵�
UPDATE EMP_COPY
SET DEPTNO = 40
WHERE SAL > (SELECT AVG(SAL) FROM EMP_COPY) AND DEPTNO=10;
-- 288P Q4: 20�� �μ� ��� �߿� �Ի����� ���� ���� ������� �ʰ� �Ի��� ����� �޿��� 10%�̻��ϰ� 50�� �μ��� �̵�
UPDATE EMP_COPY
SET SAL = SAL*1.10, DEPTNO=50
WHERE HIREDATE > (SELECT MIN(HIREDATE) FROM EMP_COPY) AND DEPTNO=20;

-- 212P Q1 : �μ���ȣ, ��� �޿�, �ְ� �޿�, ���� �޿�, ��� ���� ����մϴ�.
-- ��, ��� �޿��� ����� �� �Ҽ����� �����ϰ� �� �μ� ��ȣ ���� ����ϼ���.
SELECT DEPTNO, TRUNC(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(DEPTNO) AS "CNT"
FROM EMP
GROUP BY DEPTNO;
-- 212P Q2 : ���� ��å�� �����ϴ� ����� 3�� �̻��� ��å�� �ο����� ����ϼ���.
SELECT JOB, COUNT(JOB)
FROM EMP
GROUP BY JOB
HAVING COUNT(JOB) >= 3;
-- 212P Q3 : ������� �Ի� ����(HIRE_YEAR)�� �������� �μ����� �� ���� �Ի��ߴ��� ����ϼ���.

-- 213P Q4 : �߰� ����(COMM)�� ��� ���� ���� �ʴ� ��� ���� ����ϼ���.

-- 213P Q5 : �� �μ��� �Ի� ������ ��� ��, �ְ� �޿�, �޿� ��, ��� �޿��� ����ϰ� �� �μ��� �Ұ�� �Ѱ踦 ����ϼ���.