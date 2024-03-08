package cn.nesc.general.demo1.exceptions;

/**
 * @author Clinton Begin
 */
public class NotSupportException extends Exception
{

	private static final long serialVersionUID = 8935197089745865786L;

	public NotSupportException()
	{
		super();
	}

	public NotSupportException(String message)
	{
		super(message);
	}

	public NotSupportException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public NotSupportException(Throwable cause)
	{
		super(cause);
	}
}
