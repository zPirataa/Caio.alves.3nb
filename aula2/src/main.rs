use std::collections::*;

fn main() {
    let mut lista: LinkedList<i32> = LinkedList::new();

    lista.push_back(5);
    lista.push_back(15);
    lista.push_back(25);

    lista.pop_front(); // Remove o primeiro elemento
    println!("{:?}", lista);
}