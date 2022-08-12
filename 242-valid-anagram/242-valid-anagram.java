class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        PriorityQueue<Character>pq= new PriorityQueue<>();
        PriorityQueue<Character>pq2= new PriorityQueue<>();
        
        for(int i=0;i<s.length();i++){
            pq.add(s.charAt(i));
        }
        for(int j=0;j<t.length();j++){
            pq2.add(t.charAt(j));
        }
        while(!pq.isEmpty()){
            if(pq.peek()!=pq2.peek()){
               
                return false;
                
            }
            
            pq.remove();
            pq2.remove();
                
            
        }
        return true;
    }
}