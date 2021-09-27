package _09_Streams;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_Streams_With_Map_And_Filter_Method {

    private static Set<Boolean> result;

    private final Map<String, Boolean> amendOptTypeMapFlag = new HashMap<String, Boolean>();
    {{
        amendOptTypeMapFlag.put("Opt 1", false);
        amendOptTypeMapFlag.put("Opt 2", false);
        amendOptTypeMapFlag.put("Opt 3", true);
    }};

    public Set<Boolean> isValueTrueInAmendOptTypeMap(String key) {
        Set<Boolean> set = new HashSet<>();
        for (Boolean v : amendOptTypeMapFlag.values()) {
            if (v.equals(amendOptTypeMapFlag.get(key))) {
                set.add(v);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        _01_Streams_With_Map_And_Filter_Method objRef = new _01_Streams_With_Map_And_Filter_Method();

        // Option 1's value is false
        result = objRef.isValueTrueInAmendOptTypeMap("Opt 1");
        System.out.println(result);

        // Option 3's value is true
        result = objRef.isValueTrueInAmendOptTypeMap("Opt 3");
        System.out.println(result);
    }

}
