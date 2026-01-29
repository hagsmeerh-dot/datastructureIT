package HW;

import org.jetbrains.annotations.NotNull;

public class hw2 {
    //  عكس String باستخدام Stac
    #include <iostream>
#include <stack>
    using namespace std;

    protected string reverseString() {
        return reverseString(null);
    }

    protected string reverseString(@NotNull string s) {
        stack<char> st;
        for (char c : s)
            st.push(c);

        string reversed = "";
        while (!st.empty()) {
            reversed += st.top();
            st.pop();
        }
        return reversed;
    }

    int main() {
        cout << reverseString("DataStructure");
        return 0;
    }
    //ترتيب Stack باستخدام Stack واحد فقط
    #include <iostream>
#include <stack>
    using namespace std;

    void sortStack(stack<int> &s) {
        stack<int> temp;

        while (!s.empty()) {
            int curr = s.top();
            s.pop();

            while (!temp.empty() && temp.top() > curr) {
                s.push(temp.top());
                temp.pop();
            }
            temp.push(curr);
        }

        s = temp;
    }
//عكس ترتيب عناصر Queue
    #include <iostream>
#include <queue>
#include <stack>
    using namespace std;

    void reverseQueue(queue<int> &q) {
        stack<int> s;
        while (!q.empty()) {
            s.push(q.front());
            q.pop();
        }
        while (!s.empty()) {
            q.push(s.top());
            s.pop();
        }
    }
//تنفيذ Priority Queue (الأصغر يخرج أولاً)
#include <iostream>
#include <queue>
    using namespace std;

    int main() {
        priority_queue<int, vector<int>, greater<int>> pq;

        pq.push(10);
        pq.push(5);
        pq.push(20);

        while (!pq.empty()) {
            cout << pq.top() << " ";
            pq.pop();
        }
        return 0;
    }
//دمج Queueين مرتبين في Queue واحد مرتب
    #include <iostream>
#include <queue>
    using namespace std;

    queue<int> mergeQueues(queue<int> q1, queue<int> q2) {
        queue<int> result;

        while (!q1.empty() && !q2.empty()) {
            if (q1.front() < q2.front()) {
                result.push(q1.front());
                q1.pop();
            } else {
                result.push(q2.front());
                q2.pop();
            }
        }

        while (!q1.empty()) {
            result.push(q1.front());
            q1.pop();
        }

        while (!q2.empty()) {
            result.push(q2.front());
            q2.pop();
        }

        return result;
    }


}
