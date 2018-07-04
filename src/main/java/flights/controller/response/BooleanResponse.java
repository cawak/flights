package flights.controller.response;

import java.io.Serializable;

public class BooleanResponse implements Serializable {

    boolean response = false;

    public BooleanResponse() {
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooleanResponse that = (BooleanResponse) o;

        return response == that.response;
    }

    @Override
    public int hashCode() {
        return (response ? 1 : 0);
    }
}
