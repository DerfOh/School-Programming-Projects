#include <fstream>
#include <iostream>

int main()
{
    using namespace std;
    ifstream in_stream;
    ofstream out_stream;

    in_stream.open("infile.dat");
    out_stream.open("outfile.dat");
    int first, second, third;
    in_stream >> first >> second >> third;
    out_stream << "The sum of the first 3\n"
              << "numbers in infile.dat\n"
              << "is " << (first + second + third)
              << endl;

    in_stream.close();
    out_stream.close();
    return 0;
}
