SELECT B.ID,
       B.GENOTYPE,
       A.GENOTYPE PARENT_GENOTYPE
  FROM ECOLI_DATA A
  JOIN ECOLI_DATA B ON A.ID = B.PARENT_ID
 WHERE B.PARENT_ID IS NOT NULL
   AND A.GENOTYPE & B.GENOTYPE = A.GENOTYPE
ORDER BY 1