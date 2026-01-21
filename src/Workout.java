import java.util.ArrayList;

public class Workout {
    private ArrayList<Exercise> exercises;

    public Workout() {
        this.exercises = new ArrayList<>();
    }

    public void addExercise(String exercise, int sets, int reps, double weight) {
        Exercise exerciseName = new Exercise(exercise, sets, reps, weight);
        exercises.add(exerciseName);
    }
    public double calculateTotalWorkoutVolume() {
        double totalVolume = 0;
        for (Exercise e: exercises) {
            totalVolume += e.calculateTotalVolume();
        }
        return totalVolume;
    }

    public void listWorkout() {
        int exerciseCounter = 1;
        for (Exercise e: exercises) {
            System.out.println(exerciseCounter + ": " + e);
        }
    }
}
