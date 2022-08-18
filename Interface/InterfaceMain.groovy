package Interface

class InterfaceMain {
	static void main(String[] args) {
		Student st = new Student();
		st.StudentID = 1;
		st.Marks1 = 10;
		println(st.DisplayMarks());
	 }
}
