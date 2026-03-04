class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == original){
                original *= 2;
                i = -1;
            }
        }

        return(original);
    }
}

/*Fontaine was peak for genshin OSTs
La nuit silencieuse et paisable was so goated
also Coruscating Street
and who can forget Fontaine title theme and La Vaguelette
*/
