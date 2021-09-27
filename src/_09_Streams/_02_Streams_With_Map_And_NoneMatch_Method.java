package _09_Streams;

import java.util.HashMap;
import java.util.Map;

public class _02_Streams_With_Map_And_NoneMatch_Method {

    private static boolean result;

    private Map<String, Boolean> amendOptTypeMapFlag = new HashMap<String, Boolean>();
    {{
        amendOptTypeMapFlag.put("Opt 1", false);
        amendOptTypeMapFlag.put("Opt 2", false);
        amendOptTypeMapFlag.put("Opt 3", true);
    }};

    // Returns true if no elements of the stream match the predicate
    public boolean isValuePresentInAmendOptTypeMap(String key) {
        return amendOptTypeMapFlag.keySet().stream()
                .noneMatch(k -> k.equals(key));
    }

    public static void main(String[] args) {
        _02_Streams_With_Map_And_NoneMatch_Method objRef = new _02_Streams_With_Map_And_NoneMatch_Method();

        // Returns false as no key exists named 'Opt X'
        result = objRef.isValuePresentInAmendOptTypeMap("Opt X");
        System.out.println(result);

        // Returns true as a key does exist named 'Opt 2'
        result = objRef.isValuePresentInAmendOptTypeMap("Opt 2");
        System.out.println(result);
    }

}