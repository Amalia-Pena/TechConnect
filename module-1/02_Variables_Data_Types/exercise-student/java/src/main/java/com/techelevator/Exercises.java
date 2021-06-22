package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numberOfRaccoonsPlaying = 3;
		int numberOfRaccoonsLeaving = 2;
		int numberOfRaccoonsLeft = numberOfRaccoonsPlaying - numberOfRaccoonsLeaving;

		System.out.println(numberOfRaccoonsLeft);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int amountBeesLessThanFlowers = numberOfFlowers - numberOfBees;

		System.out.println(amountBeesLessThanFlowers);

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeonEating = 1;
		int anotherPigeonJoiningLonelyPigeonEating = 1;
		int pigeonTotal = lonelyPigeonEating + anotherPigeonJoiningLonelyPigeonEating;

		System.out.println(pigeonTotal);

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsOnFence = 3;
		int owlsOnFenceJoining = 2;
		int owlsOnFenceTotal = owlsOnFence + owlsOnFenceJoining;

		System.out.println(owlsOnFence);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorkingOnHome = 2;
		int beaverLeavesForSwim = 1;
		int beaversStillWorkingOnHome = beaversWorkingOnHome - beaverLeavesForSwim;

		System.out.println(beaversStillWorkingOnHome);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int sittingToucansOnTree = 2;
		int additionalToucanJoiningOnTree = 1;
		int totalToucansOnTree = sittingToucansOnTree + additionalToucanJoiningOnTree;

		System.out.println(totalToucansOnTree);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int totalSquirrelsOverNuts = squirrelsInTree - nutsInTree;

		System.out.println(totalSquirrelsOverNuts);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double foundQuarterByHilt = 0.25;
		double foundDimeByHilt = 0.10;
		double foundNickelsByHilt = 0.05*2;
		double foundMoneyByHilt = foundQuarterByHilt + foundDimeByHilt + foundNickelsByHilt;

		System.out.println(foundMoneyByHilt);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int muffinsBakedByBriersClass = 18;
		int muffinsBakedByMacAdamsClass = 20;
		int muffinsBakedByFlannerysClass = 17;
		int totalMuffinsBaked = muffinsBakedByBriersClass + muffinsBakedByMacAdamsClass + muffinsBakedByFlannerysClass;

		System.out.println(totalMuffinsBaked);

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyoPrice = 0.24;
		double whistlePrice = 0.14;
		double totalPriceSpent = yoyoPrice + whistlePrice;

		System.out.println(totalPriceSpent);

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshallows = largeMarshmallows + miniMarshmallows;

		System.out.println(totalMarshallows);

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int inchesSnowAtHiltsHouse = 29;
		int inchesSnowAtBrecknockSchool = 17;
		int howMuchMoreSnowHiltsHouseHas = inchesSnowAtHiltsHouse - inchesSnowAtBrecknockSchool;

		System.out.println(howMuchMoreSnowHiltsHouseHas);

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double totalMoneyOfHilt = 10.00;
		double spentMoneyToyTruck = 3.00;
		double spentMoneyPencil = 2.00;
		double totalMoneyLeftOfHilt = totalMoneyOfHilt - spentMoneyToyTruck - spentMoneyPencil;

		System.out.println(totalMoneyLeftOfHilt);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int marblesInCollection = 16;
		int marblesLost = 7;
		int marblesTotalEnd = marblesInCollection - marblesLost;

		System.out.println(marblesTotalEnd);

		/* Exercise 17
		17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int totalSeashellsOfMegan = 19;
		int totalSeashellsDesired = 25;
		int totalSeashellsNeeded = totalSeashellsDesired - totalSeashellsOfMegan;

		System.out.println(totalSeashellsNeeded);

        /* Exercise 18
       18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloonsOfBrad = 17;
		int totalRedBalloons = 8;
		int totalGreenBalloons = totalBalloonsOfBrad - totalRedBalloons;

		System.out.println(totalGreenBalloons);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int booksMartaAddedToShelf = 10;
		int totalBooksOnShelfEnd = booksOnShelf + booksMartaAddedToShelf;

		System.out.println(totalBooksOnShelfEnd);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int amountOfBees = 8;
		int amountOfLegsTotal = beeLegs * amountOfBees;

		System.out.println(amountOfLegsTotal);

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double priceIceCream = 0.99;
		double priceOfTwoIceCream = priceIceCream * 2;

		System.out.println(priceOfTwoIceCream);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksTotalNeededToCompleteBorder = 125;
		int rocksAmountInPossession = 64;
		int rocksLeftToFinish = rocksTotalNeededToCompleteBorder - rocksAmountInPossession;

		System.out.println(rocksLeftToFinish);

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int totalMarblesStart = 38;
		int totalMarblesLost = 15;
		int totalMarblesLeft = totalMarblesStart - totalMarblesLost;

		System.out.println(totalMarblesLeft);

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMilesAway = 78;
		int totalMilesDriven = 32;
		int totalMilesLeft = totalMilesAway - totalMilesDriven;

		System.out.println(totalMilesLeft);

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int totalTimeMinutesSpentSaturdayMorning = 90;
		int totalTimeMinutesSpentSaturdayAfternoon = 45;
		int totalTimeSpentShoveling = totalTimeMinutesSpentSaturdayMorning + totalTimeMinutesSpentSaturdayAfternoon;

		System.out.println(totalTimeSpentShoveling);

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double moneySpentOnHotDogs = 6 * 0.50;

		System.out.println(moneySpentOnHotDogs);

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int totalMoney = 50;
		int pencilPrice = 7;
		int pencilAffordQuotient = totalMoney / pencilPrice;

		System.out.println(pencilAffordQuotient);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int butterfliesSeen = 33;
		int orangeButterflies = 20;
		int totalRedButterflies = butterfliesSeen - orangeButterflies;

		System.out.println(totalRedButterflies);

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyKateGaveToClerk = 1.00;
		double priceCandy = 0.54;
		double changeKateWillReceive = moneyKateGaveToClerk - priceCandy;

		System.out.println(changeKateWillReceive);

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treesPlanted = 13;
		int treesPlantedFuture = 12;
		int totalTreesPlanted = treesPlanted + treesPlantedFuture;

		System.out.println(totalTreesPlanted);

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int seeingGrandmaHours = 48;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int amountOfCousins = 4;
		int amountGumPerPerson = 5;
		int totalGumNeeded = amountOfCousins * amountGumPerPerson;

		System.out.println(totalGumNeeded);

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double amountMoneyDanHas = 3.00;
		double amountSpentCandy = 1.00;
		double amountMoneyLeft = amountMoneyDanHas - amountSpentCandy;

		System.out.println(amountMoneyLeft);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsInLake = 5;
		int amountOfPeoplePerBoat = 3;
		int totalAmountPeopleOnBoats = boatsInLake * amountOfPeoplePerBoat;

		System.out.println(totalAmountPeopleOnBoats);

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int amountLegos = 380;
		int amountLegosLost = 57;
		int amountLegosLeft = amountLegos - amountLegosLost;

		System.out.println(amountLegosLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int muffinsBaked = 35;
		int amountMuffinsNeededEnd = 83;
		int amountMuffinsLeftToBake = amountMuffinsNeededEnd - muffinsBaked;

		System.out.println(amountMuffinsLeftToBake);

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int amountOfCrayonsWillyHas = 1400;
		int amountOfCrayonsLucyHas = 290;
		int differenceInCrayons = amountOfCrayonsWillyHas - amountOfCrayonsLucyHas;

		System.out.println(differenceInCrayons);

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersOnEachPage = 10;
		int amountOfPages = 22;
		int amountOfStickersTotal = stickersOnEachPage * amountOfPages;

		System.out.println(amountOfStickersTotal);

        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		double cupcakesTotal = 96;
		double childrenTotal = 8;
		double cupcakePerPerson = cupcakesTotal / childrenTotal;

		System.out.println(cupcakePerPerson);

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int cookiesNotPlacedInJar = gingerbreadCookies % cookiesPerJar;

		System.out.println(cookiesNotPlacedInJar);

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int neighbors = 8;
		int eachNeighborWithEqualAmount = croissants % neighbors;

		System.out.println(eachNeighborWithEqualAmount);

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookies = 276;
		int cookiesPerTray = 12;
		int traysNeeded = oatmealCookies / cookiesPerTray;

		System.out.println(traysNeeded);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzelsMade = 480;
		int pretzelServing = 12;
		int pretzelServingsTotalMade = pretzelsMade / pretzelServing;

		System.out.println(pretzelServingsTotalMade);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakes = 53;
		int lemonCupcakesLeftAtHome = 2;
		int totalLemonCupcakes = lemonCupcakes - lemonCupcakesLeftAtHome;
		int totalPerBox = 3;
		int totalBoxesMade = totalLemonCupcakes / totalPerBox;

		System.out.println(totalBoxesMade);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticks = 74;
		int people = 12;
		int carrotsLeftUneaten = carrotSticks % people;

		System.out.println(carrotsLeftUneaten);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBearsTotal = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilledTotal = teddyBearsTotal / teddyBearsPerShelf;

		System.out.println(shelvesFilledTotal);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int totalPictures = 480;
		int picturesPerAlbum = 20;
		int albumsNeeded = totalPictures / picturesPerAlbum;

		System.out.println(albumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCardsCollected = 94;
		int boxHoldAmount = 8;
		int boxesFilled = tradingCardsCollected / boxHoldAmount;
		int cardsUnfilledBox = tradingCardsCollected % boxHoldAmount;

		System.out.println(boxesFilled + cardsUnfilledBox);

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int totalBooks = 210;
		int totalShelves = 10;
		int totalBooksPerShelf = totalBooks	/ totalShelves;

		System.out.println(totalBooksPerShelf);

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		double croissantsBaked = 17;
		double totalGuests = 7;
		double evenAmountServedToGuests = croissantsBaked / totalGuests;

		System.out.println(evenAmountServedToGuests);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */

		double billAverage = 2.15;
		double jillAverage = 1.90;
		double combinedAverage = (billAverage + jillAverage) / 2;
		double totalAmount = 10.2;
		double finalAnswer = totalAmount / combinedAverage;

		System.out.println(finalAnswer);


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B.";
		String fullName = lastName + "," + " " + firstName + " " + middleInitial;

		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

		int totalTripMiles = 800;
		int traveledMiles = 537;
		double percentageOfTripTaken = traveledMiles / totalTripMiles;
		int percentageWhole = 67;

		System.out.println(percentageWhole);


	}

}