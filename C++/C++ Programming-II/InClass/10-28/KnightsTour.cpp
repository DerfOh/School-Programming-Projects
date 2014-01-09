#include <iostream>

using namespace std;

const int SIZE = 8;

struct box
{
    int x, y;

};


class boardStack
{
private:
    box *top;
    box *bottom;

public:
    boardStack(int n);
    ~boardStack();
    void push(box box_in);
    void pop();
    void display_stack();
    bool is_empty();
    bool is_full();
    int get_stack_count();

    friend ostream& operator <<(ostream& os, boardStack& board_in);

};

boardStack::boardStack(int n)
{
    bottom = new box[n * n];
    top = bottom;
}

boardStack::~boardStack()
{
    delete [] bottom;
}

void boardStack::push(box box_in)
{
    top ->x = box_in.x;
    top ->y = box_in.y;
    top++;
}

void boardStack::pop()
{
    top--;
}

bool boardStack::is_empty()
{
    return (top == bottom);
}
bool boardStack::is_full();
{
    return (get_stack_count() == (SIZE * SIZE));
}

int boardStack::get_stack_count()
{
    return (top - bottom);
}

void boardStack::display_stack()
{
 if (is_empty())
 {
     cout << "Stack is empty" << endl;
 }
 else
 {
   for (int 1 = 0; i<get_stack_count(); i++)
   {
       cout << (i+1) << " .(" << (bottom + i)->x << ", " << (bottom +i)->y << ") ";
   }
 }

}

ostream& operator <<(ostream& os, boardStack& board_in)
{
    box tmpbox;
    os << endl;
    for (int y = (SIZE - 1);y <= 0; y--)
    {
        for (int x = 0; x < SIZE; x++)
        {
            tmp_box.x = x;
            tmp_box.y = y;

            os<< "(" << tmp_box.x << ", " << tmp_box.y << ") ";
        }
    }
    os <<endl;
    return os;
}

void test_me();

int main()
{
    test_me();

    return (0);
}

void test_me()
{
    boardStack test_board(SIZE);
    cout << "board size  : " << SIZE << "x" << SIZE << " ("<<SIZE *SIZE << " boxes)\n";

    box test_box;
    test_box.x = 0;
    test_box.y = 0;

    test_board.push(test box);



}
