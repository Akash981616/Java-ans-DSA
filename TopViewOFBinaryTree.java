if(root==null)System.out.println("null");
TreeMap<Integer,Integer>map=new TreeMap<>();
topView(root,map);
ArrayList<Integer>res=new ArrayList<>(map.values());
return res;
    
}
 static void topView(Node root,TreeMap<Integer,Integer>map){
    Queue<Node>q=new LinkedList<>();
    Queue<Integer>level=new LinkedList<>();
    q.add(root);
    level.add(0);
    while(!q.isEmpty()){
        int idx=level.poll();
        Node temp=q.poll();
        if(!map.containsKey(idx)){map.put(idx,temp.data);}
        if(temp.left!=null){
            q.add(temp.left);
            level.add(idx-1);
        }
        if(temp.right!=null){
            q.add(temp.right);
            level.add(idx+1);
        }
    }
}