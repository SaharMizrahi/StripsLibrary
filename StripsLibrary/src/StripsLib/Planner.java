package StripsLib;

import java.util.List;
/**
 * 
 * @author Sahar Mizrahi and Gal Ezra
 *
 */
public interface Planner
{
	public List<PlanAction> plan(Plannable plannable); 

}
