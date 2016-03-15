       identification division.
       program-id. shipLookupTable.

       environment division.
       source-computer. ibm-pc.
       object-computer. ibm-pc.

       *>configuration section.

       Input-Output Section.

        File-Control.
       

           Select table-in assign to disk 
           "C:\Users\Fredrick\ownCloud\Programming\COBOL\A7\Table7.txt" 
             organization is line sequential.
             
           Select report-file-in assign to
       "C:\Users\Fredrick\ownCloud\Programming\COBOL\A7\shipData7.txt"
             organization is line sequential.                                                                                                                                                                                                                                             
           
           select report-file-out assign to
        "C:\Users\Fredrick\ownCloud\Programming\COBOL\A7\output.txt"
             organization is line sequential.


        Data Division.

        File Section.
       
      *
      * SD Aux-sort-file.
      * 01 Aux-sort-record.
      *     05 filler pic x(20).
      *     *>tells the program where to find the contents of the item that will be sorted
      *     05 sort-cargo-name pic x(10).
      *     05 filler pic x(10).
      *
      * FD sort-file-out label records are omitted.
      * 01 Record-out.
      *     05 pic x(80).



        FD report-file-in label records are standard.
        01 report-record-in.
            05 company-name pic x(20).
            05 cargo-in-name pic x(10).
            05 units-in pic 9(6).
            05 country-in pic x(6).

        FD table-in label records are standard.
        01 table-in-values.
            05 table-cargo-in pic x(9).
            05 table-value-in pic 9999.
       
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
            05 filler pic x(11) value 'Due: Apr 16'.

        01 student-info-out-line4.
            05 filler pic x(1) value spaces.
            05 filler pic x(23) value 'Cargo Info Lookup Table'.
      *End of the student info



      *Begin headings
        01 column-headers.
            05 filler pic x(1) value space.
            05 filler pic x(9) value 'Ship Name'.
            05 filler pic x(19) value space.
            05 filler pic x(5) value 'Cargo'.
            05 filler pic x(5) value space.
            05 filler pic x(5) value 'Units'.
            05 filler pic x(5) value space.
            05 filler pic x(11) value 'Total Value'.
            05 filler pic x(8) value space.
            05 filler pic x(12) value 'Registration'.
            
            
            
        01 record-out.
           05 filler pic x(1) value space.
           05 company-name-out pic x(20).
           05 filler pic x(8) value space.
           05 cargo-name-out pic x(9).
           05 filler pic x(1) value space.
           05 units-out pic zzzz9.
           05 filler pic x(5) value space.
           05 shipment-total-out pic $z,zzz,zzz,zz9.99.
           05 filler pic x(4) value space.
           05 country-out pic x(6).
           

       



       
              
       01 sub pic 9 value 0.
       01 total pic 9 value 8.
       01 shipment-total pic 9999999999v99.
       01 more-records pic x value 'y'.
      * declare ship array
       01 cargo-table.
           05 cargo-table-array occurs 8 times.
              10 cargo pic x(9).
              10 cost occurs 8 times pic 9(4)v99 value zero.

       procedure division.

       

           
       100-main.
      *     open output report-file-out.
            
            perform 400-open.
            perform 1000-write-student-info.
            perform 200-write-headers.
            perform 300-table.
            perform 900-close.

            
            

      *     close report-file-out.
            stop-run.
            

       200-write-headers.
           write report-record-out from column-headers before 
           advancing 1 line.    
           
       
       
       
       300-table.
           
           
      *    read table-in at end move 'n' to more-records.
           perform 800-populate-array until more-records = 'n'.
      *    move sub to total.
           move 'y' to more-records.
           move 0 to sub.
           read report-file-in at end move 'n' to more-records.

           perform 300-sum-total varying sub from 1 by 1 
           until more-records = 'n'.                   
      *    perform 400-compute-average.
      *    perform 500-above-average varying sub from 1 by 1 until sub > total.
      *    perform 600-print-all-students varying sub from 1 by 1 until sub > total.
           
           
           
           
       800-populate-array.
           read table-in at end move 'n' to more-records.
           if more-records = 'y'
                 add 1 to sub
                 
      *          move table-cargo-in to cargo (sub)
      *          move table-value-in to cost (sub)
                 move table-in-values to cargo-table-array (sub)
           end-if.
           

       
      
       400-open.
           open input table-in.
           open input report-file-in.
           open output report-file-out.
           
       300-sum-total.
      *    compute sum-of-scores = sum-of-scores + cost (sub).
           
      *   read report-file-in at end move 'n' to more-records.
           
           
           if more-records = 'y'
               if cargo-in-name = cargo (sub)
                   compute shipment-total = cost (sub) * units-in
               
                   move company-name to company-name-out
                   move cargo-in-name to cargo-name-out
                   move units-in to units-out
                   move country-in to country-out
                   move shipment-total to shipment-total-out
               
                   write report-record-out from record-out after 
                   advancing 1 lines
               
                   move 0 to sub
                   read report-file-in at end move 'n' to more-records 
               end-if
           end-if.
               
           
       
         
           
        900-close.
           close table-in.
           close report-file-in.
           close report-file-out.
        goback.   
           
      


       
       
       1000-write-student-info.

           write report-record-out from student-info-out-line1.
           write report-record-out from student-info-out-line2 
             before advancing 1 lines.
           write report-record-out from student-info-out-line3 
             before advancing 1 lines.
           write report-record-out from student-info-out-line4 
             before advancing 3 lines.
           
       
      
       end program shipLookupTable.