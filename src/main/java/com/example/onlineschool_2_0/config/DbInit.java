package com.example.onlineschool_2_0.config;

import com.example.onlineschool_2_0.entity.AdditionalMaterials;
import com.example.onlineschool_2_0.entity.User;
import com.example.onlineschool_2_0.service.AdditionalMaterialsService;
import com.example.onlineschool_2_0.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class DbInit {

    private final AdditionalMaterialsService materialService;

    private final UserService userService;

    private Random random = new Random();

    public DbInit(AdditionalMaterialsService materialService, UserService userService) {
        this.materialService = materialService;
        this.userService = userService;
    }

    @PostConstruct
    private void postConstruct() {
        for (int i = 0; i < 100; i++) {
            final AdditionalMaterials additionalMaterials = new AdditionalMaterials();
            additionalMaterials.setLectureId(random.nextLong());
            additionalMaterials.setName("Tree " + random.nextInt());
            additionalMaterials.setIsAvailable(random.nextBoolean());
            materialService.saveMaterials(additionalMaterials);
        }

        final User user = new User();
        user.setEmail("user@gmail.com");
        user.setUsername("cat");
        user.setPassword("cat");

        userService.addUser(user, false);

        final User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setUsername("admin");
        admin.setPassword("admin");

        userService.addUser(admin, true);
    }
}
