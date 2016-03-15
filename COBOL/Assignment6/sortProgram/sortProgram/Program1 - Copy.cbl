       program-id. Program1 as "sortProgram.Program1".

       

       ENVIRONMENT DIVISION.

       source-computer. ibm-pc.
       object-computer. ibm-pc.

       Input-Output Section.

       File-Control.
       
           Select file-in assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\unsorteddata.txt"
              organization is line sequential.
           Select Aux-sort-file assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\temp.txt".
              *> organization is line sequential.
           Select file-out assign to "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\sortdata.txt"
              organization is line sequential.

       DATA DIVISION.

       File Section.
       
       FD File-in label records are standard.
       01 Record-in.
           05 company-name pic x(20).
           05 cargo-in-name pic x(10).
           05 units pic x(5).
           05 cost-per-unit pic 999v99.

       SD Aux-sort-file.
       01 Aux-sort-record.
           05 filler pic x(20).
           *>tells the program where to find the contents of the item that will be sorted
           05 cargo-in pic x(10).
           05 filler pic x(9).
       
       FD File-out label records are omitted.
       01 Record-out.
           05 pic x(40).

       Working-Storage Section.


      *Begin student info
       01 student-info-out-line1.
           05 filler pic x(1) value spaces.
           05 filler pic x(15) value 'Fredrick Paulin'.
           
           
       01 student-info-out-line2.
           05 filler pic x(1) value spaces.
           05 filler pic x(24) value 'CIS-CSC 170 Assignment 6'.

       01 student-info-out-line3.
           05 filler pic x(1) value spaces.
           05 filler pic x(11) value 'Due: Apr 02'.

       01 student-info-out-line4.
           05 filler pic x(1) value spaces.
           05 filler pic x(10) value 'Cargo Info'.
      *End of the student info

       01 more-records pic x value 'y'.

       01 current-cargo pic x(20).

       01 print-line-out.
           05 pic x(40).

       procedure division.
       
       100-Main-Module.

            *>perform 200-write-student-info.

            *>perform 300-sort-the-things until more-records = 'n'.
            perform 400-initial-sort until more-records = 'n'.
              
            *>perform 300-sort-the-things

            *>perform 400-control-break.

            *>perform 500-output-report.         	

              
           	Stop run.    

        150-headers.
            if current-cargo = cargo-in-name
              write record-out from student-info-out-line1.
              
             
      


        200-write-student-info.
            open output file-out.

            write record-out from student-info-out-line1 
              after advancing 1 lines.
            write record-out from student-info-out-line2 
              after advancing 1 lines.
            write record-out from student-info-out-line3 
              after advancing 1 lines.
            write record-out from student-info-out-line4 
              after advancing 1 lines.

            close file-out.

        300-sort-the-things.
            Sort Aux-sort-file
            *>sets the key that sorts the file
            *>in this case it is the value held within cargo-in
              on ascending key cargo-in
              using file-in
              giving file-out.

        400-initial-sort.
        
          perform 300-sort-the-things.

          *>open input file-in.
          open input file-out.

          
          read file-out
              at end
                  move 'n' to  more-records
              not at end

              *>perform 300-sort-the-things.

              if cargo-in-name not equal current-cargo
                perform 150-headers.
                  move cargo-in-name to current-cargo.
          *>end-read.
           
           *>close file-in.
           close file-out.
           
       end program Program1.
