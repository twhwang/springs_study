SELECT DISTINCT DEPTNO
FROM EMP;
SELECT DISTINCT "JOB", "DEPTNO"
FROM EMP;
SELECT ALL "JOB", "DEPTNO"
FROM EMP;

-- ���� ����� ����Ͽ� ���
SELECT "ENAME", "SAL", "COMM", SAL*12+COMM AS "ANSWER"
FROM EMP;

-- ���� ��Ī�� �����Ѵ�.
SELECT ENAME AS �����, SAL AS �޿�, COMM AS �߰�����, SAL*12+COMM AS ����
FROM EMP;

SELECT *
FROM EMP
ORDER BY SAL; --������ ����

SELECT ENAME, JOB --3����
FROM EMP --1����
WHERE JOB = 'SALESMAN'; --2����

SELECT *
FROM EMP
WHERE JOB = 'SALESMAN' AND DEPTNO = 30;

-- AND(�׸���) / OR(�Ǵ�)
-- 2���� �̻��� ������ ���͸��� ��� ����Ѵ�.

SELECT *
FROM EMP
WHERE EMPNO = 7499 AND DEPTNO = 30;