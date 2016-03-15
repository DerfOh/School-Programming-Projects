       
           *> Fredrick Paulin
           *> CIS-CSC 170 Assignment 6
           *> Due: Apr 02
           *> Cargo Info
        program-id. Program1 as "sortProgram.Program1".

       

        ENVIRONMENT DIVISION.

        source-computer. ibm-pc.
        object-computer. ibm-pc.

        Input-Output Section.

        File-Control.
       
            Select sort-file-in assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\unsorteddata.txt"
              organization is line sequential.
            Select Aux-sort-file assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\temp.txt".
              *>organization is line sequential.
            Select sort-file-out assign to "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\sortdata.txt"
              organization is line sequential.

            Select report-file-in assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\sortdata.txt"
              organization is line sequential.
            Select report-file-out assign to "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment6\reportData.txt"
              organization is line sequential.


        DATA DIVISION.

        File Section.
       
        FD sort-file-in label records are standard.
        01 Record-in.
            05 pic x(80).

        SD Aux-sort-file.
        01 Aux-sort-record.
            05 filler pic x(20).
            *>tells the program where to find the contents of the item that will be sorted
            05 sort-cargo-name pic x(10).
            05 filler pic x(10).
       
        FD sort-file-out label records are omitted.
        01 Record-out.
            05 pic x(80).



        FD report-file-in label records are standard.
        01 report-record-in.
            05 company-name pic x(20).
            05 cargo-in-name pic x(10).
            05 units pic 9(5).
            05 cost-per-unit pic 999v99.
       
        FD report-file-out label records are omitted.
        01 report-record-out.
            05 pic x(80).


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



      *Begin headings
        01 column-headers.
            05 filler pic x(10) value space.
            05 filler pic x(7) value 'Company'.
            05 filler pic x(8) value space.
            05 filler pic x(6) value '#Units'.
            05 filler pic x(2) value space.
            05 filler pic x(6) value '$/Unit'.
            05 filler pic x(4) value space.
            05 filler pic x(16) value 'Total load value'.

        01 cargo-type-header.
            05 filler pic x(15) value spaces.
            05 filler pic x(12) value 'SHIPMENTS OF'
            05 filler pic x(1) value spaces.
            05 cargo-in-name-heading-out pic x(10).

        01 footer1.
            05 filler pic x(15) value spaces.
            05 filler pic x(7) value 'Total: '.
            05 sub-total-out pic $zzz,zzz,zz9.99.

      *Data to be written
       01 print-output-line-out.
            05 filler pic x(10) value spaces.
            05 company-name-out pic x(13).
            *>05 cargo-in-name-out pic x(10).
            05 filler pic x(3) value spaces.
            05 units-out pic zz,999.
            05 filler pic x(3) value spaces.
            05 cost-per-unit-out pic $zz9.99.
            05 filler pic x(3) value spaces.
            05 cargo-total-out pic $z,zzz,zz9.99.


        01 grand-total-output-footer.
            05 filler pic x(10) value spaces.
            05 filler pic x(12) value 'Grand Total:'.
            05 filler pic x(1) value spaces.
            05 grand-total-output pic $zzz,zzz,zz9.99.


       01 more-records pic x value 'y'.

       01 current-cargo pic x(20).

       01 cargo-total pic $z,zzz,zz9.99 value 0.00.

       01 sub-total pic 999999999v99 value 0.00.

       01 grand-total pic 9999999999999v99 value 0.00.

       procedure division.


       100-Main.
      *> sort all of the records
          perform 300-sort-the-things.

      *>   OPEN files
          open input report-file-in.
          open output report-file-out.

          perform 600-write-student-info.
            
      *>   MOVE ‘YES’ to More-records
          move 'y' to more-records.

      *>   READ first record,
          read report-file-in.
      *>         at end
      *> *>     At end move ‘no’ to More-records
      *>             move 'n' to  more-records
      *>    end-read.         
          
      *>   MOVE cargo-in-name to the current cargo
          move cargo-in-name to current-cargo.
      *>     MOVE zero to Total
          move 0 to cargo-total.
      *>   MOVE zero to Grand-total
          move 0 to grand-total.

          move cargo-in-name to cargo-in-name-heading-out.

      *> perform the initial header for the sorted category
          write report-record-out from cargo-type-header before advancing 1 line. 
      *> write initial headings to the report
          Perform 150-Print-Headings.


      *> this will go thru the file until it reaches an EOF,
      *> it separetes the section headers
          Perform 200-process until More-records = 'n'.
          
      *>   Close files
          close report-file-in.
          close report-file-out.
          Stop-run.

       200-Process.
      *>   Generate details for record
      *>     move cargo-in-name to cargo-in-name-out.
           move company-name to company-name-out.
           move units to units-out.
           move cost-per-unit to cost-per-unit-out.
        
        *> check current cargo against the cargo name read in to the program
        if (current-cargo not = cargo-in-name) and (more-records = 'y') then
      *>     Perform 400-Control-Break
            perform 400-control-break

        else if (current-cargo = cargo-in-name) and (more-records = 'y') then
      *>   Generate City-summary using Control-City and City-Total
            compute cargo-total = units * cost-per-unit
      *>   ADD Qty-in to Total
            compute sub-total = (units * cost-per-unit) + sub-total
            move cargo-total to cargo-total-out
            move sub-total to sub-total-out
            

      *>   Print detail record
            write report-record-out from print-output-line-out
        End-IF.


      *>   ADD Qty-in to Grand-total
        compute grand-total = sub-total + grand-total.



      *>   READ next record
         if more-records = 'y' then
           read report-file-in
               at end
                write report-record-out from footer1 after advancing 1 line
                  perform 500-Print-Grand-total
      *> *>     At end move ‘no’ to More-records
                   move 'n' to  more-records
         end-if.


       400-Control-Break.
        IF More-records = 'y' THEN
      *>     MOVE City-in to Control-City
            move cargo-in-name to current-cargo
            move cargo-in-name to cargo-in-name-heading-out
      *>   Print summary-line.     
            write report-record-out from footer1 after advancing 1 line
            write report-record-out from cargo-type-header after advancing 2 lines
            perform 150-Print-Headings
            write report-record-out from print-output-line-out after advancing 1 line
      *>     MOVE zero to total
            move 0 to cargo-total-out
            move 0 to sub-total-out
            
         End-IF.
      

       150-Print-Headings.
          IF (More-records = 'y') and (current-cargo not = 'COPPER') THEN
            write report-record-out from column-headers before advancing 1 lines
            
          else if (More-records = 'y') and (current-cargo = 'COPPER') Then
           write report-record-out from column-headers before advancing 2 lines
          end-if.
      *>   Print report heading
      *>   Print date/page line
      *>   Skip line
      *>   Print column headers
      *>   Skip line.

       500-Print-Grand-total.
      *>   Generate details for grand-total
      *>   Print Grand total
           if (more-records = 'y')
               move grand-total to grand-total-output
               write report-record-out from grand-total-output-footer after advancing 3 lines
           end-if.



       300-sort-the-things.
          
          Sort Aux-sort-file
          *>sets the key that sorts the file
          *>in this case it is the value held within cargo-in
            on ascending key sort-cargo-name
            using sort-file-in
            giving sort-file-out.

        600-write-student-info.
           if (more-records = 'y')
              write report-record-out from student-info-out-line1 
                after advancing 1 lines
              write report-record-out from student-info-out-line2 
                after advancing 1 lines
              write report-record-out from student-info-out-line3 
                after advancing 1 lines
              write report-record-out from student-info-out-line4 
                after advancing 1 lines
           end-if.

       end program Program1.
