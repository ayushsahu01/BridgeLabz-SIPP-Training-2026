import java.util.*;
public class EmployeeSkillAssignment {
    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, 0, new ArrayList<>());
    }
    public static void findTeams(int[] skills, int index,
                                 int target, int currentSum,
                                 List<Integer> team) {

        if (currentSum == target) {
            System.out.println(team);
            return;
        }

        if (index == skills.length || currentSum > target) {
            return;
        }

        team.add(skills[index]);
        findTeams(skills, index + 1,
                  target, currentSum + skills[index], team);

        team.remove(team.size() - 1);

        findTeams(skills, index + 1,
                  target, currentSum, team);
    }
}