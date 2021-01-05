package esg.itp.shape;

interface Polygon {
    float area = 0f;
    float perimeter = 0f;

    abstract float calcArea();

    abstract float calcPeri();

    abstract void display();
}




