package org.example.Task;

import java.util.ArrayList;
import java.util.List;

public interface Task {
    void attach(TeamMember member);
    void detach(TeamMember member);
    void notifyMembers();
}
