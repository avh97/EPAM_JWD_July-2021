package by.khaletski.task06.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class Cone {
    private Point innerPoint;
    private Point outerPoint;
    private Point upperPoint;

    public Cone(final Point newInnerPoint, final Point newOuterPoint, final Point newFormingPoint) {
        innerPoint = newInnerPoint;
        outerPoint = newOuterPoint;
        upperPoint = newFormingPoint;
    }

    public final double getRadius() {
        return Math.sqrt((Math.pow(innerPoint.getX() - outerPoint.getX(), 2))
                + (Math.pow(innerPoint.getY() - outerPoint.getY(), 2))
                + (Math.pow(innerPoint.getZ() - outerPoint.getZ(), 2)));
    }

    public final double getForming() {
        return Math.sqrt((Math.pow(outerPoint.getX() - upperPoint.getX(), 2))
                + (Math.pow(outerPoint.getY() - upperPoint.getY(), 2))
                + (Math.pow(outerPoint.getZ() - upperPoint.getZ(), 2)));
    }

    public final double getHeight() {
        return Math.sqrt((Math.pow(upperPoint.getX() - innerPoint.getX(), 2))
                + (Math.pow(upperPoint.getY() - innerPoint.getY(), 2))
                + (Math.pow(upperPoint.getZ() - innerPoint.getZ(), 2)));
    }

    public final Point getInnerPoint() {
        return innerPoint;
    }

    public final void setInnerPoint(final Point newInnerPoint) {
        innerPoint = newInnerPoint;
    }

    public final Point getOuterPoint() {
        return outerPoint;
    }

    public final void setOuterPoint(final Point newOuterPoint) {
        outerPoint = newOuterPoint;
    }

    public final Point getUpperPoint() {
        return upperPoint;
    }

    public final void setUpperPoint(final Point newUpperPoint) {
        upperPoint = newUpperPoint;
    }

    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cone)) {
            return false;
        }

        Cone cone = (Cone) o;

        return Objects.equals(innerPoint, cone.innerPoint)
                && Objects.equals(outerPoint, cone.outerPoint)
                && Objects.equals(upperPoint, cone.upperPoint);
    }

    @Override
    public final int hashCode() {
        int result = innerPoint != null ? innerPoint.hashCode() : 0;
        result = 31 * result + (outerPoint != null ? outerPoint.hashCode() : 0);
        result = 31 * result + (upperPoint != null ? upperPoint.hashCode() : 0);
        return result;
    }

    @Override
    public final String toString() {
        return new StringJoiner(", ", Cone.class.getSimpleName() + "[", "]")
                .add("innerPoint=" + innerPoint)
                .add("outerPoint=" + outerPoint)
                .add("upperPoint=" + upperPoint)
                .toString();
    }

    public static class Point {
        private double x;
        private double y;
        private double z;

        public Point(final double newX, final double newY, final double newZ) {
            x = newX;
            y = newY;
            z = newZ;
        }

        public final double getX() {
            return x;
        }

        public final void setX(final double newX) {
            x = newX;
        }

        public final double getY() {
            return y;
        }

        public final void setY(final double newY) {
            y = newY;
        }

        public final double getZ() {
            return z;
        }

        public final void setZ(final double newZ) {
            z = newZ;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (!(o instanceof Point)) {
                return false;
            }

            Point point = (Point) o;

            return point.x != x || point.y != y || point.z != z;
        }

        @Override
        public final int hashCode() {
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

        @Override
        public final String toString() {
            return new StringJoiner(", ", Point.class.getSimpleName() + "[", "]")
                    .add("x=" + x)
                    .add("y=" + y)
                    .add("z=" + z)
                    .toString();
        }
    }
}
