package ModelClasses;

public class HomeModel {
    Integer img1,img2;
    String frameLive;

    public HomeModel(Integer img1, Integer img2, String frameLive) {
        this.img1 = img1;
        this.img2 = img2;
        this.frameLive = frameLive;
    }


    public Integer getImg1() {
        return img1;
    }

    public void setImg1(Integer img1) {
        this.img1 = img1;
    }

    public Integer getImg2() {
        return img2;
    }

    public void setImg2(Integer img2) {
        this.img2 = img2;
    }

    public String getFrameLive() {
        return frameLive;
    }

    public void setFrameLive(String frameLive) {
        this.frameLive = frameLive;
    }
}
