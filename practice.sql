SELECT  *
FROM EMP
WHERE ENAME >= 'O';

SELECT *
FROM EMP
WHERE NOT (DEPTNO=30 AND JOB='SALESMAN');

SELECT *
FROM EMP
WHERE JOB = 'SALESMAN'
OR JOB = 'MANAGER'
OR JOB = 'CLERK'
ORDER BY JOB;

SELECT *
FROM EMP
WHERE JOB IN ('MANAGER', 'CLERK', 'SALESMAN');

SELECT *
FROM EMP
WHERE EMPNO NOT IN (7369, 7499, 7566);

SELECT *
FROM EMP
WHERE SAL >= 2000 AND SAL <= 3000;

SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

SELECT *
FROM EMP
WHERE ENAME LIKE 'M%';

SELECT *
FROM EMP
WHERE ENAME LIKE '%ES';

SELECT *
FROM EMP
WHERE ENAME LIKE '_L%';

SELECT *
FROM EMP
WHERE COMM IS NULL; // COMM값이 NULL인 경우를 필터링

SELECT *
FROM EMP
WHERE COMM IS NOT NULL; // COMM값이 NULL을 제외하고 필터링


-- 테이블 생성 CREATE문
CREATE TABLE DEPT_TEMP
AS SELECT * FROM DEPT; --기존 테이블 DEPT를 불러오기

DROP TABLE DEPT_TEMP;

CREATE TABLE DEPT_TEMP
AS SELECT * FROM DEPT;

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (50, 'DATABASE', 'SEOUL');

INSERT INTO DEPT_TEMP (DNAME, DEPTNO, LOC)
VALUES ('JAVA', 60, 'BUSAN');

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (50, 'DATABASE', 'JEJU');

INSERT INTO DEPT_TEMP
VALUES (70, 'WEB', 'INCHEON');

INSERT INTO DEPT_TEMP
VALUES (80, 'MARKETING', NULL);

SELECT * FROM DEPT_TEMP;

CREATE TABLE EMP_TEMP
AS SELECT * FROM EMP
WHERE 1 != 1;

DESC EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2021-03-05', 5000, 1000, 10);

INSERT INTO EMP_TEMP
VALUES (9999, '성춘향', 'MANAGER', NULL, '2021/03/05', 4000, NULL, 20);

INSERT INTO EMP_TEMP
VALUES (3333, '이순신', 'CLERK', NULL, TO_DATE('05/03/2021','DD/MM/YYYY'), 3000, NULL, 30);

SELECT * FROM EMP_TEMP;

-- 125~6P Q1
SELECT *
FROM EMP
WHERE ENAME LIKE '%S';

-- 125~6P Q2
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

-- 125~6P Q3
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO
FROM EMP
WHERE SAL > 2000;

-- 125~6P Q4
SELECT *
FROM EMP
WHERE NOT SAL > 2000 AND SAL < 3000;

-- 125~6P Q5
SELECT ENAME, EMPNO, SAL, DEPTNO
FROM EMP
WHERE SAL NOT BETWEEN 1000 AND 2000 AND ENAME LIKE '%E%' AND DEPTNO = 30;

-- 125~6P Q6
SELECT *
FROM EMP
WHERE COMM IS NULL  AND JOB IN('MANAGER' , 'CLERK') AND ENAME NOT LIKE '%L__';

-- 287P Q1
CREATE TABLE CHAP10HW_EMP AS SELECT * FROM EMP;
CREATE TABLE CHAP10HW_DEPT AS SELECT * FROM DEPT;
CREATE TABLE CHAP10HW_SALGRADE AS SELECT * FROM SALGRADE;

INSERT INTO CHAP10HW_DEPT
VALUES (50, 'ORACLE', 'BUSAN');

INSERT INTO CHAP10HW_DEPT
VALUES (60, 'SQL', 'ILSAN')

SELECT *
FROM chap10hw_dept;