package lesson19.test19_4;

public class UrgentState implements State
{
	private static UrgentState singleton = new UrgentState();

	private UrgentState()
	{
	}

	public static State getInstance()
	{
		return singleton;
	}

	public void doClock(Context context, int hour)
	{

	}

	public void doUse(Context context)
	{
		context.callSecurityCenter("紧急:紧急时使用金库！");
	}

	public void doAlarm(Context context)
	{
		context.callSecurityCenter("按下警铃(紧急时)");
	}

	public void doPhone(Context context)
	{
		context.callSecurityCenter("正常通话(紧急时)");
	}

	public String toString()
	{
		return "[紧急时]";
	}
}
