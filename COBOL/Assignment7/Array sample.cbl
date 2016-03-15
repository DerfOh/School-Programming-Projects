      * Array.cbl example
       identification division.
       program-id. readit.
       environment division.
       input-output section.
       file-control.
           select file-in assign to disk "a:testdata.txt"
                 organization is line  sequential.
           select file-out assign to printer, "con".
       data division.
       file section.
       fd file-in label records are standard.
       01 record-in.
           05 name-in   pic x(21).
           05 score-in  pic 999.
          
       fd file-out label records are omitted.
       01 record-out pic x(80).
       working-storage section.
       01 more-records pic x value 'y'.
       01 sub           pic 999 value 0.
       01 average       pic 999v9 value 0.
       01 total         pic 9999v99 value 0.
       01 sum-of-scores pic 9999v99 value 0.
       
       01 print-line-out.
           05 filler    pic x(10) value spaces.
           05 name-out  pic x(25).
           05 filler    pic x(10) value spaces.
           05 score-out pic 999.
           05 filler    pic x(20) value spaces.
     
       01 array-of-records.
           05 student-array occurs 100 times.
              10 s-name    pic x(21).
              10 s-score   pic 999.
           .
       procedure division.
       100-main.
           open input file-in.
           open output file-out.
           
           read file-in at end move 'n' to more-records.
           perform 200-process until more-records = 'n'.
           move sub to total.
           perform 300-sum-scores varying sub from 1 by 1 until sub > total.
           perform 400-compute-average.
           perform 500-above-average varying sub from 1 by 1 until sub > total.
           perform 600-print-all-students varying sub from 1 by 1 until sub > total.
           close file-in.
           close file-out.
           stop run.

       200-process.
           add 1 to sub.
           move record-in to student-array (sub).
           read file-in at end move 'n' to more-records.

       300-sum-scores.
           compute sum-of-scores = sum-of-scores + s-score (sub).

       400-compute-average.
           compute average = sum-of-scores / total.

       500-above-average.
           if s-score (sub) > average
              move s-name (sub) to name-out
              move s-score (sub) to score-out
              write record-out from print-line-out
                after advancing 1 line
           end-if.

       600-print-all-students.
              move s-name (sub) to name-out
              move s-score (sub) to score-out
              write record-out from print-line-out
                after advancing 1 line.






