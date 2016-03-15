
      *Apartment complex profit calculator
      *Fredrick Paulin
      *CIS-CSC 170 Assignment 3
      *Due: Feb 17
      *Apartment Profitability
       
      *--Variable Library--
      *building-id         - The letter and number for the apartment building
      *rental-units        - the amout of units in the building
      *monthly-rent        - The amount a tenate pays monthly
      *annual-revenue      - revenue generated by the rental property
      *annual-heating-cost - cost of heating the unit
      *annual-interest     - the interest payments made on a mortgage on the building
      *occupancy-rate      - number of units times monthly rental times 12
      *profit              - gross profit computed by subtracing annual-revenue, annual-heating-cost, and annual-interest
      *--------------------
       
       
       identification division.
       program-id. aptprofits.
       environment division.
       input-output section.


       file-control.
           select file-in assign to disk "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment3\Rent.txt"
                 organization is line  sequential.
           select file-out assign to printer, "con".


       data division.
       file section.
       fd file-in label records are standard.
       01 record-in.
           05 building-id          pic x(3).
           05 rental-units         pic 9(2).
           05 monthly-rent         pic 999.
           05 annual-revenue       pic 999999.
           05 annual-heating-cost  pic 9999v99.
           05 annual-interest      pic 999999v99.


       fd file-out label records are omitted.
       01 record-out pic x(80).


       working-storage section.
       01 more-records pic x value 'y'.
       
      *Declare variables that aren't read from input file 
       01 occupancy-rate pic 99v99.
       01 profit pic s9999999v99.
        

      *Begin student info
       01 header-info-out-line1.
           05 filler pic x(1) value spaces.
           05 filler pic x(15) value 'Fredrick Paulin'.

       01 header-info-out-line2.
           05 filler pic x(1) value spaces.
           05 filler pic x(24) value 'CIS-CSC 170 Assignment 3'.

       01 header-info-out-line3.
           05 filler pic x(1) value spaces.
           05 filler pic x(11) value 'Due: Feb 17'.

       01 header-info-out-line4.
           05 filler pic x(1) value spaces.
           05 filler pic x(24) value 'Apartment Profitability'.
      *End of the student info

       01 line1-out.
           05 filler pic x(37) value spaces.
           05 filler pic x(6) value 'output'.
           05 filler pic x(37) value spaces.



      *Headers for the different categories of data
       01 line2-out.
           05 filler pic x(1) value spaces.
           05 filler pic x(4) value 'Bdg.'.
           05 filler pic x(2) value spaces.
           05 filler pic x(5) value 'Units'.
           05 filler pic x(2) value spaces.
           05 filler pic x(4) value 'Rate'.
           05 filler pic x(3) value spaces.
           05 filler pic x(7) value 'Revenue'.
           05 filler pic x(3) value spaces.
           05 filler pic x(4) value 'Heat'.
           05 filler pic x(7) value spaces.
           05 filler pic x(8) value 'Interest'.
           05 filler pic x(4) value spaces.
           05 filler pic x(14) value 'Occupancy Rate'.
           05 filler pic x(2) value spaces.
           05 filler pic x(6) value 'Profit'.



      *Prints out the different lines in the input file
       01 print-line-out.
           05 filler                   pic x(1) value spaces.
           05 building-id-out          pic x(3).
           05 filler                   pic x(3) value spaces.
           05 rental-units-out         pic 9(2).
           05 filler                   pic x(5) value spaces.
           05 monthly-rent-out         pic $z(3)9.
           05 filler                   pic x(2) value spaces.
           05 annual-revenue-out       pic $z(6)9.
           05 filler                   pic x(2) value spaces.
           05 annual-heating-cost-out  pic $z(4)9.99.
           05 filler                   pic x(2) value spaces.
           05 annual-interest-out      pic $z(5)9.99.
           05 filler                   pic x(2) value spaces.
           05 occupancy-rate-out       pic 99.99.
           05 filler                   pic x value '%'.
           05 filler                   pic x(8) value spaces.
           05 profit-out               pic +$z(5)9.99.


       procedure division.
       100-main.
           open input file-in.
           open output file-out.


           write record-out from header-info-out-line1 after advancing 1 lines.
           write record-out from header-info-out-line2 after advancing 1 lines.
           write record-out from header-info-out-line3 after advancing 1 lines.
           write record-out from header-info-out-line4 after advancing 1 lines.

           write record-out from line1-out after advancing 5 lines.
           write record-out from line2-out after advancing 2 lines.


           read file-in at end move 'n' to more-records.
           perform 200-process until more-records = 'n'.
           
           close file-in.
           close file-out.
           stop run.

       200-process.
      *    compute the occupancy rate of the unit by dividing the annual revenue generated by number of units times monthly rental times 12 then multiplying by 100    
           compute occupancy-rate = ((annual-revenue) / ((rental-units * monthly-rent) * 12)) * 100.
           
      *    compute the annual profit or loss of the unit calculated by the annual revenue minus the heating cost minus the interest 
           compute profit = annual-revenue - annual-heating-cost - annual-interest.
      
      
      *    Move all data to output variables     
           move building-id        to building-id-out.
           move rental-units       to rental-units-out.
           move monthly-rent       to monthly-rent-out.
           move annual-revenue     to annual-revenue-out.
           move annual-heating-cost to annual-heating-cost-out.
           move annual-interest    to annual-interest-out.
           move occupancy-rate     to occupancy-rate-out.
           move profit             to profit-out.

      
       
           
           write record-out from print-line-out after advancing 1 line.
           read file-in at end move 'n' to more-records.




