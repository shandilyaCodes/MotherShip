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
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3ef4c796-017d-46fc-9dae-167655750d2e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220807%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220807T180312Z&X-Amz-Expires=86400&X-Amz-Signature=589d43df06a3393e867ea01d48631a83100230166124c81cd7ef7a1f24bafba2&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeCyclicDAG() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -> 2
        adj.get(1).add(2);

        // 2 -> 3
        adj.get(2).add(3);

        // 3 -> 4
        adj.get(3).add(4);

        // 4 -> 5
        adj.get(4).add(5);

        // 3 -> 6
        adj.get(3).add(6);

        // 6 -> 5
        adj.get(6).add(5);

        // 7 -> 2
        adj.get(7).add(2);

        // 7 -> 8
        adj.get(7).add(8);

        // 8 -> 9
        adj.get(8).add(9);

        // 9 -> 7
        adj.get(9).add(7);

        return adj;
    }

    public static ArrayList<ArrayList<Integer>> makeAcyclicDAG() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -> 2
        adj.get(1).add(2);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6ffe8f89-ed4b-422f-a100-f9109a717a15/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220807%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220807T183647Z&X-Amz-Expires=86400&X-Amz-Signature=02487637149403cbe19f81e6d3e36ab9fd73bd861c6024ac8de8398fd3dba2de&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeTopologicalDAG() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }

        // 5 -> 0
        adj.get(5).add(0);

        // 4 -> 0
        adj.get(4).add(0);

        // 4 -> 1
        adj.get(4).add(1);

        // 3 -> 1
        adj.get(3).add(1);

        // 2 -> 3
        adj.get(2).add(3);

        // 5 -> 2
        adj.get(5).add(2);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ec446f02-0952-4ad7-9688-570ca6de226d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220808%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220808T134125Z&X-Amz-Expires=86400&X-Amz-Signature=356c8238dd4cea1d346d24c01d0bd26819c60c665f0b27de936b3636f8797b46&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeUnitWeightGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // 0 -- 3
        adj.get(0).add(3);
        adj.get(3).add(0);

        // 1 -- 3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 4 -- 5
        adj.get(4).add(5);
        adj.get(5).add(4);

        // 5 -- 6
        adj.get(5).add(6);
        adj.get(6).add(5);

        // 2 -- 6
        adj.get(2).add(6);
        adj.get(6).add(2);

        // 6 -- 7
        adj.get(6).add(7);
        adj.get(7).add(6);

        // 6 -- 8
        adj.get(6).add(8);
        adj.get(8).add(6);

        // 8 -- 7
        adj.get(8).add(7);
        adj.get(7).add(8);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6895d43e-1fe3-4ad4-9ffc-c95d21d1f4d7/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220808%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220808T143626Z&X-Amz-Expires=86400&X-Amz-Signature=df2ee9c91bce33692239747e3156c29fd8454cce319f0469d7dc3c475af58d7a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<GraphNode>> makeWeightedDAG() {
        // v : 6
        ArrayList<ArrayList<GraphNode>> adj = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1 -- 2
        adj.get(0).add(new GraphNode(1, 2));

        // 1 -- 2 -- 3
        adj.get(1).add(new GraphNode(2, 3));

        // 2 -- 3 -- 6
        adj.get(2).add(new GraphNode(3, 6));

        // 0 -- 4 -- 1
        adj.get(0).add(new GraphNode(4, 1));

        // 4 -- 2 -- 2
        adj.get(4).add(new GraphNode(2, 2));

        // 4 -- 5 -- 4
        adj.get(4).add(new GraphNode(5, 4));

        // 5 -- 3 -- 1
        adj.get(5).add(new GraphNode(3, 1));

        return adj;
    }
    
        // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9dac158b-3784-470f-bf37-3d413d797614/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220810%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220810T131557Z&X-Amz-Expires=86400&X-Amz-Signature=1a1d0a3eaedfd73dd179a801f5fd298eb2285ea5832a7d81a51a6ea7a7508c96&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<GraphNode>> makePrimsGraph() {
        ArrayList<ArrayList<GraphNode>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(new GraphNode(1, 2));
        adj.get(1).add(new GraphNode(0, 2));

        // 1 -- 2
        adj.get(1).add(new GraphNode(2, 3));
        adj.get(2).add(new GraphNode(1, 3));

        // 0 -- 3
        adj.get(0).add(new GraphNode(3, 6));
        adj.get(3).add(new GraphNode(0, 6));

        // 3 -- 1
        adj.get(3).add(new GraphNode(1, 8));
        adj.get(1).add(new GraphNode(3, 8));

        // 1 -- 4
        adj.get(1).add(new GraphNode(4, 5));
        adj.get(4).add(new GraphNode(1, 5));

        // 4 -- 2
        adj.get(4).add(new GraphNode(2, 7));
        adj.get(2).add(new GraphNode(4, 7));

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e27ca7cb-4f4f-4594-8fe3-5503fc006b90/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220815%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220815T180248Z&X-Amz-Expires=86400&X-Amz-Signature=f88a7c2e68ba8685a18007857459de07dcb059e6324f9eb5566d0e8390eb9fa5&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeSccGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);

        // 1 -- 2
        adj.get(1).add(2);

        // 1 -- 3
        adj.get(1).add(3);

        // 3 -- 4
        adj.get(3).add(4);

        // 4 -- 0
        adj.get(4).add(0);

        // 4 -- 5
        adj.get(4).add(5);

        // 5 -- 2
        adj.get(5).add(2);

        // 4 -- 6
        adj.get(4).add(6);

        // 5 -- 6
        adj.get(5).add(6);

        // 6 -- 5
        adj.get(6).add(5);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/10cc853a-3f2c-4578-9ce9-10843c0ae109/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220816%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220816T184817Z&X-Amz-Expires=86400&X-Amz-Signature=5ce559a486fd453b56060debec67527b1d1b58957b4c2b491ce1006c2619f66d&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeBridgeGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 0
        adj.get(2).add(0);
        adj.get(0).add(2);

        // 0 -- 3
        adj.get(0).add(3);
        adj.get(3).add(0);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        return adj;
    }
    
    // URL https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c8d0b038-cef8-44f6-b637-04d45c629ecb/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220817%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220817T111657Z&X-Amz-Expires=86400&X-Amz-Signature=d5c0ae9b84d945f3df9ae07884227f0dd96debcfa4ad226887a6ef2089246722&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject
    public static ArrayList<ArrayList<Integer>> makeAPGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 0
        adj.get(2).add(0);
        adj.get(0).add(2);

        // 0 -- 3
        adj.get(0).add(3);
        adj.get(3).add(0);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 3 -- 5
        adj.get(3).add(5);
        adj.get(5).add(3);

        return adj;
    }
    
    public static ArrayList<ArrayList<Integer>> makeEulerGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 0
        adj.get(2).add(0);
        adj.get(0).add(2);

        return adj;
    }

    public static ArrayList<ArrayList<Integer>> makeSemiEulerGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        // 0 -- 1
        adj.get(0).add(1);
        adj.get(1).add(0);

        // 1 --2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);

        // 4 -- 2
        adj.get(4).add(2);
        adj.get(2).add(4);

        return adj;
    }

    public static ArrayList<ArrayList<Integer>> makeNonEulerGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }

        // 1 -- 0
        adj.get(1).add(0);
        adj.get(0).add(1);

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 0
        adj.get(2).add(0);
        adj.get(0).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);
        
        return adj;
    }
}
