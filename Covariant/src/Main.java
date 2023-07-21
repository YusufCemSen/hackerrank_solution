

class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "cem";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Yusuf";
    }
}

class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Ilayda";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends Region {
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class Cem extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}