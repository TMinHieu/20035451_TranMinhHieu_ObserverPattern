package org.example.Task;

import java.util.ArrayList;
import java.util.List;

class ConcreteTask implements Task {
    private String name;
    private String status;
    private List<TeamMember> members = new ArrayList<>();

    public ConcreteTask(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void attach(TeamMember member) {
        members.add(member);
    }

    @Override
    public void detach(TeamMember member) {
        members.remove(member);
    }

    @Override
    public void notifyMembers() {
        for (TeamMember member : members) {
            member.update(name, status);
        }
    }

    // Khi trạng thái thay đổi, tự động thông báo
    public void setStatus(String newStatus) {
        if (!this.status.equals(newStatus)) {
            System.out.println("Task '" + name + "' thay doi trang thai: " + status + " ➡ " + newStatus);
            this.status = newStatus;
            notifyMembers();
        }
    }
}

