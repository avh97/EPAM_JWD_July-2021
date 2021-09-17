package by.khaletski.task06.entity;

import java.util.Objects;

public class Cone {
    //TODO три точки
    private Point innerPoint;
    private Point outerPoint;
    private Point lowerPoint;
    private Point upperPoint;

    public Cone(Point newRadiusPoint1, Point newRadiusPoint2, Point newFormingPoint1, Point newFormingPoint2) {
        innerPoint = newRadiusPoint1;
        outerPoint = newRadiusPoint2;
        lowerPoint = newFormingPoint1;
        upperPoint = newFormingPoint2;
    }

    public double getRadius() {
        return Math.sqrt((Math.pow(innerPoint.getX() - outerPoint.getX(), 2))
                + (Math.pow(innerPoint.getY() - outerPoint.getY(), 2))
                + (Math.pow(innerPoint.getZ() - outerPoint.getZ(), 2)));
    }

    public double getForming() {
        return Math.sqrt((Math.pow(lowerPoint.getX() - upperPoint.getX(), 2))
                + (Math.pow(lowerPoint.getY() - upperPoint.getY(), 2))
                + (Math.pow(lowerPoint.getZ() - upperPoint.getZ(), 2)));
    }

    public double getHeight() {
        return Math.sqrt((Math.pow(upperPoint.getX() - innerPoint.getX(), 2))
        + (Math.pow(upperPoint.getY() - innerPoint.getY(), 2))
                + (Math.pow(upperPoint.getZ() - innerPoint.getZ(), 2)));
    }

    public double getBaseAngle() {
        return Math.toDegrees(Math.tan(getRadius() / (2 * getForming())));
    }

    public Point getInnerPoint() {
        return innerPoint;
    }

    public void setInnerPoint(Point innerPoint) {
        this.innerPoint = innerPoint;
    }

    public Point getOuterPoint() {
        return outerPoint;
    }

    public void setOuterPoint(Point outerPoint) {
        this.outerPoint = outerPoint;
    }

    public Point getLowerPoint() {
        return lowerPoint;
    }

    public void setLowerPoint(Point lowerPoint) {
        this.lowerPoint = lowerPoint;
    }

    public Point getUpperPoint() {
        return upperPoint;
    }

    public void setUpperPoint(Point upperPoint) {
        this.upperPoint = upperPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (!Objects.equals(innerPoint, cone.innerPoint)) return false;
        if (!Objects.equals(outerPoint, cone.outerPoint)) return false;
        if (!Objects.equals(lowerPoint, cone.lowerPoint)) return false;
        return Objects.equals(upperPoint, cone.upperPoint);
    }

    @Override
    public int hashCode() {
        int result = innerPoint != null ? innerPoint.hashCode() : 0;
        result = 31 * result + (outerPoint != null ? outerPoint.hashCode() : 0);
        result = 31 * result + (lowerPoint != null ? lowerPoint.hashCode() : 0);
        result = 31 * result + (upperPoint != null ? upperPoint.hashCode() : 0);
        return result;
    }

    public static class Point {
        double x;
        double y;
        double z;

        public Point(final double newX, final double newY, final double newZ) {
            x = newX;
            y = newY;
            z = newZ;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getZ() {
            return z;
        }

        public void setZ(double z) {
            this.z = z;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (Double.compare(point.x, x) != 0) return false;
            if (Double.compare(point.y, y) != 0) return false;
            return Double.compare(point.z, z) == 0;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            temp = Double.doubleToLongBits(x);
            result = (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(y);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(z);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}
