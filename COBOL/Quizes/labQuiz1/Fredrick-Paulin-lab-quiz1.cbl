      *Lab Quiz #1
      *Lab Quiz #1

      *1. Correct the errors in the following program
      *2. Submit the corrected lab-quiz1.cbl in blackboard
      *3. Due: Jan 22
      *4. Enter your name: Fredrick Paulin


       identification division.
       program-id. labquiz2.

       environment division.
       input-output section.
       file-control.
           select file-out assign to printer, "con".

       data division.
       file section.
       fd file-out label records are omitted.
       01 record-out pic x(80).

       working-storage section.
       01 print-line-out.
           05 filler pic x(20) value spaces.
           05 filler pic x(17) value 'Hello, Cobol User'.
           05 filler  pic x(43) value spaces.

       procedure division.
           open output file-out.
           write record-out from print-line-out
               after advancing 3 lines.
           close file-out.
           stop run.

