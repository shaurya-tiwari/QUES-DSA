class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // here we re using one loop becouse if the length will be same then code will
        // reach here othervise not .
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
            // means the arr will take s and make the chars 1 then on t when same values are
            // 1 then it will just minus the value
        }
        // cgeck for availability of 0 or not
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        System.out.println(va.isAnagram("listen", "silent")); // Expected: true
        System.out.println(va.isAnagram("hello", "bello")); // Expected: false
    }
}

// Also a better aproach--------------------------------------------------
// int s1 = s.length();
// int t1 = t.length();
// if (s1 != t1) {
// return false;
// } else {
// int arr[] = new int[26]; // size of array wiillbe 26 becousue alphabets have
// 26 values
// for (int i = 0; i < s1; i++) {
// arr[s.charAt(i) - 'a']++; // in short its just shft the value from 0 to next
// . with subtract the ascii
// }
// for (int j = 0; j < t1; j++) {
// arr[t.charAt(j) - 'a']--;
// }
// // now check the value is 0 or not
// for (int n = 0; n < arr.length; n++) {
// if (arr[n] != 0) {
// return false; // means if the values still in the t1 then it wil return false
// means not
// // anargam
// }
// }
// }

// return true;


// aprch 3

// class Solution {
//     public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;

//         Map<Character, Integer> map1 = new HashMap<>();
//         Map<Character, Integer> map2 = new HashMap<>();

//         for ( int i = 0; i < s.length() ; i++ ){
//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);

//             map1.put(c1, map1.getOrDefault(c1,0)+1);
//             map2.put(c2,map2.getOrDefault(c2,0)+1);
//         }
//         return map1.equals(map2);
//     }
// } 