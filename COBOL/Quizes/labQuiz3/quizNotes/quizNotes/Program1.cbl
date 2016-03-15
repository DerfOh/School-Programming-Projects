       identification division.
       program-id. Program1.

       environment division.
       configuration section.

       data division.
       working-storage section.
       01   A   PIC 999V999 VALUE 2.
       01   B   PIC 999     VALUE 22.
       01   C   PIC 99V99   VALUE 4.
       01   X   PIC 99V9    VALUE 0.

       procedure division.
           display A.
           display B.
           display C.
           display X.
           
           compute X = B / 4 + A ** 3
           display X.
           
           compute X = (25 + A) / 2 - C.
           display X.
           
           compute X ROUNDED = B + 7.39 + A.
           display X.
           
           DIVIDE B BY C GIVING A REMAINDER X.
           display X.
           stop run.
           
       end program Program1.