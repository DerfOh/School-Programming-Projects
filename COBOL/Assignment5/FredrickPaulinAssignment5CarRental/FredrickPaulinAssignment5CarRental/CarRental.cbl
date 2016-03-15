      *Apartment complex profit calculator
      *Fredrick Paulin
      *CIS-CSC 170 Assignment 5
      *Due: Mar 19
      *Car Rental
       
      *--Variable Library--
      *> cusomter-name: the name of the customer
      *> car-make: the make of the car
      *> mileage: the milage of the car
      *> days: the amount of days the customer has rented the car
      *> days-charged: the total days that the user was charged
      *> miles-charged: the total miles that the user was charged
      *> per-mile-charge: the total that the user was charged for miles
      *> per-day-charge: the total that the user was charged for the day
      *> state-tax: the total that the user was charged for tax
      *> total-charge: the total that the user was charged for the rental




       identification division.
       program-id. aptprofits.
       environment division.
       input-output section.

       


       file-control.
           select file-in assign to disk 
          "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment5\Rental.txt"
                 organization is line  sequential.
           select file-out assign to printer, "con".


       data division.
       file section.
       fd file-in label records are standard.
       01 record-in.
           05 customer-name       pic x(20).
           05 car-make         		pic x(4).
           05 mileage           	pic 9999v9.
           05 days       	        pic 99.
           

       fd file-out label records are omitted.
       01 record-out pic x(80).


       working-storage section.
       01 more-records pic x value 'y'.
       
      *Declare variables that aren't read from input file 
       01 days-charged pic 99.
       01 miles-charged pic 9999v9 value 0.00.
       01 per-mile-charge pic 9v99 value 0.00.
       01 per-day-charge pic 99v99 value 0.
       01 state-tax pic 9v99 value 0.00.
       01 total-charge pic 9999999v99 value 0.00.

        

      *Begin student info
       01 header-info-out-line1.
           05 filler pic x(1) value spaces.
           05 filler pic x(15) value 'Fredrick Paulin'.
           

       01 header-info-out-line2.
           05 filler pic x(1) value spaces.
           05 filler pic x(24) value 'CIS-CSC 170 Assignment 5'.

       01 header-info-out-line3.
           05 filler pic x(1) value spaces.
           05 filler pic x(11) value 'Due: Mar 19'.

       01 header-info-out-line4.
           05 filler pic x(1) value spaces.
           05 filler pic x(10) value 'Car Rental'.
      *End of the student info

       01 line1-out.
           05 filler pic x(37) value spaces.
           05 filler pic x(18) value 'Car Rental Company'.
           05 filler pic x(37) value spaces.



      *Headers for the different categories of data
        01 line2-out.
            05 filler pic x(1) value spaces.
            05 filler pic x(4) value 'Name'.
            05 filler pic x(4) value spaces.
            05 filler pic x(4) value 'Make'.
            05 filler pic x(2) value spaces.
            05 filler pic x(7) value 'Mileage'.
            05 filler pic x(3) value spaces.
            05 filler pic x(4) value 'Days'.
            05 filler pic x(3) value spaces.
            05 filler pic x(3) value 'Tax'.
            05 filler pic x(7) value spaces.
            05 filler pic x(5) value 'Total'.
       


      *Prints out the different lines in the input file
       01 print-line-out.
           05 filler                pic x(1) value spaces.
           05 customer-name-out     pic x(5).
           05 filler                pic x(3) value spaces.
           05 car-make-out         	pic x(4).
           05 filler                pic x(3) value spaces.
           05 Mileage-out         	pic zzz9.99.
           05 filler                pic x(3) value spaces.
           05 Days-out       		pic 99.
           05 filler                pic x(3) value spaces.
           05 state-tax-out  		pic $zz9.99.
           05 filler                pic x(3) value spaces.
           05 total-charge-out      pic $zzzzz9.99.       


       procedure division.
       100-main.
           open input file-in.
           open output file-out.

           *> write the student info to the screen.
           write record-out from header-info-out-line1 
           	after advancing 1 lines.
           write record-out from header-info-out-line2 
           	after advancing 1 lines.
           write record-out from header-info-out-line3 
           	after advancing 1 lines.
           write record-out from header-info-out-line4 
           	after advancing 1 lines.

           write record-out from line1-out after advancing 5 lines.
           write record-out from line2-out after advancing 2 lines.


           read file-in at end move 'n' to more-records.
           perform 200-process until more-records = 'n'.
           
           close file-in.
           close file-out.
           stop run.

       200-process.
      *    Evaluate which values to use for the calculations
          evaluate car-make
    	   		when 'BUIC' move 0.25 to per-mile-charge, move 25.50 
              to per-day-charge
    	   		when 'CHEV' move 0.19 to per-mile-charge, move 18.00 
              to per-day-charge
    	   		when 'HOND' move 0.15 to per-mile-charge, move 15.25 
              to per-day-charge
    	   		when 'VOLK' move 0.10 to per-mile-charge, move 13.50 
              to per-day-charge
      	  end-evaluate.
            
            

            *> adjust the day count accordingly
      	 	if (days > 6) and (days < 12) then
      	 		compute days-charged = days - 1
      	 	else if (days > 12) then
      	 		compute days-charged = days - 2
                compute miles-charged = mileage - 200
            else
                compute days-charged = days
      	 	end-if.
            

      	 	*> adjust the mile count accordingly
      	 	if (mileage > 100) then
      	 		compute miles-charged = mileage - 100
      	 	else
      	 		compute miles-charged = mileage - 50
      	 	end-if.	

      *    compute the annual profit or loss of the unit calculated by 
      *> the annual revenue minus the heating cost minus the interest
           compute total-charge = (per-day-charge * days-charged) + 
               (per-mile-charge * miles-charged).
           compute state-tax = total-charge * 0.06.
           compute total-charge = state-tax + total-charge
      
      
      *    Move all data to output variables     
           move customer-name  to customer-name-out.
           move car-make       to car-make-out.
           move miles-charged  to Mileage-out.
           move days-charged   to days-out.
           move state-tax 	   to state-tax-out.
           move total-charge   to total-charge-out.

      
       
           
           write record-out from print-line-out after advancing 1 line.
           read file-in at end move 'n' to more-records.
           
       End Program aptprofits.