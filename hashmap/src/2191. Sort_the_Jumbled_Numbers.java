

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            StringBuilder mapno = new StringBuilder();
            int originalNumber = number;
            
            // Mapping the number according to the given mapping
            if (number == 0) {
                mapno.append(mapping[0]);
            } else {
                while (number != 0) {
                    int lastdig = number % 10;
                    mapno.append(mapping[lastdig]);
                    number = number / 10;
                }
            }
            
            String mappedStr = mapno.reverse().toString();
            int changedmapno = Integer.parseInt(mappedStr);
            
            mp.put(originalNumber, changedmapno);
        }

        List<Integer> l1 = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));

        Collections.sort(l1, (a, b) -> {
            if (!mp.get(a).equals(mp.get(b))) {
                return mp.get(a) - mp.get(b);
            } else {
                return 0;
            }
        });

        int[] result = new int[nums.length];
        
        for (int i = 0; i < l1.size(); i++) {
            result[i] = l1.get(i);
        }

        return result;
    }
}
