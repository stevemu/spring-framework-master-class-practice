package mockitodemo.binarysearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private Sort sort;

    public BinarySearch(Sort sort) {
        this.sort = sort;
    }

    public int search(int[] arr, int searchFor) {
        return 5;
    }
}
