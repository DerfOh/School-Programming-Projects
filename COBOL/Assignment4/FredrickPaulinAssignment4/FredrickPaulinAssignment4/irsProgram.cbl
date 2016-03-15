    
       identification division.
       program-id. Program1.
       environment division.

       configuration section.
       source-computer. ibm-pc.
       object-computer. ibm-pc.
       
       file-control.
                  select file-in assign to disk 
                  "C:\Users\Fredrick\ownCloud\Programming\COBOL\Assignment4\IRS.txt"
                         organization is line  sequential.
                  select file-out assign to printer, "con".


       data division.
       
       file section.
       
           fd file-in label records are standard.
           01 record-in.  
                05 name-in pic x(20).
                05 recovered-amnt-in pic 9999999999v99.
               
               
           fd file-out label records are omitted.
           01 record-out pic x(80).        
               
       working-storage section.
           
       
      *    Begin student info
           01 header-info-out-line1.
               05 filler pic x(10) value spaces.
               05 filler pic x(15) value 'Fredrick Paulin'.

           01 header-info-out-line2.
               05 filler pic x(10) value spaces.
               05 filler pic x(24) value 'CIS-CSC 170 Assignment 4'.

           01 header-info-out-line3.
               05 filler pic x(10) value spaces.
               05 filler pic x(12) value 'Date: Mar 10'.

           01 header-info-out-line4.
               05 filler pic x(10) value spaces.
               05 filler pic x(11) value 'IRS Program'.
               05 filler pic x(10) value spaces.
      *    End of the student info
           
      *    determines the end of the file when processing records
           01 more-records pic x value 'y'.
           
      *    the reward for a specific record instance
           01 reward pic 99999999v99.
           
      *    the total award recovered from all instances
           01 total-reward pic 999999999999999999999v99.
           
      *    the total records processed
           01 record-count pic 99999.
           
      *    the average reward
           01 average-reward pic 999999999v99.
           
           
      *    Headers for the different categories of data
           01 line2-out.
               05 filler pic x(1) value spaces.
               05 filler pic x(4) value 'Name'.
               05 filler pic x(20) value spaces.
               05 filler pic x(13) value 'Amount In'.
               05 filler pic x(5) value spaces.
               05 filler pic x(6) value 'Reward'.
               
               
               
      *    Line out for the data that was computed
           01 print-computations-out.
               05 filler           pic x(1) value spaces.
               05 name-out         pic x(20).
               05 filler           pic x(4) value spaces.
               05 amnt-out         pic $zzzzzzz999.99.
               05 filler           pic x(4) value spaces.
               05 reward-out       pic $zzzz999.99.
               05 filler           pic x(4) value spaces.
               
      *    line ot for the totals and the count
           01 print-totals-out.
               05 filler pic x(1) value spaces.
               05 filler pic x(18) value 'Records Processed:'.
               05 filler pic x(1) value spaces.
               05 record-count-out pic zz9.
               05 filler pic x(2) value spaces.               
               05 filler pic x(13) value 'Total Reward:'.
               05 filler pic x(5) value spaces.
               05 total-reward-out   pic $zzzz999.99.
               
      *    line out of the average reward recieved
           01 print-average-out.
               05 filler pic x(25) value spaces.
               05 filler pic x(15) value "Average reward:".
               05 filler pic x(3) value spaces.
               05 average-reward-out   pic $zzzz999.99.
               
               
       
       
   
       procedure division.
           100-main.
      *        open files for editing
               open input file-in.
               open output file-out.

      *         Write the header with student information to the console
                write record-out from header-info-out-line1 after advancing
                1 lines.
                write record-out from header-info-out-line2 after advancing
                1 lines.
                write record-out from header-info-out-line3 after advancing
                1 lines.
                write record-out from header-info-out-line4 after advancing
                1 lines.
               
      *        Write output headers 
               write record-out from line2-out after advancing 1 lines.
               
               
      *        continue to read all records until there is nothing more to read
               read file-in at end move 'n' to more-records.
               perform 200-process until more-records = 'n'.
               
      *        output totals
               write record-out from print-totals-out.
               
      *        output the average reward recieved
               write record-out from print-average-out.
              
              
      *        close files after processes complete
               close file-in.
               close file-out.
               stop run.

           200-process.
      *        Compute the reward that is recieved from the record         
               if recovered-amnt-in <= 75000 then
                   compute reward = recovered-amnt-in * 0.1
               else if recovered-amnt-in <= 100000 then
                   compute reward = 7500 - (recovered-amnt-in - 75000) * 0.05
               else
                   compute reward = 7500  + 1250 + (recovered-amnt-in - 100000) * 0.01
               end-if.
               
      *        Rewards max out at 50000
               if reward > 50000
                   compute reward = 50000
               end-if.
               
      *        compute the total amount rewarded
               compute total-reward = total-reward + reward.
               
      *        compute the total amount of records processed
               compute record-count = record-count + 1.
               
      *        compute the average reward recieved
               compute average-reward = total-reward / record-count.

      *        move the information to the program output
               move name-in to name-out.
               move recovered-amnt-in to amnt-out.
               move reward to reward-out.
               move total-reward to total-reward-out.
               move record-count to record-count-out.
               move average-reward to average-reward-out.
               
               
      *        write records to output
               write record-out from print-computations-out after advancing 1 lines.
               read file-in at end move 'n' to more-records.
               

           
       end program Program1.
