/*
 * File:   knight_class.cpp
 * Author: CSC 275
 *
 */

#include <iostream>
using namespace std;

int const SIZE = 8;

struct box{
    int x;
    int y;

    // overload the extraction operator so we can stream our object to stdout
    friend ostream& operator <<(ostream& os, const box& box_in);

    bool is_in_range() const;
};

ostream& operator <<(ostream& os, const box& box_in){
    os << "(" << box_in.x << "," << box_in.y << ")";
    return os;
}

bool box::is_in_range() const{
    // replace this
    //const because we don't want to change anything
    return (((x >= 0) && (x < SIZE)) && (((y >= 0) && (y < SIZE))));
}

// we use stack here so we can push on the boxes that visit
class boardStack{
private:
    box *top;
    box *bottom;

public:
    boardStack(int n);
    ~boardStack();

    bool is_empty() const;
    bool is_full() const;

    void push(box box_in);
    void pop();

    int get_stack_count() const;
    void walk_stack() const;

    int search(const box& box_in) const;

    bool is_in_list(const box& box_in) const;

    // another overload so we can stream our object to stdout
    friend ostream& operator <<(ostream& os, const boardStack& board_in);
};

ostream& operator <<(ostream& os, const boardStack& board_in){

    box tmp_box;

    os << endl;
    // walk the possible y values backwards
    for(int y = (SIZE - 1); y >= 0; y--){
        // walk the possible x values forward
        for(int x = 0; x < SIZE; x++){

            tmp_box.x = x;
            tmp_box.y = y;

            if(board_in.search(tmp_box) < 10){
                os << "0" << board_in.search(tmp_box);
            }else{
                os << board_in.search(tmp_box);
            }

            os << tmp_box << " ";
        }
        os << endl;
    }

    return os;
}

boardStack::boardStack(int n){
    bottom = new box[(n * n)];
    top = bottom;
}

boardStack::~boardStack(){
    delete [] bottom;
}

int boardStack::get_stack_count() const{
    return (top - bottom);
}

bool boardStack::is_empty() const{
    return (bottom == top);
}

bool boardStack::is_full() const{
    // replace this

    return ((top-bottom)==(SIZE*SIZE));
}

void boardStack::walk_stack() const{

    cout << endl;
    if(is_empty()){
        cout << "Stack is empty";
    }else{
        // display our moves
        for(int i = 0; i < get_stack_count(); i++){
            if(i == 0){
                 cout << "we started in square (" << bottom->x << "," << bottom->y << ")" << endl;
            }else{
                cout << "move " << i <<  " from (" << (bottom + (i - 1))->x << "," << (bottom + (i - 1))->y
                     << ") to (" << (bottom + i)->x << "," << (bottom + i)->y << ")" << endl;
            }
        }
    }
}

void boardStack::push(box box_in){
    if(!is_full()){
        top->x = box_in.x;
        top->y = box_in.y;
        top++;
    }
}

void boardStack::pop(){
    top--;
}

// we want to know where our object is at on the stack
int boardStack::search(const box& box_in) const{

    int ret_val = 0;

    if(!is_empty()){
        for(int i = 0; i < get_stack_count(); i++){
            if((box_in.x == (bottom + i)->x) && (box_in.y == (bottom + i)->y)){
                ret_val = (i + 1);
                break;
            }
        }
    }

    return ret_val;
}

// we just want to know if the object is in our stack
// same as above, just now returning a boolean value
bool boardStack::is_in_list(const box& box_in) const{

    bool ret_val = false;

    if(!is_empty()){
        for(int i = 0; i < get_stack_count(); i++){
            if((box_in.x == (bottom + i)->x) && (box_in.y == (bottom + i)->y)){
                ret_val = true;
                break;
            }
        }
    }

    return ret_val;
}

//******************************************************************************
void test_me();
void move_knight(boardStack& board_in, box box_in);

int main(){
    //test_me();
    // more goes here

    boardStack my_board(SIZE);

    box start_box;
    start_box.x = 1;
    start_box.y = 0;

    move_knight(my_board, start_box);

    if(my_board.get_stack_count() == (SIZE * SIZE)){
        cout << "success " << endl;
        cout << "we did it in " << my_board.get_stack_count() << endl;
        cout << "here's the board" << my_board << endl;
        cout << "complete path  : ";
        my_board.walk_stack();
        cout << endl;
    }else{
        cout << "oops, not quite " << endl;
        cout << "we couuld only make " << my_board.get_stack_count() << endl;
        cout << "here's the board" << my_board << endl;
        cout << "path at this point  : ";
        my_board.walk_stack();
        cout << endl;
    }
    return(0);
}

void move_knight(boardStack& board_in, box box_in){
    // replace this
    box next_tmp_box;

    board_in.push(box_in);


    //up right
    next_tmp_box.x = box_in.x + 1;
    next_tmp_box.y = box_in.y + 2;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //up left
    next_tmp_box.x = box_in.x - 1;
    next_tmp_box.y = box_in.y + 2;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //left up
    next_tmp_box.x = box_in.x - 2;
    next_tmp_box.y = box_in.y + 1 ;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //left down
    next_tmp_box.x = box_in.x - 2;
    next_tmp_box.y = box_in.y - 1;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //right up
    next_tmp_box.x = box_in.x + 2;
    next_tmp_box.y = box_in.y + 1;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //right down
    next_tmp_box.x = box_in.x + 2;
    next_tmp_box.y = box_in.y - 1;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //down left
    next_tmp_box.x = box_in.x - 1;
    next_tmp_box.y = box_in.y - 2;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

    //down right
    next_tmp_box.x = box_in.x + 1;
    next_tmp_box.y = box_in.y - 2;
    if (next_tmp_box.is_in_range() && (board_in.is_in_list(next_tmp_box)==false)){
        move_knight(board_in, next_tmp_box);
    }

}

// a test function we can use to test and make sure our stack class works
void test_me(){

    boardStack test_board(SIZE);
    cout << "board size      : " << SIZE << "x" << SIZE << " (" << (SIZE * SIZE) << " box objects )" << endl;

    box tmp_box;

    tmp_box.x = 0;
    tmp_box.y = 0;
    test_board.push(tmp_box);

    tmp_box.x = 1;
    tmp_box.y = 2;
    test_board.push(tmp_box);

    tmp_box.x = 3;
    tmp_box.y = 4;
    test_board.push(tmp_box);

    cout << "number of objects on stack : " << test_board.get_stack_count() << endl;
    cout << "stack contents  : "; test_board.walk_stack(); cout << endl;

    tmp_box.x = 5;
    tmp_box.y = 6;
    test_board.push(tmp_box);

    cout << "tmp_box " << tmp_box << " is at position " << test_board.search(tmp_box) << endl << endl;

    cout << test_board << endl;

    test_board.pop();

    cout << "number on stack : " << test_board.get_stack_count() << endl;
    cout << "stack contents  : "; test_board.walk_stack(); cout << endl;
}
