package by.khaletski.task06.entity;

import java.util.Objects;

public class Cone {
    Point radiusPoint1;
    Point radiusPoint2;
    Point heightPoint1;
    Point heightPoint2;

    public Cone(Point newRadiusPoint1, Point newRadiusPoint2, Point newHeightPoint1, Point newHeightPoint2) {
        radiusPoint1 = newRadiusPoint1;
        radiusPoint2 = newRadiusPoint2;
        heightPoint1 = newHeightPoint1;
        heightPoint2 = newHeightPoint2;
    }

    public double getRadius() {
        return Math.sqrt((radiusPoint1.getX() - radiusPoint2.getX())
                + (radiusPoint1.getY() - radiusPoint2.getY())
                + (radiusPoint1.getZ() - radiusPoint2.getZ()));
    }

    public double getHeight() {
        return Math.sqrt((heightPoint1.getX() - heightPoint2.getX())
                + (heightPoint1.getY() - heightPoint2.getY())
                + (heightPoint1.getZ() - heightPoint2.getZ()));
    }

    public Point getRadiusPoint1() {
        return radiusPoint1;
    }

    public void setRadiusPoint1(Point radiusPoint1) {
        this.radiusPoint1 = radiusPoint1;
    }

    public Point getRadiusPoint2() {
        return radiusPoint2;
    }

    public void setRadiusPoint2(Point radiusPoint2) {
        this.radiusPoint2 = radiusPoint2;
    }

    public Point getHeightPoint1() {
        return heightPoint1;
    }

    public void setHeightPoint1(Point heightPoint1) {
        this.heightPoint1 = heightPoint1;
    }

    public Point getHeightPoint2() {
        return heightPoint2;
    }

    public void setHeightPoint2(Point heightPoint2) {
        this.heightPoint2 = heightPoint2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (!Objects.equals(radiusPoint1, cone.radiusPoint1)) return false;
        if (!Objects.equals(radiusPoint2, cone.radiusPoint2)) return false;
        if (!Objects.equals(heightPoint1, cone.heightPoint1)) return false;
        return Objects.equals(heightPoint2, cone.heightPoint2);
    }

    @Override
    public int hashCode() {
        int result = radiusPoint1 != null ? radiusPoint1.hashCode() : 0;
        result = 31 * result + (radiusPoint2 != null ? radiusPoint2.hashCode() : 0);
        result = 31 * result + (heightPoint1 != null ? heightPoint1.hashCode() : 0);
        result = 31 * result + (heightPoint2 != null ? heightPoint2.hashCode() : 0);
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
