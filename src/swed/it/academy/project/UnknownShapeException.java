package swed.it.academy.project;

public class UnknownShapeException extends Exception
{
    private final String exceptionMessage;

    public UnknownShapeException(String exceptionMessage)
    {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage()
    {
        return exceptionMessage;
    }
}
