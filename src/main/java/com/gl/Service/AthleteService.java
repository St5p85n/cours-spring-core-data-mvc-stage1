package com.gl.Service;

import com.gl.Repository.AthleteRepository;
import com.gl.Repository.NotificationRepository;
import com.gl.entities.Athlete;
import com.gl.entities.AthleteDTO;
import com.gl.generateur.AthleteGeneratoeur;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class AthleteService implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        IO.println("Init avec afterpropertieset ");
    }

    @PostConstruct
    public void init(){
        IO.println("init avec postcontruct");
    }
    @PreDestroy
    public void destroy(){
        IO.println("destrcution");
    }

    @Value("${app.name}")
    private String nomApp;
    private AthleteRepository athleteRepository;
    private NotificationRepository notificationRepository;
    private AthleteGeneratoeur athleteGeneratoeur;
    public AthleteService(AthleteRepository athleteRepository,@Qualifier("SMSNotificationRepositoryImp") NotificationRepository notificationRepository,AthleteGeneratoeur athleteGeneratoeur) {
        this.athleteRepository = athleteRepository;
        this.notificationRepository = notificationRepository;
        this.athleteGeneratoeur = athleteGeneratoeur;
    }

    public AthleteDTO getAthleteById(Athlete athlete) {
            return athleteGeneratoeur.toDTO(athlete);
    }
    public void afficherDateCompetition(){
        athleteRepository.afficherDateCompetition();
        notificationRepository.sendNotification();
        IO.println("TITLE : "+nomApp);
    }


}
