import javax.xml.soap.Node;

/******************************************************
 * BST ADT.
 * Supported operations:
 * Insert
 * Delete
 * Find
 * Min
 * Max
 * Depth
 * Print
 ******************************************************/
public class BST{
  private BSTNode root;      /* Pointer to the root of the tree */
  private int noOfNodes;     /* No of nodes in the tree */

  /*******************************************************
   * Constructor: Initializes the BST
   *******************************************************/
  public BST(){root=null; noOfNodes=0;}

  /*******************************************************
   * Returns a pointer to the root of the tree
   *******************************************************/
  public BSTNode Root(){return root;}

  /*******************************************************
   * Returns the number of nodes in the tree
   *******************************************************/

  public int NoOfNodes(){

  return -1;
  }

  /*******************************************************
   * Inserts the key into the BST. Returns a pointer to
   * the inserted node
   *******************************************************/
  public BSTNode Insert(int key){

    BSTNode pp = null; /* pp is the parent of p */
    BSTNode p = root; /* Start at the root and go down */
    while (p != null){
      pp = p;
      if (key == p.key) {
        p.count++;
        return p;
      }
      else if (key < p.key) p = p.left;
      else /* key > p.key */ p = p.right;
    } /* end-while */

    BSTNode z = new BSTNode(key); /* New node to store the key */
    z.left = z.right = null;

    if (root == null) {
      root = z; /* Inserting into empty tree */
      return root;
    }
    else if (key < pp.key)
      pp.left = z;
    else pp.right = z;


    return p;
  }
   //end-Insert


  /*******************************************************
   * Deletes the key from the tree (if found). Returns
   * 0 if deletion succeeds, -1 if it fails
   *******************************************************/
  public int Delete(int key){
    // Fill this in
    return 0;
  } //end-Delete

  /*******************************************************
   * Searches the BST for a key. Returns a pointer to the
   * node that contains the key (if found) or NULL if unsuccessful
   *******************************************************/
  public BSTNode Find(int key){
    BSTNode p = root;
    while (p != null){
      if (key == p.key) return p;
      else if (key < p.key) p = p.left;
      else /* key > p.key */ p = p.right;
    } /* end-while */
    return null;
  } //end-Find

  /*******************************************************
   * Returns a pointer to the node that contains the minimum key
   *******************************************************/
  public BSTNode Min(){
    if (root == null)
      return null;
    BSTNode p = root;
    while (p.left != null){
      p = p.left;
    } //end-while
    return p;
  } //end-Min

  /*******************************************************
   * Returns a pointer to the node that contains the maximum key
   *******************************************************/
  public BSTNode Max(){
    if (root == null)
      return null;
    BSTNode p = root;
    while (p.right != null){
      p = p.right;
    } //end-while
    return p;
  } //end-Max

  /*******************************************************
   * Returns the depth of tree. Depth of a tree is defined as
   * the depth of the deepest leaf node. Root is at depth 0 
   *******************************************************/
  public int Depth(){

    return -1;

  } //end-Depth

  /*******************************************************
   * Performs an inorder traversal of the tree and prints [key, count] 
   * pairs in sorted order
   *******************************************************/
  public void Print(){
    // Fill this in
  } //end-Print
};
