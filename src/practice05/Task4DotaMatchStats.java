package practice05;

public class Task4DotaMatchStats {
    public static void main(String[] args) {
        String[] heroes = {"Pudge", "Invoker", "Juggernaut", "Crystal Maiden", "Earthshaker"};
        int[] kills   = {8,  12, 10, 2,  4};
        int[] deaths  = {6,  3,  2,  9,  5};
        int[] assists = {14, 9,  8,  18, 16};
        int[] netWorth = {14500, 21200, 24800, 9800, 12300};

        double[] kdaRatios = new double[heroes.length];
        int totalTeamKills = 0;
        int totalNetWorth = 0;

        for (int i = 0; i < kills.length; i++) {
            totalTeamKills += kills[i];
            totalNetWorth += netWorth[i];
        }

        for (int i = 0; i < heroes.length; i++) {
            int effectiveDeaths = Math.max(1, deaths[i]);
            kdaRatios[i] = (double) (kills[i] + assists[i]) / effectiveDeaths;
        }

        System.out.println("========================================================================");
        System.out.println("                       🏆 DOTA 2: POST-MATCH REPORT");
        System.out.println("========================================================================");
        System.out.println("Герой            | K / D / A  | Net Worth | KDA Ratio | Kill Participation");
        System.out.println("------------------------------------------------------------------------");

        double maxKda = kdaRatios[0];
        int mvpIndex = 0;

        for (int i = 0; i < heroes.length; i++) {
            if (kdaRatios[i] > maxKda) {
                maxKda = kdaRatios[i];
                mvpIndex = i;
            }

            double killParticipation = totalTeamKills > 0 ? ((double) (kills[i] + assists[i]) / totalTeamKills) * 100 : 0.0;

            System.out.printf("%-16s | %2d / %2d / %2d | %-9d | %-9.2f | %.2f%%\n",
                    heroes[i], kills[i], deaths[i], assists[i], netWorth[i], kdaRatios[i], killParticipation);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Загальна кількість вбивств команди: " + totalTeamKills);
        System.out.println("Сумарний Net Worth команди:          " + totalNetWorth + " золота");
        System.out.println("⭐ НАЙКРАЩИЙ ГРАВЕЦЬ МАТЧУ (MVP):    " + heroes[mvpIndex] + " (KDA: " + String.format("%.2f", maxKda) + ")");
        System.out.println("========================================================================");
    }
}