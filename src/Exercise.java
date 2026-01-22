public class Exercise {
    private String name;
    private int sets;
    private int reps;
    private double weight;
    private String muscleGroup;

    public Exercise(String name, int sets, int reps, double weight, String muscleGroup)
            throws IllegalArgumentException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Exercise name cannot be blank");
        }
        if (sets < 1) {
            throw new IllegalArgumentException("Sets cannot be less than 1");
        }
        if (reps < 1) {
            throw new IllegalArgumentException("Reps cannot be less than 1");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        if (muscleGroup == null || muscleGroup.isBlank()) {
            throw new IllegalArgumentException("Muscle group cannot be blank");
        }
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.muscleGroup = muscleGroup;
    }

    public String getName() {
        return name;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public double calculateTotalVolume() {
        return weight * (sets * reps);
    }

    public String classifyExercise() {
        String muscleGroup = this.muscleGroup.toLowerCase();
        if (muscleGroup.equals("chest") || muscleGroup.equals("shoulders")
                || muscleGroup.equals("triceps")) {
            return "Push";
        } else if (muscleGroup.equals("lats") || muscleGroup.equals("biceps")
                || muscleGroup.contains("upper back") || muscleGroup.equals("erectors")) {
                    return "Pull";
                } else if (muscleGroup.equals("quads") || muscleGroup.equals("hamstrings")
                || muscleGroup.equals("calves")) {
                    return "Legs";
                }
                return "Other";
    }

    @Override
    public String toString() {
        return name + " -  Sets: " + sets + ", Reps: " + reps + ", Weight: " + weight;
    }

}
