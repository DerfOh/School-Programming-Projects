     * String and Unstring Example


       Working-storage section.
       01 First-Name pic x(10) Value "John      ".
       01 Middle-Name Pic x(10) value "David     ".
       01 Last-Name  pic x(10) value "Smith     ".

       01 Full-Name pic x(35).



       100-main.
     *  String function

             string First-Name delimited by ' '
                    ' ' delimited by size
                    middle-name delimited by ' '
                    ' ' delimited by size
                    last-Name delimited by ' '
               into full-Name.

     *     delimited by ' ' is equal to a blank space
     *     ' ' delimited by size is equal to  putting a space between
     *              the first name and the second name

     *  Unstring function

           unstring full-Name delimited by ' ' or ','
            into first_name, Middle-Name, last-name.    