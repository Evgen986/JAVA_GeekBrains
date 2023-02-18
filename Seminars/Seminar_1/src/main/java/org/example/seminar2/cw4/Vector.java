package org.example.seminar2.cw4;

public class Vector {
    private double x, y, z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длину вектора
     */
    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    /**
     *
     * @return скалярное произведение
     */
    public double scal(Vector vector){
        return x* vector.x + y* vector.y + z* vector.z;
    }

    /**
     *
     * @param Новый вектор
     * @return
     */
    public Vector vecPr(Vector vector){
        return new Vector(y* vector.z-z* vector.y, z* vector.x-x* vector.z, x* vector.y-y* vector.x);
    }

    /**
     *
     * @param vector
     * @return
     */
    public double cosinus(Vector vector){
        return scal(vector)/(vector.length() * length());
    }

    /**
     *
     * @param vector слогаемый
     * @return вектор результирующий
     */
    public Vector sumVectors(Vector vector){
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }
    /**
     *
     * @param vector вычитаемый
     * @return вектор результирующий
     */
    public Vector differenceVectors(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }
}
