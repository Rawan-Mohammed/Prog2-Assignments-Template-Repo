//Rawan Mohammed AbdelTawab
//20216116
#include <iostream>
using namespace std;
int main() {
	int A, B, C;
	cin >> A >> B >> C;
	if (A >= B && A > C && B > C) {
		cout << C << endl;
		cout << B << endl;
		cout << A << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;
	}
	else if (A >= B && A >= C && C >= B) {
		cout << B << endl;
		cout << C << endl;
		cout << A << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;
	}
	else if (B >= A && B >= C && A >= C) {
		cout << C << endl;
		cout << A << endl;
		cout << B << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;

	}
	else if (B >= A && B >= C && C >= A) {
		cout << A << endl;
		cout << C << endl;
		cout << B << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;

	}
	else if (C >= B && C >= A && A >= B) {
		cout << B << endl;
		cout << A << endl;
		cout << C << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;

	}
	else if (C >= B && C >= A && B >= A) {
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;
		cout << endl;
		cout << A << endl;
		cout << B << endl;
		cout << C << endl;
	}
	return 0;
}
