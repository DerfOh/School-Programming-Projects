
      *Apartment complex profit calculator
       identification division.
       program-id. aptprofits.
       environment division.
       input-output section.


       file-control.
           select file-in assign to disk "H:\rent.txt"
                 organization is line  sequential.
           select file-out assign to printer, "con".


       data division.
       file section.
       fd file-in label records are standard.
      *Begin record for the apartment
       01 record-in.
           05 building-id      pic x(3).
           05 rental-units     pic 9(5).
           05 monthly-rent     pic 9(8).
           05 annual-revenue   pic 999v99.
           05 annual-cost      pic 9999v99.
           05 interest-payment pic 9999v99.


       fd file-out label records are omitted.
       01 record-out pic x(80).


       working-storage section.
       01 more-records pic x value 'y'.
       01 total-cost pic 999999999999999v99.

      *Begin student info
       01 header-info-out-line1.
           05 filler pic x(10) value spaces.
           05 filler pic x(15) value 'Fredrick Paulin'.

       01 header-info-out-line2.
           05 filler pic x(10) value spaces.
           05 filler pic x(24) value 'CIS-CSC 170 Assignment 2'.

       01 header-info-out-line3.
           05 filler pic x(10) value spaces.
           05 filler pic x(11) value 'Due: Feb 17'.

       01 header-info-out-line4.
           05 filler pic x(10) value spaces.
           05 filler pic x(24) value 'Apartment Profitability'.
      *End of the student info

       01 line1-out.
           05 filler pic x(37) value spaces.
           05 filler pic x(6) value 'output'.
           05 filler pic x(37) value spaces.



      *Headers for the different categories of data
       01 line2-out.
           05 filler pic x(1) value spaces.
           05 filler pic x(9) value 'Apt. Bdg.'.
           05 filler pic x(10) value spaces.
           05 filler pic x(5) value 'Units'.
           05 filler pic x(6) value spaces.
           05 filler pic x(19) value 'Rental Rate Monthly'.
           05 filler pic x(8) value spaces.
           05 filler pic x(14) value 'Annual Revenue'.
           05 filler pic x(4) value spaces.
           05 filler pic x(19) value 'Annual Heating Cost'.
           05 filler pic x(4) value spaces.
           05 filler pic x(15) value 'Annual Interest'.
           05 filler pic x(4) value spaces.
           05 filler pic x(14) value 'Occupancy Rate'.
           05 filler pic x(4) value spaces.
           05 filler pic x(23) value 'Gross Profit(+) Loss(-)'.




       01 print-line-out.
           05 filler           pic x(1) value spaces.
           05 building-id      pic x(3).
           05 filler           pic x(4) value spaces.
           05 rental-units     pic 9(2).
           05 filler           pic x(8) value spaces.
           05 monthly-rent     pic $zzz999.99.
           05 filler           pic x(8) value spaces.
           05 annual-revenue   pic $zzz999.99.
           05 filler           pic x(6) value spaces.
           05 annual-cost      pic $zzz999.99.
           05 filler           pic x(13) value spaces.



       procedure division.
       100-main.
           open input file-in.
           open output file-out.


           write record-out from header-info-out-line1 after advancing
           1 lines.
           write record-out from header-info-out-line2 after advancing
           1 lines.
           write record-out from header-info-out-line3 after advancing
           1 lines.
           write record-out from header-info-out-line4 after advancing
           1 lines.

           write record-out from line1-out after advancing 5 lines.
           write record-out from line2-out after advancing 2 lines.


           read file-in at end move 'n' to more-records.
           perform 200-process until more-records = 'n'.
           close file-in.
           close file-out.
           stop run.

       200-process.
      *    compute total-cost = unit-price * units-in.
           move building-id to building-id-out.
           move rental-units to rental-units-out.
           move monthly-rent to monthly-rent-out.
           move annual-revenue to price-out.
           move annual-cost to annual-cost-out.
           write record-out from print-line-out after advancing 1 line.
           read file-in at end move 'n' to more-records.





