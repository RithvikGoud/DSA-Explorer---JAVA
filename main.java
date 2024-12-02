import java.util.*;
class Array{
    Scanner a = new Scanner(System.in);
    int size = 10;
    // Setting the size of the array to 10
    int[] arr = new int[size];
    // Declaring an array of integers with size 10


    // Method to input array elements
    public void array(){
        System.out.println("Enter 10 array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = a.nextInt();// Taking input for each array element
        }
    }

    // Method to traverse and print array elements
    public void traverse(){
        for(int i : arr){ // Enhanced for loop to iterate through the array
            System.out.print(i+" ");  // Printing each array element
        }
        System.out.println(); // Printing a newline after traversing the array
    }

    public void linearSearchDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
            "\nLinear Search (Sequential Search):\n"+
            "\n    1)Linear Search, also known as Sequential Search, is a basic search algorithm."+
            "\n    2)It sequentially examines each element in a list (or array) until a match is found or the entire list has been searched."+
            "\n    3)The search continues until the desired element is found or until the end of the data set."+
            "\n    4)Linear Search is straightforward but not very efficient for large datasets.\n"+
            "\nHow Linear Search Works:\n"+
            "\n    1)Start from the first element (index 0) of the array."+
            "\n    2)Compare the target value with each element:"+
            "\n          * If the element matches the target, return its index."+
            "\n          * If not, continue to the next element."+
            "\n    3)If no match is found, return a message indicating that the element is not present in the array.\n"+
            "\nTime Complexity:\n"+
            "\nThe time complexity of Linear Search depends on the position of the target element:"+
            "\n    1)Best Case Time Complexity (O(1)):"+
            "\n           * Occurs when the target element is found at the first position (index 0)."+
            "\n           * The algorithm performs only one comparison to find the element."+
            "\n           * Therefore, the best-case time complexity is O(1)."+
            "\n    2)Worst Case Time Complexity (O(n)):"+
            "\n           *Occurs when the target element is not present in the array."+
            "\n           * In this case, the algorithm compares the target with every element in the array."+
            "\n           * The number of comparisons equals the size of the array (i.e., n)."+
            "\n           * Thus, the worst-case time complexity is O(n)."+
            "\n    3)Average Case Time Complexity (O(n)):"+
            "\n           * The average-case complexity is also O(n) because it considers both successful and unsuccessful searches."+
            "\n           * On average, the target element is not found in the first position, leading to multiple comparisons.\n"+
            "\nSpace Complexity:\n"+
            "\n    * The space complexity of Linear Search is O(1) (constant space)."+
            "\n    * It doesnt require additional data structures beyond a few variables used during the search.\n"+
            "\nExample:\n"+
            "\nConsider the following array: [2, 4, 0, 1, 9] Suppose we want to search for the value 1."+
            "\n   * Compare 1 with the first element 2. Not a match."+
            "\n   * Compare 1 with the second element 4. Not a match."+
            "\n   * Compare 1 with the third element 0. Not a match."+
            "\n   * Compare 1 with the fourth element 1. Match found! Return the index 3."+
            "\n   * Therefore, the element 1 is present at index 3 in the array."+
            "\n---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void binarySearchDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
            "Binary Search:\n"+
            "    1)Binary Search is a search algorithm that efficiently finds the position of a target value within a sorted array.\n"+
            "    2)It repeatedly divides the search interval in half until the target value is found or eliminated.\n"+
            "    3)Binary Search leverages the sorted nature of the data to significantly reduce the number of comparisons needed.\n"+
            "    4)It is significantly faster than Linear Search for large datasets.\n"+
            "\nHow Binary Search Works:\n"+
            "    1)Start by defining the search space as the entire array.\n"+
            "    2)Calculate the middle index of the search space.\n"+
            "    3)Compare the target value with the element at the middle index:\n"+
            "          * If the target value matches the element, the search is successful, return the middle index.\n"+
            "          * If the target value is less than the element at the middle index, eliminate the right half of the search space \n"+
            "            and repeat steps 2 and 3 on the left half.\n"+
            "          * If the target value is greater than the element at the middle index, eliminate the left half of the search space \n"+
            "            and repeat steps 2 and 3 on the right half.\n"+
            "   4)Continue steps 2 and 3 until the target value is found or the search space becomes empty.\n"+
            "   5)If the search space becomes empty, the target value is not present in the array.\n"+
            "\nTime Complexity:\n"+
            "    * The time complexity of Binary Search is O(log n) (logarithmic time), significantly faster than Linear Search's O(n).\n"+
            "    * This is because Binary Search halves the search space with each iteration, leading to a much quicker identification of the target element.\n"+
            "\nSpace Complexity:\n"+
            "    * The space complexity of Binary Search is also O(1) (constant space), similar to Linear Search.\n"+
            "    * It only uses a few additional variables to track the search space boundaries during the process.\n"+
            "\nExample:\n"+
            "Consider the following sorted array: [2, 4, 7, 10, 15]. Suppose we want to search for the value 10.\n"+
            "   * Initial search space: [2, 4, 7, 10, 15].\n"+
            "   * Middle index: (0 + 4) / 2 = 2.\n"+
            "   * Compare 10 with the element at index 2 (value 7). Since 10 is greater, eliminate the left half.\n"+
            "   * New search space: [10, 15].\n"+
            "   * Middle index: (1 + 1) / 2 = 1.\n"+
            "   * Compare 10 with the element at index 1 (value 10). Match found! Return index 3.\n"+
            "Therefore, the element 10 is present at index 3 in the sorted array.\n"+
            "---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void ternarySearchDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Ternary Search:\n"+
        "    1)Ternary Search is a search algorithm that efficiently finds the position of a target value within a sorted array.\n"+
        "    2)It divides the search interval into three parts instead of two in binary search.\n"+
        "    3)Ternary Search leverages the sorted nature of the data to reduce the number of comparisons needed further.\n"+
        "    4)It can be faster than binary search in certain scenarios.\n"+
        "\nHow Ternary Search Works:\n"+
        "    1)Start by defining the search space as the entire array.\n"+
        "    2)Calculate the two midpoints of the search space.\n"+
        "    3)Compare the target value with the elements at these midpoints:\n"+
        "          * If the target value matches any of the elements, the search is successful, return the corresponding index.\n"+
        "          * If the target value is less than the elements at both midpoints, eliminate the right two-thirds of the search space \n"+
        "            and repeat steps 2 and 3 on the left one-third.\n"+
        "          * If the target value is greater than the elements at both midpoints, eliminate the left two-thirds of the search space \n"+
        "            and repeat steps 2 and 3 on the right one-third.\n"+
        "          * If the target value is between the elements at the two midpoints, eliminate the outer one-third on both sides \n"+
        "            and repeat steps 2 and 3 on the middle one-third.\n"+
        "   4)Continue steps 2 and 3 until the target value is found or the search space becomes empty.\n"+
        "   5)If the search space becomes empty, the target value is not present in the array.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Ternary Search is O(log3 n) (logarithmic time).\n"+
        "    * Although ternary search involves more comparisons than binary search, it still achieves a significant reduction in search time.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Ternary Search is also O(1) (constant space).\n"+
        "    * It only uses a few additional variables to track the search space boundaries during the process.\n"+
        "\nExample:\n"+
        "Consider the following sorted array: [2, 4, 7, 10, 15, 20, 25, 30]. Suppose we want to search for the value 10.\n"+
        "   * Initial search space: [2, 4, 7, 10, 15, 20, 25, 30].\n"+
        "   * Midpoints: (0 + 7) / 3 = 2, (0 + 7) * 2 / 3 = 4.\n"+
        "   * Compare 10 with the elements at index 2 (value 7) and index 4 (value 15).\n"+
        "   * Since 10 is greater than 7 but less than 15, eliminate the left two-thirds.\n"+
        "   * New search space: [10, 15, 20, 25, 30].\n"+
        "   * Midpoints: (0 + 4) / 3 = 1, (0 + 4) * 2 / 3 = 2.\n"+
        "   * Compare 10 with the elements at index 1 (value 4) and index 2 (value 7).\n"+
        "   * Since 10 is greater than 4 but less than 7, eliminate the left two-thirds.\n"+
        "   * New search space: [10, 15].\n"+
        "   * Midpoint: (0 + 1) / 3 = 0, (0 + 1) * 2 / 3 = 0.\n"+
        "   * Compare 10 with the element at index 0 (value 2). Since 10 is greater, eliminate the left one-third.\n"+
        "   * New search space: [10].\n"+
        "   * Match found! Return index 3.\n"+
        "Therefore, the element 10 is present at index 3 in the sorted array.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------");   
    }

    public void interpolationSearchDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Interpolation Search:\n"+
        "\n    1)Interpolation Search is a search algorithm that works on uniformly distributed sorted arrays.\n"+
        "    2)It is an improvement over binary search when the values in a sorted array are uniformly distributed.\n"+
        "    3)Interpolation Search calculates the probable position of the target value based on its value and the values at the extremes of the search space.\n"+
        "    4)It can be faster than binary search in scenarios where the distribution of values is known and uniform.\n"+
        "\nHow Interpolation Search Works:\n"+
        "\n    1)Start by defining the search space as the entire array.\n"+
        "    2)Calculate the probable position of the target value using interpolation formula:\n"+
        "          position = low + ((value - arr[low]) * (high - low) / (arr[high] - arr[low]))\n"+
        "    3)Compare the target value with the element at the calculated position:\n"+
        "          * If the target value matches the element, the search is successful, return the position.\n"+
        "          * If the target value is less than the element, search in the left part of the array.\n"+
        "          * If the target value is greater than the element, search in the right part of the array.\n"+
        "   4)Repeat steps 2 and 3 until the target value is found or the search space becomes empty.\n"+
        "   5)If the search space becomes empty, the target value is not present in the array.\n"+
        "\nTime Complexity:\n"+
        "\n    * The time complexity of Interpolation Search can vary depending on the distribution of values, but it's generally close to O(log log n).\n"+
        "    * In scenarios with uniformly distributed values, Interpolation Search can approach O(log(log n)), making it faster than binary search.\n"+
        "\nSpace Complexity:\n"+
        "\n    * The space complexity of Interpolation Search is O(1) (constant space).\n"+
        "    * It only uses a few additional variables to track the search space boundaries during the process.\n"+
        "\nExample:\n"+
        "\nConsider the following sorted array with uniformly distributed values: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]. Suppose we want to search for the value 60.\n"+
        "   * Initial search space: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100].\n"+
        "   * Probable position calculation: position = 0 + ((60 - 10) * (9 - 0) / (100 - 10)) = 5.\n"+
        "   * Compare 60 with the element at index 5 (value 60). Match found! Return index 5.\n"+
        "Therefore, the element 60 is present at index 5 in the sorted array.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void jumpSearchDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Jump Search:\n"+
        "    1)Jump Search is a search algorithm particularly useful for large sorted arrays.\n"+
        "    2)It works by jumping ahead by fixed steps to reduce the number of elements to be checked during search.\n"+
        "    3)Jump Search requires the array to be sorted.\n"+
        "    4)It combines linear and binary search techniques to efficiently find the target value.\n"+
        "\nHow Jump Search Works:\n"+
        "    1)Start by defining the jump size (step) as the square root of the array length.\n"+
        "    2)Jump forward in fixed steps until an element greater than the target value is found or the end of the array is reached.\n"+
        "    3)Perform a linear search in the block where the target value might exist to find the exact position.\n"+
        "    4)If the target value is found, return its position; otherwise, return -1 indicating that the value is not present in the array.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Jump Search is O(√n), where n is the size of the array.\n"+
        "    * Jump Search is particularly efficient for large arrays due to its ability to reduce the number of elements to be checked.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Jump Search is O(1) (constant space).\n"+
        "    * It only uses a few additional variables to track the search space boundaries during the process.\n"+
        "\nExample:\n"+
        "Consider the following sorted array: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]. Suppose we want to search for the value 60.\n"+
        "   * Jump size (step): √10 ≈ 3.\n"+
        "   * Jump from index 0 to index 3, then index 6 (value 70) is encountered, which is greater than 60.\n"+
        "   * Perform linear search between indices 3 and 6 to find the exact position of 60.\n"+
        "   * Element 60 found at index 5. Return index 5.\n"+
        "Therefore, the element 60 is present at index 5 in the sorted array.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void bubbleSortDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Bubble Sort:\n"+
        "    1)Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.\n"+
        "    2)It is named for the way smaller elements 'bubble' to the top of the list with each pass.\n"+
        "    3)Bubble Sort is easy to understand and implement but is highly inefficient for large lists.\n"+
        "    4)It has a time complexity of O(n^2) in the worst and average cases.\n"+
        "\nHow Bubble Sort Works:\n"+
        "    1)Start at the beginning of the list.\n"+
        "    2)Compare the first two elements, and if they are in the wrong order, swap them.\n"+
        "    3)Move to the next pair of elements and repeat step 2 until the end of the list is reached.\n"+
        "    4)Repeat steps 1-3 until no swaps are needed, indicating that the list is sorted.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Bubble Sort is O(n^2) in the worst and average cases, making it highly inefficient for large datasets.\n"+
        "    * This is because it requires multiple passes through the entire list, comparing and swapping adjacent elements.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Bubble Sort is O(1) (constant space), as it only requires a few additional variables to track the sorting process.\n"+
        "\nExample:\n"+
        "Consider the following array: [5, 3, 8, 4, 2].\n"+
        "   * Pass 1: [3, 5, 4, 2, 8].\n"+
        "   * Pass 2: [3, 4, 2, 5, 8].\n"+
        "   * Pass 3: [3, 2, 4, 5, 8].\n"+
        "   * Pass 4: [2, 3, 4, 5, 8].\n"+
        "   * The array is now sorted.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void insertionSortDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Insertion Sort:\n"+
        "    1)Insertion Sort is a simple comparison-based sorting algorithm that builds the final sorted array one element at a time.\n"+
        "    2)It iterates through the input array, removing one element and then inserting it into the correct position in the sorted array.\n"+
        "    3)Insertion Sort is efficient for small datasets or nearly sorted arrays but becomes inefficient for large datasets.\n"+
        "    4)It has a time complexity of O(n^2) in the worst and average cases.\n"+
        "\nHow Insertion Sort Works:\n"+
        "    1)Start with the second element of the array.\n"+
        "    2)Compare the current element with the elements to its left, moving them one position to the right until finding the correct position for insertion.\n"+
        "    3)Insert the current element into its correct position.\n"+
        "    4)Repeat steps 1-3 until the entire array is sorted.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Insertion Sort is O(n^2) in the worst and average cases, making it inefficient for large datasets.\n"+
        "    * This is because it requires multiple passes through the array, shifting elements to insert each new element into its correct position.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Insertion Sort is O(1) (constant space), as it only requires a few additional variables to track the sorting process.\n"+
        "\nExample:\n"+
        "Consider the following array: [5, 3, 8, 4, 2].\n"+
        "   * Pass 1: [3, 5, 8, 4, 2].\n"+
        "   * Pass 2: [3, 5, 8, 4, 2].\n"+
        "   * Pass 3: [3, 4, 5, 8, 2].\n"+
        "   * Pass 4: [2, 3, 4, 5, 8].\n"+
        "   * The array is now sorted.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void selectionSortDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Selection Sort:\n"+
        "    1)Selection Sort is a simple comparison-based sorting algorithm that divides the input array into a sorted and an unsorted region.\n"+
        "    2)It repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the end of the sorted region.\n"+
        "    3)Selection Sort is straightforward to implement but inefficient for large datasets due to its time complexity.\n"+
        "    4)It has a time complexity of O(n^2) in the worst and average cases.\n"+
        "\nHow Selection Sort Works:\n"+
        "    1)Find the smallest element in the unsorted region.\n"+
        "    2)Swap it with the first element of the unsorted region.\n"+
        "    3)Move the boundary of the unsorted region one element to the right.\n"+
        "    4)Repeat steps 1-3 until the entire array is sorted.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Selection Sort is O(n^2) in the worst and average cases, making it inefficient for large datasets.\n"+
        "    * This is because it requires multiple passes through the array, finding the smallest element in each pass and moving it to the sorted region.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Selection Sort is O(1) (constant space), as it only requires a few additional variables to track the sorting process.\n"+
        "\nExample:\n"+
        "Consider the following array: [5, 3, 8, 4, 2].\n"+
        "   * Pass 1: [2, 3, 8, 4, 5].\n"+
        "   * Pass 2: [2, 3, 8, 4, 5].\n"+
        "   * Pass 3: [2, 3, 4, 8, 5].\n"+
        "   * Pass 4: [2, 3, 4, 5, 8].\n"+
        "   * The array is now sorted.\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void quickSortDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Quick Sort:\n"+
        "    1)Quick Sort is a highly efficient comparison-based sorting algorithm that divides the input array into smaller sub-arrays.\n"+
        "    2)It then recursively sorts these sub-arrays using a pivot element, which partitions the array into elements less than the pivot and elements greater than the pivot.\n"+
        "    3)Quick Sort is often faster than other sorting algorithms, such as Merge Sort and Heap Sort, due to its in-place partitioning and small overhead.\n"+
        "    4)It has an average and best-case time complexity of O(n log n), but can degrade to O(n^2) in the worst case.\n"+
        "\nHow Quick Sort Works:\n"+
        "    1)Choose a pivot element from the array (typically the middle element).\n"+
        "    2)Partition the array into two sub-arrays: elements less than the pivot and elements greater than the pivot.\n"+
        "    3)Recursively apply Quick Sort to the sub-arrays until the base case of sub-arrays with one or zero elements is reached.\n"+
        "    4)Concatenate the sorted sub-arrays to form the final sorted array.\n"+
        "\nTime Complexity:\n"+
        "    * The average and best-case time complexity of Quick Sort is O(n log n), making it one of the fastest sorting algorithms.\n"+
        "    * However, in the worst case, when the pivot selection is poor, Quick Sort can degrade to O(n^2), which is inefficient for large datasets.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Quick Sort depends on the implementation, but it typically ranges from O(log n) to O(n) due to recursive calls and partitioning.\n"+
        "\nExample:\n"+
        "Consider the following array: [5, 3, 8, 4, 2].\n"+
        "   * Choose the pivot element (e.g., 4).\n"+
        "   * Partition the array into [3, 2] [4] [5, 8].\n"+
        "   * Recursively apply Quick Sort to each sub-array.\n"+
        "   * Concatenate the sorted sub-arrays to obtain the final sorted array: [2, 3, 4, 5, 8].\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public void mergeSortDetails(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
        "Merge Sort:\n"+
        "    1)Merge Sort is a comparison-based sorting algorithm that follows the divide-and-conquer strategy.\n"+
        "    2)It divides the input array into smaller sub-arrays, sorts them individually, and then merges them back together.\n"+
        "    3)Merge Sort is stable, meaning it preserves the relative order of equal elements, and has a consistent time complexity.\n"+
        "    4)It has a time complexity of O(n log n) in all cases, making it efficient for large datasets.\n"+
        "\nHow Merge Sort Works:\n"+
        "    1)Divide the array into two halves.\n"+
        "    2)Recursively apply Merge Sort to each half until the base case of sub-arrays with one or zero elements is reached.\n"+
        "    3)Merge the sorted sub-arrays back together, comparing elements and placing them in the correct order.\n"+
        "    4)Continue merging until the entire array is sorted.\n"+
        "\nTime Complexity:\n"+
        "    * The time complexity of Merge Sort is O(n log n) in all cases, making it highly efficient for large datasets.\n"+
        "    * This is because Merge Sort consistently divides the array into halves and merges them back together, ensuring a logarithmic time complexity.\n"+
        "\nSpace Complexity:\n"+
        "    * The space complexity of Merge Sort is O(n) due to the need for additional space to store the merged sub-arrays during the sorting process.\n"+
        "\nExample:\n"+
        "Consider the following array: [5, 3, 8, 4, 2].\n"+
        "   * Divide the array into [5, 3] [8, 4, 2].\n"+
        "   * Recursively apply Merge Sort to each sub-array.\n"+
        "   * Merge the sorted sub-arrays back together: [3, 5] [2, 4, 8].\n"+
        "   * Merge the final sub-arrays to obtain the sorted array: [2, 3, 4, 5, 8].\n"+
        "---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void bfsDetails() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "\nBreadth-First Search (BFS):\n" +
                "\n    1) Breadth-First Search (BFS) is a graph traversal algorithm." +
                "\n    2) It explores all the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level." +
                "\n    3) BFS uses a queue data structure to keep track of the nodes to be visited." +
                "\n    4) The algorithm visits all the nodes reachable from the starting (source) node before moving to the nodes at the next level." +
                "\n    5) BFS is useful for finding the shortest path in an unweighted graph." +
                "\n    6) It can also be used to check if a graph is bipartite." +
                "\n    7) BFS can be implemented using either iterative or recursive approaches.\n" +
                "\nHow Breadth-First Search Works:\n" +
                "\n    1) Start from the source node and enqueue it into a queue." +
                "\n    2) Dequeue a node from the queue and visit it." +
                "\n    3) Enqueue all the neighboring nodes of the visited node that have not been visited yet." +
                "\n    4) Repeat steps 2 and 3 until the queue is empty.\n" +
                "\nTime Complexity:\n" +
                "\n    * The time complexity of BFS is O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph.\n" +
                "\nSpace Complexity:\n" +
                "\n    * The space complexity of BFS is O(V), where V is the number of vertices (nodes) in the graph." +
                "\n    * It requires additional space to store the visited nodes and the queue data structure.\n" +
                "\nExample:\n" +
                "\nConsider the following graph:\n" +
                "   A --- B\n" +
                "   |     |\n" +
                "   C --- D\n" +
                "   Suppose we start the BFS traversal from node A.\n" +
                "   The traversal order would be: A, B, C, D.\n" +
                "   BFS explores nodes in layers, visiting all neighbors of A first, then neighbors of B, and so on.\n" +
                "   Therefore, the BFS traversal of the graph starting from node A is A, B, C, D.\n" +
                "---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void dfsDetails() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "\nDepth-First Search (DFS):\n" +
                "\n    1) Depth-First Search (DFS) is a graph traversal algorithm." +
                "\n    2) It explores as far as possible along each branch before backtracking." +
                "\n    3) DFS uses a stack data structure (or recursion) to keep track of the nodes to be visited." +
                "\n    4) The algorithm traverses a single path from the starting (source) node to the deepest node, then backtracks to explore other paths." +
                "\n    5) DFS can be implemented using either iterative or recursive approaches.\n" +
                "\nHow Depth-First Search Works:\n" +
                "\n    1) Start from the source node and push it onto a stack." +
                "\n    2) Pop a node from the stack and visit it." +
                "\n    3) Push all the neighboring nodes of the visited node onto the stack that have not been visited yet." +
                "\n    4) Repeat steps 2 and 3 until the stack is empty.\n" +
                "\nTime Complexity:\n" +
                "\n    * The time complexity of DFS is O(V + E), where V is the number of vertices (nodes) and E is the number of edges in the graph.\n" +
                "\nSpace Complexity:\n" +
                "\n    * The space complexity of DFS depends on the implementation (stack or recursion)." +
                "\n    * For the stack-based approach, the space complexity is O(V) due to the additional space required to store the visited nodes and the stack.\n" +
                "\nExample:\n" +
                "\nConsider the following graph:\n" +
                "   A --- B\n" +
                "   |     |\n" +
                "   C --- D\n" +
                "   Suppose we start the DFS traversal from node A.\n" +
                "   The traversal order would be: A, B, D, C.\n" +
                "   DFS explores one branch completely before moving to the next branch.\n" +
                "   Therefore, the DFS traversal of the graph starting from node A is A, B, D, C.\n" +
                "---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    
    public void Sort() 
    { 
        int n = arr.length;
        // Bubble sort algorithm implementation
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) 
                if (arr[j] > arr[j + 1]) {
                    // Swapping if the current element is greater than the next one
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
    }

    public void LinearSearch(int search){
        boolean found = false; // Flag to track if the element is found
        String time_complexity; // String to hold time complexity information
        int comparisons = 0; // Counter for the number of comparisons made
        int pos = 0; // Position of the found element
        long startTime = System.nanoTime(); // Recording start time for performance measurement

        // Linear search algorithm implementation
        for(int i = 0; i < size ;i++){
            comparisons++; // Incrementing comparison count
            if (arr[i] == search) { // Checking if the current element matches the search element
                found = true;
                pos = i; // Storing the index of the found element
                break; // Exiting loop as soon as element is found
            } else {
                continue; // Moving to the next iteration if element is not found
            }
        }
        long endTime = System.nanoTime(); // Recording end time for performance measurement
        if(!found){
            System.out.println("Element not found in the array.");// Output if element is not found
        } 
        else {
            double executionTime = (endTime - startTime) / 1000000.0; // Calculating execution time in milliseconds
            System.out.println("Element found at index: " + pos); // Output if element is found
            System.out.println("\nNumber of comparisons: " + comparisons); // Outputting the number of comparisons made
            if(comparisons==1){ 
                time_complexity = "Best Case : O(1)"; // Best case time complexity
            }
            else if(comparisons==size){
                time_complexity = "Worst Case : O(n)"; // Worst case time complexity
            }
            else{
                time_complexity = "Average Case : O(n)"; // Average case time complexity
            }
            System.out.println("Time Complexity "+time_complexity); // Outputting the time complexity
            System.out.printf("Total Execution Time: %.4f milliseconds\n",executionTime); // Outputting the execution time
            System.out.println("Space Complexity: O(1)"); // Outputting the space complexity
        }
    }

        public void BinarySearch(int search) {
            int comparisons = 0; // Initialize the variable to count comparisons
            String time_complexity; // String to hold time complexity description
            int left = 0; // Initialize left pointer
            int right = size - 1; // Initialize right pointer
            int mid; // Initialize variable to hold middle index
            int pos = 0; // Initialize variable to hold position of found element
            boolean found = false; // Initialize variable to indicate if element is found
            long startTime = System.nanoTime(); // Record start time of execution
            // Binary search loop
            while(left <= right){
                comparisons++; // Increment comparison count
                mid = (left + right) / 2; // Calculate middle index
                if (arr[mid] == search) { // Check if search value is found at middle index
                    pos = mid; // Record the position of the found element
                    found = true; // Set found flag to true
                    break; // Exit loop
                } else if (arr[mid] < search) { // If search value is greater, search in right half
                    left = mid + 1;
                } else { // If search value is smaller, search in left half
                    right = mid - 1;
                }
            }
            long endTime = System.nanoTime(); // Record end time of execution
            // Output results
            if (!found) { // If element is not found
                System.out.println("Element not found in the array.");
                System.out.println("Time Complexity : O(log n)");
            } else { // If element is found
                double executionTime = (endTime - startTime) / 1000000.0; // Calculate execution time in milliseconds
                System.out.println("Element found at index: " + pos);
                System.out.println("\nNumber of comparisons: " + comparisons);
                // Determine time complexity based on position of found element
                if(pos == size/2){ 
                    time_complexity = "Best Case : O(1)";
                }
                else if(pos==0||pos==size-1){
                    time_complexity = "Worst Case : O(log n)";
                }
                else{
                    time_complexity = "Average Case : O(log n)";
                }
                System.out.println("Time Complexity "+time_complexity);
                System.out.printf("Total Execution Time: %.4f milliseconds\n",executionTime);
                System.out.println("Space Complexity: O(1)");
            }
        }

    public void ternarySearch(int search) {
        int left = 0; // Initialize left pointer
        int right = arr.length - 1; // Initialize right pointer
        int comparisons = 0; // Initialize the variable to count comparisons
        boolean found = false; // Initialize variable to indicate if element is found
        int pos = 0; // Initialize variable to hold position of found element
        String time_complexity; // String to hold time complexity description
        long startTime = System.nanoTime(); // Record start time of execution
        // Ternary search loop
        while (left <= right) {
            comparisons++; // Increment comparison count
            int mid1 = left + (right - left) / 3; // Calculate first mid index
            int mid2 = right - (right - left) / 3; // Calculate second mid index
            if (arr[mid1] == search) { // Check if search value is found at first mid index
                pos = mid1; // Record the position of the found element
                found = true; // Set found flag to true
                break; // Exit loop
            }
            if (arr[mid2] == search) { // Check if search value is found at second mid index
                pos = mid2; // Record the position of the found element
                found = true; // Set found flag to true
                break; // Exit loop
            }
// Adjust pointers based on comparison with mid-values
            if (search < arr[mid1]) {
                right = mid1 - 1;
            } else if (search > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        long endTime = System.nanoTime();
        if(!found){
            System.out.println("Element not found in the array.");
            System.out.println("Time Complexity Worst Case : O(log3 n)");
        }
        else {
            double executionTime = (endTime - startTime) / 1000000.0;
            System.out.println("Element found at index: " + pos);
            System.out.println("\nNumber of comparisons: " + comparisons);
            if (pos == 0 || pos == size- 1) {
                time_complexity = "Worst Case : O(log3 n)";
            } else if (pos == (left + right) / 2) {
                time_complexity = "Best Case : O(1)";
            } else {
                time_complexity = "Average Case : O(log3 n)";
            }
            System.out.println("Time Complexity "+time_complexity);
            System.out.printf("Total Execution Time: %.4f milliseconds\n",executionTime);
            System.out.println("Space Complexity: O(1)");
        }
    }       

    public void jumpSearch(int search) {
        int n = arr.length; // Length of the array
        int step = (int) Math.floor(Math.sqrt(n)); // Calculate the jump step
        int prev = 0; // Initialize previous index
        boolean found = false; // Initialize flag for element found
        int comparisons = 0; // Initialize variable to count comparisons
        long startTime = System.nanoTime(); // Record start time of execution

        // Jumping to the next block
        while (arr[Math.min(step, n) - 1] < search) {
            prev = step; // Update previous index
            step += (int) Math.floor(Math.sqrt(n)); // Update step
            comparisons++; // Increment comparison count
            if (prev >= n) { // If previous index exceeds array length
                return; // Exit the loop
            }
        }
        // Linear search within the block
        while (arr[prev] < search) {
            prev++; // Move to the next element
            comparisons++; // Increment comparison count
            if (prev == Math.min(step, n)) { // If reached the end of block
                return; // Exit the loop
            }
        }

        // Check if the element is found
        if (arr[prev] == search) {
            comparisons++;
            found = true;
        }
        long endTime = System.nanoTime(); // Record end time of execution


        if (found) {
            double executionTime = (endTime - startTime) / 1000000.0; // Calculate execution time in milliseconds
            System.out.println("Element found at index: " + prev);
            System.out.println("\nNumber of comparisons: " + comparisons);
            System.out.printf("Total Execution Time: %.4f milliseconds", executionTime);
            System.out.println("\nSpace Complexity: O(1)");
            // Determine time complexity based on number of comparisons
            if (comparisons == 1) {
                System.out.println("Time Complexity: Best Case - O(1)");
            } else if (comparisons <= Math.sqrt(n)) {
                System.out.println("Time Complexity: Average Case - O(√n)");
            } else {
                System.out.println("Time Complexity: Worst Case - O(√n)");
            }
        }
        else{
            System.out.println("Element not found in the array.");
            System.out.println("Time Complexity Worst Case : O(√n)");
        }
    }
 
    public void InterpolationSearch(int search) {
        int left = 0;
        int right = arr.length - 1;
        int comparisions=0;
        int ele=0;
        boolean found=false;
        long startTime = System.nanoTime();
        while (left <= right && search >= arr[left] && search <= arr[right]) {
            comparisions++;
            if (left == right) {
                if (arr[left] == search) {
                    ele=left;
                    found = true;
                    break; 
                }
                break; 
            }

            // Calculate the probable position
            int pos = left + (int)(((double)(right - left) / (arr[right] - arr[left])) * (search - arr[left]));
            
            if (arr[pos] == search) {
                ele=pos;
                found = true;
                break; 
            }
            
            if (arr[pos] < search) {
                left = pos + 1;
            } else {
                right = pos - 1; 
            }
        }
        long endTime = System.nanoTime();  // Record end time of execution
        if(found){
            double executionTime = (endTime - startTime) / 1000000.0;
            System.out.println("\nElement found at index: " + ele);
            System.out.println("\nNumber of comparisons: " + comparisions);
            System.out.printf("Total Execution Time: %.4f milliseconds", executionTime);
            System.out.println("\nSpace Complexity: O(1)");
            // Determine time complexity based on number of comparisons and found index
            if(ele==0){
                System.out.println("Time Complexity: Best Case - O(1)");
            }
            else if (comparisions <= Math.log(Math.log(arr.length))) {
                System.out.println("Time Complexity: Average Case - O(log(log n))");
            }
            else {
                System.out.println("Time Complexity: Worst Case - O(n)");
            }
        }
        else{
            System.out.println("\nElement not found in the array.");
            System.out.println("Time Complexity Worst Case : O(n)");
        }
    }

    public void BubbleSort(){
        int comparisons=0;
        int swaps=0;
        String time_complexity;  // String to hold time complexity description
        long startTime = System.nanoTime();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                comparisons++;
                if((arr[j]>arr[j+1])){ // If adjacent elements are in wrong order
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){ // If no swaps performed in a pass, array is sorted
                break;
            }
        }
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;
        System.out.print("\nBubble Sort: ");
        traverse();
        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        // Determine time complexity based on number of swaps
        if(swaps == 0){ 
            time_complexity = "Best Case : O(n)";
        }
        else if(swaps == 45){
            time_complexity = "Worst Case : O(n^2)";
        }
        else{
            time_complexity = "Average Case : O(n^2)";
        }
        System.out.println("Time Complexity "+time_complexity);
        System.out.printf("Total Execution Time: %.4f milliseconds",executionTime);
    }

    public void InsertionSort(){
        long startTime = System.nanoTime();
        int i, j, ele;
        String time_complexity;
        int comparisons=0;
        int swaps=0;
        for(i = 1; i < size; i++){
            ele = arr[i];
            j = i - 1;
            while(j >= 0 && ele < arr[j]){
                comparisons++;
                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }
            arr[j + 1] = ele;
        }
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;
        System.out.print("\nInsertion Sort: ");
        traverse();
        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        if(comparisons == 0){ 
            time_complexity = "Best Case : O(n)";
        }
        else if(comparisons == (size*(size-1))/2){
            time_complexity = "Worst Case : O(n^2)";
        }
        else{
            time_complexity = "Average Case : O(n^2)";
        }
        System.out.println("Time Complexity "+time_complexity);
        System.out.printf("Total Execution Time: %.4f milliseconds",executionTime);
    }
    
    public void SelectionSort(){
        long startTime = System.nanoTime();
        int comparisons=0;
        int swaps=0;
        String time_complexity;

        // Selection sort algorithm
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;
        System.out.print("\nSelection Sort: ");
        traverse();
        System.out.println("\nNumber of comparisons: " + comparisons);
        System.out.println("Number of swaps: " + swaps);
        if(swaps == 0){ 
            time_complexity = "Best Case : O(n^2)";
        }
        else if(swaps == size/2){
            time_complexity = "Worst Case : O(n^2)";
        }
        else{
            time_complexity = "Average Case : O(n^2)";
        }
        System.out.println("Time Complexity "+time_complexity);
        System.out.printf("Total Execution Time: %.4f milliseconds",executionTime);
    }


    static int comparisionsQuik = 0; // Static variable to count comparisons in QuickSort
    static int swapQuick = 0; // Static variable to count swaps in QuickSort


    public int partitionNum(int[] arr, int low, int high) {
        // Choose the pivot element (last element in this case)
        int pivot = arr[high];
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            comparisionsQuik++;
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swapQuick++;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        swapQuick++;

        return i + 1; // Return the partition index
    }

    public void quickSortNum(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array into two halves
            int partitionIndex = partitionNum(arr, low, high);

            // Recursively sort the left and right halves
            quickSortNum(arr, low, partitionIndex - 1);
            quickSortNum(arr, partitionIndex + 1, high);
        }
    }
    
    public int[] QuickSort(int[] arr) {
        long startTime = System.nanoTime();
        quickSortNum(arr, 0, size - 1);
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;
        System.out.print("\nQuick Sort Output: ");
        traverse();
        System.out.println("\nNumber of comparisons: " + comparisionsQuik);
        System.out.println("Number of swaps: " + swapQuick);
        System.out.println("Time Complexity : O(nlogn)");
        System.out.println("Space Complexity : O(n)");
        System.out.printf("Total Execution Time: %.4f milliseconds",executionTime);
        return arr;
    }
    // Static variables to count comparisons and swaps in MergeSort
    static int comparisonsMerge=0;
    static int swapsMerge=0;

// Method to perform MergeSort on the given array
    public int[] MergeSort(int[] arr) {
        long startTime = System.nanoTime();
        mergeSortNum(arr, 0, size - 1);
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;
        System.out.print("\nMerge Sort Output: ");
        traverse();
        System.out.println("\nNumber of comparisons: " + comparisonsMerge);
        System.out.println("Number of swaps: " + swapsMerge);
        System.out.println("Time Complexity : O(nlogn)");
        System.out.println("Space Complexity : O(n)");
        System.out.printf("Total Execution Time: %.4f milliseconds",executionTime);
        return arr;
    }

    // Recursive method to perform MergeSort on the given array within the specified range
    public void mergeSortNum(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSortNum(arr, left, mid);
            mergeSortNum(arr, mid + 1, right);

            // Merge the sorted halves
            mergeNum(arr, left, mid, right);  
        }
    }

    // Method to merge two sorted subarrays into one sorted array
    public void mergeNum(int[] arr, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the left and right subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the two temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            comparisonsMerge++;
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            swapsMerge++;
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            swapsMerge++;
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }


    // Method to add an edge to an adjacency list representing a graph
    public  void addEdge(LinkedList<Integer>[] adjList,int u,int v){
        adjList[u].add(v);
    }

    // Method to perform Breadth-First Search (BFS) traversal on a graph represented by an adjacency list
    public  void bfs(LinkedList<Integer>[] adjList,int vertices,int startNode){
        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[startNode]=true;
        queue.add(startNode);
        // Perform BFS traversal
        while(!queue.isEmpty()){
            int currentNode=queue.poll();
            System.out.print(currentNode+" ");
            for(int neighbor:adjList[currentNode]){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Method to add an edge to an adjacency list representing a graph (overloaded method)
    public  void addEdge1(LinkedList<Integer>[] adjList, int u, int v) {
        adjList[u].add(v);
    }

    // Method to perform Depth-First Search (DFS) traversal on a graph represented by an adjacency list
    public void dfs(LinkedList<Integer>[] adjList1, int startNode) {
        boolean[] visited = new boolean[adjList1.length]; // Create an array to track visited vertices
        Stack<Integer> stack = new Stack<>(); // Create a stack for DFS traversal
        visited[startNode] = true; // Mark the starting node as visited
        stack.push(startNode); // Push the starting node onto the stack
// Perform DFS traversal
        while (!stack.isEmpty()) {
            int currentNode = stack.pop(); // Pop the top node from the stack
            System.out.print(currentNode + " "); // Print the current node
// Visit all neighbors of the current node
            for (int neighbor : adjList1[currentNode]) {
                if (!visited[neighbor]) { // If the neighbor is not visited
                    visited[neighbor] = true; // Mark it as visited
                    stack.push(neighbor); // Push it onto the stack
                }
            }
        }
    }
}


public class Project2{
    public static void main(String[] args){
        while (true) {
            Scanner s = new Scanner(System.in); // Create a scanner object to read user input
            Array arr = new Array(); // Create an instance of the Array class

            // Display the main menu for choosing DSA topics
            System.out.println("Which DSA topic would you like to explore first?\n1) Sorting Algorithms\n2) Searching Algorithms\n3) Graph Algorithms\n4) Exit\n");
            System.out.print("Enter your selection: ");
            int a = s.nextInt();

            // Switch statement to handle the user's choice
            switch (a) {
                case 1:
                    System.out.println("Which topic would you like to explore in Sortings?\n1) Bubble Sort\n2) Insertion Sort\n3) Selection Sort\n4) Quick Sort\n5) Merge Sort\n6) Go Back");
                    System.out.print("\nEnter your selection: ");
                    int c = s.nextInt();
                    switch(c){
                        case 1:  // Bubble Sort
                            arr.bubbleSortDetails();
                            System.out.println("\nYou Selected Option 1(Bubble Sort)");
                            arr.array();
                            arr.BubbleSort();
                            System.out.println("\n");
                            break;
                        case 2: // Insertion Sort
                            arr.insertionSortDetails();
                            System.out.println("\nYou Selected Option 1(Insertion Sort)");
                            arr.array();
                            arr.InsertionSort();
                            System.out.println("\n");                             
                            break; 
                        case 3: // Selection Sort
                            arr.selectionSortDetails();
                            System.out.println("\nYou Selected Option 3(Selection Sort)");
                            arr.array();
                            arr.SelectionSort();
                            System.out.println("\n");                             
                            break;
                        case 4: // Quick Sort
                            arr.quickSortDetails();
                            System.out.println("\nYou Selected Option 4(Quick Sort)");    
                            arr.array();
                            arr.QuickSort(arr.arr);
                            System.out.println("\n");                             
                            break;
                        case 5: // Merge Sort
                            arr.mergeSortDetails();    
                            System.out.println("\nYou Selected Option 5(Merge Sort)");
                            arr.array();
                            arr.MergeSort(arr.arr);
                            System.out.println("\n");                             
                            break;
                        case 6: // Go Back
                            continue;
                        default:
                            System.out.println("Invalid input!!!!\n");
                            break;
                        }
                    break;

                case 2: // Searching Algorithms
                    System.out.println("Which topic would you like to explore in Searching?\n1) Linear Search\n2) Binary Search\n3) Ternary Search\n4) Jump Search\n5) Interpolation Search\n6) Go Back");
                    System.out.print("\nEnter your selection: ");
                    int choice = s.nextInt();   
                    switch(choice){
                        case 1: // Linear Search
                            arr.linearSearchDetails();
                            System.out.println("\nYou Selected Option 1(Linear Search)");
                            arr.array();
                            System.out.print("Enter a number to search: ");
                            int search1 = s.nextInt();
                            arr.LinearSearch(search1);;
                            System.out.println("\n");
                            break;
                        case 2:  // Binary Search
                            arr.binarySearchDetails();
                            System.out.println("\nYou Selected Option 2(Binary Search)");
                            arr.array();
                            arr.Sort();
                            System.out.print("Enter a number to search: ");
                            int search2 = s.nextInt();
                            arr.BinarySearch(search2);
                            System.out.println("\n");
                            break;
                        case 3: // Ternary Search
                            arr.ternarySearchDetails();
                            System.out.println("\nYou Selected Option 3(Ternary Search)");
                            arr.array();
                            arr.Sort();
                            System.out.print("Enter a number to search: ");
                            int search3 = s.nextInt();
                            arr.ternarySearch(search3);
                            System.out.println("\n");
                            break;
                        case 4: // Jump Search
                            arr.jumpSearchDetails();
                            System.out.println("\nYou Selected Option 4(Jump Search)");
                            arr.array();
                            arr.Sort();
                            System.out.print("\nEnter a number to search: ");
                            int search4 = s.nextInt();
                            arr.jumpSearch(search4);
                            System.out.println("\n");
                            break;
                        case 5: // Interpolation Search
                            arr.interpolationSearchDetails();
                            System.out.println("\nYou Selected Option 5(Interpolation Search)");
                            arr.array();
                            arr.Sort();
                            System.out.print("Enter a number to search: ");
                            int search5 = s.nextInt();
                            arr.InterpolationSearch(search5);
                            System.out.println("\n");
                            break;
                        case 6: // Go Back
                            continue;
                        default:
                            System.out.println("Invalid input!!!!\n");
                            break;
                        }
                    break;
                case 3: // Graph Algorithms
                    System.out.println("Which topic would you like to explore in Graph Algorithms?\n1) Breadth-First Search\n2) Depth-First Search\n3) Go Back");
                    System.out.print("\nEnter your selection: ");
                    int select=s.nextInt();
                    switch(select){
                        case 1:  // Breadth-First Search
                            arr.bfsDetails();
                            System.out.println("Enter the number of vertices: ");
                            int vertices=s.nextInt();
                            LinkedList<Integer>[] adjList = new LinkedList[vertices];
                            for(int i=0;i<vertices;++i){
                                adjList[i]=new LinkedList<>();
                            }
                            System.out.println("\nEnter the number of edges: ");
                            int edges=s.nextInt();
                            System.out.println("\nEnter the edges (format: source destination)(Ex: 1 3):");
                            for(int i=0;i<edges;i++){
                                int source = s.nextInt();
                                int destination = s.nextInt();
                                if (source < 0 || source >= vertices || destination < 0 || destination >= vertices) {
                                    System.out.println("Entered order is wrong. Please re-enter the edge again.");
                                    i--; // Decrement i to re-enter the edge
                                    continue;
                                }
                                arr.addEdge(adjList,source,destination);
                            }
                            System.out.print("\nEnter the start node for BFS: ");
                            int startnode=s.nextInt();
                            System.out.print("\nBFS Order: ");
                            arr.bfs(adjList,vertices,startnode);
                            System.out.println("\n");
                                break;
                            case 2: // Depth-First Search
                                arr.dfsDetails();
                                System.out.println("Enter the number of vertices: ");
                                int vertices1 = s.nextInt();
                                LinkedList<Integer>[] adjList2=new LinkedList[vertices1];
                                for(int i=0;i<vertices1;++i){
                                    adjList2[i]=new LinkedList<>();
                                }
                                System.out.println("\nEnter the number of edges: ");
                                int edges1=s.nextInt();
                                System.out.println("\nEnter the edges (format: source destination): ");
                                for(int i=0;i<edges1;i++){
                                    int source1=s.nextInt();
                                    int destination1=s.nextInt();
                                    if (source1 < 0 || source1 >= vertices1 || destination1 < 0 || destination1 >= vertices1) {
                                        System.out.println("Entered order is wrong. Please re-enter the edge again.");
                                        i--; // Decrement i to re-enter the edge
                                        continue;
                                    }
                                    arr.addEdge1(adjList2,source1,destination1);
                                }
                                System.out.println("\nEnter the start node for BFS: ");
                                int startnode1=s.nextInt();
                                System.out.print("\nDFS Order: ");
                                arr.dfs(adjList2,startnode1);
                                System.out.println("\n");
                                break;
                            case 3: // Go Back
                                continue;
                            default:
                                System.out.println("Invalid input!!!!\n");
                            break;
                    }
                    break;
                case 4: // Exit the program
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------"+
                    "\n-----------------------------------------------------------------Exited-Successfully--------------------------------------------------------"+
                    "\n-------------------------------------------------------------------------------------------------------------------------------------------");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid input!! Please try again!!!\n");
                    break;
            }
            // Ask the user if they want to continue or exit
            System.out.println("1) Do you want to continue?\n2) exit\n");
            System.out.print("Enter your selection: ");
            int choice = s.nextInt();
            if(choice == 1){
                continue;
            }
            else if(choice == 2){
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------"+
                    "\n-----------------------------------------------------------------Exited-Successfully---------------------------------------------------------"+
                    "\n--------------------------------------------------------------------------------------------------------------------------------------------");
                    s.close();
                    break;
            }
            else{
                System.out.println("--------------------------------------Choice invalid!!-----Program Terminated!!!-----Forcefully!!---------------------------------------------");
                s.close();
                break;
            }
        }
    }
}