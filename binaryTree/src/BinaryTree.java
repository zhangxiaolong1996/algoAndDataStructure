import java.util.ArrayList;
import java.util.List;

/**
 * 创建二叉树和二叉树的遍历
 */
public class BinaryTree {
    public BinaryTree root;
    public BinaryTree right;
    public BinaryTree left;

    private Object data;

    public List<BinaryTree> datas;

    public BinaryTree(BinaryTree left, BinaryTree right, Object data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public BinaryTree(Object root){
        this(null, null, root);
    }

    public BinaryTree(){}

    public void create(Object[] objects){
        datas = new ArrayList<>();
        for (Object obj:objects){
            datas.add(new BinaryTree(obj));
        }

        root = datas.get(0);

        for (int i = 0; i < objects.length/2; i++) {
            //左孩子
            datas.get(i).left=datas.get(i*2+1);
            //右孩子
            if(i*2+2<datas.size()){//避免偶数的时候 下标越界
                datas.get(i).right=datas.get(i*2+2);
            }
        }
    }
}
