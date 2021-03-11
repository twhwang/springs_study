--- 1. EMP ���̺��� ������ Ȯ���ϴ� ��ɹ��� �ۼ��ϼ���.
DESC EMP;

--- 2. EMP ���̺��� �μ���ȣ(DEPTNO) �� ���� 30�̰� ����(JOB) �� ���� SALESMAN�� �����͸� ��µǵ��� ��ȸ�ϴ� ������ �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

--- 3. EMP ���̺��� �޿�(SAL) �� ���� 2000 �̻� 3000 ������ ��� �����͸� ��ȸ�ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

--- 4. EMP ���̺��� ��� �̸�(ENAME)�� AM�� ���ԵǾ� ���� ���� ��� �����͸� ��ȸ�ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE ENAME NOT LIKE '%AM%';

--- 5. EMP ���̺��� �� ������ ���� EMP_TEMP ���̺��� �����ϴ� SQL���� �ۼ��ϼ���.
CREATE TABLE EMP_TEMP
    AS SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
    FROM EMP
    WHERE 1!=1;
SELECT *
    FROM EMP_TEMP;
    
--- 6. EMP_TEMP ���̺� ��� ��ȣ(EMPNO)�� 9999, ��� �̸�(ENAME)�� ȫ�浿, ��å(JOB)�� PRESIDENT,
--- ���� ���(MGR)�� NULL��, �������(HIREDATE)�� 2001�� 1�� 1��, �޿�(SAL)�� 5000, �߰� ����(COMM)�� 1000,
--- �μ� ��ȣ(DEPTNO)�� 10���� �����͸� �߰��ϴ� SQL���� �ۼ��ϼ���.
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUES (9999, 'ȫ�浿', 'PRESIDENT', NULL, '2001-01-01', 5000, 1000, 10);
SELECT *
    FROM EMP_TEMP;
    
--- 7. DEPT ���̺��� �����ؼ� DEPT_TEMP2 ���̺��� �����ϴ� SQL���� �ۼ��ϼ���.
CREATE TABLE DEPT_TEMP2
    AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TEMP2;

--- 8. DEPT_TEMP2 ���̺��� 40�� �μ�(DEPTNO)�� �μ� �̸�(DNAME)�� DATABASE�� �����ϰ� ����(LOC)�� SEOUL�� �����ϴ� SQL���� �ۼ��ϼ���.
UPDATE DEPT_TEMP2
    SET DNAME = 'DATABASE', LOC = 'SEOUL'
    WHERE DEPTNO=40;
SELECT * FROM DEPT_TEMP2;

--- 9. Ʈ������� ����ϴ� ��ɾ �ۼ��ϼ���.
ROLLBACK;

--- 10. EMP ���̺��� ��� �̸��� ��ҹ��� ���� ���� SMITH�� ��� ������ ��ȸ�ϴ� SQL���� �ۼ��ϼ���.
SELECT EMPNO, INITCAP(ENAME) AS ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP
WHERE ENAME = 'SMITH';

--- 11. EMP ���̺��� ��� �̸��� 4���� ������ ��� ������ ��ȸ�ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE LENGTH(ENAME) <= 4;

--- 12. EMP ���̺��� ��å �̸��� ù���ں��� �� ���� ����ϴ� SQL���� �ۼ��ϼ���.
SELECT SUBSTR(JOB, 1, 3) AS "JOB_3WORD"
FROM EMP;

--- 13. EMP ���̺��� 1981�� 6�� 1�� ���Ŀ� �Ի��� ��� ������ ����ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE HIREDATE > '1981-06-01'
ORDER BY HIREDATE;

--- 14. EMP ���̺��� NVL �Լ��� ����Ͽ� ����� �����ȣ(EMPNO), ����̸�(ENAME),
--- ����(SAL), �߰�����(COMM), �׸��� 1��ġ ������ ���ؼ� ANNSAL ���� ����ϴ� SQL���� �ۼ��ϼ���.
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0)AS COMM, SAL*12+NVL(COMM, 0) AS ANNSAL
FROM EMP;

--- 15. EMP ���̺��� �Ʒ��� ���� ����� �������� SQL���� �ۼ��ϼ���.
--- EMP ���̺��� ��� ����� ������� ���ӻ���� �����ȣ(MGR)�� ������ ���� ������ �������� ��ȯ�ؼ� CHG_MGR���� ����ϼ���.
--SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.MGR AS CHG_MGR,
DECODE(E2.MGR,SUBSTR(E2.MGR,1,2)=75, E2.MGR=5555)
FROM EMP E1 JOIN EMP E2 ON (E1.MGR = E2.EMPNO);

--- 16. EMP ���̺��� �ߺ��� ������ ��å�� ������ ����ϴ� SQL���� �ۼ��ϼ���.
SELECT COUNT(DISTINCT JOB) AS JOB_NUM, JOB AS JOB_NAME
FROM EMP
GROUP BY JOB;

--- 17. EMP ���̺��� ������ 3000 ���Ϸ� �޴� ������� �μ���ȣ�� ��å���� �׷��� �����,
--- �׷캰�� ���� ����� 2000 �̻��� �׷츸 �����Ͽ�, �Ʒ��� ���� �μ���ȣ�� ��å �� ��� ������ ����ϴ� SQL���� �ۼ��ϼ���.
--- �μ���ȣ�� ��å���� �������� ������.
SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
WHERE SAL <= 3000 AND 2000 < SAL
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

--- 18. EMP�� DEPT ���̺��� ����(SAL)�� 3000 �̻� �޴� ������� ����̸��� �Ҽ� �μ��̸��� ����ϴ� SQL���� �ۼ��ϼ���.
SELECT ENAME, DNAME
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
WHERE SAL >= 3000;

--- 19. EMP�� DEPT ���̺��� �Ʒ��� ���� �� �μ��� ��ձ޿�, �ִ�޿�, �ּұ޿�, ������� ����ϴ� SQL���� �ۼ��ϼ���.
SELECT E.DEPTNO, DNAME, TRUNC(AVG(SAL)) AS AVG_SAL, MAX(SAL) AS MAX_SAL, MIN(SAL) AS MIN_SAL, COUNT(DNAME) AS CNT
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
GROUP BY E.DEPTNO, DNAME;

--- 20. EMP ���̺��� MARTIN���� �޿��� ���� ��������� ����ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP
WHERE SAL < (SELECT SAL FROM EMP WHERE ENAME='MARTIN');

--- 21. EMP ���̺��� 30�� �μ� ������� �ִ� �޿����� ���� �޿��� �޴� ��������� ����ϴ� SQL���� �ۼ��ϼ���.
--- (������������ ������ ������ ��İ� ������ ������ ������� ���� 2���� ��� �ۼ��ϼ���)
SELECT *
FROM EMP
WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE DEPTNO =30);

--- 22. EMP, SALGRADE ���̺��� ����� �޿������ 3����̰� 30�� �μ� �Ҽ��� ������� ������ ����ϴ� SQL���� �ۼ��ϼ���.
SELECT *
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO =30;

--- 23. CREATE ��ɾ ����Ͽ� ���� �� ������ ������ EMP_DDL ���̺��� �����ϴ� SQL���� �ۼ��ϰ� �����ϼ���.
--- �׸��� DESC ��ɾ�� ������ ���̺��� �� ������ Ȯ���ϼ���.
CREATE TABLE SCOTT.EMP_DDL(
EMPNO NUMBER(4),
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
);
DESC EMP_DDL;

--- 24. ������ �����ڸ� �̿��Ͽ� EMP ���̺��� 10�� �μ��� �ٹ��ϴ� �����
--- 20�� �μ��� �ٹ��ϴ� ��� ������ ��ġ�� ��� ���� �ߺ��� �����Ͽ� �����ȣ, ����̸�, �޿�, �μ���ȣ�� ����ϼ���.
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 20;

--- 25. �ܺ� ������ ����Ͽ� ��� �μ������� ��������� �Ʒ��� ���� �μ��̸�, ����̸� ������ �����Ͽ� ����ϼ���.
--- (����Ŭ ���� ���� �Ǵ� SQL ǥ�� ���� �� �ϳ��� �����ϼ���.)
SELECT DNAME, E1.ENAME, E1.MGR, E1.SAL, GRADE, E2.MGR AS MGR_EMPNO, E2.ENAME AS MGR_ENAME
FROM EMP E1, EMP E2, DEPT D, SALGRADE S
WHERE E1.MGR = E2.EMPNO(+) AND E1.DEPTNO = D.DEPTNO AND E1.SAL BETWEEN S.LOSAL AND S.HISAL
ORDER BY DNAME;