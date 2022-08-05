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
}
