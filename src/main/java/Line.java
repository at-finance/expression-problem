public class Line {
    private final Point2D start;
    private final Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) {
            return false;
        }

        Line other = (Line) obj;
        return other != null
                && other.start.equals(start)
                && other.end.equals(end);
    }
}