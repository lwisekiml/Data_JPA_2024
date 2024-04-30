package study.datajpa.repository;

public interface NestedClosedProjections {

    String getUsername(); // 첫번째 것은 정확하게 최적화가 되어 username만 가져온다.
    TeamInfo getTeam(); // 두번째 부터는 최적화가 안되고 팀은 엔티티 그대로 불러온다.

    interface TeamInfo {
        String getName();
    }
}
