#include <iostream>
using namespace std;

struct record
{
  double quiz1, quiz2;
  double midterm, final, course;
  string name;
};

char returnLetterGrade(double grade);
double average(record student);

char returnLetterGrade(double grade)
{
    //decides what letter to assign to the given grade
    if (grade >= 90)
    {
        return 'A';
    }
    else if ((grade >= 80) && (grade < 90))
    {
        return 'B';
    }
    else if ((grade >= 70) && (grade < 80))
    {
        return 'C';
    }
    else if ((grade >= 60) && (grade < 70))
    {
        return 'D';
    }
    else if ((grade < 60))
    {
        return 'F';
    }

    //in case of invalid input
    else
    {
        cout << "The number you entered is an unnaceptable value, the program will now exit.";
        return (0);
    }



}

double average(record student)
{
    return ((student.final * 0.50) //multiplied by decimal to computer percentage towards grade.
            +(student.midterm * 0.25)
            +((student.quiz1*10)*0.125) //quizzes are multiplied by 10 to normalize them then multiplied by decimal to compute percentage.
            +((student.quiz2*10)*0.125));
}

int main()
{
    record student;

    cout << "Enter the name of the student being evaluated: ";
    cin >> student.name;
    cout << "Enter the score for quiz one: " ;
    cin >> student.quiz1;
    cout << "Enter the score for quiz two: ";
    cin >> student.quiz2;
    cout << "Enter the score for the Midterm Exam: ";
    cin >> student.midterm;
    cout << "Enter the score for the final: ";
    cin >> student.final;
    student.course = average(student);





    cout << "\n\nResults for: " << student.name << endl;
    cout << "-----------------------------------------------------------" << endl;

    //quizes are multiplied by ten so that a single function can be used to evaluate the letter grade
    //furthermore the function evaluates grades on a 100 point scale.
    cout << "Quiz one: \t" << returnLetterGrade(student.quiz1*10) << "\tscore: " << student.quiz1 << endl;
    cout << "Quiz two: \t" << returnLetterGrade(student.quiz2*10) << "\tscore: " << student.quiz2 << endl;
    cout << "Midterm: \t" << returnLetterGrade(student.midterm) << "\tscore: " << student.midterm << endl;
    cout << "Final: \t\t" << returnLetterGrade(student.final) << "\tscore: " << student.final << endl;
    cout << "-----------------------------------------------------------" << endl;
    cout << "Course Grade: \t" <<  returnLetterGrade(student.course) <<"\tscore: " << student.course << endl;

    return 0;
}
