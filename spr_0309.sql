-- 형 변환 함수
SELECT EMPNO, ENAME, EMPNO + '500'
--원칙적으로는 문자형인 '500'의 데이터는 숫자형의 열에 적용이 되지 않으나 순수 숫자로만 이루어진 문자형의 경우 경우 암시적 형 변환(자동 형 변환)
FROM EMP
WHERE ENAME = 'JAMES';

-- 문자 데이터로 변환 'TO_CHAR'
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY.MM.DD AM HH24:MI:SS DAY') AS 현재_날짜_시간_요일
FROM DUAL;

/*
◎ 시간 형식 지정하기
- HH24 : 24시간으로 표현
- HH, HH12 : 12시간으로 표현
- MI : 분
- SS : 초
- AM, PM, A.M., P.M. : 오전, 오후

◎ 날짜 형식 지정하기
- CC : 세기
- YYYY, RRRR : 연도 (4자리 숫자)
- YY, RR : 연도 (2자리 숫자)
- MM : 월 (2자리 숫자)
- MON : 월(언어별 월 이름 약자)
- MONTH : 월(언어별 월 이름 전체)
- DD : 일 (2자리 숫자)
- DDD : 1~366 (1년 중 며칠)
- DY : 요일 (언어별 요일 이름 약자)
- DAY : 요일 (언어별 요일 이름 전체)
- W : 1~53 (1년 중 몇번째 주)
*/

-- 특정 언어에 맞춰 날짜 출력하기
/*
TO_CHAR([날짜 데이터], '[출력되길 원하는 문자 형태]', 'NLS_DATE_LANGUAGE = 언어');
*/
SELECT TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = KOREAN') AS 한글,
TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = ENGLISH') AS 영문,
TO_CHAR(SYSDATE, 'MON.DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS 일문
FROM DUAL;

-- 숫자 데이터 형식을 지정하여 출력하기
SELECT SAL,
TO_CHAR(SAL, '999,999') AS 숫자한자리, --9는 숫자 한자리를 의미(빈자리를 안 채움)
TO_CHAR(SAL, '00,999') AS 숫자빈자리, -- 0은 빈자리를 0을 채움
TO_CHAR(SAL, '$999,999') AS 달러표기, -- $달러 표기
TO_CHAR(SAL, 'L999,999') AS 숫자한자리, -- L 해당 지역 화폐로 출력
TO_CHAR(SAL, '999,999.00') AS 소숫점 -- .으로 소수점, ,으로 천단위를 구분
FROM EMP;

-- 숫자 데이터로 변환하는 TO_NUMBER

SELECT 1300 + '1500'
FROM DUAL;

SELECT TO_NUMBER('1,300', '9999') + TO_NUMBER('2,500', '9999') AS 문자_숫자
FROM DUAL;

-- 문자 데이터를 날짜 데이터로 변환하는 TO_DATE
SELECT
TO_DATE('2021-03-09', 'YYYY.MM.DD') AS 날짜1,
TO_DATE('20210309', 'YYYY.MM.DD') AS 날짜2
FROM DUAL;

-- 특정 날짜 이후에 입사한 사원 찾기
SELECT *
FROM EMP
WHERE HIREDATE > TO_DATE('19810601', 'YYYY/MM/DD');

-- NULL값을 대체하는 NVL
SELECT ENAME, SAL, COMM, SAL*12+COMM AS ANNSAL,
NVL (COMM, 0), SAL*12+NVL(COMM, 0)
FROM EMP;

SELECT EMPNO, ENAME, COMM,
NVL2(COMM, '아님', '맞음'), NVL2(COMM, SAL*12+COMM, SAL*12)
FROM EMP;

-- DECODE함수
SELECT EMPNO, ENAME, JOB, SAL,
DECODE(JOB,
'MANAGER', SAL*1.1,
'SALESMAN', SAL*1.05,
'ANALYST', SAL,
SAL*1.03) AS UPSAL
FROM EMP;

-- CASE문
SELECT EMPNO, ENAME, JOB, SAL,
CASE JOB --기준 데이터
WHEN 'MANAGER' THEN SAL*1.1
WHEN 'SALESMAN' THEN SAL*1.05
WHEN 'ANALYST' THEN SAL
ELSE SAL * 1.03
END AS UPSAL
FROM EMP;

-- 기준 데이터없이 CASE문 사용
SELECT EMPNO, ENAME, COMM,
CASE
WHEN COMM IS NULL THEN '해당사항 없음'
WHEN COMM=0 THEN '수당없음'
WHEN COMM>0 THEN '수당:' || COMM
END AS 수당처리결과
FROM EMP;

-- 그룹 함수
SELECT SUM(SAL)
FROM EMP;
/*
주요 그룹 함수
SUM : 지정된 데이터의 합
COUNT : 지정된 데이터의 개수
MAX : 지정한 데이터 중 최댓값
MIN : 지정한 데이터 중 최솟값
AVG : 지정한 데이터의 평균값 반환
*/

--GROUP BY절을 사용하지 않으면 테이블 전체 행이 하나의 그룹으로 형성됨
/*
SELECT ENAME, SUM(SAL) <- 이처럼 단일행 함수와 다중행 함수는 이러한 표기 형태로는 사용할 수 없다.
*/
SELECT SUM(COMM) -- SUM은 NULL일 경우 값이 없다고 판단하고 자체 생략함
FROM EMP;

-- 데이터 개수를 출력하는 COUNT
SELECT COUNT(*)
FROM EMP;

SELECT COUNT(*)
FROM EMP
WHERE DEPTNO=30;
-- ※ NULL값은 카운트 안됨

SELECT COUNT(COMM)
FROM EMP;
--WHERE COMM IS NOT NULL; (을 사용해도 결과값은 똑같이 출력된다.)

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

-- 결과 값을 원하는 열로 묶어 출력하는 GROUP BY
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

SELECT ENAME, SAL, ROUND(SAL*0.15,2) AS "회비"
FROM EMP
WHERE SAL BETWEEN 1500 AND 3000;

SELECT DEPTNO, ENAME, SAL FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP);

CREATE TABLE EMP_COPY AS SELECT * FROM EMP;

SELECT * FROM EMP_COPY;

SELECT DEPTNO, ENAME, SAL FROM EMP_COPY
WHERE SAL > (SELECT AVG(SAL) FROM EMP_COPY);

ROLLBACK;

SELECT DEPTNO, ENAME, SAL, HIREDATE, SAL*1.10 AS 급여인상 FROM EMP
WHERE HIREDATE > (SELECT MIN(HIREDATE) FROM EMP);

-- 288P Q3: 10번 부서 사원 중 평균 급여보다 많은 급여를 받는 직원들을 40번 부서로 이동
UPDATE EMP_COPY
SET DEPTNO = 40
WHERE SAL > (SELECT AVG(SAL) FROM EMP_COPY) AND DEPTNO=10;
-- 288P Q4: 20번 부서 사원 중에 입사일이 가장 빠른 사원보다 늦게 입사한 사원의 급여를 10%이상하고 50번 부서로 이동
UPDATE EMP_COPY
SET SAL = SAL*1.10, DEPTNO=50
WHERE HIREDATE > (SELECT MIN(HIREDATE) FROM EMP_COPY) AND DEPTNO=20;

-- 212P Q1 : 부서번호, 평균 급여, 최고 급여, 최저 급여, 사원 수를 출력합니다.
-- 단, 평균 급여를 출력할 때 소수점을 제외하고 각 부서 번호 별로 출력하세요.
SELECT DEPTNO, TRUNC(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(DEPTNO) AS "CNT"
FROM EMP
GROUP BY DEPTNO;
-- 212P Q2 : 같은 직책에 종사하는 사원이 3명 이상인 직책과 인원수를 출력하세요.
SELECT JOB, COUNT(JOB)
FROM EMP
GROUP BY JOB
HAVING COUNT(JOB) >= 3;
-- 212P Q3 : 사원들의 입사 연도(HIRE_YEAR)를 기준으로 부서별로 몇 명이 입사했는지 출력하세요.
SELECT TO_CHAR(HIREDATE, 'YYYY') AS HIRE_YEAR, DEPTNO, COUNT(HIREDATE)
FROM EMP
GROUP BY HIREDATE, DEPTNO;
-- 213P Q4 : 추가 수당(COMM)을 사원 수와 받지 않는 사원 수를 출력하세요.

-- 213P Q5 : 각 부서의 입사 연도별 사원 수, 최고 급여, 급여 합, 평균 급여를 출력하고 각 부서별 소계와 총계를 출력하세요.
SELECT DEPTNO, TO_CHAR(HIREDATE, 'YYYY') AS "HIRE_YEAR",
COUNT(HIREDATE) AS "CNT", MAX(SAL) AS "MAX_SAL", SUM(SAL) AS "SUM_SAL", AVG(SAL) AS "AGV_SAL"
FROM EMP
GROUP BY DEPTNO, HIREDATE, SAL
ORDER BY DEPTNO;
