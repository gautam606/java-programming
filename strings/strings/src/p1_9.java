    public class p1_9 {
        public static void main(String[] args) {
            String[] strs = {"flower", "flow", "flight"};
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty())
                    {
                        prefix=" ";
                    }
                }
            }
            System.out.println(prefix);
        }
    }

    //Longest Common Prefix
    //
    //Example 1
    //Input:
    //        ["flower","flow","flight"]
    //Output:"fl"
    //
    //Example 2
    //Input:["dog","racecar","car"]
    //Output:""



