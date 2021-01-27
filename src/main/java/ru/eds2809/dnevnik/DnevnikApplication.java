package ru.eds2809.dnevnik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.eds2809.dnevnik.models.Appraisal;
import ru.eds2809.dnevnik.models.ClassRoom;
import ru.eds2809.dnevnik.models.Pupil;
import ru.eds2809.dnevnik.models.Subject;
import ru.eds2809.dnevnik.repositories.AppraisalRepository;
import ru.eds2809.dnevnik.repositories.PupilRepository;

import java.util.Map;

@SpringBootApplication
public class DnevnikApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DnevnikApplication.class, args);
		/*PupilRepository pupilRepository = context.getBean(PupilRepository.class);
		AppraisalRepository appraisalRepository = context.getBean(AppraisalRepository.class);

		ClassRoom classRoom = new ClassRoom("1A",null);
        Pupil pupil = new Pupil("Дима", "eds2809", "1", classRoom);
        Subject subject = new Subject("Математика");
        Appraisal appraisal = new Appraisal(5);
        Appraisal appraisal2 = new Appraisal(3);

        appraisalRepository.save(appraisal);
        appraisalRepository.save(appraisal2);*/

    }

}
