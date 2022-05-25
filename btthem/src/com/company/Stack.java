package com.company;

public class Stack {

    static class Parantheses{

        static class stack{
            int top=-1;
            char items[] = new char[100];

            void push(char x){
                if(top == 99){
                    System.out.println("Stack full");
                }

                else{
                    items[++top] = x;
                }
            }

            char pop(){
                if(top == -1){
                    System.out.println("Underflow error");
                    return '\0';
                }

                else{
                    char element = items[top];
                    top--;
                    return element;
                }
            }

            boolean isEmpty(){
                return (top == -1) ? true : false;
            }
        }

         static boolean isPair(char character1, char character2){
            if(character1 == '(' && character2 == ')')
                return true;

            else if(character1 == '{' && character2 == '}')
                return true;

            else if(character1 == '[' && character2 == ']')
                return true;

            else
                return false;
        }

        static boolean isBalanced(char s[]){
            stack st=new stack();

            for(int i=0;i<s.length;i++){

                if(s[i] == '{' || s[i] == '(' || s[i] == '[')
                    st.push(s[i]);

                if(s[i] == '}' || s[i] == ')' || s[i] == ']'){

                    if (st.isEmpty()){
                        return false;
                    }

                    else if( !isPair(st.pop(), s[i])){
                        return false;
                    }
                }

            }

            if(st.isEmpty())
                return true;

            else
                return false;
        }
        public static void main(String[] args){
            char s[] = {'[','(',')',']','{','}','{','[','(',')','(',')',']','(',')','}'};

            if(isBalanced(s)){
                System.out.println("Expression is balanced.");
            }
            else{
                System.out.println("Expression is not balanced.");
            }
        }
    }
}
