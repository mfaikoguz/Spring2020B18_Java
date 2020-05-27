package Practice2;

public class Phone {
}

class CameraPhone extends Phone {
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures() {
        if (memorySize > 0) {

            return memorySize * 1000 / imageSize;
        }

        return 0;
    }
}
