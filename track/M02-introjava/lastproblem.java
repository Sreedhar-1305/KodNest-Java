class lastproblem {
    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearninghours = 3;
        int learningdays = 5;
        double progressPercentage = (double) completedTopics * 100 / totalTopics;
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + (totalTopics - completedTopics));
        System.out.println("Weekly Learning Hours: " + dailyLearninghours * learningdays);
        System.out.println("Progress Percentage: " + progressPercentage);

    }
}
