package net.watoud.learn.algorithm.leetcodecn.twocityschedcost;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution
{
	public int twoCitySchedCost(int[][] costs)
	{
		List<deltaInfo> deltas = new ArrayList<>(costs.length);
		for (int[] ele : costs)
		{
			deltas.add(new deltaInfo(ele[0] - ele[1], ele[1]));
		}
		deltas.sort(new Comparator<deltaInfo>()
		{
			@Override
			public int compare(deltaInfo o1, deltaInfo o2)
			{
				if (o1.delta < o2.delta)
				{
					return 1;
				}
				else if (o1.delta == o2.delta)
				{
					return 0;
				}
				else
				{
					return -1;
				}
			}
		});
		int sum = 0, idx = 0, cnt = costs.length / 2;
		for (deltaInfo info : deltas)
		{
			++idx;
			if (idx <= cnt)
			{
				sum += info.costB;
			}
			else
			{
				sum += info.costB + info.delta;
			}
		}
		return sum;
	}

	class deltaInfo
	{
		int delta;
		int costB;

		deltaInfo(int delta, int costB)
		{
			this.delta = delta;
			this.costB = costB;
		}
	}

}
