package manager.gym.Gym.Manager;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.entity.TrainingHistory;
import manager.gym.Gym.Manager.repository.MemberRepository;
import manager.gym.Gym.Manager.repository.TrainingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GymManagerApplication implements CommandLineRunner {

	private final MemberRepository memberRepository;
	private final TrainingHistoryRepository trainingHistoryRepository;

	@Autowired
	public GymManagerApplication(MemberRepository memberRepository, TrainingHistoryRepository trainingHistoryRepository) {
		this.memberRepository = memberRepository;
		this.trainingHistoryRepository = trainingHistoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(GymManagerApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) {
		// Thêm 10 thành viên
		for (int i = 1; i <= 10; i++) {
			Member member = new Member();
			member.setName("Member " + i);
			member.setAge(30);
			member.setGender("Male");
			member.setEmail("member" + i + "@example.com");
			member.setPhoneNumber("1234567890");
			member.setOccupation("Professional");
			member.setBirthday(LocalDateTime.now());
			member.setJob("Engineer");
			member.setMemberType("Regular");

			// Thêm 15 lịch sử huấn luyện cho mỗi thành viên
			List<TrainingHistory> trainingHistories = new ArrayList<>();
			for (int j = 1; j <= 15; j++) {
				TrainingHistory trainingHistory = new TrainingHistory();
				trainingHistory.setTrainingDay(new Date());
				trainingHistory.setTrainingTime("09:00 AM");
				trainingHistory.setTrainerId(1);
				trainingHistory.setMemberId(i);
				trainingHistories.add(trainingHistory);
				trainingHistoryRepository.save(trainingHistory);
			}
			memberRepository.save(member);
		}
	}
}
