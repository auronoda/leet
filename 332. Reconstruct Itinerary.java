public class Solution {
    public List<String> findItinerary(String[][] tickets) {
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> result = new ArrayList();
        for (int i = 0; i < tickets.length; i++){
            if (!map.containsKey(tickets[i][0])){
                ArrayList<String> arr = new ArrayList();
                arr.add(tickets[i][1]);
                map.put(tickets[i][0],arr);
            }
            else {
                ArrayList<String> arr = map.get(tickets[i][0]);
                arr.add(tickets[i][1]);
                map.put(tickets[i][0],arr);
            }
        }
        for (ArrayList<String> arr: map.values()){
            Collections.sort(arr);
        }
        search(result,"JFK",map);
        return result;
    }
    
    private void search(ArrayList<String> result, String pos, Map<String, ArrayList<String>> map){
        while (map.containsKey(pos) && !map.get(pos).isEmpty()){
            String next = map.get(pos).remove(0);
            search(result, next, map);
        }
        result.add(0,pos);
    }
}