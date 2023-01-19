class Box {
    public void simpleWrap() {
        System.out.println("simple wrap");
    }

    public void wrap() {
        simpleWrap();
    }
}

class PaperBox extends Box {
    public void paperWrap() {
        System.out.println("paper wrap");
    }

    public void wrap() {
        paperWrap();
    }
}

class GoldPaperBox extends PaperBox {
    public void goldWrap() {
        System.out.println("gold wrap");
    }

    public void wrap() {
        goldWrap();
    }
}

class InstanceOf {
    public static void wrapBox(Box box) {
        box.wrap();
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
}
