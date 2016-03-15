
      *Readdata.cbl example
       identification division.
       program-id. readit.
       environment division.
       input-output section.


       file-control.
      *    select file-in assign to disk "H:\testdata.txt"
      *          organization is line  sequential.
           select console-out assign to printer, "con".


       fd console-out label records are omitted.
       01 REPORT-RECORD-OUT pic x(73).

       WORKING-STORAGE SECTION.
       01 X      PIC 99V99 VALUE 79.42.
       01 DETAIL-LINE-OUT.
           05  FILLER   PIC X(5)  VALUE SPACES.
           05  DL-OUT   PIC $Z99.99.
           05  FILLER   PIC X(68) VALUE SPACES.

       PROCEDURE DIVISION.
       100-MAIN.
           open output console-out.
           MOVE X TO DL-OUT.
           WRITE REPORT-RECORD-OUT FROM DETAIL-LINE-OUT
           AFTER ADVANCING 1 LINE.
           MOVE 6.789 TO DL-OUT.
           WRITE REPORT-RECORD-OUT FROM DETAIL-LINE-OUT
           BEFORE ADVANCING 1 LINE.
           MOVE 1783.95 TO X.
           MOVE X TO DL-OUT.
           WRITE REPORT-RECORD-OUT FROM DETAIL-LINE-OUT.

