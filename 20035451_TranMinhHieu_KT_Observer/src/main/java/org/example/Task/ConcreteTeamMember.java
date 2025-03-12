package org.example.Task;

class ConcreteTeamMember implements TeamMember {
    private String name;

    public ConcreteTeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println(name + " nhan duoc thong bao: Task '" + taskName + "' hien tai co trang thai: " + status);
    }
}

