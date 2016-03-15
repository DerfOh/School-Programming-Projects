      *  Assignment #6
      *
      *  
      *  CSC-170 Sec 01
      *
      *  Write a program to sort the unsorted input 
      *  file ShipDATA6.TXT creating the sorted output file
      *  a:sort6out.txt.  Then, using the sorted file,
      *  write a program (ships2.cbl) using a control-
      *  break with the output (a:master6.txt).
      
       IDENTIFICATION DIVISION.

       Program-Id. shipsort.

       ENVIRONMENT DIVISION.

       Configuration Section.

       source-computer. ibm-pc.
       object-computer. ibm-pc.

       Input-Output Section.

       File-Control.
       
           Select file-in assign to disk "z:\ShipData6.txt"
              organization is line sequential.
           Select Aux-sort-file assign to disk "z:\temp6.txt".

           Select file-out assign to "z:\sort6out.txt"
              organization is line sequential.

       DATA DIVISION.

       File Section.
       
       FD File-in label records are standard.
       01 Record-in.
           05 pic x(40).

       SD Aux-sort-file.
       01 Aux-sort-record.
           05 filler pic x(20).
           05 cargo-in pic x(10).
           05 filler pic x(10).
       
       FD File-out label records are omitted.
       01 Record-out.
           05 pic x(40).

       Working-Storage Section.

       01 more-records pic x value 'y'.

       01 print-line-out.
           05 pic x(40).

       PROCEDURE DIVISION.
       
       100-Main-Module.

           Sort Aux-sort-file
              on ascending key cargo-in
              using file-in
              giving file-out.

           Stop run.
                       
      
