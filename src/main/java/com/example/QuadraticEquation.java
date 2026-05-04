package com.example;

public class QuadraticEquation {
    public enum Type {
        TWO_REAL_ROOTS,
        ONE_REAL_ROOT,
        NO_REAL_ROOT,
        LINEAR_ONE_ROOT,
        LINEAR_NO_SOLUTION,
        LINEAR_INFINITE_SOLUTIONS
    }

    public static class Result {
        private final Type type;
        private final Double x1;
        private final Double x2;

        public Result(Type type, Double x1, Double x2) {
            this.type = type;
            this.x1 = x1;
            this.x2 = x2;
        }

        public Type getType() {
            return type;
        }

        public Double getX1() {
            return x1;
        }

        public Double getX2() {
            return x2;
        }
    }

    public static Result solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return new Result(Type.LINEAR_INFINITE_SOLUTIONS, null, null);
                }
                return new Result(Type.LINEAR_NO_SOLUTION, null, null);
            }
            return new Result(Type.LINEAR_ONE_ROOT, -c / b, null);
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new Result(Type.NO_REAL_ROOT, null, null);
        }

        if (delta == 0) {
            double x = -b / (2 * a);
            return new Result(Type.ONE_REAL_ROOT, x, x);
        }

        double sqrtDelta = Math.sqrt(delta);
        double x1 = (-b + sqrtDelta) / (2 * a);
        double x2 = (-b - sqrtDelta) / (2 * a);
        return new Result(Type.TWO_REAL_ROOTS, x1, x2);
    }
}
