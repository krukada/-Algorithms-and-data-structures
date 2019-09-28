//
// Created by Ade on 16.05.19.
//
#include <vector>
#ifndef INC_9LABASCORB_LIST_HPP
#define INC_9LABASCORB_LIST_HPP
using namespace std;
#endif //INC_9LABASCORB_LIST_HPP


template <typename T>
class Node{
private:
    vector<Node<T>> list;
    T p;
public:
    Node* next;
    Node(T elem){
        this->p = elem;
    };


    bool Next(Node m){
        return next == m;

    };
    void nextNode(Node& y){
        next = &y;
    };
    void printList(){
        for(auto i = list.begin();i != list.end(); i++)
            cout << i->p << " ";
        cout << endl;
    };
    vector<Node<T>>&operator << (Node<T>&  obj){

        if (list.size() > 0 ) {

            reverse(list.begin(),list.end());
            list.push_back(obj);
            reverse(list.begin(),list.end());
        }
        if (list.size() == 0){
            list.push_back(obj);
            list.push_back(0);
        }
        return list;
    };

    T&operator*(Node<T>&  obj){
        T m = NULL;
        for(auto i = list.begin(); i!= list.end();i++){
            if (i->p ==obj.p){
                m = obj.p;
            }
        }
        cout<<m<<endl;
        return m;
    };
    vector<Node<T>>&operator+=(Node<T>&  obj){
        list.insert(list.end()-1,obj.list.begin(),obj.list.end()-1);
        return list;
    };

    vector<Node<T>> &operator++ (int n){
        for(auto i = list.begin()+n;i != list.end(); i++)
            cout << i->p << " ";
        cout << endl;
        return list;
    };
};

