#include <iostream>
using namespace std;

struct rectangle
{
    int width;
    int height;
    int area;
    string name;
};

void getData(rectangle& rect1);
void setArea(rectangle& rect1);
void displayData(rectangle rect_in);
rectangle copyData(rectangle rect1);
rectangle doubleData(rectangle rect_in)


int main()
{
    //rectangle rect1 = {2, 4};
    rectangle rect1, rect2, rect_copy, double_copy;

    getData(rect1);
    //getData(rect2);

//    setArea(rect1);
//    setArea(rect2);

//    cout << "the name of my rectangle is: " << rect1.name << endl;
//    cout << "the width of my rectangle is: " << rect1.width << endl;
//    cout << "the height of my rectangle is: " << rect1.height << endl;
//    cout << "the area of my rectangle is: " << rect1.area << endl;
    displayData(rect1);
    //displayData(rect2);

    rect_copy = copyData(rect1);
    displayData(rect_copy);
    double_copy = double_data(rect_copy)

    return 0;
}

rectangle copyData(rectangle rect_in)
{
    return rect_in;
    //being used to copy the other data value because it is only asking for a value...
}

rectangle doubleData(rectangle rect_in)
{
    rect_in.name = rect_in.name + "_double";
    rect_in.width = rect_in *2;
    rect_in.height = rect_in.height*2;

    setArea(rect_in);
    return rect_in;



}

void setArea(rectangle& rect_in)
{

    rect_in.area = rect_in.height * rect_in.width;
}

void getData(rectangle& rect_in)
{
    cout << "Enter The name: ";
    cin >> rect_in.name;

    cout << "Enter The width: ";
    cin >> rect_in.width;

    cout << "Enter the height: ";
    cin >> rect_in.height;
    setArea(rect_in);
}

void displayData(rectangle rect1)
{

    cout << "the name of my rectangle is: " << rect1.name << endl;
    cout << "the width of my rectangle is: " << rect1.width << endl;
    cout << "the height of my rectangle is: " << rect1.height << endl;
    cout << "the area of my rectangle is: " << rect1.area << endl;
}
