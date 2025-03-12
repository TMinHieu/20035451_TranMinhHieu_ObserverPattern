package org.example.Task;

public class ProjectObserver {
    public static void main(String[] args) {
        // Tạo một task
        ConcreteTask task = new ConcreteTask("Phat trien giao dien", "TODO");

        // Tạo thành viên nhóm
        TeamMember member1 = new ConcreteTeamMember("Nguyen Van A");
        TeamMember member2 = new ConcreteTeamMember("Tran Thi B");

        // Đăng ký thành viên theo dõi task
        task.attach(member1);
        task.attach(member2);

        // Cập nhật trạng thái task
        task.setStatus("IN PROGRESS");
        task.setStatus("DONE");

        // Một thành viên ngừng theo dõi
        task.detach(member1);

        // Cập nhật trạng thái task lần nữa
        task.setStatus("REVIEW");
    }
}

