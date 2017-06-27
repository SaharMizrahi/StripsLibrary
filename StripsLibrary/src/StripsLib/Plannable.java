package StripsLib;

import java.util.Set;
/**
 * 
 * @author Sahar Mizrahi and Gal Ezra
 *
 */
public interface Plannable
{
	Clause getGoal();
	Clause getKnowledgebase();
	Set<PlanAction> getSatisfyingActions(Predicate topPredicate);

}
