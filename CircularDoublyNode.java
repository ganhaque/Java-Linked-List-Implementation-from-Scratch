public class CircularDoublyNode extends Nodes {
  //null <-> node <-> null
  Nodes pointerBackward;

  public CircularDoublyNode(int nodeKey) {
    super(nodeKey);
    pointerBackward = null;
  }

}
