package Entities;

public class Instrutor extends Person implements Teacher {
    public Instrutor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        for(Learner learner : learners){
            learner.learn(numOfHoursPerLearner(learners, numberOfHours));
        }
    }

    public double numOfHoursPerLearner (Iterable<? extends Learner> learners, double numberOfHours){
         int counter = 0;
         for (Learner learner : learners) {
             counter++;
         }
         return counter;
    }
}
