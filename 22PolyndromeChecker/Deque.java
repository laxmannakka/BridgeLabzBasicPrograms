package com.bridgelabz.nodedeque;

public class Deque<E>
{
    public E mdata;
    public Deque<E> mnext;
    public Deque <E> mpre ;

public Deque(E val)
{
    this.mdata =val;
    this.mnext =null;
    this.mpre = null;
}



}
