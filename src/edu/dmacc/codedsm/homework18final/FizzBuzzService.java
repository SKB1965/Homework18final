package edu.dmacc.codedsm.homework18final;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    private MapRepository repository;

    }
    public FizzBuzzServiceImpl(MapRepository repository){
        this.repository = repository;
    }

    @Override
    public Result performFizzBuzzLogic(Submission submission) {
        String message = "";
        if (Submission.getInputNumber() % 4 == 0 && Submission.getInputNumber() % 7 == 0) {
            message = "FizzBuzz!";

        } else if (Submission.getInputNumber() % 4 == 0) {
            message = "Fizz";

        } else if (Submission.getInputNumber() % 7 == 0) {
            message = "Buzz";

        }
        Result result = new Result();
        result.setMessage(message);
        repository.save(result);
        return result;

    }
}
