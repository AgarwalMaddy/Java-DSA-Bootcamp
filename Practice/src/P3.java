import java.util.*;

public class P3 {
    public static void main(String[] args) {
        int[] taskMemory = {2, 3, 1, 4, 2, 3};
        int[] taskType = {1, 2, 3, 2, 1, 2};
        int maxMemory = 4;

        int result = minProcessingTime(taskMemory, taskType, maxMemory);
        System.out.println("Minimum processing time: " + result);
    }

    public static int minProcessingTime(int[] taskMemory, int[] taskType, int maxMemory) {
        // Create a HashMap to store task types and their corresponding memory requirements
        HashMap<Integer, List<Integer>> memoryMap = new HashMap<>();

        // Iterate through the tasks to group them by task type and their memory requirements
        for (int i = 0; i < taskMemory.length; i++) {
            int type = taskType[i];
            int memory = taskMemory[i];
            if (!memoryMap.containsKey(type)) {
                memoryMap.put(type, new ArrayList<>());
            }
            memoryMap.get(type).add(memory);
        }

        // Sort each list in the memoryMap in descending order
        for (List<Integer> memoryList : memoryMap.values()) {
            Collections.sort(memoryList, Collections.reverseOrder());
        }

        int minTime = 0;

        // Process tasks in pairs
        while (!memoryMap.isEmpty()) {
            int maxPairMemory = -1;

            // Find a pair of tasks with the same type and the memory requirement not exceeding maxMemory
            for (int type : memoryMap.keySet()) {
                List<Integer> memoryList = memoryMap.get(type);
                if (memoryList.size() >= 2) {
                    int pairMemory = memoryList.get(0) + memoryList.get(1);
                    if (pairMemory <= maxMemory) {
                        maxPairMemory = Math.max(maxPairMemory, pairMemory);
                    }
                }
            }

            // If no such pair found, process a single task
            if (maxPairMemory == -1) {
                for (List<Integer> memoryList : memoryMap.values()) {
                    if (!memoryList.isEmpty()) {
                        maxPairMemory = Math.max(maxPairMemory, memoryList.get(0));
                        break;
                    }
                }
            }

            // Remove processed tasks from memoryMap and update the minimum time
            for (List<Integer> memoryList : memoryMap.values()) {
                if (!memoryList.isEmpty() && memoryList.get(0) == maxPairMemory) {
                    memoryList.remove(0);
                }
                if (!memoryList.isEmpty() && memoryList.get(0) == maxPairMemory) {
                    memoryList.remove(0);
                }
            }

            // Update the minimum time required
            minTime++;

            // Remove empty task types from memoryMap
            memoryMap.entrySet().removeIf(entry -> entry.getValue().isEmpty());
        }

        return minTime;
    }
}