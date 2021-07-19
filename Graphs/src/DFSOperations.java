import java.util.ArrayList;

public class DFSOperations {
	
	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	
	static void dfs(ArrayList<ArrayList<Integer>> list, int source, boolean marked[]) {
		marked[source] = true;
		System.out.println(source + " ");
		for(int item : list.get(source)) {
			if(marked[item] == false) {
				dfs(list, source, marked);
			}
		}
	}
	
	static void dfsCall(ArrayList<ArrayList<Integer>> list,int v, int source) {
		boolean marked[] = new boolean[v+1];
		
		for(int i = 1; i <= v; i++) {
			marked[i] = false;
		}
		dfs(list, source, marked);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
