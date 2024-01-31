package study.datajpa5.repository;

public interface NestedClosedProjections {

    String getUsername();

    TeamInfo getTeam();

    interface TeamInfo {
        String getName();
    }
}
