package lesson19.test19_4;

public class NightState implements State
{
	private static NightState singleton = new NightState();

	private NightState()
	{
	}

	public static State getInstance()
	{
		return singleton;
	}

	public void doClock(Context context, int hour)
	{
		if (9 <= hour && hour < 17)
		{
			context.changeState(DayState.getInstance());
		}
	}

	public void doUse(Context context)
	{
		context.callSecurityCenter("紧急：晚上使用金库！");
	}

	public void doAlarm(Context context)
	{
		context.callSecurityCenter("按下警铃(晚上)");
		context.changeState(UrgentState.getInstance());
	}

	public void doPhone(Context context)
	{
		context.recordLog("晚上的通话录音");
	}

	public String toString()
	{
		return "[晚上]";
	}
}
