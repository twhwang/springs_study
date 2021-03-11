--- 1. EMP 테이블의 구성을 확인하는 명령문을 작성하세요.
DESC EMP;

--- 2. EMP 테이블에서 부서번호(DEPTNO) 열 값이 30이고 직업(JOB) 열 값이 SALESMAN인 데이터만 출력되도록 조회하는 문장을 작성하세요.
SELECT *
FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

--- 3. EMP 테이블에서 급여(SAL) 열 값이 2000 이상 3000 이하인 사원 데이터를 조회하는 SQL문을 작성하세요.
SELECT *
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;

--- 4. EMP 테이블에서 사원 이름(ENAME)에 AM이 포함되어 있지 않은 사원 데이터를 조회하는 SQL문을 작성하세요.
SELECT *
FROM EMP
WHERE ENAME NOT LIKE '%AM%';

--- 5. EMP 테이블의 열 구조만 같은 EMP_TEMP 테이블을 생성하는 SQL문을 작성하세요.
CREATE TABLE EMP_TEMP
    AS SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
    FROM EMP
    WHERE 1!=1;
SELECT *
    FROM EMP_TEMP;
    
--- 6. EMP_TEMP 테이블에 사원 번호(EMPNO)는 9999, 사원 이름(ENAME)은 홍길동, 직책(JOB)은 PRESIDENT,
--- 직속 상관(MGR)은 NULL값, 고용일자(HIREDATE)는 2001년 1월 1일, 급여(SAL)는 5000, 추가 수당(COMM)은 1000,
--- 부서 번호(DEPTNO)는 10으로 데이터를 추가하는 SQL문을 작성하세요.
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001-01-01', 5000, 1000, 10);
SELECT *
    FROM EMP_TEMP;
    
--- 7. DEPT 테이블을 복사해서 DEPT_TEMP2 테이블을 생성하는 SQL문을 작성하세요.
CREATE TABLE DEPT_TEMP2
    AS SELECT * FROM DEPT;
SELECT * FROM DEPT_TEMP2;

--- 8. DEPT_TEMP2 테이블에서 40번 부서(DEPTNO)의 부서 이름(DNAME)을 DATABASE로 수정하고 지역(LOC)을 SEOUL로 수정하는 SQL문을 작성하세요.
UPDATE DEPT_TEMP2
    SET DNAME = 'DATABASE', LOC = 'SEOUL'
    WHERE DEPTNO=40;
SELECT * FROM DEPT_TEMP2;

--- 9. 트랜잭션을 취소하는 명령어를 작성하세요.
ROLLBACK;

--- 10. EMP 테이블에서 사원 이름이 대소문자 구분 없이 SMITH인 사원 정보를 조회하는 SQL문을 작성하세요.
SELECT EMPNO, INITCAP(ENAME) AS ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP
WHERE ENAME = 'SMITH';

--- 11. EMP 테이블에서 사원 이름이 4글자 이하인 사원 정보를 조회하는 SQL문을 작성하세요.
SELECT *
FROM EMP
WHERE LENGTH(ENAME) <= 4;

--- 12. EMP 테이블에서 직책 이름을 첫글자부터 세 개만 출력하는 SQL문을 작성하세요.
SELECT SUBSTR(JOB, 1, 3) AS "JOB_3WORD"
FROM EMP;

--- 13. EMP 테이블에서 1981년 6월 1일 이후에 입사한 사원 정보를 출력하는 SQL문을 작성하세요.
SELECT *
FROM EMP
WHERE HIREDATE > '1981-06-01'
ORDER BY HIREDATE;

--- 14. EMP 테이블에서 NVL 함수를 사용하여 사원별 사원번호(EMPNO), 사원이름(ENAME),
--- 월급(SAL), 추가수당(COMM), 그리고 1년치 연봉을 구해서 ANNSAL 열로 출력하는 SQL문을 작성하세요.
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0)AS COMM, SAL*12+NVL(COMM, 0) AS ANNSAL
FROM EMP;

--- 15. EMP 테이블에서 아래와 같은 결과가 나오도록 SQL문을 작성하세요.
--- EMP 테이블의 모든 사원을 대상으로 직속상관의 사원번호(MGR)를 다음과 같은 조건을 기준으로 변환해서 CHG_MGR열에 출력하세요.
--SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.MGR AS CHG_MGR,
DECODE(E2.MGR,SUBSTR(E2.MGR,1,2)=75, E2.MGR=5555)
FROM EMP E1 JOIN EMP E2 ON (E1.MGR = E2.EMPNO);

--- 16. EMP 테이블에서 중복을 제외한 직책의 개수를 출력하는 SQL문을 작성하세요.
SELECT COUNT(DISTINCT JOB) AS JOB_NUM, JOB AS JOB_NAME
FROM EMP
GROUP BY JOB;

--- 17. EMP 테이블에서 월급을 3000 이하로 받는 사원들을 부서번호와 직책별로 그룹을 만들고,
--- 그룹별로 월급 평균이 2000 이상인 그룹만 선택하여, 아래와 같이 부서번호와 직책 별 평균 월급을 출력하는 SQL문을 작성하세요.
--- 부서번호와 직책으로 오름차순 정렬함.
SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
WHERE SAL <= 3000 AND 2000 < SAL
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

--- 18. EMP와 DEPT 테이블에서 월급(SAL)을 3000 이상 받는 사원들의 사원이름과 소속 부서이름을 출력하는 SQL문을 작성하세요.
SELECT ENAME, DNAME
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
WHERE SAL >= 3000;

--- 19. EMP와 DEPT 테이블에서 아래와 같이 각 부서별 평균급여, 최대급여, 최소급여, 사원수를 출력하는 SQL문을 작성하세요.
SELECT E.DEPTNO, DNAME, TRUNC(AVG(SAL)) AS AVG_SAL, MAX(SAL) AS MAX_SAL, MIN(SAL) AS MIN_SAL, COUNT(DNAME) AS CNT
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
GROUP BY E.DEPTNO, DNAME;

--- 20. EMP 테이블에서 MARTIN보다 급여가 낮은 사원정보를 출력하는 SQL문을 작성하세요.
SELECT *
FROM EMP
WHERE SAL < (SELECT SAL FROM EMP WHERE ENAME='MARTIN');

--- 21. EMP 테이블에서 30번 부서 사원들의 최대 급여보다 많은 급여를 받는 사원정보를 출력하는 SQL문을 작성하세요.
--- (서브쿼리에서 단일행 연산자 방식과 다중행 연산자 방식으로 문장 2개를 모두 작성하세요)
SELECT *
FROM EMP
WHERE SAL > (SELECT MAX(SAL) FROM EMP WHERE DEPTNO =30);

--- 22. EMP, SALGRADE 테이블에서 사원의 급여등급이 3등급이고 30번 부서 소속인 사원들의 정보를 출력하는 SQL문을 작성하세요.
SELECT *
FROM EMP E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO =30;

--- 23. CREATE 명령어를 사용하여 다음 열 구조를 가지는 EMP_DDL 테이블을 생성하는 SQL문을 작성하고 실행하세요.
--- 그리고 DESC 명령어로 생성된 테이블의 열 구조를 확인하세요.
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

--- 24. 합집합 연산자를 이용하여 EMP 테이블에서 10번 부서에 근무하는 사원과
--- 20번 부서에 근무하는 사원 정보를 합치고 결과 행의 중복은 제거하여 사원번호, 사원이름, 급여, 부서번호를 출력하세요.
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 20;

--- 25. 외부 조인을 사용하여 모든 부서정보와 사원정보를 아래와 같이 부서이름, 사원이름 순으로 정렬하여 출력하세요.
--- (오라클 전용 문법 또는 SQL 표준 문법 중 하나를 적용하세요.)
SELECT DNAME, E1.ENAME, E1.MGR, E1.SAL, GRADE, E2.MGR AS MGR_EMPNO, E2.ENAME AS MGR_ENAME
FROM EMP E1, EMP E2, DEPT D, SALGRADE S
WHERE E1.MGR = E2.EMPNO(+) AND E1.DEPTNO = D.DEPTNO AND E1.SAL BETWEEN S.LOSAL AND S.HISAL
ORDER BY DNAME;