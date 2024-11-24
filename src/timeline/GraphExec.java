package timeline;

public class GraphExec {
    public static void main(String[] args) {
        GraphBuilder graphBuilder = new GraphBuilder();

        String fileName = "E:\\Programs\\Others\\Java\\Workspace\\Tegraf_FP\\input.tsv";
        graphBuilder.loadGraphFromFile(fileName);
        graphBuilder.addEdges();
        graphBuilder.findMST();
        
        
    }
}
