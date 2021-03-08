-- 시스템에서 현재 날짜 가져오기
SELECT SYSDATE FROM DUAL;

-- 데이터 수정하기
/*
UPDATE [변경할 테이블]
SET [변경할 열1] = [데이터], [변경할 열2] = [데이터] ~ [변경할 열Z] = [데이터]
[WHERE 데이터를 변경할 대상 행을 선별]
※ 생략할 경우 테이블 내의 지정된 모든 열의 데이터가 변경됨
*/

CREATE TABLE DEPT_TEMP2
AS SELECT * FROM DEPT;

UPDATE DEPT_TEMP2
SET LOC='SEOUL';

ROLLBACK;

UPDATE DEPT_TEMP2
SET DNAME = 'DATABASE', LOC= 'SEOUL'
WHERE DEPTNO = 40; --DEPTNO이 40인 경우에만 수정

SELECT * FROM DEPT_TEMP2;

/*
1분복습 [EMP_TEMP 테이블에서 급여(SAL)가 2500이하인 사람을 대상으로 추가 수당(COMM)을 50으로 수정]
UPDATE EMP_TEMP
SET COMM = 50
WHERE SAL <= 2500;
*/

-- 데이터 삭제
/*
DELETE FROM [삭제할 표 이름]
[WHERE 데이터를 삭제할 대상 행을 선별]
*/

CREATE TABLE EMP_TEMP2
AS SELECT * FROM EMP;

DELETE FROM EMP_TEMP2
WHERE JOB = 'MANAGER'; --JOB이 MANAGER인 경우만 삭제

SELECT * FROM EMP_TEMP2;

ROLLBACK;

COMMIT;

-- 집합 연산자
/*
UNION (합집합)
※ 주의점 : 출력하려는 열 개수와 자료형이 순서별로 일치하여야 한다.
*/

SELECT *
FROM EMP
WHERE DEPTNO = 10
UNION
SELECT *
FROM EMP
WHERE DEPTNO = 20;
 --위의 코드를 다르게 작성하는 법 (UNION을 사용하지 않은 경우)
 SELECT *
 FROM EMP
 WHERE DEPTNO IN (10, 20);
 
 SELECT *
 FROM EMP
 MINUS
 SELECT *
 FROM EMP
 WHERE DEPTNO = 10;
 -- 위의 코드를 다르게 작성하는 법
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
 우선 순위 AND > OR
 만약 OR의 우선 순위를 높이고 싶다면 해당 부분을 괄호로 감싸는 것을 권장한다.
 (DEPTNO 30 OR JOB 'SALESMAN')
 */
 
 -- 오라클 함수
 -- 대·소문자 전환
 SELECT ENAME, UPPER(ENAME), LOWER(ENAME), INITCAP(ENAME)
 FROM EMP;
 
 SELECT *
 FROM EMP
 WHERE UPPER(ENAME) LIKE UPPER('%james%');
 -- UPPER함수로 문자열 비교하기 (ENAME JAMES 단어를 포함한 데이터를 검색)
 
 SELECT UPPER(ENAME)
 FROM EMP;
 
 -- 문자 길이(LENGTH)
 SELECT ENAME, LENGTH(ENAME)
 FROM EMP;
 
 -- WHERE에도 사용 (문자열 길이로 조건 검색)
 SELECT ENAME, LENGTH(ENAME)
 FROM EMP
 WHERE LENGTH(ENAME) >= 5;
 
 --LENGTH(글자수)와 LENGTHB(바이트용량)
 SELECT LENGTH('한글'), LENGTHB('한글')
 FROM DUAL;
 
 -- SUBSTR (문자열 일부를 추출)
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
SELECT '010-1234-5678' AS 전화번호,
REPLACE('010-1234-5678', '-', ' ') AS 대체번호1,
REPLACE('010-1234-5678', '-') AS 대체번호2,
REPLACE('010-1234-5678', '-', '·') AS 대체번호3
FROM DUAL;
SELECT ENAME,
REPLACE(ENAME, 'A', '§♧') AS 결과물
FROM EMP;

--LPAD, RPAD
SELECT
RPAD ('450815-', 14, '*') AS 주민등록_번호,
RPAD ('010-1234-', 13, '*') AS 휴대전화_번호
FROM DUAL;
SELECT 'ORACLE',
LPAD (' ORACLE', 10, '■'),
RPAD ('ORACLE ', 10, '■'),
LPAD ('ORACLE', 10),
RPAD ('ORACLE', 10)
FROM DUAL;

--CONCAT
SELECT CONCAT(EMPNO, ENAME),
CONCAT(EMPNO, CONCAT('_O_', ENAME))
FROM EMP
WHERE ENAME = 'JAMES';
--CONCAT함수 호환 가능한 연산자
SELECT EMPNO || ENAME,
EMPNO||':'||ENAME
FROM EMP
WHERE ENAME = 'JAMES';

--TRIM (테두리를 자르다)
SELECT '[' || TRIM(' _ _Oracle_ _ ') || ']' AS TRIM,
'[' || TRIM(LEADING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_LEADING, --리드하는 왼쪽 공백 제거
'[' || TRIM(TRAILING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_TRAILING, --따라오는 오른쪽 공백 제거
'[' || TRIM(BOTH FROM ' _ _Oracle_ _ ') || ']' AS TRIM_BOTH --양쪽 공백 제거
FROM DUAL;

SELECT '[' || TRIM('_' FROM  '_ _Oracle_ _') || ']' AS TRIM,
'[' || TRIM(LEADING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_LEADING, --리드하는 왼쪽 공백 제거
'[' || TRIM(TRAILING '_'  FROM '_ _Oracle_ _') || ']' AS TRIM_TRAILING, --따라오는 오른쪽 공백 제거
'[' || TRIM(BOTH '_' FROM '_ _Oracle_ _') || ']' AS TRIM_BOTH --양쪽 공백 제거
FROM DUAL;

-- ROUND : 지정된 숫자의 특정 위치에서 반올림한 값을 반환
SELECT ROUND(1234.5678) AS ROUND,
ROUND(1234.5678, 0) AS ROUND_0,
ROUND(1234.5678, 1) AS ROUND_1, --소수점 첫째 자리기준으로 반올림
ROUND(1234.5678, 2) AS ROUND_2, --소수점 둘째 자리기준으로 반올림
ROUND(1234.5678, -1) AS ROUND_MINUS1, -- 기준에서 -1(정수 첫째 자리기준으로 반올림)
ROUND(1234.5678, -2) AS ROUND_MINUS2  -- 기준에서 -2(정수 둘째 자리기준으로 반올림)
FROM DUAL;

-- TRUNC : 지정된 숫자의 특정 위치에서 버림한 값을 반환
SELECT TRUNC(1234.5678) AS TRUNC,
TRUNC(1234.5678, 0) AS TRUNC_0,
TRUNC(1234.5678, 1) AS TRUNC_1, --소수점 첫째 자리기준으로 버림
TRUNC(1234.5678, 2) AS TRUNC_2, --소수점 둘째 자리기준으로 버림
TRUNC(1234.5678, -1) AS TRUNC_MINUS1, -- 기준에서 -1(정수 첫째 자리기준으로 버림)
TRUNC(1234.5678, -2) AS TRUNC_MINUS2  -- 기준에서 -2(정수 둘째 자리기준으로 버림)
FROM DUAL;

-- MOD : 숫자를 나눈 나머지 값을 구함
SELECT MOD(15,6), MOD(10,2), MOD(11,2)
FROM DUAL;

-- SYSDATE로 날짜 출력하기
SELECT SYSDATE AS NOW, --현재 날짜
SYSDATE+1 AS TOMORROW, --현재 날짜 + 1
SYSDATE-1 AS YESTERDAY --현재 날짜 - 1
FROM DUAL;

-- ADD_MONTHS로 현 시점 몇 개월 이전/이후 날짜 출력하기
SELECT SYSDATE,
ADD_MONTHS(SYSDATE, 3) AS AFT3MH,
ADD_MONTHS(SYSDATE, -4) AS BFR4MH
FROM DUAL;

SELECT EMPNO, ENAME, HIREDATE, ADD_MONTHS(HIREDATE, 120) AS 입사10주년_사원
FROM EMP;

SELECT EMPNO, ENAME, HIREDATE, SYSDATE
FROM EMP
WHERE SYSDATE < ADD_MONTHS(HIREDATE, 480);

-- 두 날짜 간의 개월 수 차이를 구하는 MONTHS_BETWEEN
SELECT ENAME, HIREDATE, SYSDATE,
MONTHS_BETWEEN(HIREDATE, SYSDATE) AS MONTH1, -- 입사일에서 현재 날짜를 뺌
MONTHS_BETWEEN(SYSDATE, HIREDATE) AS MONTH2, -- 현재 날짜에서 입사일을 뺌
TRUNC(MONTHS_BETWEEN(SYSDATE,HIREDATE)) AS 근속일자, -- 소수점 이하 자리를 버림
CEIL(MONTHS_BETWEEN(SYSDATE,HIREDATE)) AS 근속일자 -- 소수점 이하에서 가까운 큰 정수로
FROM EMP;
-- 돌아오는 요일 NEXT_DAY, 달의 마지막 날짜 LAST_DAY
SELECT SYSDATE,
NEXT_DAY(SYSDATE,'수요일') AS 다음_월요일,
LAST_DAY(SYSDATE) AS 이번달_마지막날
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
WHERE SAL > (SAL+12 --킵

SELECT SAL
FROM Q288_1;

-- Q2