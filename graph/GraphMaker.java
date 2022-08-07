package graph;

import java.util.ArrayList;

public class GraphMaker {
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/b5719ff8-5f79-46e5-bcdc-6907b8ba3dc2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220805%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220805T175304Z&X-Amz-Expires=86400&X-Amz-Signature=f93dd86c7d9f1605d4a37c66cc0d40081eb6304e52542242055f2d09104d6883&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeBfsTraversalPracticeGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= 7; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 5
        adj.get(3).add(5);
        adj.get(5).add(3);

        // 5 -- 7
        adj.get(5).add(7);
        adj.get(7).add(5);

        // 7 -- 2
        adj.get(7).add(2);
        adj.get(2).add(7);

        // 4 -- 6
        adj.get(4).add(6);
        adj.get(6).add(4);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/2a83a54d-801f-4009-b98b-7a1f43ecdf46/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220805%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220805T201945Z&X-Amz-Expires=86400&X-Amz-Signature=775e695871534f94356dd9194a269400e896525d78838171a5bf8009613fbc23&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeDfsTraversalPracticeGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 4
        adj.get(2).add(4);
        adj.get(4).add(2);

        // 4 -- 6
        adj.get(4).add(6);
        adj.get(6).add(4);

        // 6 -- 7
        adj.get(6).add(7);
        adj.get(7).add(6);

        // 7 -- 2
        adj.get(7).add(2);
        adj.get(2).add(7);

        // 3 -- 5
        adj.get(3).add(5);
        adj.get(5).add(3);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0e13d9c0-243f-44e9-9986-5dfe8622f156/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220806%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220806T125406Z&X-Amz-Expires=86400&X-Amz-Signature=f556a196f81b66780abd499a506069de9f921c148094e5a4824b782fa5065d2e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeCyclicNonDirectedGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= 11; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 4
        adj.get(2).add(4);
        adj.get(4).add(2);

        // 3 -- 5
        adj.get(3).add(5);
        adj.get(5).add(3);

        // 5 -- 6
        adj.get(5).add(6);
        adj.get(6).add(5);

        // 6 -- 7
        adj.get(6).add(7);
        adj.get(7).add(6);

        // 7 -- 8
        adj.get(7).add(8);
        adj.get(8).add(7);

        // 8 -- 11
        adj.get(8).add(11);
        adj.get(11).add(8);

        // 8 -- 9
        adj.get(8).add(9);
        adj.get(9).add(8);

        // 9 -- 10
        adj.get(9).add(10);
        adj.get(10).add(9);

        // 10 -- 5
        adj.get(10).add(5);
        adj.get(5).add(10);

        return adj;
    }

    public static ArrayList<ArrayList<Integer>> makeAcyclicNonDirectedGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= 11; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 4
        adj.get(2).add(4);
        adj.get(4).add(2);

        // 3 -- 5
        adj.get(3).add(5);
        adj.get(5).add(3);

        // 5 -- 6
        adj.get(5).add(6);
        adj.get(6).add(5);

        // 6 -- 7
        adj.get(6).add(7);
        adj.get(7).add(6);

        // 10 -- 5
        adj.get(10).add(5);
        adj.get(5).add(10);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/91c563ba-0786-41d8-bca8-b9439a6bf64e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220807%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220807T112610Z&X-Amz-Expires=86400&X-Amz-Signature=4a331087bc9c05ad4eb1158a1aca76a2927907a72f0c67bee87c89cbab0bacf1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeNonOddLengthCycleBipartiteGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 4 -- 5
        adj.get(4).add(5);
        adj.get(5).add(4);

        // 5 -- 6
        adj.get(5).add(6);
        adj.get(6).add(5);

        // 6 -- 9
        adj.get(6).add(9);
        adj.get(9).add(6);

        // 9 -- 10
        adj.get(9).add(10);
        adj.get(10).add(9);

        // 6 -- 7
        adj.get(6).add(7);
        adj.get(7).add(6);

        // 7 -- 8
        adj.get(7).add(8);
        adj.get(8).add(7);

        // 8 -- 3
        adj.get(8).add(3);
        adj.get(3).add(8);

        return adj;
    }

    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/604834b0-e300-45f5-add4-060d5c63a06d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220807%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220807T112700Z&X-Amz-Expires=86400&X-Amz-Signature=c375bd58c11a5e22c404a4bbc1ac3fc020668a84da2ae18e8a29d78debfabcc6&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeOddLengthCycleNonBipartiteGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 4 -- 7
        adj.get(4).add(7);
        adj.get(7).add(4);

        // 7 -- 8
        adj.get(7).add(8);
        adj.get(8).add(7);

        // 4 -- 5
        adj.get(4).add(5);
        adj.get(5).add(4);

        // 5 -- 6
        adj.get(5).add(6);
        adj.get(6).add(5);

        // 6 -- 2
        adj.get(6).add(2);
        adj.get(2).add(6);

        return adj;
    }

    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6fe549b1-153a-4d94-ae55-f8823b96511b/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220807%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220807T112748Z&X-Amz-Expires=86400&X-Amz-Signature=dc9aa0f3d2ded7dd66b6255df442534b9774699d9bd063b962908753bc55e7e8&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeNoCycleBipartiteGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0 ; i <= 5; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 4 -- 5
        adj.get(4).add(5);
        adj.get(5).add(4);

        return adj;
    }
}
