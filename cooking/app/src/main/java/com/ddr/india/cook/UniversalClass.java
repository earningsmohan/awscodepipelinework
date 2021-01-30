package com.ddr.india.cook;

import android.renderscript.Script.KernelID;

public class UniversalClass {
	
	public static String[] types={"African Recpies","American Recpies","Chinese Recpies","France Recpies","German Recpies","International Recpies","Italian Recpies","Japanese Recpies","Jewish Recpies","Korean Recpies","Mexican Recpies","Middle Eastern Recpies","Nepali Recpies","Pakistan Recpies",
		"Thai Recpies","Srilanka Recpies","Indian Recpies"};
	public static String[] Africantypes={"Chicken in Cumin Sauce","Custard Pineapple","Chicken Mussalam","Chicken Shashlik","Chapli Kababs","Nihari","Seekh Kabab","Chicken Porridge","Kimchi Fried Rice","Swiss Circles","White Pumpkin Fritters","Malai Mushroom","African Vegetable Stew","Amhari Mesir Wat","Banana Pie ",
	"Casserole","Apple Coffee Cake","Banana Dressing","Alaska Salmon Melts","Baked Fish Fillet","Bacon Cheese Dogs","Malay lamb curry potjie","Curry sosaties","Potato curry with poached eggs","Citrus chicken curry","Lamb and apricot curry","Samp curry","Smoorsnoek","Creamed chicken curry","Hake and fennel bobotie"};
	public static Integer[] images = {
		R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,R.drawable.ime,
		R.drawable.ime,R.drawable.ime,R.drawable.ime};
	public static String[] itemtypes={"Baking Recipes","Biryani Recipes","Breakfast Recipes","Chutneys Recipes","Desserts Recuoes","Drinks Recipes","Salad Recipes","Soups Recipes","Snacks Recipes","Chicken Recipes","Seafood Recipes","Mutton Recipes"};
	public static Integer[] itemimages={R.drawable.baking,R.drawable.sindhichickenbiryani,R.drawable.breakfast,R.drawable.chutneys,R.drawable.basundi,R.drawable.lemonjuice,R.drawable.beanssalad,R.drawable.thaisoup,R.drawable.cornsandwich,R.drawable.orangechicken,R.drawable.fishfry,R.drawable.muttoncurrywithchillies};
	public static Integer[] Africanimages = {
		R.drawable.chickenincuminsauce,R.drawable.custardpineapple,R.drawable.chickenmussalam,R.drawable.chickenshahlik,R.drawable.chapalikababs,R.drawable.nihari,R.drawable.seekhkabab,R.drawable.chickenporridge,R.drawable.kimchifriedrice,R.drawable.swisscircles,R.drawable.whitepumpkin,R.drawable.malaimushroom,R.drawable.africanvigetablestew,R.drawable.amharimesirwat,R.drawable.bananapie
		,R.drawable.casserole,R.drawable.applecoffeecake,R.drawable.bananadressing,R.drawable.alaskasalmonmelts,R.drawable.bakedfishfillet,R.drawable.baconcheesedogs,R.drawable.malaylambcurrypotjie,R.drawable.currysosaties,R.drawable.potatocurrywithpoachedeggs,R.drawable.citruschickencurry,R.drawable.lambandapricot,R.drawable.sampcurry,R.drawable.smoorsnoek,R.drawable.creamedchickencurry,R.drawable.hakeandfennelbobotie};
	public static String[] Americantypes={"Hawaiin Chicken Sandwich","Mushroom Fritters","Turkey Burger","Turkey Tandoori","Rich Peanut Butter Cookies","X-Mas Porridge","Strawberry Pie","Almond Bark","Fish Manchurian","Onion-Potato Soup","Crock Pot Roast","Creamy Cajun Chicken Pasta","Great Meatloaf","Beer Bread","Classic Baked Macaroni & Cheese",
		"Crock Pot Whole Chicken","Delicious Chicken Pot Pie","Southern Fried Chicken","Barbecue Ribs","Basil Cream Chicken","Baked Chicken","The Blue Mill Tavern Loosemeat Sandwich","Brown Sugar Meatloaf","Chicken Noodle Soup","Crock Pot Cream Cheese Chicken","Oven Fried Eggplant ","Scalloped Potatoes"};
	public static Integer[] Americanimages = {
		R.drawable.hawaiinchickensandwich,R.drawable.mushroomfritters,R.drawable.turkeyburger,R.drawable.turkeytandoori,R.drawable.richpeanutbuttercookes,R.drawable.chrismasporridge,R.drawable.strawberrypie,R.drawable.almondbark,R.drawable.fishmanchurian,R.drawable.onionpotatosoup,R.drawable.crockpotroast,R.drawable.creamycajunchickenpasta,R.drawable.greatmeatloaf,R.drawable.beerbread,R.drawable.fanniefarmersclassicbakedmacaronicheese
		,R.drawable.crockpotwholechicken,R.drawable.deliciouschickenpotpie,R.drawable.friedchicken,R.drawable.barbecueribs,R.drawable.basilcreamchicken,R.drawable.bakedchicken,R.drawable.bluemilltavernloosemeatsandwich,R.drawable.brownsugarmatloag,R.drawable.chickennoodlesoup,R.drawable.crockpotcreamcheesechicken,R.drawable.ovenfriedeggplant,R.drawable.scallopedpotatoes};
	public static String[] chinesetypes={"Chinese Pickled Vegetables","Vegetable Kung Pao","Vegetable Chow Mein","Chicken Chow Mein","Quails Fry","Orange Chicken","Chicken adobo","Cheese Balls","chicken nuggets","Egg Croquettes","Fish In Garlic Sauce","Steamed Fish","Spicy Honey Chicken Wings","Tomato Egg Drop Soup","Apples Walnut Caramel Crunch","Cheese Chicken Kebab with Pesto","Asian Noodles with Chicken and Shrimp","Golden Fried Prawns",
		"Cheese Pearls Pulao","Chicken Noodle Soup","Chinese Hot and Sour Onions","Potato Chinese","Hakka Noodles","Fried Rice ","Bean Sprouts","Noodle Soup","Billy Kee Chicken","Fried Noodles","Marinated Chicken Wings","cheese and pasta salad"};
	public static Integer[] chineseimages = {R.drawable.chinesepickledvegetables,R.drawable.vege,R.drawable.vegetablechowmein,R.drawable.chickenchowmein,R.drawable.quailsfry,R.drawable.orangchicken,R.drawable.chickenadobo,R.drawable.cheeeballs,R.drawable.chickennuggets,R.drawable.eggcroquettes,R.drawable.fishgarlicsauce,R.drawable.steamedfish,R.drawable.spicyhoneychickenwings,R.drawable.tomatoeggsoup,R.drawable.appleswalnutcaramelcrunch,R.drawable.cheesechickenkababwith,R.drawable.noodleswithchickenandshrimp,R.drawable.gloldernfriedprawns,
		R.drawable.cheesepearlspulao,R.drawable.chickennoodlesoup2,R.drawable.chinesehotandsouronions,R.drawable.potatochinese,R.drawable.hakkanoodles,R.drawable.friedrice,R.drawable.beansprouts,R.drawable.noodlessoup,R.drawable.billykeechicken,R.drawable.friednoodles,R.drawable.marinatedchickenwings,R.drawable.cheeseandpastasalad};
	public static String[] frenchtypes={"Orange-Cardamom Madeleines","Coq au Vin","Beef Burgundy","Pork Chops au Poivre","Sole with Lemon Cream","Coleslaw","Mayonnaise","Bread Rolls","Chocolate Walnut Brownie","Roasted Pumpkin Tomato Soup","Cream Of Fresh Mushroom Soup","Caramel Custard","French fries and chips","Breakfast Burritos","Crispy Cheese Rolls","Pudding Souffle","Baked Eggs","Cuban Eggs","Sweet Omelette","Light Salade aux Lardons","Bacon-and-Leek Quiche","Parsleyed New Potatoes","Chicken Fricassee with Tarragon"};
	public static Integer[] frenchimages ={R.drawable.orangecardamommadelaines,R.drawable.coqauvin,R.drawable.beefburgundy,R.drawable.porkchopspoivre,R.drawable.solelemoncreamlg,R.drawable.coleslaw,R.drawable.mayonnaise,R.drawable.breadrolls,R.drawable.choclatewalnutbrownie,R.drawable.roastedpumpkintomatosoup,R.drawable.creamoffreshmushroom,R.drawable.caramelcustard,R.drawable.frenchfriesandchips,R.drawable.breakfaseburritos,R.drawable.crispycheeserolls,R.drawable.puddingsouffle,R.drawable.bakedeggs,R.drawable.cubaneggs,R.drawable.sweetomlet,R.drawable.lightsaladlardons,R.drawable.baconleekquichelg,R.drawable.parsleyednewpotatoes,R.drawable.chickenfricassee};
	public static String[] germantypes={"Boneless Pork Loin Roast","Bavarian Chops","Beef Tips And Gravy","Bishops Meat Loaf","Savory Blade Pot Roast","Ground Beef Stroganoff","Crock Pot Beef Roast","Beef Fondue","Applesauce Beef Loaf","Chicken Salad","Tomatensalad","Rotkohl","Kartoffelsalad","Schwarzbrotsuppe","Kohlsuppe","Hazelnussomeletten","Kartoffelpuffer","Bauernfruhstuck","Watermelon Ice","Garlic Toast","Black Forest Cake"};
	public static Integer[] germanimages ={R.drawable.bonelessporkloinroast,R.drawable.bavrianchops,R.drawable.beeftipsandgravy,R.drawable.bishopsmeatloaf,R.drawable.savorybladepotroast,R.drawable.groundbeefstroganoff,R.drawable.crockpotbeefroast,R.drawable.beeffondue,R.drawable.applesauce,R.drawable.chickensalad,R.drawable.tomatensalt,R.drawable.rotkohl,R.drawable.kartoffelsalad,R.drawable.schwarzbrotsuppe,R.drawable.kohlsuppe,R.drawable.hazelnussomeltten,R.drawable.kartoffelpuffer,R.drawable.bauermfruhstuck,R.drawable.watermelonice,R.drawable.garlictoast,R.drawable.blackforestcake};
	public static String[] internationaltypes={"Fish and Chips","Russian salad","Baby Corn Cigars ","Veggie Momos Perogies","Pot Chicken Rice Oriental Biryani","Garlic Toast","Banana Bread","Popcorn Paneer With Homemade Cheese","Onion rings","Puff Pastry","Prawn Pil Pil"
		,"Buffalo Wings Crazy Sauce","Paneer with Brinjals Rolls","Almond Horseshoe Cookies","King Prawn Korma Curry"};
	public static Integer[] internationalimages ={R.drawable.fishandchips,R.drawable.russiansalad,R.drawable.babycorncigars,R.drawable.veggiemomosperogies,R.drawable.potchickenriceorientalbiryani,R.drawable.garlictoast2,R.drawable.bananabread,R.drawable.popcornpaneerwithhomemadecheese,R.drawable.onionrings,R.drawable.puffpastry,R.drawable.prawnpilpil,R.drawable.buffalowingscragysauce
		,R.drawable.paneerwithbrinjalrolls,R.drawable.almondhorseshoecookes,R.drawable.kinhptsenkormacurry};
	public static String[] italianltypes={"Pasta with Pistachio Pesto","Mushroom Spinach Parcels","Pizza Base","Masasaged And Stuffed Indian Mackerel","Yummy Things to Put on Toast","Dahi Kabab","Italian Sphaghetti","Vegetable Pasta","Stuffed Zucchini","Bean Burrito","Italian Rice","Italian Toron","Baked Fish","Mushroom Misotoo",
		"Awsome Meatballs","Roast Pork Loin and Potatoes","Caprese Salad with Pesto Sauce","Panzenella","Bruschetta","Margherita Pizza"};
	public static Integer[] italianimages ={R.drawable.pastawithpistachiopesto,R.drawable.mushroomspinachparcels,R.drawable.pizzabase,R.drawable.massagedandstuffedindianmackerel,R.drawable.yummythingstoputontoast,R.drawable.dahikabab,R.drawable.italiansphaghetti,R.drawable.vegetablepasta,R.drawable.stuffedzucchini,R.drawable.beanburrito,R.drawable.italianrice,R.drawable.italliantorn,R.drawable.bakedfish,
		R.drawable.mushroomrisotoo,R.drawable.awesomemeatballs,R.drawable.roastporkloin,R.drawable.capresesaladmed,R.drawable.panzenella,R.drawable.bruschetta,R.drawable.margheritapizza};
	public static String[] japanesetypes={"Chicken Katsu Curry","Coconut pan cake","Smoked Salmon Sushi Roll","Miso Soup","Miso Braised Pork","Chakin Sushi","Asari Sakamushi ","Buridaikon","Sweet and Sour Crab Omelet","Baked Oyster","Simmered Flat Fish","Kobumaki","Maguro Zukedon","Octopus",
		"Salmon Oshizushi","Soft Fried Shrimp","Stuffed Squid","Squid and Broccoli Stir-fry","Tempura Shrimp","Shrimp and Cucumber "};
	public static Integer[] japaneseimages ={R.drawable.chickenkastsucurry,R.drawable.coconutpancake,R.drawable.smokedsalmonsushiroll,R.drawable.misosoup,R.drawable.misobraisedpork,R.drawable.chakinsushi,R.drawable.asarisakamushi,R.drawable.buridaikon,R.drawable.sweetandsourcrabomelet,R.drawable.bakedoyster,R.drawable.simmeredflatfish,R.drawable.kobumaki
		,R.drawable.magurozukedon,R.drawable.octopus,R.drawable.salmonoshizushi,R.drawable.softfriedshrimp
		,R.drawable.stuffedsqui,R.drawable.squidandbroccolistirfry,R.drawable.tempurashrimp,R.drawable.shrimpandcucumber};
	public static String[] jewishetypes={"Potato Latkes","Challah ","Slow Cooker Reuben Dip","Rugelach","Jewish Coffee Cake","Baked Falafel","Jewish Apple Cake ","Bread Machine Challah","Bagels","Kugel","Jewish Style Sweet and Sour Brisket","Michell Jenny's Challah","Shabbat Challah","Israeli Salad","Sy's Challah",
		"Applesauce Noodle Kugel","Sweet Potato Latkes","Easy Passover Lasagna","Classic Jewish Chicken Soup","Fried Matzoh"};
	public static Integer[] jewishimages ={R.drawable.potatolatkes,R.drawable.challah,R.drawable.slowcookerreubendip,R.drawable.rugelach,R.drawable.jewishcoffeecake,R.drawable.bakedfalafel,R.drawable.jewishapplecake,R.drawable.breadmachine,R.drawable.bagels,R.drawable.kugel,R.drawable.jewishstylesweet,R.drawable.michelljennyschallah,R.drawable.shabbatchallah,R.drawable.israelisalad
		,R.drawable.syschallah,R.drawable.applesauce2,R.drawable.sweetpotatolatkes,R.drawable.passoverlasagna,R.drawable.jewishchickensoup,R.drawable.friedmat};
	public static String[] koreantypes={"Korean Hamburgers","Korean Roast Chicken Thighs","Korean Pork Strips","Korean Vegetable-Beef Stir Fry","Korean Grilled Meat on Skewers ","Korean BBQ","Korean Beef Noodles","Korean Beef BBQ","Fantastic Korean-Style Marinade for Beef Pork or Chicken","Olympic Seoul Chicken","Korean Potatoes","Kalbi BBQ Ribs Hawaiian Style","Korean Style Salad Dressing","Kim Bap (Korean Rice Rolls)","Daikon Radish With Chicken-Korean Style","Ramen Korean-style","My Korean Dipping Sauce"
		,"Korean Sesame Grilled Beef","Korean Beef Bulgogi in Lettuce Wraps","Kimchee","Korean Chicken Teriyaki-Yangnyom Tak"};
	public static Integer[] koreanimages =
		{R.drawable.koreanhamburgers,R.drawable.koreanroastchickenthighs,R.drawable.koreanporkstrips,R.drawable.koreanvegetablebeefstirfry,R.drawable.koreangrilledmeatonskewers,R.drawable.koreanbbq,R.drawable.koreanbeefnoodles,R.drawable.koreanbeefbbq,R.drawable.fantastickorean,R.drawable.olympicseoulchicken,R.drawable.koreanpotatoes,R.drawable.kabibbqribs,R.drawable.koreanstylesaladdressing,R.drawable.kimbap,R.drawable.daikonradish,R.drawable.ramen,R.drawable.dippingsauce,
		R.drawable.grilledbeef,R.drawable.beefbulgogi,R.drawable.kimchee,R.drawable.teriyakiyangbyom};
	public static String[] mexicantypes={"Creamy Burrito Casserole","Chicken Tortilla Soup","Simply Sour Cream Chicken Enchiladas","Mexican Rice","Crock Pot Taco Soup","Wholly Guacamole","Crock Pot Chicken Taco Meat","Steak (Or Chicken) Fajitas","Fantastic Taco Casserole","Easy Enchiladas (Beef or Chicken)","Chicken Enchiladas","Wet Burritos","Streamlined Chimichangas","Mexican Enchilada Sauce","Refried Beans","Chipotle Roast for Tacos & Sandwiches","Mexican Stuffed Shells (Oamc)","Best Albondigas Soup","New Mexico Style Chili Chicken Casserole","Mexican Manicotti","Pineapple-Black Bean Enchiladas"};
	public static Integer[] mexicanimages =
		{R.drawable.creamyburrito,R.drawable.chickentortillasoup,R.drawable.creamchicken,R.drawable.mexicanrice,R.drawable.crockpottacosoup,R.drawable.whooly,R.drawable.crockpotchickentacomeat,R.drawable.streak,R.drawable.tacocasserole,R.drawable.enchiladas,R.drawable.chickenenchiladas,R.drawable.wetburritos,R.drawable.chimichangas,R.drawable.enchiladasauce,R.drawable.refriedbeans,R.drawable.chipotle,R.drawable.mexicanstuffedshells,R.drawable.albondigasoup,R.drawable.chillichickencasserole,R.drawable.mexicancake,R.drawable.beanenchiladas};
	public static String[] middleeasterntypes={"Armenian Herb Marinade Grilled Chicken Breasts","Arabian Pita Bread","Baba Ganoush - the Best in the World!","Lebanese Lentil/Rice Pilaf With Blackened Onions","Hot Feta Artichoke Dip","Kabak M�cveri (Turkish Zucchini Fritters)",
		"Chicken, Rice, and Spices Bake","Quinoa Tabouli","Persian Eggs Poached in Tomato Sauce","Lemon Herb Quinoa","Creamy Roasted Garlic Hummus","Pumpkin Bread Pudding (Low Fat)","Tabbouli / Tabouli / Tabbouleh Salad (Parsley Salad)","Curried Red Lentils","Persian Tomato and Cucumber Salad (Salad Shiraz)",
		"Armenian Nutmeg Cake","Shish Taouk - Lebanese Chicken Skewers","Eggplant (Aubergine) Fit for a Sheik (Sheik Al Mihshee)","Luleh Kebabs- Persian Ground Lamb Kebabs","One-pot Moroccan Lamb","Lebanese Chicken"};
	public static Integer[] middleeasternimages =
		{R.drawable.armenianherbmariade,R.drawable.arabianpitabread,R.drawable.babaganoush,R.drawable.leabaneselentilricepilaf,R.drawable.hotfetaartichokedip,R.drawable.kabakmucveri,R.drawable.chickenriceandspicesbake,
		R.drawable.quinoatabouli,R.drawable.persianeggspoachedintomatosauce,R.drawable.lemonherbquinoa,R.drawable.creamyroastedgarlic,R.drawable.pumbpkinbreadpudding,R.drawable.tabbouli,R.drawable.curriedredlentils,R.drawable.persiantomatoandcucumbersalad,
		R.drawable.ameniannutmegcake,R.drawable.shishtaouklebane,R.drawable.eggplantfitfofsheik,R.drawable.lulehkebabspersiangroundlambkebabs,R.drawable.onepotmoroccan,R.drawable.lebanesechicken};
	public static String[] nepalitypes={"Tibetan Lentil Soup","Tibetan Greens With Tofu (Tse Tofu)","Cardamom and Saffron Pilau: Spiced Indian Rice","Tibetan Potato Curry","Murgh Makhani","Tibetan Momo (A Dim Sum Dumpling from Tibet)","Pulau Nepalese Basmati Rice Dish","Yum Yum Chicken Curry","Nepali Momo (Nepalese Meat Dumplings)","Ghurka Chicken Cardamom Curry - Kukhra Alainchi Sanga"
		,"Lamb Bhutuwa (Nepali Lamb Stir-Fried in Himalayan Spices)","Shikarni - Cinnamon-Flavored Banana Yogurt","Pahadiya Lamb Tarkari","Turmeric Soup","Chana Ko Tarkari","Nepali Chicken","Hunza Pie","Vegy Lamb Tarkari","Shadeko Mashu"};
	public static Integer[] nepaliimages ={R.drawable.tibetanlentilsoup,R.drawable.tibetangreenswithtofu,R.drawable.kashmirichicken,R.drawable.tibetanpotatocurry,R.drawable.murghmakhani,R.drawable.tibetanmomo,R.drawable.pulaunepalesebasmatiricedish,R.drawable.yumchickencurry,R.drawable.nepalimomo,R.drawable.ghurkachickencardamom,R.drawable.lambandapricot
		,R.drawable.shikarnicinnamonflavoredbananayogurt,R.drawable.pahsdiyalambtarkari,R.drawable.turmericsoup,R.drawable.chanakotarkari,R.drawable.nepalichicken,R.drawable.hunzapie,R.drawable.vegylambtarkari,R.drawable.shadekomashu};
	public static String[] pakistanitypes={"Chicken, Rice, and Spices Bake","Balti Fish Curry","The Best Biryani","Kashmiri Chicken, Cardamom and Saffron Pilau","Aloo Keema (Potato and Mince Curry)","Sindhi Biryani","Lamb Korma","Deep Fried Onion Fritters", "Yakni Pilau (Chicken Rice)", "Pakistani or Desi style Spicy Chili Chicken","Banana Dumplings","Chana Dal With Bell Pepper","Chicken Jalfrezi","Pakistani Fish Curry","Aloo Kay Kabab (Potato Kebabs)","Wonderful Veggie Curry","Golden Saffron and Cardamom Spiced Chicken & Rice Pilau",
		"Falooda -- Easy and Delicious","Chicken Kundou"};
	public static Integer[] pakistaniimages ={R.drawable.chickenriceandspicesbake2,R.drawable.baltifishcurry,R.drawable.thebestbiryani,R.drawable.kashmirichicken2,R.drawable.alookeema,R.drawable.sindhibiryani,R.drawable.lambkorma,R.drawable.friedonionfritters,R.drawable.yaknipilau,R.drawable.pakistaniordesistylespicychilichicken,R.drawable.bannanadumplings,R.drawable.chanadalwithbellpepper,R.drawable.chickenjalfrezi,R.drawable.pakistanfishcurry,R.drawable.alookaykabab,R.drawable.veggcury,R.drawable.goldensaffronandcardamomspicedchicken,
		R.drawable.falooda,R.drawable.chickenkundou};
	public static String[] thaitypes={"Thai Noodles With Spicy Peanut Sauce","Broiled Tilapia With Thai Coconut- Curry Sauce","Pad Thai With Chicken and Shrimp","Crock Pot Thai Chicken Thighs","Spicy Shrimp In Coconut Milk","Thai Chicken Fried Rice with Basil - Kao Pad Krapao","Weeknight Thai Beef (1 Pan & 3 Carbs!)"
		,"Thai Dipping Sauce for Spring Wrap or Egg Rolls","Tofu and Broccoli with Peanut Sauce","Chicken in Peanut Curry","Chicken and Mango Curry","Sticky Coconut Chicken With Chili Glaze and Coconut Rice","Awesome Thai Chicken Coconut Curry","My O My.. Best Thai Beef Salad Ever!",
		"Thai Tofu and Squash Curry","Thai Beef Pitas","Thai Shrimp (chili) Soup","Thai Thighs","Thai Style Butternut Squash Soup"};
	public static Integer[] thaiimages ={R.drawable.thainoodles,R.drawable.thaicurrysauce,R.drawable.thaiwithchicken,R.drawable.thaichickenthighs,R.drawable.shrimpincoconutmilk,R.drawable.thaichickenfriedrice,R.drawable.thaibeef,R.drawable.thaidippingsauceforspring,R.drawable.broccoliwithsauce,R.drawable.chickenpeanutcurry,
		R.drawable.chickenandmangocurry,R.drawable.coconutchicken,R.drawable.thaichickencocuntcurry,R.drawable.beefsalad,R.drawable.squashcurry,R.drawable.beefpitas,R.drawable.thaishrimpsoup,R.drawable.thaithighs,R.drawable.thaistylebutternut};
	public static String[] srilankatypes={"Spicy fish koftas","Sarogini's fusion spicy chicken curry","Prawn curry","Drumstick (Murunga) curry","Eggplant and green banana curry","Mixed vegetable pickle","Crab curry","Ala Kiri Hodi","Fish Cutlets","Egg Rolls","Lamb or Mutton Curry","Wambatu Moju","Fried Rice","White Chicken Curry","Purawapu Mallu Miris","Ala Thel Dala","Srilankan style Pork Curry","Wambatu Salad","Kaha Bath"};
	public static Integer[] srilankanimages ={R.drawable.spicyfishkoftas,R.drawable.spicychickencurry,R.drawable.prawncurry,R.drawable.drumstickcurry,R.drawable.greenbananacurry,R.drawable.mixedvegetablepickle,R.drawable.crabcurry,R.drawable.alakirihodi,R.drawable.fishcutlets,R.drawable.eggrolls,R.drawable.lambormuttoncurry,R.drawable.wambatumoju,R.drawable.friedrice2,R.drawable.whitechicken,R.drawable.purawapumalumiris,R.drawable.alatheldala,R.drawable.srrlankastyleporkcurry,R.drawable.wambatusalad,R.drawable.kahabath};
	public static String[] indianreci={"Veg South Indian Recipes","Non-Veg South Indian Recipes","Veg North-Indian Recipes","Non-Veg North-Indian Recipes"};
	public static Integer[] indianimg={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};
	public static String[] vegsouthtypes={"Ragi Pakoda","Okra (Vendaikai) Tamarind Pachadi","Keerai Paruppu (Dhal) Masiyal","Moong Curd Bonda","Potato Coriander Fry (Aloo Dhaniya)","Dates Kozhukattai","Brinjal Thokku","Sprouted Green Gram (Moong) Dosai","Garlic Onion Kara Chutney","Pudalankai (Snakegourd) Varuval","Kalkandu (Sugar Candy) Pongal","Double Beans Rice","Wheat Carrot Halwa","Pandigai (Festival) Vadai","Pavakaai Ellu (Bitter gourd � Sesame) Pachadi","Nellikkai (Gooseberry) Thokku","Curry Leaves Rice","Peas Pulav","Chidambaram Kathirikai (Brinjal) Gosthu","Onion Thool Pakoda","Kal Dosai"
		,"Special Adai","Beetroot Banana Kesari","Beans Milk Curry","Potato Masala Fry","Samba Sadham (Pepper, Cumin Rice)","Pepper Vadai (Anjaneyar Vadai)","Andhra Dal Masiyal","Vegetable Vadai","Okra (Vendaikai) Tamarind Pachadi"};
	public static Integer[] vegsouthimages={R.drawable.ragipakoda,R.drawable.tamarindpach,R.drawable.keeraiparuppum,R.drawable.moongcurdbonda,R.drawable.potatocorianderfray,R.drawable.dateskozukattai,R.drawable.brinjalthokku,R.drawable.greengramdosai,R.drawable.garliconionchutney,R.drawable.pudalankaivaruval,R.drawable.kalkandupongal,R.drawable.doublebeanrice,R.drawable.wheatcarrothalwa,R.drawable.pandigaifestival,R.drawable.pavakaaiellu,R.drawable.nellikkaithoku,R.drawable.curryleavesrice,R.drawable.peaspulav,R.drawable.chidabaramkathir,R.drawable.onionthoolpakoda,R.drawable.kaldosai
		,R.drawable.specialadai,R.drawable.beetrootbananakesari,R.drawable.beansmilkcurry,R.drawable.potatomasalfry,R.drawable.sambasadham,R.drawable.pepervadai,R.drawable.andhradalmasiyal,R.drawable.vegetablevadai,R.drawable.okratamarindpachadi};
	public static String[] nonvegsouthtypes={"Curried Coconut Chicken","Karivepaku Kodi Kura","Chingri Malai Curry","Palak Chicken","Noodles Omelette","Omelette packet with paneer","Chettinad Chicken roast","Chettinad Mutton Curry","Kottyam Fish Curry","Mushroom Pepper Fry ","Prawns Masala ","Spicy Madras Cicken","Pumpkin Tamarind curry ","Shrimp Kofta Recipe","Squid (Kanava) Vadai Recipe","Squid Curry Recipe",
		"Mughlai Mutton Masala Recipe","Aatukal (Goat Trotters) Paya Recipe","Fish Masala Kurma Recipe"};
	public static Integer[] nonvegsouthimages={R.drawable.curriedcoconutchicken,R.drawable.chickencurry,R.drawable.chingrimalaicuryy,R.drawable.palakchicken,R.drawable.noodlesomelette,R.drawable.omelettepackwithpaneer,R.drawable.chettinadchickenroast,R.drawable.chettinadmuttoncurry,R.drawable.kottyamfishcurry,R.drawable.mushroompepperfry,R.drawable.prawnsmasala,R.drawable.spicymadraschicken,R.drawable.tamarind,R.drawable.shrimpkoftarecipe,R.drawable.squidvadairecipe,R.drawable.squidcurryrecipe,
		R.drawable.mughlaimuttonmasalarecipe,R.drawable.aatukalpayarecipe,R.drawable.fishmasalakurmarecipe};
	public static String[] vegnorthtypes={"Raw Jack Fruit Kofta","Aloo Palak Recipe","Dalbaati","Dhum Aloo Curry","Gobi 65","NAVRATAN KURMA","Sabudana Kichidi","Veg Manchurian","Aloo Palak Curry","Corn Curry","Aloo Tamatar Curry","Palak Paneer with chick peas recipe","Mixed Vegetable Korma","Capsicum Masala Curry","Dahi Bhalla","Methi Mathri","Matar Kachori","Gujiya Recipe","Malpua Recipe"};
	public static Integer[] vegnorthimages={R.drawable.rawjackfruit,R.drawable.aloopalakrecipe,R.drawable.dalbaati,R.drawable.dhumaloocurry,R.drawable.gobinorth,R.drawable.navratnakurma,R.drawable.sabudanakichidi,R.drawable.vegmanchurian,R.drawable.aloopalakcurry,R.drawable.corncurry,R.drawable.alootomatocurry,R.drawable.palakpannerwithchick,R.drawable.mixedvegetablekorma,R.drawable.capsicummasalacurry,R.drawable.dahibhalla,R.drawable.methimathri,R.drawable.matarkachori,R.drawable.gujiyarecipe,R.drawable.malpuarecipe};
	public static String[] nonvegnorthtypes={"Sindhi Chicken Biryani","Yakhni Pulao","Murg Mussllam","Punjabi Chicken Curry","Kolhapuri Mutton Curry","Mutton Rogan Josh","Lamb Chops With Tarragon Sauce","Spicy Lamb Shank Curry","Spinach Mutton Curry","Chicken ki Chop","Omelette Rolls","Dry Mutton Curry","White Mutton Curry","Mutton Curry With Chilles","Pakku","Machor Kalia","Murg Jugalbandi","Machhi Gravy","Pan Rools","Pudina Chicken(Mint)"};
	public static Integer[] nonvegnorthimages={R.drawable.sindhichickenbiryani,R.drawable.yakhnipulao,R.drawable.murgmussllam,R.drawable.punjabchickencurry,R.drawable.kolhapurimuttoncurry,R.drawable.muttonroganjosh,R.drawable.lambchopswithtarragonsauce,R.drawable.spicylambshankcurry,R.drawable.spinachmuttoncurry,R.drawable.chickenkichop,R.drawable.omeletterrolls,R.drawable.drymuttoncurry,R.drawable.whitemuttoncurry,R.drawable.muttoncurrywithchillies,R.drawable.pakku,R.drawable.machorkalia,R.drawable.murgjugalbandi,R.drawable.machhigravy,R.drawable.panrools,R.drawable.pudinachicken};
	public static String[] bakingtypes={"Banana Bread","Potato Fish Pie Recipe","Crunchy Potato Chip Chicken","Almond and Choco Chip Cookies","Cardamom Cookies","Chicken Pasta Bake","Coconut Cup Cakes","Chicken Parmesan","Chicken Stuffed Buns","Fish Cutlets","Butter Cookies","Bannana Chocolate Cake","Honey Cake","Carrot Cake"};
	public static Integer[] bakingimages ={R.drawable.bananabread,R.drawable.potatofishpie,R.drawable.crunchypotato,R.drawable.almondandchoco,R.drawable.cardamomcookies,R.drawable.chickenpastabake,R.drawable.coconutcupcakes,R.drawable.chicenparmesan,R.drawable.chickenstuffedbuns,R.drawable.fishcutlets,R.drawable.buttercookies,R.drawable.bannanachocolatecake,R.drawable.honeycake,R.drawable.carrotcake};
	public static String[] biryanitypes={"Sindhi Chicken Biryani","Yakhini Pulao","Lamb Shulla Pulao Akbar Recipe","Kabuli Chicken Pulao Rice","Awadhi Mutton Biryani","Kacchi Chicken Biryani","Chicken Dry Biryani","Sofiyani Biryani","Hyderbad Biryani","Kofta Biryani","Shahi Chicken Biryani","Hyderbadi Gosht Biryani","Bombay Chicken and Rice","Basmati Pulao With Chicken Tikka"};
	public static Integer[] biryaniimages ={R.drawable.sindhichickenbiryani,R.drawable.yakhnipulao,R.drawable.lambshulla,R.drawable.kabulichicken,R.drawable.awadhimuttonbiryani,R.drawable.kacchichicken,R.drawable.chickedrybirayni,R.drawable.sofiyanibiryani,R.drawable.hyderbadbiryani,R.drawable.koftabiryani,R.drawable.shahichickenbiryani,R.drawable.hyderbadighotbir,R.drawable.bombaychickenbiryani,R.drawable.basmatipulao};
	public static String[] breakfasttypes={"Cranberry/orange loaf or muffins","Vegi Frankies","Rice flakes with Milk","Pepper and Onion Frittata","Lachha Parata","Makki Ka Roti","Bhatura","Vermicelli","Paneer Dosa","Noodles Omelette","Omelette packet with paneer","Mixed Vegetable with Oats Dosa","Biscuit Roti","Kanchipuram Idlies","Omelette Rolls","Cashew Utaapam"};
	public static Integer[] breakfastmages ={R.drawable.crandberry,R.drawable.vegifrankies,R.drawable.riceflakes,R.drawable.pepperonion,R.drawable.lachhaparata,R.drawable.makkikaroti,R.drawable.bhatura,R.drawable.vermicelli,R.drawable.paneerdosa,R.drawable.noodlesomelette,R.drawable.omelettepackwithpaneer,R.drawable.mixedvegetableoatsdosa,R.drawable.biscuitroti,R.drawable.kanchipuramidlies,R.drawable.omeletterrolls,R.drawable.cashewuttapam};
	public static String[] chutneytypes={"Roasted Tomato Salsa","Bathue ka Raitha","Cucumber Raitha","Mango Raitha","Garlic Chutney","Pomegranate Raitha","Apricot Chutney","Corn Raitha","Corinader Chutney","Capsicum Raitha","Onion Chutney","Peanut Chutney","Gajar Chutney","Besan Chutney","Raw Cumcumber chutney","Pudina Chutney"};
	public static Integer[] chutneyimages ={R.drawable.roastedtomoto,R.drawable.bathuekaraitha,R.drawable.cucumberraitha,R.drawable.mangoraitha,R.drawable.garlicchutney,R.drawable.pomegranateraitha,R.drawable.apricotchutney,R.drawable.cornraitha,R.drawable.corianderchutney,R.drawable.capsicumraitha,R.drawable.onionchutney,R.drawable.peanutchutney,R.drawable.gajarchutney,R.drawable.besanchutney,R.drawable.rawcucumburchutney,R.drawable.pudinachutney};
	public static String[] desertstypes={"Badusha Recipe","Shrikhand","Pumpkin Cake","Banana Burfi","Mango Cream","Mango Sherbet","Fruit Kheer","Straw Berry Ice Cream","Mango Pudding","Semolina/suji and Banana Pudding","Gulab Jamuns","Rasa Malai","Basundi","Jack Fruit Halwa","Dry Fruit Kheer"};
	public static Integer[] desertsimages ={R.drawable.badusharecipe,R.drawable.shrikhand,R.drawable.pumpkincake,R.drawable.bananaburfi,R.drawable.mangocream,R.drawable.mangosherbet,R.drawable.fruitkheer,R.drawable.strawberryicecream,R.drawable.mangopudding,R.drawable.semolina,R.drawable.gulabjamuns,R.drawable.rasmalai,R.drawable.basundi,R.drawable.jackfruithalwa,R.drawable.dryfruit};
	public static String[] drinkstypes={"Kharbhooja Shrbat Recipe","Dry Ginger Drink","Pine Apple Coconut Milk Smoothie","Angoor Lasi","Almond Honey Milk","Lemon Juice","Apple Beet Cumcumber Juice","Basil/Tulsi Tea","Jeera Lassi","Cardamom Milk Shake","Apple Milk Shake","Tropicana Banana Yogurt Smoothie","Lemon Pudding Recipe","Apple and pineapple Juice","Musk Melon Jucie","Cola Shake Recipe","Cold Coffee"};
	public static Integer[] drinksimages ={R.drawable.kharbhooja,R.drawable.drygingerdrink,R.drawable.pineappledrink,R.drawable.angoorlassi,R.drawable.almondhoney,R.drawable.lemonjuice,R.drawable.applebeetcucumber,R.drawable.basil,R.drawable.jeeralassi,R.drawable.cardamommilk,R.drawable.applemilkshake,R.drawable.tropicanaorange,R.drawable.lemonpuddingrecipe,R.drawable.pineappledrink,R.drawable.muskmelon,R.drawable.colashakerecipe,R.drawable.coldcoffee};
	public static String[] saladstypes={"Roasted Tomato Salsa","Avocado Salsa","Tomato, Red Onion, and Paneer Salad","Pomegranate and Carrot Salad","Mango Salsa","Fruit and Nut Salad","Carrot Salad","Raw Mango Salad","Rice Salad","Beans Salad","King Crab Potato Salad","Turkey Salad","Fresh Fruit Salad Recipe"};
	public static Integer[] saladsimages ={R.drawable.roastedtomatosalsa,R.drawable.avocadosalsa,R.drawable.tomatoredonionsalad,R.drawable.pomegranatesalad,R.drawable.mangosalsa,R.drawable.fruitandnutsalad,R.drawable.carrotsalad,R.drawable.rawmangosalad,R.drawable.ricesalad,R.drawable.beanssalad,R.drawable.kingcrabpota,R.drawable.turkeysalad,R.drawable.wintersalad};
	public static String[] soupstypes={"Barley soup","Majiga Charu","Chicken Corn Soup","Easy Tom Yum Soup","Thai Chicken Stock","Chicken Chawal Palak Soup","Potato Soup","Kandi Kattu","Pineapple Rasam","Garlic Tomato soup","Broccoli Soup","Basil And Badam Soup","Tomato And Coconut Soup","Almond Chicken Soup",
		"Vegetable Soup","Thai Soup","Prawn Soup","Creamed Spinach & King Crab Soup"};
	public static Integer[] soupsimages ={R.drawable.barleysoup,R.drawable.majjigacharu,R.drawable.chickencornsoup,R.drawable.easytompicture,R.drawable.thaichickenstock,R.drawable.chickenchawalsoup,R.drawable.ptatosoup,R.drawable.kandikattu,R.drawable.pineapplerasam,R.drawable.garlictomatosoup,R.drawable.broccolisoup,R.drawable.basilandbadamsoup,R.drawable.tomatoandcoconutsoup
		,R.drawable.almondchickensoup,R.drawable.vegetablesoup,R.drawable.thaisoup,R.drawable.prawnsoup,R.drawable.creamofchicken};
	public static String[] snaksstypes={"Dhaba Ghost Curry","Bread Potato Bonda","Aloo-Green Gram Cutlet","Chilli Chicken Rolls","Fish Tikka Recipe","Crispy Deep Fried Spinach Balls","Vegetable Noodles","Saggubiyam Chicken Dumplings","Tasty Thai Fish Balls","Chicken Stuffed Buns","Bread Pakoda","Mushroom Basket","Chicken Tikkas","Shammi Kebabs","Chocolate Fudge","Paneer Onion Kachori","Crispy Cheese Rolls","Sweet Corn Sandwich"};
	public static Integer[] snakssimages ={R.drawable.dabbaghostcurry,R.drawable.breadpotatobonda,R.drawable.aloogreencutlet,R.drawable.chillichickenrolls,R.drawable.fishtikkarecipe,R.drawable.friedspinachballs,R.drawable.vegetablenoodles,R.drawable.chickendumplings,R.drawable.fishballs,R.drawable.chickenstuffedbuns,R.drawable.breadpakoda,R.drawable.mushroombasket,R.drawable.chickentikkas,R.drawable.shammikebabs,R.drawable.chocolatefudge,R.drawable.panneronionkachori,R.drawable.cheeserolls,R.drawable.cornsandwich};
	public static String[] chickentypes={"Panang Curry With Chicken","Sambaal Chicken","Chicken Dumplings","Green bean and Chicken","OrangeChicken","Chicken Satay","Thai Yellow Chicken Curry","Northern Thai Curry With Chicken and Peanuts","Thai Chicken Stock","Chilli Chicken Inod Chinesse","Tandoori Chicken","General Tsos Chicken","Ginger Chicken","Chicken Roast Kerala Style ","Konkani Chicken Maharashtrian Kombdi Recipe","Popcorn Chicken","chicken nuggets","Chicken Tariwala Recipe"};
	public static Integer[] chickenimages ={R.drawable.panangcurrychicken,R.drawable.sambaalchicken,R.drawable.chickendumplings,R.drawable.greenbananacurry,R.drawable.orangchicken,R.drawable.chickensataywithrice,R.drawable.thaichickencurry,R.drawable.chickenandpeanuts,R.drawable.thaichickenstock,R.drawable.chillichickenindo,R.drawable.tandoorichicken,R.drawable.tsoschicken,R.drawable.gingerchicken,R.drawable.keralachicken,R.drawable.maharashtrianchicken,R.drawable.popcornchicken,R.drawable.chickennuggets,R.drawable.chickentariwalarecipe};
	public static String[] seafoodtypes={"Fish Fry","coconut shrimp prawn fry","Goan Shrimp curry","Crab Curry","Crispy Fried Shrimp - Prawns with Shell on","Pearl spot - karimeen fry kerala style ","Prawns - Shrimp cooked in sour greens gongura","Mahi Pakoda","Fish Fingers","Golden Fried Prawns","Fish In Garlic Sauce","Massaged and Stuffed Indian Mackerel","Spicy Tangy Prawns Kerala Style","Dry Prawns With Tomato Masala","Apollo Fish Fry","Fish Makhani","Shrimp with Mustard Sauce","Grilled Shrimp on Sugarcane"};
	public static Integer[] seafoodimages ={R.drawable.fishfry,R.drawable.shrimpprawnfry,R.drawable.goanshrimpcurry,R.drawable.crabcurry,R.drawable.prawnswithshell,R.drawable.pearlspotkarimeenfry,R.drawable.prawnshrimp,R.drawable.mahipakose,R.drawable.fishfingers,R.drawable.goldenprawns,R.drawable.fishgarlicsauce,R.drawable.mackerel,R.drawable.spicytangy,R.drawable.dryprawns,R.drawable.apollofishfry,R.drawable.fishmakhani,R.drawable.shrimpwithmustardsauce,R.drawable.grilledshrimp};
	public static String[] muttontypes={"Mutton Stew","Spicy Lamb Chops","Kheema Mattar","Achari Gosh","Seena With Raisins Curry","Paya -Attu kalu curry","Kheema Mutti Indian Meat Patties","Liver Masala","lamb pepper chops curry style","Dappadam - Lamb Kadi","Gongura mutton curry","Botti Curry","Bhuna Ghost","Sweet Meat Balls","Hyderabadi Haleem","Empanada Pastry Pockets","Barbecue Flavoured Lamb","Rogan Josh mutton"};
	public static Integer[] muttonimages ={R.drawable.muttonstew,R.drawable.spicylambchops,R.drawable.kheemamattar,R.drawable.acharigosh,R.drawable.seenawithraisinscuryy,R.drawable.payaattukalucurry,R.drawable.kheemamutti,R.drawable.livermasala,R.drawable.lambpepperchopscurry,R.drawable.dappadamlambkadi,R.drawable.gonguramutton,R.drawable.botticurry,R.drawable.bhunaghost,R.drawable.sweetmeatballs,R.drawable.hyderbadihallem,R.drawable.empandapastrypockets,R.drawable.barbcuefla,R.drawable.roganjoshmutton};
	
}
