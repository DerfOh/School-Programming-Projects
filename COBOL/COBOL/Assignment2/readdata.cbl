
      *Readdata.cbl example
       identification division.
       program-id. readit.
       environment division.
       input-output section.


       file-control.
           select file-in assign to disk "H:\testdata.txt"
                 organization is line  sequential.
           select file-out assign to printer, "con".


       data division.
       file section.
       fd file-in label records are standard.
       01 record-in.
           05 ship-name-in   pic x(15).
           05 units-in  pic 9(6).
           05 cargo-in  pic x(8).
           05 unit-price pic 999v99.

       fd file-out label records are omitted.
       01 record-out pic x(80).


       working-storage section.
       01 more-records pic x value 'y'.
       01 total-cost pic 999999999999999v99.

       01 line1-out.
           05 filler pic x(37) value spaces.
           05 filler pic x(6) value 'output'.
           05 filler pic x(37) value spaces.

       01 line2-out.
           05 filler pic x(1) value spaces.
           05 filler pic x(9) value 'Ship Name'.
           05 filler pic x(10) value spaces.
           05 filler pic x(8) value 'Cargo'.
           05 filler pic x(6) value spaces.
           05 filler pic x(5) value 'Units'.
           05 filler pic x(8) value spaces.
           05 filler pic x(13) value 'Cost Per Unit'.
           05 filler pic x(4) value spaces.
           05 filler pic x(10) value 'Total Cost'.

       01 print-line-out.
           05 filler    pic x(1) value spaces.
           05 ship-name-out  pic x(15).
           05 filler    pic x(4) value spaces.
           05 cargo-out pic x(5).
           05 filler    pic x(8) value spaces.
           05 units-out   pic 999999.
           05 filler    pic x(8) value spaces.
           05 price-out pic $zzz,999.99.
           05 filler    pic x(6) value spaces.
           05 cost-out  pic $zzz,9999999.99.
           05 filler    pic x(13) value spaces.

       procedure division.
       100-main.
           open input file-in.
           open output file-out.
           write record-out from line1-out after advancing 5 lines.
           write record-out from line2-out after advancing 2 lines.
           read file-in at end move 'n' to more-records.
           perform 200-process until more-records = 'n'.
           close file-in.
           close file-out.
           stop run.

       200-process.
           compute total-cost = unit-price * units-in.
           move ship-name-in to ship-name-out.
           move cargo-in to cargo-out.
           move units-in to units-out.
           move unit-price to price-out.
           move total-cost to cost-out
           write record-out from print-line-out after advancing 1 line.
           read file-in at end move 'n' to more-records.





