
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



      * additional working storage to complete the cover sheet

       procedure division.
       100-main-module.



      * additional write statement to complete the cover sheet


           close file-out.
           stop run.

