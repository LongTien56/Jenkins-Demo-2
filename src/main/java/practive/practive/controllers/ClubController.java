package practive.practive.controllers;

//import org.graalvm.compiler.replacements.StringIndexOfNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import practive.practive.dto.ClubDTO;
import practive.practive.models.Club;
import practive.practive.services.ClubService;

import java.util.List;

@Controller
public class ClubController {
    private ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDTO> clubs =clubService.findAllClubs();
        model.addAttribute("clubs", clubs);
        model.addAttribute("message", "Welcome to my website!");
        return "clubs-list";
    }
    @GetMapping("/clubs/new")
    public String home(Model model) {
        Club club = new Club();
        model.addAttribute("club", club);
        return "club-create";
    }
    @GetMapping("/story")
    public String sendText(){
        return "test-frontend";
    }

    @PostMapping("/clubs/new")
        public String saveClub1(@ModelAttribute("club") Club club){
            clubService.saveClub(club);
            return  "redirect:/clubs";
        }

}
