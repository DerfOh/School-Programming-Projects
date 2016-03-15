      *
      *  CIS-CSC 170 Assignment #1
      *  Download the file Assign1.cbl from Progdata.
      *  Complete the COBOL program to produce a cover sheet
      *  with the following information:
      *                    Student Name
      *                    Course and section 
      *                    Assignment number
      *                    Due Date 1/23/14
      *                    Grade ___________
      *
      *  The above information must be centered on the paper.
      *  Hand in the cover sheet and the completed Cobol porgram
      *
       identification division.
       program-id. cover.
       environment division.

       configuration section.
       source-computer. ibm-pc.
       object-computer. ibm-pc.

       input-output section.
       file-control.
           select file-out assign to printer, "con".

       data division.
       file section.
       fd  file-out label records are omitted.
       01  record-out   pic x(80).

       working-storage section.
       01 line1-out.
           05   filler    pic x(30) value spaces.
           05   filler    pic x(18) value 'Fredrick J. Paulin'.
           05   filler    pic x(35) value spaces.
       01 line2-out.
           05   filler    pic x(30) value spaces.
           05   filler    pic x(14) value 'csc-170 sec 01'.
           05   filler    pic x(36) value spaces.

       01 line3-out.
           05   filler    pic x(30) value spaces.
           05   filler    pic x(12) value 'Assignment 1'.
           05   filler    pic x(35) value spaces.

       01 line4-out.
           05   filler    pic x(30) value spaces.
           05   filler    pic x(13) value 'Due 1/23/2015'.
           05   filler    pic x(35) value spaces.

       01 line5-out.
           05   filler    pic x(30) value spaces.
           05   filler    pic x(12) value 'Grade:______'.
           05   filler    pic x(35) value spaces.



      * additional working storage to complete the cover sheet

       procedure division.
       100-main-module.
           open output file-out.

           move spaces to record-out.

           perform 15 times
           write record-out
           end-perform.

           write record-out from line1-out
                 after advancing 2 lines.
           write record-out from line2-out
                  after advancing 2 lines.
           write record-out from line3-out
                  after advancing 2 lines.
           write record-out from line4-out
                  after advancing 2 lines.
           write record-out from line5-out
                  after advancing 2 lines.



      * additional write statement to complete the cover sheet


           close file-out.
           stop run.

