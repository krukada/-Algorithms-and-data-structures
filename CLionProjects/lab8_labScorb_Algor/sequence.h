//
// Created by Ade on 17.04.19.
//

#ifndef LAB8_SEQUENCE_H
#define LAB8_SEQUENCE_H

#endif //LAB8_SEQUENCE_H

template <typename T, int M>
class Seq{
private:
    T a[M];
public:
    T& operator[] (int index);
    void set(T x);
    void print();
    Seq<T,0> maxSum();
};

template <typename T>
class Seq<T,0>{
private:
    int x;
public:
    Seq<T,0>(int x);
    int size();
};
