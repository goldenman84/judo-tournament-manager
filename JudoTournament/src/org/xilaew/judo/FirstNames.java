package org.xilaew.judo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class SurNames
 */
@WebServlet("/FirstNames")
public class FirstNames extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String names[] = {
			"Ben","Leon","Lukas","Lucas","Finn","Fynn","Jonas","Maximilian","Luis","Louis","Paul","Felix","Luca","Luka","Noah","Tim","Elias","Max","Julian","Philipp","Moritz","Niklas","Niclas","Alexander","Jan","Jakob","Jacob","Tom","David","Erik","Eric","Fabian","Simon","Jannik","Yannik","Yannick","Yannic","Nico","Niko","Lennard","Lennart","Linus","Oskar","Oscar","Nils","Niels","Anton","Emil","Florian","Nick","Leo","Rafael","Raphael","Vincent","Henry","Henri","Hannes","Benjamin","Adrian","Marlon","Mika","Joel","Jonathan","Till","Samuel","Daniel","Sebastian","Lennox","Dominic","Dominik","Johannes","Jason","Colin","Collin","Leonard","Julius","Jannis","Janis","Yannis","Aaron","Constantin","Konstantin","Tobias","Carl","Karl","Liam","Jona","Jonah","Ole","Lenny","Lenni","Matteo","Robin","Timo","Theo","John","Jayden","Jaden","Johann","Levi","Mats","Mads","Bastian","Jamie","Mattis","Mathis","Matthis","Mohammed","Muhammad","Gabriel","Marc","Mark","Noel","Joshua","Phil","Lasse","Levin","Kilian","Maxim","Maksim","Michael","Valentin","Justus","Benedikt","Damian","Tyler","Tayler","Justin","Marvin","Marwin","Malte","Matti","Artur","Arthur","Christian","Bennet","Lars","Silas","Oliver","Finnley","Finley","Finlay","Luke","Luc","Bruno","Pepe","Jannes","Jeremy","Sam","Emir","Dean","Julien","Marco","Marko","Leandro","Dennis","Kevin","Pascal","Toni","Tony","Leopold","Nicolas","Nikolas","Tristan","Frederik","Frederic","Richard","Marcel","Manuel","Elia","Eliah","Henrik","Maik","Meik","Mike","Diego","Arne","Ali","Fabio","Matthias","Marius","Theodor","Lias","Emilio","Franz","Kai","Kay","Lian","Can","Connor","Conner","Emilian","Markus","Marcus","Martin","Leander","Maurice","Patrick","Clemens","Klemens","Ian","Andreas","Ryan","Enes","Fritz","Kaan","Milan","Laurin","Neo","Adam","Yusuf","Ferdinand","Lion","Lorenz","Alessio","Domenic","Domenik","Laurens","Laurenz","Christopher","Fiete","Ilias","Ilyas","Magnus","Konrad","Malik","Nikita","Torben","Thorben","Lionel","Luan","Jasper","Josef","Joseph","Mert","Cedric","Cedrik","Len","Lenn","Hendrik","Leonhard","Michel","Piet","Eddi","Eddy","Ahmed","Ahmet","Carlo","Karlo","Friedrich","Hugo","Thomas","Alex","Ludwig","Arian","Deniz","Devin","Chris","Gustav","Peter","Timon","Arda","Milo","Roman","Jerome","Robert","Ruben","Alessandro","Efe","Bela","Georg","Willi","Willy","Benno","Charlie","Charly","Mehmet","Yasin","Janne","Anthony","Antonio","Christoph","Kian","Leonardo","Danny","Kerem","Korbinian","Eren","Mustafa","Nevio","Darian","Ibrahim","Jaron","Miguel","Nino","Quentin","Amir","Brian","Bryan","Henning","Marian","Thilo","Tilo","Claas","Klaas","Joris","Semih","Hans","Curt","Kurt","Sascha","Carlos","Enno","Etienne","Ã–mer","Thore","Tore","Titus","Andre","Damien","Jack","Steven","Sven","Taylor","William","Enrico","Hamza","Leif","Bjarne","Mio","Tino","Dustin","Mikail","Sandro","Stefan","Stephan","Darius","Kerim","Rayan","Victor","Viktor","Janosch","Kjell","Arvid","Berat","Berkay","SÃ¶ren","Jean","Leonidas","Lino","Dario","Jarne","Mailo","Romeo","Lucien","Ricardo","Riccardo","Emirhan","Eymen","Marten","Peer","Sean","Bilal","Danilo","Elijah","Gian","Giuliano","Jonte","Damon","Iven","Yven","Marek","Mick","Tjark","Yunus","Albert","Emre","Jamal","Keno","Lean","Mario","Mirco","Mirko","Rico","Armin","Jordan","Karim","Maddox","Valentino","Angelo","Arjen","Dion","Dorian","Hanno","Keanu","Nathan","Taha","Aiden","Ayden","Aras","Batuhan","Cem","Ege","Emanuel","Melvin","Tamino","Xaver","Dylan","Edwin","Jano","RenÃ©","Rocco","Tizian","Wilhelm","Amin","Fabrice","Jannek","Janek","Jarno","Lewis","Logan","Merlin","Sami","Alwin","Eduard","James","Jesse","Joost","Jost","Mattes","Pierre","Timur","Tommy","Yigit","Alan","Jake","Jon","Juri","Ahmad","Denny","Hauke","Jay","Kalle","Lio","Neven","Selim","Stanley","Tammo","Baran","Edward","Elian","Furkan","Gino","Jesper","Kenan","Lutz","Mirac","Miran","Pius","Quirin","Thies","Adriano","Davin","Gianluca","Ron","Sinan","BjÃ¶rn","Caspar","Ensar","Eray","Francesco","Gregor","HÃ¼seyin","Joe","Leonas","Mete","Nicolai","Nikolai","Ramon","Rasmus","Tiago","Ansgar","Halil","Hasan","Jim","Jimmy","Koray","Lucian","Onur","Samir","Umut","Davide","Erwin","Fernando","Heinrich","Ilja","Jayson","Kuzey","Orlando","Otto","Vitus","Alen","Corvin","Hagen","Ismail","Joscha","Miko","Nelson","Rune","Santino","Alejandro","Benny","Dave","Falk","Hassan","Ivan","Kimi","Kirill","Loris","Marlo","Matthew","Raul","Severin","Tamme","Vince","Yassin","Edgar","Emin","Faris","Gerrit","Hermann","Jermaine","Pablo","Taylan","Toprak","Torge","Younes","Ardian","Azad","Bendix","Burak","Ediz","Elmedin","Giuseppe","Jakub","Joey","Kadir","Leart","Lorenzo","Luiz","Raik","Vinzenz","Alper","Atakan","Cornelius","Demian","Devran","Flynn","Giovanni","Harun","Jeremias","Melih","Sammy","Simeon","Steffen","Vincenzo","Bent","Christos","Dante","Dian","Edin","Enzo","Esad","Hennes","Eik"
           ,"Mia","Emma","Hannah","Hanna","Anna","Lea","Leah","Leonie","Lina","Marie","Sofia","Sophia","Lena","Emily","Emilie","Lilli","Lilly","Lili","Laura","Sophie","Sofie","Lara","Amelie","Emilia","Nele","Neele","Johanna","Sarah","Sara","Luisa","Louisa","Maja","Maya","Leni","Clara","Klara","Pia","Charlotte","Julia","Alina","Melina","Lisa","Zoe","Zoé","Paula","Jana","Lia","Liah","Lya","Ida","Finja","Finnja","Emely","Emelie","Lotta","Greta","Josephine","Josefine","Marlene","Mathilda","Matilda","Jasmin","Yasmin","Frieda","Frida","Stella","Ella","Isabell","Isabel","Isabelle","Victoria","Viktoria","Lucy","Lucie","Helena","Katharina","Annika","Chiara","Kiara","Mara","Marah","Isabella","Amy","Fiona","Antonia","Pauline","Mila","Jule","Maria","Nina","Elisa","Theresa","Teresa","Franziska","Jolina","Joelina","Selina","Eva","Celina","Merle","Mira","Milena","Melissa","Sina","Sinah","Elena","Ronja","Vanessa","Carla","Karla","Luise","Louise","Helene","Nora","Romy","Angelina","Aylin","Eileen","Aileen","Ayleen","Carolin","Caroline","Karoline","Luna","Magdalena","Samira","Celine","Leila","Leyla","Paulina","Carlotta","Karlotta","Linda","Larissa","Vivien","Vivienne","Valentina","Elisabeth","Jette","Kim","Zoey","Alexandra","Martha","Marta","Miriam","Anni","Annie","Anny","Kira","Kyra","Annabell","Annabelle","Lana","Lenja","Lenya","Michelle","Fabienne","Laila","Layla","Mina","Kimberly","Kimberley","Elina","Marleen","Marlen","Julie","Lucia","Olivia","Alessia","Elif","Alicia","Leticia","Letizia","Samantha","Anastasia","Lotte","Nelly","Nelli","Rebekka","Tabea","Annalena","Lene","Svea","Lynn","Linn","Milla","Alisa","Aaliyah","Aliya","Carolina","Karolina","Alissa","Alyssa","Evelyn","Evelin","Eveline","Natalie","Nathalie","Marla","Nisa","Mariella","Christina","Xenia","Dana","Diana","Ela","Carina","Karina","Leona","Cheyenne","Chayenne","Tessa","Anne","Josie","Josy","Emmi","Emmy","Ecrin","Liv","Rosalie","Tuana","Mona","Liliana","Noemi","Jessika","Jessica","Luana","Alexa","Amalia","Amira","Aurelia","Leana","Azra","Ceylin","Elli","Elly","Veronika","Liana","Livia","Tamara","Amina","Giulia","Helen","Tamina","Fenja","Leandra","Saskia","Thea","Dilara","Lorena","Medina","Ava","Melanie","Selma","Aleyna","Ina","Marit","Esila","Henriette","Nicole","Florentine","Malin","Linea","Linnea","Madita","Svenja","Felicitas","Jill","Jil","Rieke","Rike","Rosa","Daria","Smilla","Tara","Lilian","Lillian","Kaja","Kaya","Caja","Lilith","Julina","Maike","Meike","Marina","Talia","Thalia","Amelia","Ayla","Elin","Freya","Jennifer","Nayla","Zeynep","Heidi","Joline","Joeline","Alea","Alena","Enna","Juliane","Nika","Selin","Valerie","Asya","Hailey","Josefin","Josephin","Joy","Joana","Jonna","Mary","Valeria","Ashley","Melia","Hermine","Janne","Nela","Ann","Ilayda","Juna","Yuna","Felina","Holly","Janina","Joleen","Mirja","Summer","Alisha","Melek","Jara","Yara","Joyce","Malia","Melisa","Viola","Aimee","Enya","Esma","Friederike","Jamie","Jolien","Levke","Madlen","Madleen","Alia","Annelie","Jolie","Malina","Patricia","Tilda","Cecilia","Delia","Eda","Jasmina","Aurora","Cassandra","Kassandra","Cora","Eliana","Elise","Ellen","Jenna","Meryem","Naomi","Vivian","Mariam","Maryam","Ylvi","Ylvie","Anouk","Ceyda","Felicia","Lavinia","Liya","Sarina","Sonja","Yagmur","Bella","Celia","Elaine","Franka","Jenny","Lola","Alma","Elsa","Helin","Maxima","Melis","Enie","Judith","Marlena","Nahla","Ruby","Adriana","Alice","Juliana","Maren","Romina","Sena","Zara","Miley","Nike","Tia","Edda","Gina","Joanna","Katrin","Catrin","Kathrin","Mathilde","Nadine","Naemi","Zehra","Frederike","Katja","Lilia","Milana","Beyza","Charleen","Flora","Inga","Mailin","Maira","Maxi","Soraya","Tamia","Janin","Janine","Lydia","Maila","Mayla","Natalia","Stefanie","Stephanie","Stina","Alica","Ayse","Jona","Jonah","Kiana","Marieke","Marike","Melinda","Melody","Penelope","Annemarie","Cara","Denise","Nala","Nia","Sabrina","Abby","Alva","Ariana","Ariane","Christin","Kristin","Defne","Fatima","Feline","Henrike","Madeleine","Malou","Mieke","Naila","Saphira","Sienna","Tiana","Verena","Amanda","Elea","Irem","Luca","Luka","Luzi","Luzie","Mareike","Mathea","Salome","Stine","Adelina","Anja","Chantal","Clarissa","Eleonora","Havin","Kayra","Marielle","Marisa","Mayra","Megan","Miray","Nila","Nilay","Philine","Philippa","Phoebe","Sidney","Sydney","Yaren","Zazou","Allegra","Arina","Charlotta","Cosima","Giuliana","Joselyn","Joseline","Jocelyn","Kate","Liz","Nadja","Rachel","Sila","Tarja","Yasmina","Alessa","Davina","Evelina","Fatma","Line","Lorin","Lou","Rana","Sandra","Shania","Sude","Violetta","Ada","Adele","Andrea","Anita","Asmin","Claire","Dina","Grace","Hanne","Joelle","Kathleen","Käthe","Leonora","Malea","Samia","Shirin","Sinja","Berfin","Charlene","Eleanor","Esther","Femke","Hayley","Janna","Lejla","Malena","Mya","Pelin","Seraphina","Talea","Thalea","Wiebke","Alara","Alexia","Anneke","Beren","Betty","Dalia","Elaina","Eylül","Fine","Gioia","Gloria","Hedi","Hedy","Hira","Ilaria","Josefina","Leia","Leya","Lenia","Michaela","Rania","Salma","Selena","Sunny","Tina","Zümra","Alessandra","Amilia","Bianca","Bianka","Elanur","Eleni","Ines","Irma","Jasmine","Jody"
			};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstNames() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> res = new ArrayList<String>();
		String term = request.getParameter("term");
		if (term==null || term.length()<2){
			response.getWriter().write("noData");
			return;
		}
		term = term.toLowerCase();
		term = Character.toUpperCase(term.charAt(0))+term.substring(1);
		System.out.println("term="+term);
		for (int i=0,j=0; i<10 && j<names.length;j++){
			String s = names[j];
			if (s.startsWith(term)){
				res.add(s);
				System.out.println(s);
				i++;
			};
		}
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(res));
	}

}
