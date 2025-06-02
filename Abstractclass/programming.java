class Programming extends FirstYearCourse {
    
    void printName() {
        System.out.println("Course Name: JAVA");
    }

    void printCode() {
        System.out.println("Course Code: JV101");
    }
    public static void main(String[] args) {
        Programming prog = new Programming();
        prog.printName();
        prog.printCode();
        prog.printTotalWeeks();
    }
}
