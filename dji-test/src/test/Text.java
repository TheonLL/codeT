package test;

import java.util.ArrayList;
import java.util.List;
public class Text {
    public static void main(String[] args) {
        Text text=new Text();
        String[] warr=new  String[]{"This", "is", "an", "example", "of", "text", "justification."};
        int l=16;
        List<String> a=text.fullJustify(warr,l);
        for(String s:a){
            System.out.println(s+",");
        }
    }
    public List<String> fullJustify(String[] warr, int l) {
        List<String> res = new ArrayList();
        int pointer = 0;
        while(pointer < warr.length){
            int n = l;
            List<String> line = new ArrayList();
            while(pointer < warr.length){
                String s = warr[pointer];
                if(s.length() > n) break;
                n -= s.length() + 1;
                line.add(s);
                pointer++;
            }

            StringBuilder cur = new StringBuilder();
            if(pointer == warr.length){
                for(String s : line){
                    cur.append(s + " ");
                }
                cur.replace(cur.length()-1, cur.length(), "");
                while(cur.length() < l) cur.append(" ");
            }else{
                int size = line.size();
                if(size == 1){
                    cur.append(line.get(0));
                    while(cur.length() < l) cur.append(" ");
                }else{
                    int space = n + size;
                    for(int i = 0; i < size - 1; i++){
                        cur.append(line.get(i));
                        int e = space / (size - 1) + (space % (size - 1) > i ? 1 : 0);
                        for(int j = 0; j < e; j++) cur.append(" ");
                    }
                    cur.append(line.get(size-1));
                }
            }
            res.add(cur.toString());
        }
        return res;
    }
}
